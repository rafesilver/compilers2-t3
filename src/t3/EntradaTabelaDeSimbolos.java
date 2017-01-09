package t3;

import java.util.List;
import java.util.ArrayList;

public class EntradaTabelaDeSimbolos {
    private String nome, tipo;
    
    public EntradaTabelaDeSimbolos(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String t) {
        tipo = t;
    }
    
    @Override
    public String toString() {
        return nome+"("+tipo+")";
    }
}