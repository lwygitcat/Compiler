import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

public class SuperVisitor extends LexBaseVisitor<Node> //LexBaseVisitor not generated, shit
{
  public ArrayList<String> outputList = new ArrayList<String>();
  public ArrayList<String> pushStack = new ArrayList<String>();
  private Stack<String> labelStack = new Stack<String>();
  private Stack<String> continueStack = new Stack<String>();
  private Stack<String> breakStack = new Stack<String>();
  private Stack<String> functionStack = new Stack<String>();
  private Stack<Integer> functionPopNumberStack = new Stack<Integer>();    //function call stack
  private Stack<ArrayList<Node>> factorStack = new Stack<ArrayList<Node>>();
  private Stack<ArrayList<Node>> exprStack = new Stack<ArrayList<Node>>();

  protected Map<String, Map<String, Node>> tableMap = new LinkedHashMap<String, Map<String, Node>>(); //scope name + symbol map of that scope
  protected Map<String, Integer> functionMap = new LinkedHashMap<String, Integer>();
  protected Map<String, ArrayList<String>> tempMap = new LinkedHashMap<String, ArrayList<String>>();

  private int tempIndex = 0;
  public int finalTempIndex = 0;
  private int varIndex = 0;
  private int paramIndex = 0;
  private int labelIndex = 0;
  private int countPUSH = 0;
  private String functionRecord = "GLOBAL";

  public SuperVisitor(SymbolTable table, Map<String, Integer> functionMap)
  {
    this.functionMap = functionMap;

    for (Scope scope : table.scopestack.subList(0, table.scopestack.size()))
    {
      Map <String, Node> varMap= new LinkedHashMap<String, Node>();
      if (scope.Scopetype.equalsIgnoreCase("GLOBAL")) { //shit, will it work, check grammer file
        for (String key : scope.symbolMap.keySet()) {
          //System.out.println(key);
          if (((Symbol)scope.symbolMap.get(key)).getType().contains("INT")) {
            varMap.put(key, new Node(key, 1));  //String node
          }
          else if (((Symbol)scope.symbolMap.get(key)).getType().contains("FLOAT")) {
            varMap.put(key, new Node(key, 2));
          }
          else if (((Symbol)scope.symbolMap.get(key)).getType().contains( "STRING")) {
            varMap.put(key, new Node(key, 5));   //string equals five
          }
          else
          {
            System.out.println("error@constructor");
          }
        }
      }
      else {
        ;
      }

      this.tableMap.put(scope.Scopetype, varMap); //scope has its own varmap, tablemap similar to symboltable
//      this.varIndex = 0;
   //   this.paramIndex = 0;   //every function has vars and parameters
    }
  }
/*
  private String createVar(boolean isParameter)
  {
    if (isParameter) {
      this.paramIndex += 1;
      return "$P" + Integer.toString(this.paramIndex);      //$p1, $p2
    }

    this.varIndex += 1;
    return "$L" + Integer.toString(this.varIndex);      //$L1, $L2
  }
*/  

  
  
  
  
  //Scopetype is something like GLOBAL, BLCOK X, FUNCTION NAME
  public Node findIdNode(String id, String scopeName)
  {
    if ((this.tableMap.get(scopeName)).get(id) == null) {  //new, <scopename, varmap>   varmap<idname, Node>
      if ((this.tableMap.get("GLOBAL")).get(id) == null) {  //Shit, check delete (Map) in front a lot
        System.out.println("can't find assign variable, error@findIdNode");
        return null;
      }

      //return (Node)((Map)this.tableMap.get("GLOBAL")).get(id);
      return this.tableMap.get("GLOBAL").get(id);
    }

    //return (Node)((Map)this.tableMap.get(scopeName)).get(id);
    return this.tableMap.get(scopeName).get(id);
  }



  public Node visitPrimary(@NotNull LexParser.PrimaryContext ctx) //basic unit, like expr/id/intliteral/floatliteral
  {
    if (ctx.expr() != null)
      return visit(ctx.expr());   // if complex, just depth-first visit down
    if (ctx.id() != null)
      return findIdNode(ctx.id().getText(), this.functionRecord);  // returns something like $p1/$L1--->varmap has been created at the first step
    if (ctx.INTLITERAL() != null) {
      Node newNode = new Node(createTemp(), 1);
      this.outputList.add("STOREI " + ctx.INTLITERAL().getText() + " " + newNode.content); //directly stores IR code.in outputlist

      return newNode;
    }

    Node newNode = new Node(createTemp(), 2);
    this.outputList.add("STOREF " + ctx.FLOATLITERAL().getText() + " " + newNode.content);

    return newNode;
  }
  
  
  

