import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

public class SuperVisitor extends LexBaseVisitor<Node> 
{
  public ArrayList<String> outputList = new ArrayList<String>();
  private Stack<ArrayList<Node>> factorStack = new Stack<ArrayList<Node>>();
  private Stack<ArrayList<Node>> exprStack = new Stack<ArrayList<Node>>();
//private ArrayList<Node> infactor = new ArrayList<Node>();
//private ArrayList<Node> inexpr = new ArrayList<Node>();

  protected Map<String, Map<String, Node>> tableMap = new LinkedHashMap<String, Map<String, Node>>(); //scope name + symbol map of that scope
  protected Map<String, Integer> functionMap = new LinkedHashMap<String, Integer>();
  protected Map<String, ArrayList<String>> tempMap = new LinkedHashMap<String, ArrayList<String>>();

  private int tempIndex = 0;
  private String functionRecord = "GLOBAL";

  public SuperVisitor(SymbolTable table, Map<String, Integer> functionMap)
  {
    this.functionMap = functionMap;

    for (Scope scope : table.scopestack.subList(0, table.scopestack.size()))
    {
      Map <String, Node> varMap= new LinkedHashMap<String, Node>();
      if (scope.Scopetype.equalsIgnoreCase("GLOBAL")) { 
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
            System.out.println("error adding key to varMap");
          }
        }
      }
      else {
        ;
      }

      this.tableMap.put(scope.Scopetype, varMap); 
    }
  }

  
  
  
  
  //Scopetype is something like GLOBAL, BLCOK X, FUNCTION NAME
  public Node findIdNode(String id, String scopeName)
  {
    if ((this.tableMap.get(scopeName)).get(id) == null) {  
      if ((this.tableMap.get("GLOBAL")).get(id) == null) {  
        System.out.println("can't find assign variable, error@findIdNode");
        return null;
      }


      return this.tableMap.get("GLOBAL").get(id);
    }

 
    return this.tableMap.get(scopeName).get(id);
  }



  public Node visitPrimary(@NotNull LexParser.PrimaryContext ctx) 
  {
    if (ctx.expr() != null)
      return visit(ctx.expr()); 
    if (ctx.id() != null)
      return findIdNode(ctx.id().getText(), this.functionRecord);  
    if (ctx.INTLITERAL() != null) {
      Node newNode = new Node(createTemp(), 1);
      this.outputList.add("STOREI " + ctx.INTLITERAL().getText() + " " + newNode.content); 

      return newNode;
    }

    Node newNode = new Node(createTemp(), 2);
    this.outputList.add("STOREF " + ctx.FLOATLITERAL().getText() + " " + newNode.content);

    return newNode;
  }
  
  
  

  public Node visitFunc_decl(@NotNull LexParser.Func_declContext ctx)
  {
    ArrayList newTempList = new ArrayList();

    this.outputList.add("LABEL " + ctx.id().getText());   
    this.functionRecord = ctx.id().getText();
    this.tempMap.put(this.functionRecord, newTempList);  
    this.outputList.add("LINK ");                   
    visitChildren(ctx);     
    this.tempIndex = 0;   
    if (ctx.any_type().getText().equals("VOID")) {
      this.outputList.add("RET");  
    }
    return null;
  }







  //: expr_prefix factor 
  public Node visitExpr(@NotNull LexParser.ExprContext ctx) 
  {
    if (!"".equals(ctx.expr_prefix().getText())) {  
      ArrayList exprList = new ArrayList();
     // this.inexpr = exprList;
      this.exprStack.push(exprList);
      Node exprNode = (Node)visit(ctx.expr_prefix());
      Node factorNode = (Node)visit(ctx.factor());
     ((ArrayList)this.exprStack.peek()).add(factorNode);
     // this.inexpr.add(factorNode);
      Node resolveNode = resolve((ArrayList)this.exprStack.pop());
     // Node resolveNode = resolve(inexpr);

      return resolveNode;
    }

    Node factorNode = (Node)visit(ctx.factor());
    return factorNode;
  }


// expr_prefix factor addop | empty
  public Node visitExpr_prefix(@NotNull LexParser.Expr_prefixContext ctx)
  {
    if (!"".equals(ctx.expr_prefix().getText())) {
      visit(ctx.expr_prefix());               
    }   
    Node opNode = new Node(ctx.addop().getText(), 3); 
    Node factorNode = (Node)visit(ctx.factor());
   ((ArrayList)this.exprStack.peek()).add(factorNode); 
   ((ArrayList)this.exprStack.peek()).add(opNode); 
    //this.inexpr.add(factorNode); 
    //this.inexpr.add(opNode); 

    return null;     
  }

//factor_prefix postfix_expr
  public Node visitFactor(@NotNull LexParser.FactorContext ctx)
  {
    if (!"".equals(ctx.factor_prefix().getText())) {
      ArrayList factorList = new ArrayList();
      this.factorStack.push(factorList);
      Node exprNode = (Node)visit(ctx.factor_prefix());
      Node postfixNode = (Node)visit(ctx.postfix_expr());
      ((ArrayList)this.factorStack.peek()).add(postfixNode); 
      Node resolveNode = resolve((ArrayList)this.factorStack.pop());

      return resolveNode;
    }

    return (Node)visit(ctx.postfix_expr());
  }



  //factor_prefix postfix_expr mulop | empty
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



 
  public String createTemp() {
    this.tempIndex += 1;
    //if (this.tempIndex > this.finalTempIndex) {
      //this.finalTempIndex = this.tempIndex;
   // }

    (this.tempMap.get(this.functionRecord)).add("$T" + Integer.toString(this.tempIndex));  
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
    return returnValue;  
  }

  public String return3AC() {
    String result = "";
    for (int i = 0; i < this.outputList.size()-1; i++) {
 
      result = result + ";"+(String)this.outputList.get(i);
      result = result + "\n";
    }
    result = result + ";"+(String)this.outputList.get(outputList.size()-1);
    System.out.println(";IR code\n"+result);
    return result;   
  }
}
