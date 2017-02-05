/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3;

import t3.Saida;
import grammar.SeQueLaBaseListener;
import java.util.ArrayList;

/**
 *
 * @author Guilherme
 */

public class GeradorDeCodigo extends SeQueLaBaseListener {

    private static Saida out;
    public static BufferTabela tempOutput = new BufferTabela();
    public static BufferTabela otherOutput = new BufferTabela();
    
    public static Boolean distinct = false;
    
    public GeradorDeCodigo() {
    }
    public GeradorDeCodigo(Saida out) {
        this.out = out;
    }
    
     public static void geradorIndice(String tipo, String ent, ArrayList<String> colunas){
        String novaLinha = "\n";
        switch (tipo) {
            case "indice":
		otherOutput.adicionarTabela("CREATE INDEX");
                otherOutput.getUltimaEntrada().append("CREATE INDEX ");
                otherOutput.getUltimaEntrada().append(ent);
                break;
            case "em":
                otherOutput.getUltimaEntrada().append(novaLinha+"ON ");
                otherOutput.getUltimaEntrada().append(ent+ "( ");
                for(int i = 0; i < colunas.size(); i++){
                    if(i > 0)
                        otherOutput.getUltimaEntrada().append(", ");
                    otherOutput.getUltimaEntrada().append(colunas.get(i));
                }
                otherOutput.getUltimaEntrada().append(" )");
                break;
        }
    }
    
    // NEW: Cria o Exclui no buffer
    
 
    public static void geradorExclui(String tipo, String ent){
        switch (tipo) {
            case "exclui": 
		    otherOutput.adicionarTabela("DROP TABLE");
                    otherOutput.getUltimaEntrada().append("DROP TABLE ");
                    otherOutput.getUltimaEntrada().append(ent);
                    break;
                     
        }
    }
    
