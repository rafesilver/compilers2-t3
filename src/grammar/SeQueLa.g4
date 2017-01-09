grammar SeQueLa;

// Analisador Lexico
@lexer::members
{
   private void stop(String msg)
   {
      throw new ParseCancellationException(msg);
   }
   
}

@parser::members{   
 TabelaDeSimbolos tabela = new TabelaDeSimbolos();
}

//Setando o pacote para todos os arquivos gerados pelo ANTLR
@header{
    package trabalho3;
      import static trabalho3.GeradorDeCodigo.*;
}

COMENTARIO
    	:	'{' ~('}')* '}'{skip();}
        ;

//Comentario nao fechado
COMENTARIO_ERRADO
        : '{' ~('}')* {stop("Linha "+getLine()+": comentario nao fechado"); }
        ;

ENTIDADE
		:		'Entidade' | 'entidade' 
		;

RELACIONAMENTO	
		:		'Relacionamento' | 'relacionamento'
		;

ALTERA
		:		'Altera'
		;

EXCLUI		
		:		'Exclui'
		;

EXIBE			
		:		'Exibe'
		;

TIPO
		:		'inteiro' | 'real' | 'data' | 'hora' | 'booleano' | 'literal' 
		;

COMPOSTO
        :       'composto'
        ;

RESTRICAO		
		:		'chave primaria' | 'chave estrangeira' | 'nao nulo' | 'padrao' |
				'verifica' | 'unico'
		;

TIPO_MAPEAMENTO 
        :       'map1' | 'map2' | 'map3' | 'map4' | 'map5' | 'map6'
        ;

CARDINALIDADE
		:		'0' | '1' | 'n' | 'm' | 'N' | 'M'
		;
                   
 //Nome de entidade sempre maisculo, seguindo notacao de Navathe, Elmasri
NOME_ENTIDADE
		:		(LETRA_MAI)+ (LETRA_MAI | '_' | DIGITO)*
		;

IDENT
		:		(LETRA_MIN | '_')+ (LETRA_MIN | '_' | DIGITO)*
		;


TABULACAO
		:		('\n') ('\t')+         
		;

WS
    	:   	( ' ' | '\t' | '\r' | '\n' ) {skip();}
    	;

fragment
LETRA_MIN
		:		'a'..'z'
		;

fragment
LETRA_MAI
		:		'A'..'Z'
		;

fragment
DIGITO
		:		'0'..'9'
		;


// Parser

programa
		:		( ent | rel | alt | excl | exibe )* {demarcador("fim", "");}
		;

ent
		:		ENTIDADE //{demarcador("entidade","");} 
		        	NOME_ENTIDADE 
                                {if(!(tabela.existeSimbolo($NOME_ENTIDADE.text))){
                                    tabela.adicionarSimbolo($NOME_ENTIDADE.text, "ENTIDADE");
                                }
                                else{
                                    MyErrorListener.erroSemantico1($NOME_ENTIDADE.text, $NOME_ENTIDADE.getLine());
                                }}
                                {String aux=$NOME_ENTIDADE.text;
                                 demarcador("nome-ent",aux);}
		        	modificador_ent {demarcador("abre-parent","");} 
		        	atributos {demarcador("atributos",$atributos.atrib);}
		        				
		;
		
modificador_ent
		:		'fraca' IDENT |
				'forte'	|
				/*epsilon*/
		;

atributos returns[String atrib]
		:		declaracao mais_declaracao {
                    $atrib = $declaracao.dec + $mais_declaracao.mais_dec;
                }
		;

mais_declaracao returns[ArrayList<String> mais_dec]
                @init{$mais_dec = new ArrayList<>();}
		:		atributos {
                    $mais_dec.add($atributos.atrib);
                }
                | /*epsilon*/
		;	

declaracao returns[String dec]
        :		TABULACAO IDENT TIPO (RESTRICAO)* {
                    String nome, tipo, restricao;
                    nome = $IDENT.text;
                    tipo = gerarTipoSQL($TIPO.text);
                    restricao = gerarRestricaoSQL($RESTRICAO.text);
                    $dec = nome + " " + tipo + " " + restricao + "," + "'";

                    if(restricao.equals("PRIMARY KEY"))
                        setPrimaryKey(nome, tipo);
                }
                | TABULACAO IDENT COMPOSTO dec_composto 
		;