  public Node visitFunc_decl(@NotNull LexParser.Func_declContext ctx)
  {
    ArrayList newTempList = new ArrayList();

    this.outputList.add("LABEL " + ctx.id().getText());   //ceate  a LABEL for functions
    this.functionRecord = ctx.id().getText();
    this.tempMap.put(this.functionRecord, newTempList);  //tempmap is a map<functionname, Arraylist>
    this.outputList.add("LINK ");                    //LINK
    visitChildren(ctx);     //how IR Code of children are put in ........................VS visit(ctx.expr()); 
    this.tempIndex = 0;   //whenever a function is met, all the temp valuable will be reset to 0
    if (ctx.any_type().getText().equals("VOID")) {
      this.outputList.add("RET");  //do we need now here??????????
    }
    return null;
  }
//conclusion
//met function
// LABEL function name
// LINK??
//visitChildren(ctx);
// ?RET


//id '(' expr_list ')'
  public Node visitCall_expr(@NotNull LexParser.Call_exprContext ctx)  //.g   id '(' expr_list? ')' only here ---> something like f(a+3, b-4,k+5);
  {
    this.functionPopNumberStack.push(Integer.valueOf(this.countPUSH));  //functionPopNumberStack is a Stack of Integer      f(a+1)+g(b-2)*k(c+3);
    this.countPUSH = 0;
    if (ctx.expr_list() != null) {
      visit(ctx.expr_list());
    }

    this.outputList.add("PUSH ");       //when function are called, PUSH
    String[] reverseList = new String[this.countPUSH]; //String array
    for (int i = 0; i < this.countPUSH; i++) {
      reverseList[i] = ((String)this.functionStack.pop());   //functionStack is a Stack of a+3,b-4,k+5
    }
    for (int i = this.countPUSH - 1; i >= 0; i--) {
      this.outputList.add("PUSH " + reverseList[i]);
    }
    this.outputList.add("JSR " + ctx.id().getText());
    for (int i = 0; i < this.countPUSH; i++) {
      this.outputList.add("POP ");
    }
    this.countPUSH = ((Integer)this.functionPopNumberStack.pop()).intValue(); //f(a+3, g(b)),k+5)  //not necessiary seems

    Node newNode = new Node(createTemp(), ((Integer)this.functionMap.get(this.functionRecord)).intValue());  //based on the return value type.
    this.outputList.add("POP " + newNode.content);
    return newNode; // ................................................................................................
  }
//Conclusion
//PUSH
//PUSH K+5
//PUSH b-4
//PUSH a+3
//JSR f
//POP
//POP
//POP
//POP $T10








//expr expr_list_tail | empty
  public Node visitExpr_list(@NotNull LexParser.Expr_listContext ctx)
  {
    Node exprNode = (Node)visit(ctx.expr());

    this.functionStack.push(exprNode.content);  //functionStack tracks all the expr node 
    this.countPUSH += 1;                         //countPush track the number of expr in exprlist
    if (!"".equals(ctx.expr_list_tail().getText())) {
      visit(ctx.expr_list_tail());
    }
    return null;
  }

  
  
  
  
 /*
  public Node visitExpr_list_tail(@NotNull LexParser.Expr_list_tailContext ctx)
  {
    Node exprNode = (Node)visit(ctx.expr()); // track what visit(expr) returns

    this.functionStack.push(exprNode.content);
    this.countPUSH += 1;
    if (!"".equals(ctx.expr_list_tail().getText())) {
      visit(ctx.expr_list_tail());
    }

    return null;
  }
*/
  
  

















 
  public Node visitReturn_stmt(@NotNull LexParser.Return_stmtContext ctx) //.g file something like     'RETURN' expr ';'
  {
    Node exprNode = (Node)visit(ctx.expr());      //expnode be either int node or float node.
    Node tempNode = new Node(createTemp(), exprNode.type);
    if (exprNode.type == 1) {
      this.outputList.add("STOREI " + exprNode + " " + tempNode);  //storei a $T1
      this.outputList.add("STOREI " + tempNode + " $R");   //STOREI $T1 $R    ??? register, not used here.
    }
    else {
      this.outputList.add("STOREF " + exprNode + " " + tempNode);
      this.outputList.add("STOREF " + tempNode + " $R");
    }
    this.outputList.add("RET");   //Arraylist is a dynamically resizing array, put in the end
    return null;
  }



//Param_decl : var_type id 
  public Node visitParam_decl(@NotNull LexParser.Param_declContext ctx)//f(int a, float b, char c);  var_type id 
  {
    Node newNode;
    if (ctx.var_type().getText().equalsIgnoreCase("INT")) {
      newNode = new Node(ctx.id().getText(), 1);
    }
    else {
      newNode = new Node(ctx.id().getText(), 2);
    }

    return null;
  }

//conclusion parameter is not in any scode.   
//NOT Adding any IR code.




  
  
