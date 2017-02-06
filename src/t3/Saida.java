/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package t3;

/**
 *
 * @author daniel
 */
public class Saida {
    private StringBuffer textoSintatico = new StringBuffer();
    private StringBuffer textoSemantico = new StringBuffer();
    private StringBuffer textoCodigo = new StringBuffer(); //Geracao de codigo
    
    private boolean sintaticoUsado = false;
    private boolean semanticoUsado = false;
    
    private boolean primeiroErroSintatico = true;
    
    public void printlnSintatico(String txt) {
        if(sintaticoUsado)
            return;
        textoSintatico.append(txt).append("\n");
        sintaticoUsado = true;
    }
    
    public void printlnSemantico(String txt) {
        textoSemantico.append(txt).append("\n");
        semanticoUsado = true;
    }
    
    public void clear() {
        textoSintatico = new StringBuffer();
        textoSemantico = new StringBuffer();
        textoCodigo = new StringBuffer();
    }
    
    public String getTextoSintatico() {
        return textoSintatico.toString();
    }
    
    public String getTextoSemantico() {
        return textoSemantico.toString();
    }
    
    public boolean getPrimeiroErro(){
        return primeiroErroSintatico;
    }
    
    public void setPrimeiroErro(){
        primeiroErroSintatico = false;
    }
    
    public boolean isSintatico(){
        return sintaticoUsado;       
    }
    public boolean isSemantico(){
        return semanticoUsado;       
    }

    public String getTextoCodigo() {
        return textoCodigo.toString();
    }
    public void printCodigo(String txt) {
        textoCodigo.append(txt);
    }
}
