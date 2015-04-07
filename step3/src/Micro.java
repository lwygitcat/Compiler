import java.io.IOException;
import java.io.PrintStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Micro
{
  public static void main(String[] args)
  {
    try
    {
	  //CharStream inputstream = new ANTLRFileStream(args[0].trim());      
      ANTLRFileStream inputstream = new ANTLRFileStream(args[0].trim());
      LexLexer lexer = new LexLexer(inputstream);
      TokenStream tokenStream = new CommonTokenStream(lexer);
      LexParser parser = new LexParser(tokenStream);
      parser.setErrorHandler(new MyErrorStrategy());
      parser.program();
     /*
      ParseTree tree = parser.program();
      ParseTreeWalker walker = new ParseTreeWalker();
      ExtractMicroBaseListener extractor = new ExtractMicroBaseListener(parser);
      walker.walk(extractor, tree);
      for (String str : extractor.table.checkDuplicate()) {
        System.out.println("SHADOW WARNING " + str);
      }
      String out = extractor.table.toString().trim();
      System.out.print(out);
    */
    }
    catch (IOException e)
    {
      System.out.println("file not found");
    }
    /*catch (ArrayIndexOutOfBoundsException e)
    {
      System.out.println("You didn't include the argument");
    }*/
    catch (IllegalMonitorStateException e)
    {
      System.out.println("Not accepted");
    }
    catch (IllegalArgumentException e)
    {
      System.out.println(e.getMessage());
    }
  }
}