  //expr = factor (addop factor)* 
  // solution: 
  //expr
  //: expr_prefix factor
  //;

  //expr_prefix
  //: expr_prefix factor addop
 // | /* */
  public Node visitExpr(@NotNull LexParser.ExprContext ctx) //big modification seems in need here.  --> something like  (expr_prefix)? factor in this case
  {
    if (!"".equals(ctx.expr_prefix().getText())) {   //expr_prefix() not null
      ArrayList exprList = new ArrayList();
      this.exprStack.push(exprList);
      Node exprNode = (Node)visit(ctx.expr_prefix());
      Node factorNode = (Node)visit(ctx.factor());
//I AM pretty sure missing something here
// Maybe((ArrayList)this.exprStack.peek()).add(exprNode);

      ((ArrayList)this.exprStack.peek()).add(factorNode);
      Node resolveNode = resolve((ArrayList)this.exprStack.pop());

      return resolveNode;
    }

    Node factorNode = (Node)visit(ctx.factor());
    return factorNode;
  }


  
  //expr = factor (addop factor)* 
  // solution: 
  //expr
  //: expr_prefix factor
  //;

  //expr_prefix
  //: expr_prefix factor addop
 // | /* */
  
/* 
  //shit, two factors, how to tell which is which
  public Node visitExpr(@NotNull LexParser.ExprContext ctx) 
  {
    if (!"".equals(ctx.addop().getText())) {  //more than one factor
      ArrayList<Node> exprList = new ArrayList<Node>();
      this.exprStack.push(exprList);
      //Node exprNode = visit(ctx.expr_prefix());
      Node factorNode1 = visit(ctx.factor());
      this.exprStack.peek().add(factorNode1);
      
      
      
      Node resolveNode = resolve((ArrayList)this.exprStack.pop());
      return resolveNode;
    }

    Node factorNode = visit(ctx.factor());
    return factorNode;
  }
  
*/  


// when having more than one node, instead of returning a node!
  // go with adding the nodes in the arraylist 


  
  
 //clear
// expr_prefix factor addop | empty
  public Node visitExpr_prefix(@NotNull LexParser.Expr_prefixContext ctx)//(expr_prefix)? addop factor
  {
    if (!"".equals(ctx.expr_prefix().getText())) {
      visit(ctx.expr_prefix());               
    }   // what the heck is this?  guessing not needed here.........................
    Node opNode = new Node(ctx.addop().getText(), 3); // shit, need to change
    Node factorNode = (Node)visit(ctx.factor());
    ((ArrayList)this.exprStack.peek()).add(factorNode);  //reason for using exprSack, the lower level nodes can be put into the shit.
    ((ArrayList)this.exprStack.peek()).add(opNode); //in expr node: (a+3) - ;

    return null;     //return null here because it is added in the exprstack?
  }




//factor_prefix postfix_expr
  public Node visitFactor(@NotNull LexParser.FactorContext ctx)//(factor_prefix postfix_expr)?
  {
    if (!"".equals(ctx.factor_prefix().getText())) {
      ArrayList factorList = new ArrayList();
      this.factorStack.push(factorList);
      Node exprNode = (Node)visit(ctx.factor_prefix());
      Node postfixNode = (Node)visit(ctx.postfix_expr());
      ((ArrayList)this.factorStack.peek()).add(postfixNode);  //!!! Important reverse order push the exp
      Node resolveNode = resolve((ArrayList)this.factorStack.pop());

      return resolveNode;
    }

    return (Node)visit(ctx.postfix_expr());
  }



