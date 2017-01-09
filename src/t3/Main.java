/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3;


import grammar.SeQueLaLexer;
import grammar.SeQueLaParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;



/**
 *
 * @author Felipe
 */

public class Main {
    

    
    public static void main(String[] args) throws IOException {
        Saida o = new Saida();
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(args[0]));
        SeQueLaLexer lexer = new SeQueLaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SeQueLaParser parser = new SeQueLaParser(tokens);
        parser.addErrorListener(new MyErrorListener(o));
      
        try {
            GeradorDeCodigo gdc = new GeradorDeCodigo(o);
            SeQueLaParser.ProgramaContext raiz = parser.programa();
            ParseTreeWalker ptw = new ParseTreeWalker();
            ptw.walk(gdc, raiz);
        }
        catch (ParseCancellationException pce) {
            if (pce.getMessage()!= null) {
                o.printlnSintatico(pce.getMessage());
               
        }    
        }
        PrintWriter pw = new PrintWriter(args[1]);
        if(o.isSintatico()){
            o.printlnSintatico("Fim da compilacao");
            pw.print(o.getTextoSintatico());
        }
        else if(o.isSemantico()){
            o.printlnSemantico("Fim da compilacao");
            pw.print(o.getTextoSemantico());
        }else{
            pw.print(o.getTextoCodigo());
        }
        
        pw.flush();
        pw.close();
             
    }
    
    

}
