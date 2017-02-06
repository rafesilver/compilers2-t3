grammar SeQueLa;

// PARA RODAR ESSE TREM
//Na Pasta: C:\Users\Fuler\Desktop\compilers2-t3\src\grammar
//Comando: java -jar c:\Users\Fuler\Desktop\antlr-4.5.3-complete.jar -package grammar SeQueLa.g4

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
    import t3.*;
      import static t3.TabelaDeSimbolos.*;
      import static t3.MyErrorListener.*;
      import static t3.GeradorDeCodigo.*;
}

COMENTARIO
    	:	'{' ~('}')* '}'{skip();}
        ;

//Comentario nao fechado
COMENTARIO_ERRADO
        : '{' ~('}')* {stop("Linha "+getLine()+": comentario nao fechado"); }
        ;

ENTIDADE
		:		'Entidade' | 'entidade' | 'ENTIDADE'
		;

RELACIONAMENTO	
		:		'Relacionamento' | 'relacionamento' | 'RELACIONAMENTO'
		;

ALTERA
		:		'Altera' | 'altera' | 'ALTERA'
                                | 'Altere' | 'altere' |  'ALTERE'
                                | 'Alterar' | 'alterar' | 'ALTERAR'
		;

EXCLUI		
		:		'Exclui' | 'exclui' | 'EXCLUI'
                                | 'Exclua' | 'exclua' | 'EXCLUA'
                                | 'Excluir' | 'excluir' | 'EXCLUIR'
		;

INSERE          :               'Insire' | 'insere' | 'INSERE'
                                | 'Insira' | 'insira' | 'INSIRA'
                                | 'Inserir' | 'inserir' | 'INSERIR'
                ;

ADD             :               'Adicione' | 'adicione' | 'ADICIONE'
                                | 'Adiciona' | 'adiciona' | 'ADICIONA'
                                | 'Adicionar' | 'adicionar' | 'ADICIONAR'
                ;

INDICE          :               'Indice' | 'indice' | 'INDICE'
                                | 'Índice' | 'índice' | 'ÍNDICE'
                ;

COLUMN          :               'Coluna' | 'coluna' | 'COLUNA' ;

TUDO            :               '*' | 'Tudo' | 'tudo' | 'TUDO' ;

// SELECIONA _____ DE _____ ONDE _____ = _____

SELECIONA       :               'Seleciona' | 'seleciona' | 'SELECIONA'
                                | 'Selecione' | 'selecione' | 'SELECIONE'
                                | 'Selecionar' | 'selecionar' | 'SELECIONAR'
                ;

DE              :               'De' | 'de' | 'DE'
                ;

EM              :               'Em' | 'em' | 'EM'
                ;

ONDE           :               'Onde' | 'onde' | 'ONDE'
                ;

EXIBE			
		:		'Exibe' | 'exibe' | 'EXIBE'
                                | 'Exiba' | 'exiba' | 'EXIBA'
                                | 'Exibir' | 'exibir' | 'EXIBIR'
		;

VIEW            :               'View' | 'view' | 'VIEW'
                                | 'Visao' | 'visao' | 'VISAO';

GROUP           :               'Agrupa' | 'agrupa' | 'AGRUPA'
                                | 'Agrupe' | 'agrupe' | 'AGRUPE'
                                | 'Agrupar' | 'agrupar' | 'AGRUPAR'
                                | 'Agrupado' | 'agrupado' | 'AGRUPADO'
                ;

DISTINCT        :               'Distinto' | 'distinto' | 'DISTINTO'
                                | 'Distinguir' | 'distinguir' | 'DISTINGUIR'
                                | 'Distingua' | 'distingua' | 'DISTINGUA'
                                | 'Distinguido' | 'distinguido' | 'DISTINGUIDO'
                ;

COMO            :               'Como' | 'como' | 'COMO';

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

LOGICO_E        :   'E' | 'e';
LOGICO_OU       :   'Ou' | 'OU' | 'ou';

CARDINALIDADE
		:		'0' | '1' | 'n' | 'm' | 'N' | 'M'
		;
                   
 //Nome de entidade sempre maisculo, seguindo notacao de Navathe, Elmasri

IDENT
		:		(LETRA_MIN | LETRA_MAI | '_')+ (LETRA_MIN | LETRA_MAI | '_' | DIGITO)*
		;


TABULACAO
		:		('\n') ('\t')+         
		;

WS
    	:   	( ' ' | '\t' | '\r' | '\n' ) {skip();}
    	;

fragment
LETRA_MIN
		:		'a'..'z' | 'ç'
		;

fragment
LETRA_MAI
		:		'A'..'Z' | 'Ç'
		;

fragment
DIGITO
		:		'0'..'9'
		;

