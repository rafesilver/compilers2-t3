package t3;

import java.util.ArrayList;
import java.util.List;

public class TabelaDeSimbolos {
    private List<EntradaTabelaDeSimbolos> simbolos;
    
    public TabelaDeSimbolos() {
        simbolos = new ArrayList<>();
    }
    
    public void adicionarSimbolo(String nome, String tipo) {
        simbolos.add(new EntradaTabelaDeSimbolos(nome,tipo));
    }
    
    public void adicionarSimbolos(List<String> nomes, String tipo) {
        for(String s:nomes) {
            simbolos.add(new EntradaTabelaDeSimbolos(s, tipo));
        }
    }
    
    public boolean existeSimbolo(String nome) {
        int i = 0;
        for(EntradaTabelaDeSimbolos etds: simbolos) {
            i++;
            if(etds.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }
    
    public List<EntradaTabelaDeSimbolos> getSimbolos(){
        return simbolos;
    }
    
    public int getTamanho(){
        return simbolos.size();
    }
    
    public String getNome(int i){
        return simbolos.get(i).getNome();
    }
    
    public String getTipo(int i){
        return simbolos.get(i).getTipo();
    }
}