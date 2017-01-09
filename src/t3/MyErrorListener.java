/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t3;

import java.util.BitSet;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

/**
 *
 * @author Felipe
 */
public class MyErrorListener implements ANTLRErrorListener {
    private static Saida out;

    public MyErrorListener(Saida out) {
        this.out = out;
    }
    
    // Erro semantico para entidades ja declaradas
    public static void erroSemantico1(String token, int i){
        if(out.getPrimeiroErro())    
           out.printlnSemantico("Linha "+i+": Entidade "+token+" ja declarada anteriormente");
    }
    
    // Erro semantico para uso de entidades nao declaradas
    public static void erroSemantico2(String token, int i){
        if(out.getPrimeiroErro())    
           out.printlnSemantico("Linha "+i+": Entidade "+token+" nao declarada");
    }
    
    // Erro semantico para escolha de TIPO_MAPEAMENTO incompativel com a CARDINALIDADE
    public static void erroSemantico3(int i){
        if(out.getPrimeiroErro())    
           out.printlnSemantico("Linha "+i+": Mapeamento incompativel com a cardinalidade");
    }
    
    @Override
    public void syntaxError(Recognizer<?, ?> rcgnzr, Object o, int i, int i1, String string, RecognitionException re) {
        String texto = ((CommonToken)o).getText();
        if (texto.equals("<EOF>"))
            {
               texto = "EOF";
            }
        if(out.getPrimeiroErro())
            out.printlnSintatico("Linha "+i+": erro sintatico proximo a " + texto);
            out.setPrimeiroErro();
    }

    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean bln, BitSet bitset, ATNConfigSet atncs) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitset, ATNConfigSet atncs) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atncs) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
