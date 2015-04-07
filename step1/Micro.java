import java.io.FileReader;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
//import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.*;

public class Micro {
    public static void main(String[] args) throws Exception {
        try{
           CharStream inputstream = new ANTLRFileStream(args[0].trim());          
          // CharStream inputstream = new ANTLRFileStream("fibonacci.micro");            // to be modified           
           LexLexer lexer = new LexLexer(inputstream);
          // System.out.println("start");
           Token token = lexer.nextToken();
           while(token.getType() != Token.EOF){
                if(token.getType() == LexLexer.KEYWORD)
                  // System.out.println(token.getType() + " token text:" +token.getText());
                 {
                   System.out.println ("Token Type: KEYWORD"); System.out.println ("Value: "+token.getText()); 
                  }
                if(token.getType() == LexLexer.IDENTIFIER)
                  // System.out.println(token.getType() + " token text:" +token.getText());
                 {
                   System.out.println ("Token Type: IDENTIFIER"); System.out.println ("Value: "+token.getText()); 
                  }
                if(token.getType() == LexLexer.INTLITERAL)
                   //System.out.println(token.getType() + " token text:" +token.getText());
                 {
                   System.out.println ("Token Type: INTLITERAL"); System.out.println ("Value: "+token.getText()); 
                  }
                if(token.getType() == LexLexer.FLOATLITERAL)
                   //System.out.println(token.getType() + " token text:" +token.getText());
                 {
                   System.out.println ("Token Type: FLOATLITERAL"); System.out.println ("Value: "+token.getText()); 
                  }
                if(token.getType() == LexLexer.STRINGLITERAL)
                   //System.out.println(token.getType() + " token text:" +token.getText());
                 {
                   System.out.println ("Token Type: STRINGLITERAL"); System.out.println ("Value: "+token.getText()); 
                  }

               // if(token.getType() == LexLexer.COMMENT || token.getType() == LexLexer.WS)
                 //  System.out.println(token.getType() + " token text:" +token.getText());
                if(token.getType() == LexLexer.OPERATOR)
                  // System.out.println(token.getType() + " token text:" +token.getText());
                 {
                   System.out.println ("Token Type: OPERATOR"); System.out.println ("Value: "+token.getText()); 
                  }



                token = lexer.nextToken();
           }

        }
        catch(IOException e)
        {
           System.out.println("Couldn't find the file");
        }
    }
}