  //factor_prefix postfix_expr mulop | empty
  //clear
  public Node visitFactor_prefix(@NotNull LexParser.Factor_prefixContext ctx)
  {
    if (!"".equals(ctx.factor_prefix().getText())) {
      visit(ctx.factor_prefix());
    }
    Node opNode = new Node(ctx.mulop().getText(), 3);
    Node postfixNode = (Node)visit(ctx.postfix_expr());
    ((ArrayList)this.factorStack.peek()).add(postfixNode);
    ((ArrayList)this.factorStack.peek()).add(opNode);

    return null;
  }



//clear
//'WRITE' '(' id_list ')' ';'
  public Node visitWrite_stmt(@NotNull LexParser.Write_stmtContext ctx)
  {
    String[] idArray = ctx.id_list().getText().split(",");
    for (int i = 0; i < idArray.length; i++) {
      Node newNode = findIdNode(idArray[i], this.functionRecord);
      if (newNode.type == 1) {
        this.outputList.add("WRITEI " + newNode.content);
      }
      else if (newNode.type == 5) {
        this.outputList.add("WRITES " + newNode.content);
      }
      else
      {
        this.outputList.add("WRITEF " + newNode.content);
      }
    }

    return null;
  }

  public Node visitRead_stmt(@NotNull LexParser.Read_stmtContext ctx)
  {
    String[] idArray = ctx.id_list().getText().split(",");
    for (int i = 0; i < idArray.length; i++) {
      Node newNode = findIdNode(idArray[i], this.functionRecord);
      if (newNode.type == 1) {
        this.outputList.add("READI " + newNode.content);
      }
      else
      {
        this.outputList.add("READF " + newNode.content);
      }
    }

    return null;
  }

  
  
  
  //clear ; shit may have problem here
  public Node visitAssign_expr(@NotNull LexParser.Assign_exprContext ctx)
  {
    Node exprNode = (Node)visit(ctx.expr());
    Node newNode = findIdNode(ctx.id().getText(), this.functionRecord);
    if (newNode.type == 1) {
      this.outputList.add("STOREI " + exprNode.content + " " + newNode.content);
    }
    else
    {
      this.outputList.add("STOREF " + exprNode.content + " " + newNode.content);
    }

    return null;
  }





// 'WHILE' '(' cond ')' decl aug_stmt_list 'ENDWHILE'
  public Node visitWhile_stmt(@NotNull LexParser.While_stmtContext ctx)
  {
    String newLabel = createLabel();
    this.outputList.add("LABEL " + newLabel);
    String newLabel2 = createLabel();
    this.labelStack.add(newLabel2);
    Node comp = visit(ctx.cond());

    this.continueStack.push("JUMP " + newLabel); //lots place have continue
    this.breakStack.push("JUMP " + newLabel2);
    this.outputList.add(comp.content + " " + newLabel2); // LT a, b label2 
    visit(ctx.aug_stmt_list());  // all kinds of statement inside the while block
    this.outputList.add("JUMP " + newLabel);
    this.outputList.add("LABEL " + newLabel2);
    this.breakStack.pop();
    this.continueStack.pop();
    return null;
  }

//conclusion
//LABEL start
//


//jump start
//label end






  public Node visitAug_if_stmt(@NotNull LexParser.Aug_if_stmtContext ctx)
  {
    if (!"".equals(ctx.aug_else_part().getText())) {
      Node comp = (Node)visit(ctx.cond());
      if (comp.content.equalsIgnoreCase("TRUE")) {
        visit(ctx.aug_stmt_list());
      }
      else if (comp.content.equalsIgnoreCase("FALSE")) {
        String newLabel2 = createLabel();
        this.labelStack.push(newLabel2);
        visit(ctx.aug_else_part());
        this.outputList.add("LABEL " + newLabel2);
      }
      else {
        String newLabel = createLabel();
        this.outputList.add(comp.content + " " + newLabel);
        visit(ctx.aug_stmt_list());
        String newLabel2 = createLabel();
        this.labelStack.push(newLabel2);
        this.outputList.add("JUMP " + newLabel2);
        this.outputList.add("LABEL " + newLabel);
        visit(ctx.aug_else_part());
        this.outputList.add("LABEL " + newLabel2);
      }
    }
    else {
      Node comp = (Node)visit(ctx.cond());
      if (comp.content.equalsIgnoreCase("TRUE")) {
        visit(ctx.aug_stmt_list());
      }
      else if (!comp.content.equalsIgnoreCase("FALSE"))
      {
        String newLabel2 = createLabel();
        this.outputList.add(comp.content + " " + newLabel2);
        visit(ctx.aug_stmt_list());
        this.outputList.add("LABEL " + newLabel2);
      }
    }
    return null;
  }