     // NEW: Cria o Altera no buffer
    public static void geradorAltera(String tipo, String ent, String aux){
        String novaLinha;
        switch (tipo) {
            case "altera": 
                    novaLinha = "\n";
                    otherOutput.adicionarTabela("ALTER TABLE");
                    otherOutput.getUltimaEntrada().append(novaLinha+"ALTER TABLE ");  
                    otherOutput.getUltimaEntrada().append(ent);                    
                    break;
            case "coluna":
                    novaLinha = "\n\t";                    
                    otherOutput.getUltimaEntrada().append(novaLinha+"ALTER COLUMN ");  
                    otherOutput.getUltimaEntrada().append(ent+" ");   
                    otherOutput.getUltimaEntrada().append(aux);   
                break;
            case "adiciona":
                    novaLinha = "\n\t";
                    otherOutput.getUltimaEntrada().append(novaLinha+"ADD ");  
                    otherOutput.getUltimaEntrada().append(ent+" ");   
                    otherOutput.getUltimaEntrada().append(aux);   
                    break;
            case "exclui":
                     novaLinha = "\n\t"; 
                     otherOutput.getUltimaEntrada().append(novaLinha+"DROP COLUMN ");
                     otherOutput.getUltimaEntrada().append(ent); 
                    break;
            case "fim":
                    otherOutput.getUltimaEntrada().append(";");
                break;
                    
        }
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
                tempOutput.getUltimaEntrada().append(")");
                break;
                          
            case "fim":
                    out.printCodigo(tempOutput.getStringBuffer(";").toString());
                    out.printCodigo(otherOutput.getStringBuffer(";").toString());
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
                    tempOutput.getUltimaEntrada().append(")");
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

    public static void geradorInsert(String ent, ArrayList<String> colunas, ArrayList<String> valores){
        otherOutput.adicionarTabela("INSERT");
        otherOutput.getUltimaEntrada().append("INSERT INTO " + ent + "(");
        for(int i = 0; i < colunas.size(); i++){
            if(i > 0)
                otherOutput.getUltimaEntrada().append(", ");
            otherOutput.getUltimaEntrada().append(colunas.get(i));
        }
        otherOutput.getUltimaEntrada().append(")");
        
        for(int i = 0; i < valores.size(); i++){
            if(i > 0)
                otherOutput.getUltimaEntrada().append(", ");
            otherOutput.getUltimaEntrada().append("\n\t(" + valores.get(i) + ")");
        }

    };
    
    public static void geradorSelectCabesalho(ArrayList<String> colunas){
        otherOutput.adicionarTabela("SELECT");
        otherOutput.getUltimaEntrada().append("SELECT ");
        if(distinct){
            otherOutput.getUltimaEntrada().append("DISTINCT ");
            distinct = false;
        }
        if(!colunas.isEmpty())
            for(int i = 0; i < colunas.size(); i++){
                if(i > 0)
                    otherOutput.getUltimaEntrada().append(", ");
                otherOutput.getUltimaEntrada().append(colunas.get(i));
            }
        else
            otherOutput.getUltimaEntrada().append("*");
    };
    
    public static void geradorSelectFrom(ArrayList<String> from){
        otherOutput.getUltimaEntrada().append("\nFROM ");
        for(int i = 0; i < from.size(); i++){
            if(i > 0)
                otherOutput.getUltimaEntrada().append(", ");
            otherOutput.getUltimaEntrada().append(from.get(i));
        }
    };
    
    public static void geradorSelectWhere(ArrayList<String> where){
        otherOutput.getUltimaEntrada().append("\nWHERE ");
        for(int i = 0; i < where.size(); i++){
            if(i > 0)
                otherOutput.getUltimaEntrada().append("\n ");
            otherOutput.getUltimaEntrada().append(where.get(i));
        }
    };

    public static void geradorSelectGroup(ArrayList<String> from){
        otherOutput.getUltimaEntrada().append("\nGROUP BY ");
        for(int i = 0; i < from.size(); i++){
            if(i > 0)
                otherOutput.getUltimaEntrada().append(", ");
            otherOutput.getUltimaEntrada().append(from.get(i));
        }
    };    
    
    public static void geradorViewCabesalho(String view, ArrayList<String> colunas){
        tempOutput.adicionarTabela(view);
        tempOutput.getUltimaEntrada().append("VIEW "+view+" AS");
        tempOutput.getUltimaEntrada().append("\nSELECT ");
        if(distinct){
            otherOutput.getUltimaEntrada().append("DISTINCT ");
            distinct = false;
        }
        if(!colunas.isEmpty())
            for(int i = 0; i < colunas.size(); i++){
                if(i > 0)
                    tempOutput.getUltimaEntrada().append(", ");
                tempOutput.getUltimaEntrada().append(colunas.get(i));
            }
        else
            tempOutput.getUltimaEntrada().append("*");
    };
    
    public static void geradorViewFrom(ArrayList<String> from){
        tempOutput.getUltimaEntrada().append("\nFROM ");
        for(int i = 0; i < from.size(); i++){
            if(i > 0)
                tempOutput.getUltimaEntrada().append(", ");
            tempOutput.getUltimaEntrada().append(from.get(i));
        }
    };
    
    public static void geradorViewWhere(ArrayList<String> where){
        tempOutput.getUltimaEntrada().append("\nWHERE ");
        for(int i = 0; i < where.size(); i++){
            if(i > 0)
                tempOutput.getUltimaEntrada().append("\n ");
            tempOutput.getUltimaEntrada().append(where.get(i));
        }
    };
    
    public static void geradorViewGroup(ArrayList<String> from){
        tempOutput.getUltimaEntrada().append("\nGROUP BY ");
        for(int i = 0; i < from.size(); i++){
            if(i > 0)
                tempOutput.getUltimaEntrada().append(", ");
            tempOutput.getUltimaEntrada().append(from.get(i));
        }
    };    
    
    public static void setDistinct(){distinct = true;};
    
}