OP              :               '=' | '>' | '<' | '>=' | '<=';

ARITMETICO      :               '+' | '-' | '/' | '*';

//--------------------------------------------------
// Tipos de valores

LITERAL : '"' ~('\r' | '\n' | '"')* '"' ;

INTEIRO : (DIGITO)+;
          
REAL : (DIGITO)+ (('.') (DIGITO)+)?;

booleano : 'verdadeiro' | 'Verdadeiro' | 'VERDADEIRO'
         | 'falso' | 'Falso' | 'FALSO';

DATA : DIGITO DIGITO SEP1 DIGITO DIGITO SEP1 DIGITO DIGITO DIGITO DIGITO;

SEP1 : '-' | '/' | ' ';

HORA : DIGITO DIGITO SEP2 DIGITO DIGITO SEP2 DIGITO DIGITO DIGITO DIGITO;

SEP2 : ':' | '-';

valor : LITERAL | INTEIRO | REAL | DATA | HORA 
      | booleano
      ;

valores : valor (',' valor)* ;

//--------------------------------------------------

logico returns[String text] :              
                        LOGICO_E {$text = "AND";}
                        | LOGICO_OU {$text = "OR";};

// Parser

programa
		:		( ent | rel | alt | excl | exibe | insrt | slct | view | indce )* {demarcador("fim", "",0);}
		;

ent
		:		ENTIDADE 
		        	IDENT 
                                {if(!(tabela.existeSimbolo($IDENT.text))){
                                    tabela.adicionarSimbolo($IDENT.text, "ENTIDADE");
                                }
                                else{
                                    MyErrorListener.erroSemantico1($IDENT.text, $IDENT.getLine());
                                }}
                                {String aux=$IDENT.text;
                                 demarcador("nome-ent",aux,$IDENT.getLine());}
		        	modificador_ent {demarcador("abre-parent","",$IDENT.getLine());} 
		        	atributos {demarcador("atributos",$atributos.atrib,$IDENT.getLine());}
		        				
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
		:		IDENT {
                    if(!(tabela.existeSimbolo($IDENT.text)))
                        MyErrorListener.erroSemantico2($IDENT.text, $IDENT.getLine());
                    } rel_esq (',' rel_esq)* (atributos)?
		;

rel_esq returns[String card, String nomeEnt]
		:		IDENT {
                    $nomeEnt = $IDENT.text;
                    if(!(tabela.existeSimbolo($IDENT.text)))
                        MyErrorListener.erroSemantico2($IDENT.text, $IDENT.getLine());
                } 
                CARDINALIDADE {$card = $CARDINALIDADE.text;} participacao
		;

rel_dir returns[String card, String nomeEnt]
		:		participacao CARDINALIDADE {$card = $CARDINALIDADE.text;} IDENT {
                    $nomeEnt = $IDENT.text;
                    if(!(tabela.existeSimbolo($IDENT.text)))
                        MyErrorListener.erroSemantico2($IDENT.text, $IDENT.getLine());
                } 
		;

participacao
		:		'parcial' 	|
                /*epsilon*/
                
				'total'		|
				/*epsilon*/
		;

alt 	
		:		ALTERA IDENT {if(!(tabela.existeSimbolo($IDENT.text))){MyErrorListener.erroSemantico2($IDENT.text, $IDENT.getLine());}}
                                {geradorAltera("altera",$IDENT.text,"",$IDENT.getLine());}
                                (TABULACAO (alt_alt | alt_add | alt_drop))+
		;

    alt_alt : ALTERA (COLUMN)? IDENT TIPO               
              {geradorAltera("coluna",$IDENT.text,$TIPO.text,$IDENT.getLine());}
            ;
    alt_add : ADD IDENT TIPO 
            {geradorAltera("adiciona",$IDENT.text,$TIPO.text,$IDENT.getLine());}
            ;    
    alt_drop : EXCLUI (COLUMN)? IDENT            
            {geradorAltera("exclui",$IDENT.text,null,$IDENT.getLine());}
            ;

excl 	
		:		EXCLUI IDENT {if(!(tabela.existeSimbolo($IDENT.text))){MyErrorListener.erroSemantico2($IDENT.text, $IDENT.getLine());}}
                                {geradorExclui("exclui",$IDENT.text);}
		;	

exibe	
		:		EXIBE IDENT
		;

indce           :               INDICE IDENT 
                                {geradorIndice("indice",$IDENT.text, null);}
                                EM IDENT {if(!(tabela.existeSimbolo($IDENT.text))){MyErrorListener.erroSemantico2($IDENT.text, $IDENT.getLine());}}
                                '(' colunas ')'  
                                {geradorIndice("em",$IDENT.text, $colunas.text);}
                ;