  public Node visitAug_else_part(@NotNull LexParser.Aug_else_partContext ctx)
  {
    visit(ctx.aug_stmt_list());
    return null;
  }


  
 // 'IF' '(' cond ')' decl stmt_list else_part 'ENDIF' 
  public Node visitIf_stmt(@NotNull LexParser.If_stmtContext ctx)
  {
    if (!"".equals(ctx.else_part().getText())) {
      Node comp = (Node)visit(ctx.cond());
      if (comp.content.equalsIgnoreCase("TRUE")) {
        visit(ctx.stmt_list());
      }
      else if (comp.content.equalsIgnoreCase("FALSE")) {
        String newLabel2 = createLabel();
        this.labelStack.push(newLabel2);
        visit(ctx.else_part());
        this.outputList.add("LABEL " + newLabel2);
      }
      else {
        String newLabel = createLabel();
        this.outputList.add(comp.content + " " + newLabel);
        visit(ctx.stmt_list());
        String newLabel2 = createLabel();
        this.labelStack.push(newLabel2);
        this.outputList.add("JUMP " + newLabel2);
        this.outputList.add("LABEL " + newLabel);
        visit(ctx.else_part());
        this.outputList.add("LABEL " + newLabel2);
      }
    }
    else {
      Node comp = (Node)visit(ctx.cond());
      if (comp.content.equalsIgnoreCase("TRUE")) {
        visit(ctx.stmt_list());
      }
      else if (!comp.content.equalsIgnoreCase("FALSE"))
      {
        String newLabel2 = createLabel();
        this.outputList.add(comp.content + " " + newLabel2);
        visit(ctx.stmt_list());
        this.outputList.add("LABEL " + newLabel2);
      }
    }
    return null;
  }

  
  
  
  
  
  //else_part  :  'ELSE' decl stmt_list   | /* */
  public Node visitElse_part(@NotNull LexParser.Else_partContext ctx)
  {
    visit(ctx.stmt_list());
    return null;
  }

 /* 
  public Node visitAug_break(@NotNull LexParser.Aug_breakContext ctx)
  {
    this.outputList.add((String)this.breakStack.peek());
    return null;
  }

  public Node visitAug_continue(@NotNull LexParser.Aug_continueContext ctx)
  {
    this.outputList.add((String)this.continueStack.peek());
    this.outputList.add((String)this.breakStack.peek());
    return null;
  }
*/
  
  
  
  
  
  
  //clear
  public Node visitCond(@NotNull LexParser.CondContext ctx)  //expr compop expr
  {
    Node op1 = (Node)visit(ctx.expr());

    visit(ctx.compop());
    Node op2 = (Node)visit(ctx.expr1());// name it in .g file or automatically done? shit not done?
    return resolveComp(op1, op2, ctx.compop().getText());
  }






/*
  public String resolveDoComp(String input)
  {
    if (input.contains("GEI")) {
      return input.replace("GEI", "LTI");
    }
    if (input.contains("LEI")) {
      return input.replace("LEI", "GTI");
    }
    if (input.contains("NEI")) {
      return input.replace("NEI", "EQI");
    }
    if (input.contains("EQI")) {
      return input.replace("EQI", "NEI");
    }
    if (input.contains("GTI")) {
      return input.replace("GTI", "LEI");
    }
    if (input.contains("LTI")) {
      return input.replace("LTI", "GEI");
    }
    if (input.contains("GEF")) {
      return input.replace("GEF", "LTF");
    }
    if (input.contains("LEF")) {
      return input.replace("LEF", "GTF");
    }
    if (input.contains("NEF")) {
      return input.replace("NEF", "EQF");
    }
    if (input.contains("EQF")) {
      return input.replace("EQF", "NEF");
    }
    if (input.contains("GTF")) {
      return input.replace("GTF", "LEF");
    }
    if (input.contains("LTF")) {
      return input.replace("LTF", "GEF");
    }

    System.out.println("ERROR @ resolveDoComp");
    return null;
  }

*/
  
