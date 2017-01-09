// Generated from C:\Comp2\comp2T3\src\trabalho3\SeQueLa.g4 by ANTLR 4.2.2

    package grammar;
      import static t3.GeradorDeCodigo.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import t3.MyErrorListener;
import t3.TabelaDeSimbolos;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SeQueLaParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, COMENTARIO=6, COMENTARIO_ERRADO=7, 
		ENTIDADE=8, RELACIONAMENTO=9, ALTERA=10, EXCLUI=11, EXIBE=12, TIPO=13, 
		COMPOSTO=14, RESTRICAO=15, TIPO_MAPEAMENTO=16, CARDINALIDADE=17, NOME_ENTIDADE=18, 
		IDENT=19, TABULACAO=20, WS=21;
	public static final String[] tokenNames = {
		"<INVALID>", "'fraca'", "'total'", "'forte'", "'parcial'", "','", "COMENTARIO", 
		"COMENTARIO_ERRADO", "ENTIDADE", "RELACIONAMENTO", "'Altera'", "'Exclui'", 
		"'Exibe'", "TIPO", "'composto'", "RESTRICAO", "TIPO_MAPEAMENTO", "CARDINALIDADE", 
		"NOME_ENTIDADE", "IDENT", "TABULACAO", "WS"
	};
	public static final int
		RULE_programa = 0, RULE_ent = 1, RULE_modificador_ent = 2, RULE_atributos = 3, 
		RULE_mais_declaracao = 4, RULE_declaracao = 5, RULE_dec_composto = 6, 
		RULE_rel = 7, RULE_rel_binaria = 8, RULE_rel_n = 9, RULE_rel_esq = 10, 
		RULE_rel_dir = 11, RULE_participacao = 12, RULE_alt = 13, RULE_excl = 14, 
		RULE_exibe = 15;
	public static final String[] ruleNames = {
		"programa", "ent", "modificador_ent", "atributos", "mais_declaracao", 
		"declaracao", "dec_composto", "rel", "rel_binaria", "rel_n", "rel_esq", 
		"rel_dir", "participacao", "alt", "excl", "exibe"
	};

	@Override
	public String getGrammarFileName() { return "SeQueLa.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	   
	 TabelaDeSimbolos tabela = new TabelaDeSimbolos();

	public SeQueLaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public List<RelContext> rel() {
			return getRuleContexts(RelContext.class);
		}
		public List<ExibeContext> exibe() {
			return getRuleContexts(ExibeContext.class);
		}
		public List<AltContext> alt() {
			return getRuleContexts(AltContext.class);
		}
		public EntContext ent(int i) {
			return getRuleContext(EntContext.class,i);
		}
		public RelContext rel(int i) {
			return getRuleContext(RelContext.class,i);
		}
		public List<EntContext> ent() {
			return getRuleContexts(EntContext.class);
		}
		public List<ExclContext> excl() {
			return getRuleContexts(ExclContext.class);
		}
		public ExclContext excl(int i) {
			return getRuleContext(ExclContext.class,i);
		}
		public AltContext alt(int i) {
			return getRuleContext(AltContext.class,i);
		}
		public ExibeContext exibe(int i) {
			return getRuleContext(ExibeContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeQueLaVisitor ) return ((SeQueLaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTIDADE) | (1L << ALTERA) | (1L << EXCLUI) | (1L << EXIBE) | (1L << NOME_ENTIDADE))) != 0)) {
				{
				setState(37);
				switch (_input.LA(1)) {
				case ENTIDADE:
					{
					setState(32); ent();
					}
					break;
				case NOME_ENTIDADE:
					{
					setState(33); rel();
					}
					break;
				case ALTERA:
					{
					setState(34); alt();
					}
					break;
				case EXCLUI:
					{
					setState(35); excl();
					}
					break;
				case EXIBE:
					{
					setState(36); exibe();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			demarcador("fim", "");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntContext extends ParserRuleContext {
		public Token NOME_ENTIDADE;
		public AtributosContext atributos;
		public TerminalNode ENTIDADE() { return getToken(SeQueLaParser.ENTIDADE, 0); }
		public AtributosContext atributos() {
			return getRuleContext(AtributosContext.class,0);
		}
		public Modificador_entContext modificador_ent() {
			return getRuleContext(Modificador_entContext.class,0);
		}
		public TerminalNode NOME_ENTIDADE() { return getToken(SeQueLaParser.NOME_ENTIDADE, 0); }
		public EntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterEnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitEnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeQueLaVisitor ) return ((SeQueLaVisitor<? extends T>)visitor).visitEnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntContext ent() throws RecognitionException {
		EntContext _localctx = new EntContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); match(ENTIDADE);
			setState(45); ((EntContext)_localctx).NOME_ENTIDADE = match(NOME_ENTIDADE);
			if(!(tabela.existeSimbolo((((EntContext)_localctx).NOME_ENTIDADE!=null?((EntContext)_localctx).NOME_ENTIDADE.getText():null)))){
			                                    tabela.adicionarSimbolo((((EntContext)_localctx).NOME_ENTIDADE!=null?((EntContext)_localctx).NOME_ENTIDADE.getText():null), "ENTIDADE");
			                                }
			                                else{
			                                    MyErrorListener.erroSemantico1((((EntContext)_localctx).NOME_ENTIDADE!=null?((EntContext)_localctx).NOME_ENTIDADE.getText():null), ((EntContext)_localctx).NOME_ENTIDADE.getLine());
			                                }
			String aux=(((EntContext)_localctx).NOME_ENTIDADE!=null?((EntContext)_localctx).NOME_ENTIDADE.getText():null);
			                                 demarcador("nome-ent",aux);
			setState(48); modificador_ent();
			demarcador("abre-parent","");
			setState(50); ((EntContext)_localctx).atributos = atributos();
			demarcador("atributos",((EntContext)_localctx).atributos.atrib);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Modificador_entContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(SeQueLaParser.IDENT, 0); }
		public Modificador_entContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modificador_ent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterModificador_ent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitModificador_ent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeQueLaVisitor ) return ((SeQueLaVisitor<? extends T>)visitor).visitModificador_ent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Modificador_entContext modificador_ent() throws RecognitionException {
		Modificador_entContext _localctx = new Modificador_entContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_modificador_ent);
		try {
			setState(57);
			switch (_input.LA(1)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53); match(1);
				setState(54); match(IDENT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 2);
				{
				setState(55); match(3);
				}
				break;
			case TABULACAO:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtributosContext extends ParserRuleContext {
		public String atrib;
		public DeclaracaoContext declaracao;
		public Mais_declaracaoContext mais_declaracao;
		public Mais_declaracaoContext mais_declaracao() {
			return getRuleContext(Mais_declaracaoContext.class,0);
		}
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public AtributosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterAtributos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitAtributos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeQueLaVisitor ) return ((SeQueLaVisitor<? extends T>)visitor).visitAtributos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributosContext atributos() throws RecognitionException {
		AtributosContext _localctx = new AtributosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atributos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); ((AtributosContext)_localctx).declaracao = declaracao();
			setState(60); ((AtributosContext)_localctx).mais_declaracao = mais_declaracao();

			                    ((AtributosContext)_localctx).atrib =  ((AtributosContext)_localctx).declaracao.dec + ((AtributosContext)_localctx).mais_declaracao.mais_dec;
			                
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mais_declaracaoContext extends ParserRuleContext {
		public ArrayList<String> mais_dec;
		public AtributosContext atributos;
		public AtributosContext atributos() {
			return getRuleContext(AtributosContext.class,0);
		}
		public Mais_declaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterMais_declaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitMais_declaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeQueLaVisitor ) return ((SeQueLaVisitor<? extends T>)visitor).visitMais_declaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_declaracaoContext mais_declaracao() throws RecognitionException {
		Mais_declaracaoContext _localctx = new Mais_declaracaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mais_declaracao);
		((Mais_declaracaoContext)_localctx).mais_dec =  new ArrayList<>();
		try {
			setState(67);
			switch (_input.LA(1)) {
			case TABULACAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(63); ((Mais_declaracaoContext)_localctx).atributos = atributos();

				                    _localctx.mais_dec.add(((Mais_declaracaoContext)_localctx).atributos.atrib);
				                
				}
				break;
			case EOF:
			case ENTIDADE:
			case ALTERA:
			case EXCLUI:
			case EXIBE:
			case NOME_ENTIDADE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoContext extends ParserRuleContext {
		public String dec;
		public Token IDENT;
		public Token TIPO;
		public Token RESTRICAO;
		public TerminalNode COMPOSTO() { return getToken(SeQueLaParser.COMPOSTO, 0); }
		public TerminalNode TABULACAO() { return getToken(SeQueLaParser.TABULACAO, 0); }
		public TerminalNode RESTRICAO(int i) {
			return getToken(SeQueLaParser.RESTRICAO, i);
		}
		public TerminalNode TIPO() { return getToken(SeQueLaParser.TIPO, 0); }
		public List<TerminalNode> RESTRICAO() { return getTokens(SeQueLaParser.RESTRICAO); }
		public TerminalNode IDENT() { return getToken(SeQueLaParser.IDENT, 0); }
		public Dec_compostoContext dec_composto() {
			return getRuleContext(Dec_compostoContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeQueLaVisitor ) return ((SeQueLaVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracao);
		int _la;
		try {
			setState(83);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69); match(TABULACAO);
				setState(70); ((DeclaracaoContext)_localctx).IDENT = match(IDENT);
				setState(71); ((DeclaracaoContext)_localctx).TIPO = match(TIPO);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RESTRICAO) {
					{
					{
					setState(72); ((DeclaracaoContext)_localctx).RESTRICAO = match(RESTRICAO);
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

				                    String nome, tipo, restricao;
				                    nome = (((DeclaracaoContext)_localctx).IDENT!=null?((DeclaracaoContext)_localctx).IDENT.getText():null);
				                    tipo = gerarTipoSQL((((DeclaracaoContext)_localctx).TIPO!=null?((DeclaracaoContext)_localctx).TIPO.getText():null));
				                    restricao = gerarRestricaoSQL((((DeclaracaoContext)_localctx).RESTRICAO!=null?((DeclaracaoContext)_localctx).RESTRICAO.getText():null));
				                    ((DeclaracaoContext)_localctx).dec =  nome + " " + tipo + " " + restricao + "," + "'";

				                    if(restricao.equals("PRIMARY KEY"))
				                        setPrimaryKey(nome, tipo);
				                
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79); match(TABULACAO);
				setState(80); match(IDENT);
				setState(81); match(COMPOSTO);
				setState(82); dec_composto();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dec_compostoContext extends ParserRuleContext {
		public Dec_compostoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_composto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterDec_composto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitDec_composto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeQueLaVisitor ) return ((SeQueLaVisitor<? extends T>)visitor).visitDec_composto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_compostoContext dec_composto() throws RecognitionException {
		Dec_compostoContext _localctx = new Dec_compostoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dec_composto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelContext extends ParserRuleContext {
		public Rel_binariaContext rel_binaria() {
			return getRuleContext(Rel_binariaContext.class,0);
		}
		public Rel_nContext rel_n() {
			return getRuleContext(Rel_nContext.class,0);
		}
		public RelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitRel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeQueLaVisitor ) return ((SeQueLaVisitor<? extends T>)visitor).visitRel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelContext rel() throws RecognitionException {
		RelContext _localctx = new RelContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rel);
		try {
			setState(89);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87); rel_binaria();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88); rel_n();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rel_binariaContext extends ParserRuleContext {
		public Rel_esqContext rel_esq;
		public Token IDENT;
		public Rel_dirContext rel_dir;
		public Token TIPO_MAPEAMENTO;
		public TerminalNode TIPO_MAPEAMENTO() { return getToken(SeQueLaParser.TIPO_MAPEAMENTO, 0); }
		public Rel_dirContext rel_dir() {
			return getRuleContext(Rel_dirContext.class,0);
		}
		public AtributosContext atributos() {
			return getRuleContext(AtributosContext.class,0);
		}
		public Rel_esqContext rel_esq() {
			return getRuleContext(Rel_esqContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(SeQueLaParser.IDENT, 0); }
		public Rel_binariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_binaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterRel_binaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitRel_binaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeQueLaVisitor ) return ((SeQueLaVisitor<? extends T>)visitor).visitRel_binaria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_binariaContext rel_binaria() throws RecognitionException {
		Rel_binariaContext _localctx = new Rel_binariaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rel_binaria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); ((Rel_binariaContext)_localctx).rel_esq = rel_esq();
			setState(92); ((Rel_binariaContext)_localctx).IDENT = match(IDENT);
			setState(93); ((Rel_binariaContext)_localctx).rel_dir = rel_dir();
			setState(94); ((Rel_binariaContext)_localctx).TIPO_MAPEAMENTO = match(TIPO_MAPEAMENTO);
			setState(96);
			_la = _input.LA(1);
			if (_la==TABULACAO) {
				{
				setState(95); atributos();
				}
			}


			                                        
			                    String tipoMap = (((Rel_binariaContext)_localctx).TIPO_MAPEAMENTO!=null?((Rel_binariaContext)_localctx).TIPO_MAPEAMENTO.getText():null);
			                                        
			                    // Mapeamento de relacoes com Cardinalidade 1 para 1
								if((((Rel_binariaContext)_localctx).rel_esq.card+((Rel_binariaContext)_localctx).rel_dir.card).equals("11")){
			                    if(!((tipoMap.equals("map1"))||(tipoMap.equals("map2"))||(tipoMap.equals("map3")))){
			                        MyErrorListener.erroSemantico3(((Rel_binariaContext)_localctx).IDENT.getLine());
			                    }
			                    else
			                        geradorRelacao(tipoMap, ((Rel_binariaContext)_localctx).rel_esq.nomeEnt, ((Rel_binariaContext)_localctx).rel_dir.nomeEnt, (((Rel_binariaContext)_localctx).IDENT!=null?((Rel_binariaContext)_localctx).IDENT.getText():null));
			                    }
			            
			                    // Mapeamento de relacoes com Cardinalidade 1 para n
			                    if((((Rel_binariaContext)_localctx).rel_esq.card+((Rel_binariaContext)_localctx).rel_dir.card).equals("1n")){
			                        if(!tipoMap.equals("map4"))
			                            MyErrorListener.erroSemantico3(((Rel_binariaContext)_localctx).IDENT.getLine());  
			                    else
			                        geradorRelacao(tipoMap, ((Rel_binariaContext)_localctx).rel_dir.nomeEnt, ((Rel_binariaContext)_localctx).rel_esq.nomeEnt, (((Rel_binariaContext)_localctx).IDENT!=null?((Rel_binariaContext)_localctx).IDENT.getText():null));
			                    }
			            
			                    // Mapeamento de relacoes com Cardinalidade n para 1
			                    if((((Rel_binariaContext)_localctx).rel_esq.card+((Rel_binariaContext)_localctx).rel_dir.card).equals("n1")){
			                        if(!tipoMap.equals("map4"))
			                            MyErrorListener.erroSemantico3(((Rel_binariaContext)_localctx).IDENT.getLine());  
			                        else
			                            geradorRelacao(tipoMap, ((Rel_binariaContext)_localctx).rel_esq.nomeEnt, ((Rel_binariaContext)_localctx).rel_dir.nomeEnt, (((Rel_binariaContext)_localctx).IDENT!=null?((Rel_binariaContext)_localctx).IDENT.getText():null));
			                    }
			            
			                    // Mapeamento de relacoes com Cardinalidade m para n
			                    if((((Rel_binariaContext)_localctx).rel_esq.card+((Rel_binariaContext)_localctx).rel_dir.card).equals("mn")||(((Rel_binariaContext)_localctx).rel_esq.card+((Rel_binariaContext)_localctx).rel_dir.card).equals("nm")){
			                        if(!tipoMap.equals("map5"))
			                            MyErrorListener.erroSemantico3(((Rel_binariaContext)_localctx).IDENT.getLine());  
			                        else
			                            geradorRelacao(tipoMap, ((Rel_binariaContext)_localctx).rel_esq.nomeEnt, ((Rel_binariaContext)_localctx).rel_dir.nomeEnt, (((Rel_binariaContext)_localctx).IDENT!=null?((Rel_binariaContext)_localctx).IDENT.getText():null));
			                    }
			                                        
							
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rel_nContext extends ParserRuleContext {
		public Token NOME_ENTIDADE;
		public Rel_esqContext rel_esq(int i) {
			return getRuleContext(Rel_esqContext.class,i);
		}
		public AtributosContext atributos() {
			return getRuleContext(AtributosContext.class,0);
		}
		public List<Rel_esqContext> rel_esq() {
			return getRuleContexts(Rel_esqContext.class);
		}
		public TerminalNode NOME_ENTIDADE() { return getToken(SeQueLaParser.NOME_ENTIDADE, 0); }
		public Rel_nContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_n; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterRel_n(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitRel_n(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeQueLaVisitor ) return ((SeQueLaVisitor<? extends T>)visitor).visitRel_n(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_nContext rel_n() throws RecognitionException {
		Rel_nContext _localctx = new Rel_nContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rel_n);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); ((Rel_nContext)_localctx).NOME_ENTIDADE = match(NOME_ENTIDADE);

			                    if(!(tabela.existeSimbolo((((Rel_nContext)_localctx).NOME_ENTIDADE!=null?((Rel_nContext)_localctx).NOME_ENTIDADE.getText():null))))
			                        MyErrorListener.erroSemantico2((((Rel_nContext)_localctx).NOME_ENTIDADE!=null?((Rel_nContext)_localctx).NOME_ENTIDADE.getText():null), ((Rel_nContext)_localctx).NOME_ENTIDADE.getLine());
			                    
			setState(102); rel_esq();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(103); match(5);
				setState(104); rel_esq();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			_la = _input.LA(1);
			if (_la==TABULACAO) {
				{
				setState(110); atributos();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rel_esqContext extends ParserRuleContext {
		public String card;
		public String nomeEnt;
		public Token NOME_ENTIDADE;
		public Token CARDINALIDADE;
		public TerminalNode CARDINALIDADE() { return getToken(SeQueLaParser.CARDINALIDADE, 0); }
		public ParticipacaoContext participacao() {
			return getRuleContext(ParticipacaoContext.class,0);
		}
		public TerminalNode NOME_ENTIDADE() { return getToken(SeQueLaParser.NOME_ENTIDADE, 0); }
		public Rel_esqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_esq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterRel_esq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitRel_esq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeQueLaVisitor ) return ((SeQueLaVisitor<? extends T>)visitor).visitRel_esq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_esqContext rel_esq() throws RecognitionException {
		Rel_esqContext _localctx = new Rel_esqContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_rel_esq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); ((Rel_esqContext)_localctx).NOME_ENTIDADE = match(NOME_ENTIDADE);

			                    ((Rel_esqContext)_localctx).nomeEnt =  (((Rel_esqContext)_localctx).NOME_ENTIDADE!=null?((Rel_esqContext)_localctx).NOME_ENTIDADE.getText():null);
			                    if(!(tabela.existeSimbolo((((Rel_esqContext)_localctx).NOME_ENTIDADE!=null?((Rel_esqContext)_localctx).NOME_ENTIDADE.getText():null))))
			                        MyErrorListener.erroSemantico2((((Rel_esqContext)_localctx).NOME_ENTIDADE!=null?((Rel_esqContext)_localctx).NOME_ENTIDADE.getText():null), ((Rel_esqContext)_localctx).NOME_ENTIDADE.getLine());
			                
			setState(115); ((Rel_esqContext)_localctx).CARDINALIDADE = match(CARDINALIDADE);
			((Rel_esqContext)_localctx).card =  (((Rel_esqContext)_localctx).CARDINALIDADE!=null?((Rel_esqContext)_localctx).CARDINALIDADE.getText():null);
			setState(117); participacao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rel_dirContext extends ParserRuleContext {
		public String card;
		public String nomeEnt;
		public Token CARDINALIDADE;
		public Token NOME_ENTIDADE;
		public TerminalNode CARDINALIDADE() { return getToken(SeQueLaParser.CARDINALIDADE, 0); }
		public ParticipacaoContext participacao() {
			return getRuleContext(ParticipacaoContext.class,0);
		}
		public TerminalNode NOME_ENTIDADE() { return getToken(SeQueLaParser.NOME_ENTIDADE, 0); }
		public Rel_dirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_dir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterRel_dir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitRel_dir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeQueLaVisitor ) return ((SeQueLaVisitor<? extends T>)visitor).visitRel_dir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_dirContext rel_dir() throws RecognitionException {
		Rel_dirContext _localctx = new Rel_dirContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_rel_dir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); participacao();
			setState(120); ((Rel_dirContext)_localctx).CARDINALIDADE = match(CARDINALIDADE);
			((Rel_dirContext)_localctx).card =  (((Rel_dirContext)_localctx).CARDINALIDADE!=null?((Rel_dirContext)_localctx).CARDINALIDADE.getText():null);
			setState(122); ((Rel_dirContext)_localctx).NOME_ENTIDADE = match(NOME_ENTIDADE);

			                    ((Rel_dirContext)_localctx).nomeEnt =  (((Rel_dirContext)_localctx).NOME_ENTIDADE!=null?((Rel_dirContext)_localctx).NOME_ENTIDADE.getText():null);
			                    if(!(tabela.existeSimbolo((((Rel_dirContext)_localctx).NOME_ENTIDADE!=null?((Rel_dirContext)_localctx).NOME_ENTIDADE.getText():null))))
			                        MyErrorListener.erroSemantico2((((Rel_dirContext)_localctx).NOME_ENTIDADE!=null?((Rel_dirContext)_localctx).NOME_ENTIDADE.getText():null), ((Rel_dirContext)_localctx).NOME_ENTIDADE.getLine());
			                
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParticipacaoContext extends ParserRuleContext {
		public ParticipacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_participacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterParticipacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitParticipacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeQueLaVisitor ) return ((SeQueLaVisitor<? extends T>)visitor).visitParticipacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParticipacaoContext participacao() throws RecognitionException {
		ParticipacaoContext _localctx = new ParticipacaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_participacao);
		try {
			setState(128);
			switch (_input.LA(1)) {
			case 4:
				enterOuterAlt(_localctx, 1);
				{
				setState(125); match(4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126); match(2);
				}
				break;
			case EOF:
			case 5:
			case ENTIDADE:
			case ALTERA:
			case EXCLUI:
			case EXIBE:
			case CARDINALIDADE:
			case NOME_ENTIDADE:
			case IDENT:
			case TABULACAO:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AltContext extends ParserRuleContext {
		public TerminalNode ALTERA() { return getToken(SeQueLaParser.ALTERA, 0); }
		public TerminalNode NOME_ENTIDADE() { return getToken(SeQueLaParser.NOME_ENTIDADE, 0); }
		public AltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeQueLaVisitor ) return ((SeQueLaVisitor<? extends T>)visitor).visitAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AltContext alt() throws RecognitionException {
		AltContext _localctx = new AltContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_alt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); match(ALTERA);
			setState(131); match(NOME_ENTIDADE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExclContext extends ParserRuleContext {
		public TerminalNode EXCLUI() { return getToken(SeQueLaParser.EXCLUI, 0); }
		public TerminalNode NOME_ENTIDADE() { return getToken(SeQueLaParser.NOME_ENTIDADE, 0); }
		public ExclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_excl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterExcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitExcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeQueLaVisitor ) return ((SeQueLaVisitor<? extends T>)visitor).visitExcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclContext excl() throws RecognitionException {
		ExclContext _localctx = new ExclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_excl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); match(EXCLUI);
			setState(134); match(NOME_ENTIDADE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExibeContext extends ParserRuleContext {
		public TerminalNode EXIBE() { return getToken(SeQueLaParser.EXIBE, 0); }
		public TerminalNode NOME_ENTIDADE() { return getToken(SeQueLaParser.NOME_ENTIDADE, 0); }
		public ExibeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exibe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterExibe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitExibe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeQueLaVisitor ) return ((SeQueLaVisitor<? extends T>)visitor).visitExibe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExibeContext exibe() throws RecognitionException {
		ExibeContext _localctx = new ExibeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exibe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); match(EXIBE);
			setState(137); match(NOME_ENTIDADE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\u008e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5"+
		"\6F\n\6\3\7\3\7\3\7\3\7\7\7L\n\7\f\7\16\7O\13\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7V\n\7\3\b\3\b\3\t\3\t\5\t\\\n\t\3\n\3\n\3\n\3\n\3\n\5\nc\n\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\7\13l\n\13\f\13\16\13o\13\13\3\13\5\13r\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u0083"+
		"\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\2\2\22\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \2\2\u008d\2)\3\2\2\2\4.\3\2\2\2\6;\3"+
		"\2\2\2\b=\3\2\2\2\nE\3\2\2\2\fU\3\2\2\2\16W\3\2\2\2\20[\3\2\2\2\22]\3"+
		"\2\2\2\24f\3\2\2\2\26s\3\2\2\2\30y\3\2\2\2\32\u0082\3\2\2\2\34\u0084\3"+
		"\2\2\2\36\u0087\3\2\2\2 \u008a\3\2\2\2\"(\5\4\3\2#(\5\20\t\2$(\5\34\17"+
		"\2%(\5\36\20\2&(\5 \21\2\'\"\3\2\2\2\'#\3\2\2\2\'$\3\2\2\2\'%\3\2\2\2"+
		"\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\b\2\1"+
		"\2-\3\3\2\2\2./\7\n\2\2/\60\7\24\2\2\60\61\b\3\1\2\61\62\b\3\1\2\62\63"+
		"\5\6\4\2\63\64\b\3\1\2\64\65\5\b\5\2\65\66\b\3\1\2\66\5\3\2\2\2\678\7"+
		"\3\2\28<\7\25\2\29<\7\5\2\2:<\3\2\2\2;\67\3\2\2\2;9\3\2\2\2;:\3\2\2\2"+
		"<\7\3\2\2\2=>\5\f\7\2>?\5\n\6\2?@\b\5\1\2@\t\3\2\2\2AB\5\b\5\2BC\b\6\1"+
		"\2CF\3\2\2\2DF\3\2\2\2EA\3\2\2\2ED\3\2\2\2F\13\3\2\2\2GH\7\26\2\2HI\7"+
		"\25\2\2IM\7\17\2\2JL\7\21\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2"+
		"NP\3\2\2\2OM\3\2\2\2PV\b\7\1\2QR\7\26\2\2RS\7\25\2\2ST\7\20\2\2TV\5\16"+
		"\b\2UG\3\2\2\2UQ\3\2\2\2V\r\3\2\2\2WX\3\2\2\2X\17\3\2\2\2Y\\\5\22\n\2"+
		"Z\\\5\24\13\2[Y\3\2\2\2[Z\3\2\2\2\\\21\3\2\2\2]^\5\26\f\2^_\7\25\2\2_"+
		"`\5\30\r\2`b\7\22\2\2ac\5\b\5\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\b\n\1"+
		"\2e\23\3\2\2\2fg\7\24\2\2gh\b\13\1\2hm\5\26\f\2ij\7\7\2\2jl\5\26\f\2k"+
		"i\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2nq\3\2\2\2om\3\2\2\2pr\5\b\5\2"+
		"qp\3\2\2\2qr\3\2\2\2r\25\3\2\2\2st\7\24\2\2tu\b\f\1\2uv\7\23\2\2vw\b\f"+
		"\1\2wx\5\32\16\2x\27\3\2\2\2yz\5\32\16\2z{\7\23\2\2{|\b\r\1\2|}\7\24\2"+
		"\2}~\b\r\1\2~\31\3\2\2\2\177\u0083\7\6\2\2\u0080\u0083\7\4\2\2\u0081\u0083"+
		"\3\2\2\2\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083"+
		"\33\3\2\2\2\u0084\u0085\7\f\2\2\u0085\u0086\7\24\2\2\u0086\35\3\2\2\2"+
		"\u0087\u0088\7\r\2\2\u0088\u0089\7\24\2\2\u0089\37\3\2\2\2\u008a\u008b"+
		"\7\16\2\2\u008b\u008c\7\24\2\2\u008c!\3\2\2\2\r\');EMU[bmq\u0082";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}