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
    
    public static String whatType(String text){
        if(text.matches("[0-9]+"))
            return "INTEGER";
        if(text.matches("[0-9]+(\\.[0-9]+)?"))
            return "REAL";
        if(text.matches("\"(.)+\""))
            return "VARCHAR(255)";
        if(text.equals("TRUE") || text.equals("FALSE"))
            return "BOOLEAN";
        if(text.matches("([0-9]{2}(:|-)){2}[0-9]{2}"))
            return "TIME";
        if(text.matches("([0-9]{2}( |-|\\/)){2}[0-9]{4}"))
            return "DATE";
        
        return null;
    }
    
    public static Boolean compareType(String type1, String type2){
        //System.out.print("\n["+type1+" - "+type2+"]");
        if(type1.equals(type2))
            return true;
        else
            if(type1.equals("REAL") && type2.equals("INTEGER"))
                return true;

        return false;
    }
    
    public static String f(String text){
        text = text.replace("verdadeiro", "TRUE");
        text = text.replace("Verdadeiro", "TRUE");
        text = text.replace("VERDADEIRO", "TRUE");
        text = text.replace("falso", "FALSE");
        text = text.replace("Falso", "FALSE");
        text = text.replace("FALSO", "FALSE");
        return text;
    }
 
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
    public static void geradorAltera(String tipo, String ent, String aux, int line){
        String novaLinha = "\n\t"; 
        switch (tipo) {
            case "altera": 
                    otherOutput.adicionarTabela("ALTER TABLE");
                    otherOutput.getUltimaEntrada().append("ALTER TABLE ");
                    otherOutput.getUltimaEntrada().setNomePK(ent);
                    otherOutput.getUltimaEntrada().append(ent);                    
                    break;
            case "coluna":  
                    if(!tempOutput.getEntrada(tempOutput.getIndex(otherOutput.getUltimaEntrada().getNomePK())).checkCol(ent))
                        out.printlnSemantico("Linha "+line+": Nao existe coluna chamada '"+ent+"' na entidade.");
                    otherOutput.getUltimaEntrada().append(novaLinha+"ALTER COLUMN ");  
                    otherOutput.getUltimaEntrada().append(ent+" "+aux);
                break;
            case "adiciona":
                    if(tempOutput.getEntrada(tempOutput.getIndex(otherOutput.getUltimaEntrada().getNomePK())).checkCol(ent))
                        out.printlnSemantico("Linha "+line+": Ja existe coluna chamada '"+ent+"' na entidade.");
                    otherOutput.getUltimaEntrada().append(novaLinha+"ADD ");  
                    otherOutput.getUltimaEntrada().append(ent+" "+aux);  
                    break;
            case "exclui":
                    if(!tempOutput.getEntrada(tempOutput.getIndex(otherOutput.getUltimaEntrada().getNomePK())).checkCol(ent))
                        out.printlnSemantico("Linha "+line+": Nao existe coluna chamada '"+ent+"' na entidade.");
                     otherOutput.getUltimaEntrada().append(novaLinha+"DROP COLUMN ");
                     otherOutput.getUltimaEntrada().append(ent); 
                    break;
            case "fim":
                    otherOutput.getUltimaEntrada().append(";");
                break;
                    
        }
    }
    
    // Cria uma entidade no buffer tempOut
    public static void demarcador(String tipo, String aux, int line){
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
                   
                for(String o:aux2){
                    if(!tempOutput.getUltimaEntrada().checkCol(o.split(" ")[0])){
                        if(o.split(" ").length > 1)
                            tempOutput.getUltimaEntrada().setColunas(o.split(" ")[0],o.split(" ")[1]);
                        
                        }
                    else
                        out.printlnSemantico("Linha "+line+": Ja existe uma coluna chamada '"+o.split(" ")[0]+"' na entidade.");
                        
                    tempOutput.getUltimaEntrada().append("\n\t"+o);
                    }
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
            case "booleano":
                return "BOOLEAN";
            case "hora":
                return "TIME";
            
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

    public static void geradorInsert(String ent, ArrayList<String> colunas, ArrayList<String> valores, int line){
        if(tempOutput.getIndex(ent) == -1)
            return;
        otherOutput.adicionarTabela("INSERT");
        otherOutput.getUltimaEntrada().append("INSERT INTO " + ent + "(");
        for(int i = 0; i < colunas.size(); i++){
            if(!tempOutput.getEntrada(tempOutput.getIndex(ent)).checkCol(colunas.get(i))){
                out.printlnSemantico("Linha "+line+": Nao existe coluna chamada '"+colunas.get(i)+"' na entidade.");
                return;
            }
            if(i > 0)
                otherOutput.getUltimaEntrada().append(", ");
            otherOutput.getUltimaEntrada().append(colunas.get(i));
        }
        otherOutput.getUltimaEntrada().append(")");
        
        for(int i = 0; i < valores.size(); i++){
            
            // Checar se o número de colunas/valores bate
            if(valores.get(i).split(",").length != colunas.size())
                out.printlnSemantico("Linha "+line+": Numero incompativel de colunas e valores.");
            else
                // Checar se o tipo dos valores é compatível com o da coluna
                for(int j = 0; j < valores.get(i).split(",").length; j++)
                    if(!compareType(tempOutput.getEntrada(tempOutput.getIndex(ent)).getColType(colunas.get(j)),whatType(valores.get(i).split(",")[j])))
                        out.printlnSemantico("Linha "+line+": O valor " + valores.get(i).split(",")[j]
                        +" nao eh compativel com "+colunas.get(j)+" ("+tempOutput.getEntrada(tempOutput.getIndex(ent)).getColType(colunas.get(j))+").");
            
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