  public Node resolveComp(Node op1, Node op2, String op)
  {
  //  if ((op1.type == 1) && (op2.type == 1)) {
      if (op.equalsIgnoreCase("<")) {
        return new Node("LT " + op1.content + " " + op2.content, 4);
      }
      if (op.equalsIgnoreCase(">")) {
        return new Node("GT " + op1.content + " " + op2.content, 4);
      }
      if (op.equalsIgnoreCase("=")) {
        return new Node("EQ " + op1.content + " " + op2.content, 4);
      }
      if (op.equalsIgnoreCase("!=")) {
        return new Node("NE " + op1.content + " " + op2.content, 4);
      }
      if (op.equalsIgnoreCase("<=")) {
        return new Node("LE " + op1.content + " " + op2.content, 4);
      }
      if (op.equalsIgnoreCase(">=")) {
        return new Node("GE " + op1.content + " " + op2.content, 4);
      }

      System.out.println("ERROR @ resolveComp");
      return null;
   }
/*
    if (op.equalsIgnoreCase("<")) {
      return new Node("GEF " + op1.content + " " + op2.content, 4);
    }
    if (op.equalsIgnoreCase(">")) {
      return new Node("LEF " + op1.content + " " + op2.content, 4);
    }
    if (op.equalsIgnoreCase("=")) {
      return new Node("NEF " + op1.content + " " + op2.content, 4);
    }
    if (op.equalsIgnoreCase("!=")) {
      return new Node("EQF " + op1.content + " " + op2.content, 4);
    }
    if (op.equalsIgnoreCase("<=")) {
      return new Node("GTF " + op1.content + " " + op2.content, 4);
    }
    if (op.equalsIgnoreCase(">=")) {
      return new Node("LTF " + op1.content + " " + op2.content, 4);
    }

    System.out.println("ERROR @ resolveComp");
    return null;
  }

*/
  
//clear  
  public String createLabel()
  {
    this.labelIndex += 1;
    return "label" + Integer.toString(this.labelIndex);
  }

 //clear
  public String createTemp() {
    this.tempIndex += 1;
    if (this.tempIndex > this.finalTempIndex) {
      this.finalTempIndex = this.tempIndex;
    }

    (this.tempMap.get(this.functionRecord)).add("$T" + Integer.toString(this.tempIndex));  //tempmap keeps track all the temp variable needed in one funciton
    return "$T" + Integer.toString(this.tempIndex);
  }

  
//clear  
  public Node resolve(ArrayList<Node> input)
  {
    while (input.size() >= 3)
    {
      Node op1 = (Node)input.get(0);
      Node op = (Node)input.get(1);
      Node op2 = (Node)input.get(2);

      Node newNode = new Node(createTemp(), op1.type);
      if (op.content.equalsIgnoreCase("+")) {
        if (op1.type == 1) {
          String output = "ADDI " + op1.content + " " + op2.content + " " + newNode.content;
          this.outputList.add(output);
        }
        else
        {
          String output = "ADDF " + op1.content + " " + op2.content + " " + newNode.content;
          this.outputList.add(output);
        }

      }
      else if (op.content.equalsIgnoreCase("-")) {
        if (op1.type == 1) {
          String output = "SUBI " + op1.content + " " + op2.content + " " + newNode.content;
          this.outputList.add(output);
        }
        else
        {
          String output = "SUBF " + op1.content + " " + op2.content + " " + newNode.content;
          this.outputList.add(output);
        }

      }
      else if (op.content.equalsIgnoreCase("*")) {
        if (op1.type == 1) {
          String output = "MULTI " + op1.content + " " + op2.content + " " + newNode.content;
          this.outputList.add(output);
        }
        else
        {
          String output = "MULTF " + op1.content + " " + op2.content + " " + newNode.content;
          this.outputList.add(output);
        }

      }
      else if (op1.type == 1) {
        String output = "DIVI " + op1.content + " " + op2.content + " " + newNode.content;
        this.outputList.add(output);
      }
      else
      {
        String output = "DIVF " + op1.content + " " + op2.content + " " + newNode.content;
        this.outputList.add(output);
      }

      input.remove(0);
      input.remove(0);
      input.remove(0);

      input.add(0, newNode);
    }

    Node returnValue = (Node)input.get(0);
    input.removeAll(input);
    return returnValue;  //every time run resolve, will return a value of the computation result
  }

  public String return3AC() {
    String result = "";
   // System.out.println("list size"+this.outputList.size());
    for (int i = 0; i < this.outputList.size()-1; i++) {
 
      result = result + ";"+(String)this.outputList.get(i);
      result = result + "\n";
    }
    result = result + ";"+(String)this.outputList.get(outputList.size()-1);
    System.out.println(";IR code\n"+result);
    return result;    //the way to combine strings
  }
}