//TO DO
dec_composto 
        :
        ;


rel
		:		rel_binaria | rel_n
		;

rel_binaria	
		:		rel_esq IDENT rel_dir TIPO_MAPEAMENTO (atributos)? {
                                        
                    String tipoMap = $TIPO_MAPEAMENTO.text;
                                        
                    // Mapeamento de relacoes com Cardinalidade 1 para 1
					if(($rel_esq.card+$rel_dir.card).equals("11")){
                    if(!((tipoMap.equals("map1"))||(tipoMap.equals("map2"))||(tipoMap.equals("map3")))){
                        MyErrorListener.erroSemantico3($IDENT.getLine());
                    }
                    else
                        geradorRelacao(tipoMap, $rel_esq.nomeEnt, $rel_dir.nomeEnt, $IDENT.text);
                    }
            
                    // Mapeamento de relacoes com Cardinalidade 1 para n
                    if(($rel_esq.card+$rel_dir.card).equals("1n")){
                        if(!tipoMap.equals("map4"))
                            MyErrorListener.erroSemantico3($IDENT.getLine());  
                    else
                        geradorRelacao(tipoMap, $rel_dir.nomeEnt, $rel_esq.nomeEnt, $IDENT.text);
                    }
            
                    // Mapeamento de relacoes com Cardinalidade n para 1
                    if(($rel_esq.card+$rel_dir.card).equals("n1")){
                        if(!tipoMap.equals("map4"))
                            MyErrorListener.erroSemantico3($IDENT.getLine());  
                        else
                            geradorRelacao(tipoMap, $rel_esq.nomeEnt, $rel_dir.nomeEnt, $IDENT.text);
                    }
            
                    // Mapeamento de relacoes com Cardinalidade m para n
                    if(($rel_esq.card+$rel_dir.card).equals("mn")||($rel_esq.card+$rel_dir.card).equals("nm")){
                        if(!tipoMap.equals("map5"))
                            MyErrorListener.erroSemantico3($IDENT.getLine());  
                        else
                            geradorRelacao(tipoMap, $rel_esq.nomeEnt, $rel_dir.nomeEnt, $IDENT.text);
                    }
                                        
				}
		;

rel_n
		:		NOME_ENTIDADE {
                    if(!(tabela.existeSimbolo($NOME_ENTIDADE.text)))
                        MyErrorListener.erroSemantico2($NOME_ENTIDADE.text, $NOME_ENTIDADE.getLine());
                    } rel_esq (',' rel_esq)* (atributos)?
		;

rel_esq returns[String card, String nomeEnt]
		:		NOME_ENTIDADE {
                    $nomeEnt = $NOME_ENTIDADE.text;
                    if(!(tabela.existeSimbolo($NOME_ENTIDADE.text)))
                        MyErrorListener.erroSemantico2($NOME_ENTIDADE.text, $NOME_ENTIDADE.getLine());
                } 
                CARDINALIDADE {$card = $CARDINALIDADE.text;} participacao
		;

rel_dir returns[String card, String nomeEnt]
		:		participacao CARDINALIDADE {$card = $CARDINALIDADE.text;} NOME_ENTIDADE {
                    $nomeEnt = $NOME_ENTIDADE.text;
                    if(!(tabela.existeSimbolo($NOME_ENTIDADE.text)))
                        MyErrorListener.erroSemantico2($NOME_ENTIDADE.text, $NOME_ENTIDADE.getLine());
                } 
		;

participacao
		:		'parcial' 	|
                /*epsilon*/
                
				'total'		|
				/*epsilon*/
		;

alt 	
		:		ALTERA NOME_ENTIDADE
		;

excl 	
		:		EXCLUI NOME_ENTIDADE
		;	

exibe	
		:		EXIBE NOME_ENTIDADE
		;


