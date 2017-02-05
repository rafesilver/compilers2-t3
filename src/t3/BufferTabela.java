/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guilherme
 */

// Similar a TabelaDeSimbolos, armazena um List de tabelas que pode ser acessado dada uma entidade
public class BufferTabela {
    private List<EntradaBufferTabela> tabelas;

    public BufferTabela() {
        tabelas = new ArrayList<>();
    }
    
    public void adicionarTabela(String nome) {
        tabelas.add(new EntradaBufferTabela(nome));
    }
    
    
    public void setNome(){
    }
    
    public boolean existeTabela(String nome) {
        int i = 0;
        for(EntradaBufferTabela etds: tabelas) {
            i++;
            if(etds.getEntidade().equals(nome)) {
                return true;
            }
        }
        return false;
    }
    
    public List<EntradaBufferTabela> getTabelas(){
        return tabelas;
    }
    
    public EntradaBufferTabela getEntrada(int i){
        return tabelas.get(i);
    }
    
    public EntradaBufferTabela getUltimaEntrada (){
        return tabelas.get(tabelas.size()-1);
    }
    
    
    public StringBuffer getStringBuffer(String end){
        StringBuffer buffer = new StringBuffer();
        int i;
        
        // Laço que une todos as tabelas em um buffer
        for(i = 0; i<tabelas.size(); i++){
            buffer.append(tabelas.get(i).getTextoCodigo());
            // Fecha as tabelas com );
            buffer.append(end+"\n\n");
        }
        return buffer;
    }
    
    public int getIndex(String nome){
        for(int i = 0; i < tabelas.size(); i++){
            if(tabelas.get(i).getEntidade().equals(nome)){
                return i;
            }
        }
        return -1; // Retorna -1 se não achar a entidade pelo nome
    }
    
    
}