insrt           :               IDENT {if(!(tabela.existeSimbolo($IDENT.text))){MyErrorListener.erroSemantico2($IDENT.text, $IDENT.getLine());}}
                                '(' colunas ')' INSERE valores1
                                { geradorInsert($IDENT.text, $colunas.text, $valores1.text, $IDENT.getLine());}
                ;

colunas returns[ArrayList<String> text]
                :               IDENT 
                                {$text = new ArrayList<>();
                                $text.add($IDENT.text);}
                                (',' colunas2
                                {$text.addAll($colunas2.text);}
                                )?
                ;

colunas2 returns[ArrayList<String> text]
                :               IDENT 
                                {$text = new ArrayList<>();
                                $text.add($IDENT.text);}
                                (',' colunas
                                {$text.addAll($colunas.text);}
                                )?
                ;

valores1 returns[ArrayList<String> text] : (TABULACAO)? '(' valores ')'
                                        {$text = new ArrayList<>();
                                        $text.add(f($valores.text));}
                                        (',' valores2
                                        {$text.addAll($valores2.text);}
                                        )?;


valores2 returns[ArrayList<String> text] : (TABULACAO)? '(' valores ')'
                                        {$text = new ArrayList<>();
                                        $text.add(f($valores.text));}
                                        (',' valores1
                                        {$text.addAll($valores1.text);}
                                        )?;

coluna returns[String text] :
                                IDENT {$text = $IDENT.text;}
                                ('.' atr {$text += "." + $atr.text;})?;

atr returns[String text] : IDENT {$text = $IDENT.text;};

from returns[ArrayList<String> text] :
                                IDENT {if(!(tabela.existeSimbolo($IDENT.text))){MyErrorListener.erroSemantico2($IDENT.text, $IDENT.getLine());}}
                                {$text = new ArrayList<>();
                                $text.add($IDENT.text);}
                                (',' from2
                                {$text.addAll($from2.text);}
                                )?;

from2 returns[ArrayList<String> text] :
                                IDENT {if(!(tabela.existeSimbolo($IDENT.text))){MyErrorListener.erroSemantico2($IDENT.text, $IDENT.getLine());}}
                                {$text = new ArrayList<>();
                                $text.add($IDENT.text);}
                                (',' from
                                {$text.addAll($from.text);}
                                )?;

view :  VIEW IDENT
                {if(!(tabela.existeSimbolo($IDENT.text))){
                                            tabela.adicionarSimbolo($IDENT.text, "VIEW");
                                        }
                                        else{
                                            MyErrorListener.erroSemantico1($IDENT.text, $IDENT.getLine());
                 }}
            COMO 
            SELECIONA (DISTINCT {setDistinct();})?
            (colunas {geradorViewCabesalho($IDENT.text, $colunas.text);}
            | TUDO {geradorViewCabesalho($IDENT.text, new ArrayList<>());})
            (TABULACAO)? DE from {geradorViewFrom($from.text);}
            ((TABULACAO)? ONDE expressao {geradorViewWhere($expressao.text);})?
            ((TABULACAO)? GROUP colunas {geradorViewGroup($colunas.text);})?
            ;

slct            :               SELECIONA (DISTINCT {setDistinct();})?
                                (colunas {geradorSelectCabesalho($colunas.text);}
                                | TUDO {geradorSelectCabesalho(new ArrayList<>());})
                                (TABULACAO)? DE from {geradorSelectFrom($from.text);}
                                ((TABULACAO)? ONDE expressao {geradorSelectWhere($expressao.text);})?
                                ((TABULACAO)? GROUP colunas {geradorSelectGroup($colunas.text);})?
                                ;

expressao returns[ArrayList<String> text] :
                                coluna OP algo
                                {$text = new ArrayList<String>();
                                $text.add($coluna.text +" "+ $OP.text +" "+ $algo.text);}
                                (expressao1 {$text.addAll($expressao1.text);})?;

expressao1 returns[ArrayList<String> text] :
                                 (TABULACAO)? logico coluna OP algo
                                 {$text = new ArrayList<String>();
                                 $text.add($logico.text +" "+ $coluna.text +" "+ $OP.text + " " + $algo.text);}
                                 (expressao2 {$text.addAll($expressao2.text);})?;

expressao2 returns[ArrayList<String> text] :
                                 (TABULACAO)? logico coluna OP algo
                                 {$text = new ArrayList<String>();
                                 $text.add($logico.text +" "+ $coluna.text +" "+ $OP.text + " " + $algo.text);}
                                 (expressao1 {$text.addAll($expressao1.text);})?;

algo returns[String text] :
                            (coluna {$text = $coluna.text;}
                            | valores {$text = f($valores.text);})
                            ;