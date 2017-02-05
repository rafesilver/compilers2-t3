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
 * @author Felipe + G10
 */

public class Main {
    

    
    public static void main(String[] args) throws IOException {
        if(args.length==0){  
            String path = "src\\testcases\\";
            // nome do arquivo de entrada para teste
            String name = "teste_erro_semantico2";
            
            args = new String[]{"", ""};
            args[0] = path + name + ".txt";
            args[1] = path + "output_" + name + ".txt";
        }
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
            System.out.print(o.getTextoSemantico()); //para testar
        }else{
            pw.print(o.getTextoCodigo());
            System.out.print(o.getTextoCodigo()); //para testar
        }
        
        pw.flush();
        pw.close();
             
    }
    
    

}
