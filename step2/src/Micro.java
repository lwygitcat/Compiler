import java.io.FileReader;
import java.io.IOException;

import org.antlr.v4.runtime.*;

public class Micro {
    public static void main(String[] args) throws Exception {
        try{
           CharStream inputstream = new ANTLRFileStream(args[0].trim());                   
           LexLexer lexer = new LexLexer(inputstream);
          // System.out.println("start");
           TokenStream tokenStream = new CommonTokenStream(lexer);
		   LexParser parser = new LexParser(tokenStream);

           
           ANTLRErrorStrategy es = new MyErrorStrategy();	   
           parser.setErrorHandler(es);	
           
           parser.program();
		   System.out.println("Accepted");         
        }
        catch(Exception e)
        {
          System.out.println("Not Accepted");
           //System.out.println(e);
        }
    }
}

