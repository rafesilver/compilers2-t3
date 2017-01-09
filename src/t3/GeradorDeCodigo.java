/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3;

import t3.Saida;
import grammar.SeQueLaBaseListener;

/**
 *
 * @author Guilherme
 */

public class GeradorDeCodigo extends SeQueLaBaseListener {

    private static Saida out;
    public static BufferTabela tempOutput = new BufferTabela();
    

    public GeradorDeCodigo() {
    }
    public GeradorDeCodigo(Saida out) {
        this.out = out;
    }
    
    // Cria uma entidade no buffer tempOut
    public static void demarcador(String tipo, String aux){
         switch (tipo) {
            case "nome-ent":
                tempOutput.adicionarTabela(aux);
                tempOutput.getUltimaEntrada().append("CREATE TABLE "+aux);
                break;
            
            case "abre-parent":
                tempOutput.getUltimaEntrada().append("( ");
                break;
            
            case "atributos":
                aux = aux.replace("[", "").replace("]", "");
                String[] aux2 = aux.split("'");
                int tam = aux2.length;
                aux2[tam-1] = aux2[tam-1].replace(",","");
                   
                for(String o:aux2)
                    tempOutput.getUltimaEntrada().append("\n\t"+o);
                break;
                          
            case "fim":
                    out.printCodigo(tempOutput.getStringBuffer().toString());
                    break;                 
         }
    }
    
    public static void geradorRelacao(String tipo, String ent1, String ent2, String relacao){
        String foreignKey1, foreignKey2, varFK1, varFK2, novaLinha;
        
        // Verifica se as entidades passadas como parametro foram criadas corretamente
        if(tempOutput.existeTabela(ent1) && tempOutput.existeTabela(ent2)){
            
            // Obtem e armazena os atributos (Primary keys) das entidades passadas como referencia
            varFK1 = tempOutput.getEntrada(tempOutput.getIndex(ent1)).getNomePK()+" "+tempOutput.getEntrada(tempOutput.getIndex(ent1)).getTipoPK();
            varFK2 = tempOutput.getEntrada(tempOutput.getIndex(ent2)).getNomePK()+" "+tempOutput.getEntrada(tempOutput.getIndex(ent2)).getTipoPK();

            // Cria as linhas de restricoes para as Foreign Keys
            foreignKey1 = "FOREIGN KEY ("+tempOutput.getEntrada(tempOutput.getIndex(ent1)).getNomePK()+") REFERENCES "+ent1+"("+tempOutput.getEntrada(tempOutput.getIndex(ent1)).getNomePK()+")";
            foreignKey2 = "FOREIGN KEY ("+tempOutput.getEntrada(tempOutput.getIndex(ent2)).getNomePK()+") REFERENCES "+ent2+"("+tempOutput.getEntrada(tempOutput.getIndex(ent2)).getNomePK()+")";

            novaLinha = ",\n\t";
            switch(tipo){
                // Rel 1-1 Foreign key nas 2 tabelas
                case "map1":
                    tempOutput.getEntrada(tempOutput.getIndex(ent1)).append(novaLinha+varFK2+novaLinha+foreignKey2);
                    tempOutput.getEntrada(tempOutput.getIndex(ent2)).append(novaLinha+varFK1+novaLinha+foreignKey1);
                    break;

                // Rel 1-1 Foreign key na segunda tabela
                case "map2":
                    tempOutput.getEntrada(tempOutput.getIndex(ent2)).append(novaLinha+varFK1+novaLinha+foreignKey1);;
                    break;

                // Rel 1-1 Foreign key na primera tabela
                case "map3":
                    tempOutput.getEntrada(tempOutput.getIndex(ent1)).append(novaLinha+varFK2+novaLinha+foreignKey2);
                    break;

                // Rel 1-n Foreign key na tabela com cardinalidade 1
                case "map4":
                    tempOutput.getEntrada(tempOutput.getIndex(ent1)).append(novaLinha+varFK2+novaLinha+foreignKey2);
                    break;

                // Rel m-n Criacao de nova tabela
                case "map5":
                    tempOutput.adicionarTabela(relacao);
                    // Cria nova tabela para a relacao
                    tempOutput.getUltimaEntrada().append("CREATE TABLE "+relacao.toUpperCase());

                    // Cria os atributos e faz as restricoes de Foreign Key
                    tempOutput.getUltimaEntrada().append("(\n\t"+varFK1+novaLinha+varFK2);
                    tempOutput.getUltimaEntrada().append(novaLinha+foreignKey1+novaLinha+foreignKey2);
                    break;
            }
        }

    }
    
    // Gera o tipo na sintaxe correta em SQL
    public static String gerarTipoSQL(String tipo){
        
       
        switch (tipo) {
            case "inteiro":
                return "INTEGER";
            case "literal":
                return "VARCHAR(255)";
            case "real":
                return "REAL";
            case "data":
                return "DATE";
            
        }
        
        return tipo;    
    }
      
    // Gera as restricoes em SQL
    public static String gerarRestricaoSQL(String tipo){
        
       if(tipo == null)
            return "";
        
        switch (tipo) {
            case "chave primaria":
                return "PRIMARY KEY";
            case "nao nulo":
                return "NOT NULL";
            case "unico":
                return "UNIQUE";
            case "null":
                return "";
              
        }
        
         return tipo;   
    }
    
    // Atribui o tipo e o nome da PK na EntradaBufferTabela
    public static void setPrimaryKey(String nome, String tipo){
        tempOutput.getUltimaEntrada().setNomePK(nome);
        tempOutput.getUltimaEntrada().setTipoPK(tipo);
    }

}