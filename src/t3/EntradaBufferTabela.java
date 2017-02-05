/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t3;

import java.util.ArrayList;

/**
 *
 * @author Guilherme
 */

 
//Similar a EntradaTabelaDeSimbolos, cria a entidade para que possa ser modificada após a sua instanciação

public class EntradaBufferTabela {
    private StringBuffer textoCodigo = new StringBuffer();
    private String entidade;
    private String nomePK;
    private String tipoPK;
    
    private ArrayList<String> colunas;
    private ArrayList<String> colType;

    public EntradaBufferTabela(String entidade) {
        this.entidade = entidade;
        colunas = new ArrayList<String>();
        colType = new ArrayList<String>();
    }

    public String getEntidade() {
        return entidade;
    }

    public String getTipoPK() {
        return tipoPK;
    }
    
    public String getNomePK() {
        return nomePK;
    }

    public void setNomePK(String nomePK) {
        this.nomePK = nomePK;
    }

    public void setTipoPK(String tipoPK) {
        this.tipoPK = tipoPK;
    }

    public StringBuffer getTextoCodigo() {
        return textoCodigo;
    }

    public void setColunas(String col, String type){
        colunas.add(col);
        colType.add(type);
    }
    
    public ArrayList<String> getColunas(){
        return colunas;
    }
    
    public Boolean checkCol(String col){
        for(String o:colunas)
            if(o.equals(col))
                return true;
        return false; 
    }
    
    public String getColType(String col){
        for(int i = 0; i < colunas.size(); i++){
            if(col == colunas.get(i))
                return colType.get(i);
        }
        return null;
    }
    
    public void setEntidade(String entidade) {
        this.entidade = entidade;
    }
    
    public void setBuffer(String texto){
        textoCodigo.append(texto);
    }
    
    public void append(String texto){
        textoCodigo.append(texto);
    }
}
