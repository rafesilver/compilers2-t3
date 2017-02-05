// Generated from SeQueLa.g4 by ANTLR 4.5.3
package grammar;

    import t3.*;
      import static t3.TabelaDeSimbolos.*;
      import static t3.MyErrorListener.*;
      import static t3.GeradorDeCodigo.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SeQueLaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, COMENTARIO=9, 
		COMENTARIO_ERRADO=10, ENTIDADE=11, RELACIONAMENTO=12, ALTERA=13, EXCLUI=14, 
		INSERE=15, ADD=16, INDICE=17, COLUMN=18, TUDO=19, SELECIONA=20, DE=21, 
		EM=22, ONDE=23, EXIBE=24, VIEW=25, GROUP=26, DISTINCT=27, COMO=28, TIPO=29, 
		COMPOSTO=30, RESTRICAO=31, TIPO_MAPEAMENTO=32, LOGICO_E=33, LOGICO_OU=34, 
		CARDINALIDADE=35, IDENT=36, TABULACAO=37, WS=38, OP=39, ARITMETICO=40, 
		LITERAL=41, INTEIRO=42, REAL=43, VERDADEIRO=44, FALSO=45, DATA=46, SEP1=47, 
		HORA=48, SEP2=49;
	public static final int
		RULE_booleano = 0, RULE_valor = 1, RULE_valores = 2, RULE_logico = 3, 
		RULE_programa = 4, RULE_ent = 5, RULE_modificador_ent = 6, RULE_atributos = 7, 
		RULE_mais_declaracao = 8, RULE_declaracao = 9, RULE_dec_composto = 10, 
		RULE_rel = 11, RULE_rel_binaria = 12, RULE_rel_n = 13, RULE_rel_esq = 14, 
		RULE_rel_dir = 15, RULE_participacao = 16, RULE_alt = 17, RULE_alt_alt = 18, 
		RULE_alt_add = 19, RULE_alt_drop = 20, RULE_excl = 21, RULE_exibe = 22, 
		RULE_indce = 23, RULE_insrt = 24, RULE_colunas = 25, RULE_colunas2 = 26, 
		RULE_valores1 = 27, RULE_valores2 = 28, RULE_coluna = 29, RULE_atr = 30, 
		RULE_from = 31, RULE_from2 = 32, RULE_view = 33, RULE_slct = 34, RULE_expressao = 35, 
		RULE_expressao1 = 36, RULE_expressao2 = 37, RULE_algo = 38;
	public static final String[] ruleNames = {
		"booleano", "valor", "valores", "logico", "programa", "ent", "modificador_ent", 
		"atributos", "mais_declaracao", "declaracao", "dec_composto", "rel", "rel_binaria", 
		"rel_n", "rel_esq", "rel_dir", "participacao", "alt", "alt_alt", "alt_add", 
		"alt_drop", "excl", "exibe", "indce", "insrt", "colunas", "colunas2", 
		"valores1", "valores2", "coluna", "atr", "from", "from2", "view", "slct", 
		"expressao", "expressao1", "expressao2", "algo"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'fraca'", "'forte'", "'parcial'", "'total'", "'('", "')'", 
		"'.'", null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "'composto'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "COMENTARIO", "COMENTARIO_ERRADO", 
		"ENTIDADE", "RELACIONAMENTO", "ALTERA", "EXCLUI", "INSERE", "ADD", "INDICE", 
		"COLUMN", "TUDO", "SELECIONA", "DE", "EM", "ONDE", "EXIBE", "VIEW", "GROUP", 
		"DISTINCT", "COMO", "TIPO", "COMPOSTO", "RESTRICAO", "TIPO_MAPEAMENTO", 
		"LOGICO_E", "LOGICO_OU", "CARDINALIDADE", "IDENT", "TABULACAO", "WS", 
		"OP", "ARITMETICO", "LITERAL", "INTEIRO", "REAL", "VERDADEIRO", "FALSO", 
		"DATA", "SEP1", "HORA", "SEP2"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SeQueLa.g4"; }

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
	public static class BooleanoContext extends ParserRuleContext {
		public TerminalNode VERDADEIRO() { return getToken(SeQueLaParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(SeQueLaParser.FALSO, 0); }
		public BooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitBooleano(this);
		}
	}

	public final BooleanoContext booleano() throws RecognitionException {
		BooleanoContext _localctx = new BooleanoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_booleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !(_la==VERDADEIRO || _la==FALSO) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class ValorContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(SeQueLaParser.LITERAL, 0); }
		public TerminalNode INTEIRO() { return getToken(SeQueLaParser.INTEIRO, 0); }
		public TerminalNode REAL() { return getToken(SeQueLaParser.REAL, 0); }
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public TerminalNode DATA() { return getToken(SeQueLaParser.DATA, 0); }
		public TerminalNode HORA() { return getToken(SeQueLaParser.HORA, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitValor(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_valor);
		try {
			setState(86);
			switch (_input.LA(1)) {
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(LITERAL);
				}
				break;
			case INTEIRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(INTEIRO);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				match(REAL);
				}
				break;
			case VERDADEIRO:
			case FALSO:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				booleano();
				}
				break;
			case DATA:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				match(DATA);
				}
				break;
			case HORA:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				match(HORA);
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

	public static class ValoresContext extends ParserRuleContext {
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public ValoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterValores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitValores(this);
		}
	}

	public final ValoresContext valores() throws RecognitionException {
		ValoresContext _localctx = new ValoresContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_valores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			valor();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(89);
				match(T__0);
				setState(90);
				valor();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class LogicoContext extends ParserRuleContext {
		public String text;
		public TerminalNode LOGICO_E() { return getToken(SeQueLaParser.LOGICO_E, 0); }
		public TerminalNode LOGICO_OU() { return getToken(SeQueLaParser.LOGICO_OU, 0); }
		public LogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitLogico(this);
		}
	}

	public final LogicoContext logico() throws RecognitionException {
		LogicoContext _localctx = new LogicoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_logico);
		try {
			setState(100);
			switch (_input.LA(1)) {
			case LOGICO_E:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(LOGICO_E);
				((LogicoContext)_localctx).text =  "AND";
				}
				break;
			case LOGICO_OU:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(LOGICO_OU);
				((LogicoContext)_localctx).text =  "OR";
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

	public static class ProgramaContext extends ParserRuleContext {
		public List<EntContext> ent() {
			return getRuleContexts(EntContext.class);
		}
		public EntContext ent(int i) {
			return getRuleContext(EntContext.class,i);
		}
		public List<RelContext> rel() {
			return getRuleContexts(RelContext.class);
		}
		public RelContext rel(int i) {
			return getRuleContext(RelContext.class,i);
		}
		public List<AltContext> alt() {
			return getRuleContexts(AltContext.class);
		}
		public AltContext alt(int i) {
			return getRuleContext(AltContext.class,i);
		}
		public List<ExclContext> excl() {
			return getRuleContexts(ExclContext.class);
		}
		public ExclContext excl(int i) {
			return getRuleContext(ExclContext.class,i);
		}
		public List<ExibeContext> exibe() {
			return getRuleContexts(ExibeContext.class);
		}
		public ExibeContext exibe(int i) {
			return getRuleContext(ExibeContext.class,i);
		}
		public List<InsrtContext> insrt() {
			return getRuleContexts(InsrtContext.class);
		}
		public InsrtContext insrt(int i) {
			return getRuleContext(InsrtContext.class,i);
		}
		public List<SlctContext> slct() {
			return getRuleContexts(SlctContext.class);
		}
		public SlctContext slct(int i) {
			return getRuleContext(SlctContext.class,i);
		}
		public List<ViewContext> view() {
			return getRuleContexts(ViewContext.class);
		}
		public ViewContext view(int i) {
			return getRuleContext(ViewContext.class,i);
		}
		public List<IndceContext> indce() {
			return getRuleContexts(IndceContext.class);
		}
		public IndceContext indce(int i) {
			return getRuleContext(IndceContext.class,i);
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
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTIDADE) | (1L << ALTERA) | (1L << EXCLUI) | (1L << INDICE) | (1L << SELECIONA) | (1L << EXIBE) | (1L << VIEW) | (1L << IDENT))) != 0)) {
				{
				setState(111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(102);
					ent();
					}
					break;
				case 2:
					{
					setState(103);
					rel();
					}
					break;
				case 3:
					{
					setState(104);
					alt();
					}
					break;
				case 4:
					{
					setState(105);
					excl();
					}
					break;
				case 5:
					{
					setState(106);
					exibe();
					}
					break;
				case 6:
					{
					setState(107);
					insrt();
					}
					break;
				case 7:
					{
					setState(108);
					slct();
					}
					break;
				case 8:
					{
					setState(109);
					view();
					}
					break;
				case 9:
					{
					setState(110);
					indce();
					}
					break;
				}
				}
				setState(115);
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
		public Token IDENT;
		public AtributosContext atributos;
		public TerminalNode ENTIDADE() { return getToken(SeQueLaParser.ENTIDADE, 0); }
		public TerminalNode IDENT() { return getToken(SeQueLaParser.IDENT, 0); }
		public Modificador_entContext modificador_ent() {
			return getRuleContext(Modificador_entContext.class,0);
		}
		public AtributosContext atributos() {
			return getRuleContext(AtributosContext.class,0);
		}
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
	}

	public final EntContext ent() throws RecognitionException {
		EntContext _localctx = new EntContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(ENTIDADE);
			setState(119);
			((EntContext)_localctx).IDENT = match(IDENT);
			if(!(tabela.existeSimbolo((((EntContext)_localctx).IDENT!=null?((EntContext)_localctx).IDENT.getText():null)))){
			                                    tabela.adicionarSimbolo((((EntContext)_localctx).IDENT!=null?((EntContext)_localctx).IDENT.getText():null), "ENTIDADE");
			                                }
			                                else{
			                                    MyErrorListener.erroSemantico1((((EntContext)_localctx).IDENT!=null?((EntContext)_localctx).IDENT.getText():null), ((EntContext)_localctx).IDENT.getLine());
			                                }
			String aux=(((EntContext)_localctx).IDENT!=null?((EntContext)_localctx).IDENT.getText():null);
			                                 demarcador("nome-ent",aux);
			setState(122);
			modificador_ent();
			demarcador("abre-parent","");
			setState(124);
			((EntContext)_localctx).atributos = atributos();
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
	}

	public final Modificador_entContext modificador_ent() throws RecognitionException {
		Modificador_entContext _localctx = new Modificador_entContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_modificador_ent);
		try {
			setState(131);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(T__1);
				setState(128);
				match(IDENT);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(T__2);
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
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public Mais_declaracaoContext mais_declaracao() {
			return getRuleContext(Mais_declaracaoContext.class,0);
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
	}

	public final AtributosContext atributos() throws RecognitionException {
		AtributosContext _localctx = new AtributosContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atributos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			((AtributosContext)_localctx).declaracao = declaracao();
			setState(134);
			((AtributosContext)_localctx).mais_declaracao = mais_declaracao();

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
	}

	public final Mais_declaracaoContext mais_declaracao() throws RecognitionException {
		Mais_declaracaoContext _localctx = new Mais_declaracaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mais_declaracao);
		((Mais_declaracaoContext)_localctx).mais_dec =  new ArrayList<>();
		try {
			setState(141);
			switch (_input.LA(1)) {
			case TABULACAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				((Mais_declaracaoContext)_localctx).atributos = atributos();

				                    _localctx.mais_dec.add(((Mais_declaracaoContext)_localctx).atributos.atrib);
				                
				}
				break;
			case EOF:
			case ENTIDADE:
			case ALTERA:
			case EXCLUI:
			case INDICE:
			case SELECIONA:
			case EXIBE:
			case VIEW:
			case IDENT:
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
		public TerminalNode TABULACAO() { return getToken(SeQueLaParser.TABULACAO, 0); }
		public TerminalNode IDENT() { return getToken(SeQueLaParser.IDENT, 0); }
		public TerminalNode TIPO() { return getToken(SeQueLaParser.TIPO, 0); }
		public List<TerminalNode> RESTRICAO() { return getTokens(SeQueLaParser.RESTRICAO); }
		public TerminalNode RESTRICAO(int i) {
			return getToken(SeQueLaParser.RESTRICAO, i);
		}
		public TerminalNode COMPOSTO() { return getToken(SeQueLaParser.COMPOSTO, 0); }
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
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaracao);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(TABULACAO);
				setState(144);
				((DeclaracaoContext)_localctx).IDENT = match(IDENT);
				setState(145);
				((DeclaracaoContext)_localctx).TIPO = match(TIPO);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RESTRICAO) {
					{
					{
					setState(146);
					((DeclaracaoContext)_localctx).RESTRICAO = match(RESTRICAO);
					}
					}
					setState(151);
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
				setState(153);
				match(TABULACAO);
				setState(154);
				match(IDENT);
				setState(155);
				match(COMPOSTO);
				setState(156);
				dec_composto();
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
	}

	public final Dec_compostoContext dec_composto() throws RecognitionException {
		Dec_compostoContext _localctx = new Dec_compostoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dec_composto);
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
	}

	public final RelContext rel() throws RecognitionException {
		RelContext _localctx = new RelContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_rel);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				rel_binaria();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				rel_n();
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
		public Rel_esqContext rel_esq() {
			return getRuleContext(Rel_esqContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(SeQueLaParser.IDENT, 0); }
		public Rel_dirContext rel_dir() {
			return getRuleContext(Rel_dirContext.class,0);
		}
		public TerminalNode TIPO_MAPEAMENTO() { return getToken(SeQueLaParser.TIPO_MAPEAMENTO, 0); }
		public AtributosContext atributos() {
			return getRuleContext(AtributosContext.class,0);
		}
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
	}

	public final Rel_binariaContext rel_binaria() throws RecognitionException {
		Rel_binariaContext _localctx = new Rel_binariaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_rel_binaria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			((Rel_binariaContext)_localctx).rel_esq = rel_esq();
			setState(166);
			((Rel_binariaContext)_localctx).IDENT = match(IDENT);
			setState(167);
			((Rel_binariaContext)_localctx).rel_dir = rel_dir();
			setState(168);
			((Rel_binariaContext)_localctx).TIPO_MAPEAMENTO = match(TIPO_MAPEAMENTO);
			setState(170);
			_la = _input.LA(1);
			if (_la==TABULACAO) {
				{
				setState(169);
				atributos();
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
		public Token IDENT;
		public TerminalNode IDENT() { return getToken(SeQueLaParser.IDENT, 0); }
		public List<Rel_esqContext> rel_esq() {
			return getRuleContexts(Rel_esqContext.class);
		}
		public Rel_esqContext rel_esq(int i) {
			return getRuleContext(Rel_esqContext.class,i);
		}
		public AtributosContext atributos() {
			return getRuleContext(AtributosContext.class,0);
		}
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
	}

	public final Rel_nContext rel_n() throws RecognitionException {
		Rel_nContext _localctx = new Rel_nContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_rel_n);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			((Rel_nContext)_localctx).IDENT = match(IDENT);

			                    if(!(tabela.existeSimbolo((((Rel_nContext)_localctx).IDENT!=null?((Rel_nContext)_localctx).IDENT.getText():null))))
			                        MyErrorListener.erroSemantico2((((Rel_nContext)_localctx).IDENT!=null?((Rel_nContext)_localctx).IDENT.getText():null), ((Rel_nContext)_localctx).IDENT.getLine());
			                    
			setState(176);
			rel_esq();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(177);
				match(T__0);
				setState(178);
				rel_esq();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			_la = _input.LA(1);
			if (_la==TABULACAO) {
				{
				setState(184);
				atributos();
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
		public Token IDENT;
		public Token CARDINALIDADE;
		public TerminalNode IDENT() { return getToken(SeQueLaParser.IDENT, 0); }
		public TerminalNode CARDINALIDADE() { return getToken(SeQueLaParser.CARDINALIDADE, 0); }
		public ParticipacaoContext participacao() {
			return getRuleContext(ParticipacaoContext.class,0);
		}
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
	}

	public final Rel_esqContext rel_esq() throws RecognitionException {
		Rel_esqContext _localctx = new Rel_esqContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_rel_esq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			((Rel_esqContext)_localctx).IDENT = match(IDENT);

			                    ((Rel_esqContext)_localctx).nomeEnt =  (((Rel_esqContext)_localctx).IDENT!=null?((Rel_esqContext)_localctx).IDENT.getText():null);
			                    if(!(tabela.existeSimbolo((((Rel_esqContext)_localctx).IDENT!=null?((Rel_esqContext)_localctx).IDENT.getText():null))))
			                        MyErrorListener.erroSemantico2((((Rel_esqContext)_localctx).IDENT!=null?((Rel_esqContext)_localctx).IDENT.getText():null), ((Rel_esqContext)_localctx).IDENT.getLine());
			                
			setState(189);
			((Rel_esqContext)_localctx).CARDINALIDADE = match(CARDINALIDADE);
			((Rel_esqContext)_localctx).card =  (((Rel_esqContext)_localctx).CARDINALIDADE!=null?((Rel_esqContext)_localctx).CARDINALIDADE.getText():null);
			setState(191);
			participacao();
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
		public Token IDENT;
		public ParticipacaoContext participacao() {
			return getRuleContext(ParticipacaoContext.class,0);
		}
		public TerminalNode CARDINALIDADE() { return getToken(SeQueLaParser.CARDINALIDADE, 0); }
		public TerminalNode IDENT() { return getToken(SeQueLaParser.IDENT, 0); }
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
	}

	public final Rel_dirContext rel_dir() throws RecognitionException {
		Rel_dirContext _localctx = new Rel_dirContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_rel_dir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			participacao();
			setState(194);
			((Rel_dirContext)_localctx).CARDINALIDADE = match(CARDINALIDADE);
			((Rel_dirContext)_localctx).card =  (((Rel_dirContext)_localctx).CARDINALIDADE!=null?((Rel_dirContext)_localctx).CARDINALIDADE.getText():null);
			setState(196);
			((Rel_dirContext)_localctx).IDENT = match(IDENT);

			                    ((Rel_dirContext)_localctx).nomeEnt =  (((Rel_dirContext)_localctx).IDENT!=null?((Rel_dirContext)_localctx).IDENT.getText():null);
			                    if(!(tabela.existeSimbolo((((Rel_dirContext)_localctx).IDENT!=null?((Rel_dirContext)_localctx).IDENT.getText():null))))
			                        MyErrorListener.erroSemantico2((((Rel_dirContext)_localctx).IDENT!=null?((Rel_dirContext)_localctx).IDENT.getText():null), ((Rel_dirContext)_localctx).IDENT.getLine());
			                
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
	}

	public final ParticipacaoContext participacao() throws RecognitionException {
		ParticipacaoContext _localctx = new ParticipacaoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_participacao);
		try {
			setState(202);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(T__4);
				}
				break;
			case EOF:
			case T__0:
			case ENTIDADE:
			case ALTERA:
			case EXCLUI:
			case INDICE:
			case SELECIONA:
			case EXIBE:
			case VIEW:
			case CARDINALIDADE:
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
		public Token IDENT;
		public TerminalNode ALTERA() { return getToken(SeQueLaParser.ALTERA, 0); }
		public TerminalNode IDENT() { return getToken(SeQueLaParser.IDENT, 0); }
		public List<TerminalNode> TABULACAO() { return getTokens(SeQueLaParser.TABULACAO); }
		public TerminalNode TABULACAO(int i) {
			return getToken(SeQueLaParser.TABULACAO, i);
		}
		public List<Alt_altContext> alt_alt() {
			return getRuleContexts(Alt_altContext.class);
		}
		public Alt_altContext alt_alt(int i) {
			return getRuleContext(Alt_altContext.class,i);
		}
		public List<Alt_addContext> alt_add() {
			return getRuleContexts(Alt_addContext.class);
		}
		public Alt_addContext alt_add(int i) {
			return getRuleContext(Alt_addContext.class,i);
		}
		public List<Alt_dropContext> alt_drop() {
			return getRuleContexts(Alt_dropContext.class);
		}
		public Alt_dropContext alt_drop(int i) {
			return getRuleContext(Alt_dropContext.class,i);
		}
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
	}

	public final AltContext alt() throws RecognitionException {
		AltContext _localctx = new AltContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_alt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(ALTERA);
			setState(205);
			((AltContext)_localctx).IDENT = match(IDENT);
			if(!(tabela.existeSimbolo((((AltContext)_localctx).IDENT!=null?((AltContext)_localctx).IDENT.getText():null)))){MyErrorListener.erroSemantico2((((AltContext)_localctx).IDENT!=null?((AltContext)_localctx).IDENT.getText():null), ((AltContext)_localctx).IDENT.getLine());}
			geradorAltera("altera",(((AltContext)_localctx).IDENT!=null?((AltContext)_localctx).IDENT.getText():null),"");
			setState(214); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(208);
				match(TABULACAO);
				setState(212);
				switch (_input.LA(1)) {
				case ALTERA:
					{
					setState(209);
					alt_alt();
					}
					break;
				case ADD:
					{
					setState(210);
					alt_add();
					}
					break;
				case EXCLUI:
					{
					setState(211);
					alt_drop();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(216); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TABULACAO );
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

	public static class Alt_altContext extends ParserRuleContext {
		public Token IDENT;
		public Token TIPO;
		public TerminalNode ALTERA() { return getToken(SeQueLaParser.ALTERA, 0); }
		public TerminalNode IDENT() { return getToken(SeQueLaParser.IDENT, 0); }
		public TerminalNode TIPO() { return getToken(SeQueLaParser.TIPO, 0); }
		public TerminalNode COLUMN() { return getToken(SeQueLaParser.COLUMN, 0); }
		public Alt_altContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alt_alt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterAlt_alt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitAlt_alt(this);
		}
	}

	public final Alt_altContext alt_alt() throws RecognitionException {
		Alt_altContext _localctx = new Alt_altContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_alt_alt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(ALTERA);
			setState(220);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(219);
				match(COLUMN);
				}
			}

			setState(222);
			((Alt_altContext)_localctx).IDENT = match(IDENT);
			setState(223);
			((Alt_altContext)_localctx).TIPO = match(TIPO);
			geradorAltera("coluna",(((Alt_altContext)_localctx).IDENT!=null?((Alt_altContext)_localctx).IDENT.getText():null),(((Alt_altContext)_localctx).TIPO!=null?((Alt_altContext)_localctx).TIPO.getText():null));
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

	public static class Alt_addContext extends ParserRuleContext {
		public Token IDENT;
		public Token TIPO;
		public TerminalNode ADD() { return getToken(SeQueLaParser.ADD, 0); }
		public TerminalNode IDENT() { return getToken(SeQueLaParser.IDENT, 0); }
		public TerminalNode TIPO() { return getToken(SeQueLaParser.TIPO, 0); }
		public Alt_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alt_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterAlt_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitAlt_add(this);
		}
	}

	public final Alt_addContext alt_add() throws RecognitionException {
		Alt_addContext _localctx = new Alt_addContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_alt_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(ADD);
			setState(227);
			((Alt_addContext)_localctx).IDENT = match(IDENT);
			setState(228);
			((Alt_addContext)_localctx).TIPO = match(TIPO);
			geradorAltera("adiciona",(((Alt_addContext)_localctx).IDENT!=null?((Alt_addContext)_localctx).IDENT.getText():null),(((Alt_addContext)_localctx).TIPO!=null?((Alt_addContext)_localctx).TIPO.getText():null));
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

	public static class Alt_dropContext extends ParserRuleContext {
		public Token IDENT;
		public TerminalNode EXCLUI() { return getToken(SeQueLaParser.EXCLUI, 0); }
		public TerminalNode IDENT() { return getToken(SeQueLaParser.IDENT, 0); }
		public TerminalNode COLUMN() { return getToken(SeQueLaParser.COLUMN, 0); }
		public Alt_dropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alt_drop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterAlt_drop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitAlt_drop(this);
		}
	}

	public final Alt_dropContext alt_drop() throws RecognitionException {
		Alt_dropContext _localctx = new Alt_dropContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_alt_drop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(EXCLUI);
			setState(233);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(232);
				match(COLUMN);
				}
			}

			setState(235);
			((Alt_dropContext)_localctx).IDENT = match(IDENT);
			geradorAltera("exclui",(((Alt_dropContext)_localctx).IDENT!=null?((Alt_dropContext)_localctx).IDENT.getText():null),null);
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
		public Token IDENT;
		public TerminalNode EXCLUI() { return getToken(SeQueLaParser.EXCLUI, 0); }
		public TerminalNode IDENT() { return getToken(SeQueLaParser.IDENT, 0); }
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
	}

	public final ExclContext excl() throws RecognitionException {
		ExclContext _localctx = new ExclContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_excl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(EXCLUI);
			setState(239);
			((ExclContext)_localctx).IDENT = match(IDENT);
			if(!(tabela.existeSimbolo((((ExclContext)_localctx).IDENT!=null?((ExclContext)_localctx).IDENT.getText():null)))){MyErrorListener.erroSemantico2((((ExclContext)_localctx).IDENT!=null?((ExclContext)_localctx).IDENT.getText():null), ((ExclContext)_localctx).IDENT.getLine());}
			geradorExclui("exclui",(((ExclContext)_localctx).IDENT!=null?((ExclContext)_localctx).IDENT.getText():null));
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
		public TerminalNode IDENT() { return getToken(SeQueLaParser.IDENT, 0); }
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
	}

	public final ExibeContext exibe() throws RecognitionException {
		ExibeContext _localctx = new ExibeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_exibe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(EXIBE);
			setState(244);
			match(IDENT);
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

	public static class IndceContext extends ParserRuleContext {
		public Token IDENT;
		public ColunasContext colunas;
		public TerminalNode INDICE() { return getToken(SeQueLaParser.INDICE, 0); }
		public List<TerminalNode> IDENT() { return getTokens(SeQueLaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(SeQueLaParser.IDENT, i);
		}
		public TerminalNode EM() { return getToken(SeQueLaParser.EM, 0); }
		public ColunasContext colunas() {
			return getRuleContext(ColunasContext.class,0);
		}
		public IndceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indce; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterIndce(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitIndce(this);
		}
	}

	public final IndceContext indce() throws RecognitionException {
		IndceContext _localctx = new IndceContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_indce);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(INDICE);
			setState(247);
			((IndceContext)_localctx).IDENT = match(IDENT);
			geradorIndice("indice",(((IndceContext)_localctx).IDENT!=null?((IndceContext)_localctx).IDENT.getText():null), null);
			setState(249);
			match(EM);
			setState(250);
			((IndceContext)_localctx).IDENT = match(IDENT);
			if(!(tabela.existeSimbolo((((IndceContext)_localctx).IDENT!=null?((IndceContext)_localctx).IDENT.getText():null)))){MyErrorListener.erroSemantico2((((IndceContext)_localctx).IDENT!=null?((IndceContext)_localctx).IDENT.getText():null), ((IndceContext)_localctx).IDENT.getLine());}
			setState(252);
			match(T__5);
			setState(253);
			((IndceContext)_localctx).colunas = colunas();
			setState(254);
			match(T__6);
			geradorIndice("em",(((IndceContext)_localctx).IDENT!=null?((IndceContext)_localctx).IDENT.getText():null), ((IndceContext)_localctx).colunas.text);
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

	public static class InsrtContext extends ParserRuleContext {
		public Token IDENT;
		public ColunasContext colunas;
		public Valores1Context valores1;
		public TerminalNode IDENT() { return getToken(SeQueLaParser.IDENT, 0); }
		public ColunasContext colunas() {
			return getRuleContext(ColunasContext.class,0);
		}
		public TerminalNode INSERE() { return getToken(SeQueLaParser.INSERE, 0); }
		public Valores1Context valores1() {
			return getRuleContext(Valores1Context.class,0);
		}
		public InsrtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insrt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterInsrt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitInsrt(this);
		}
	}

	public final InsrtContext insrt() throws RecognitionException {
		InsrtContext _localctx = new InsrtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_insrt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			((InsrtContext)_localctx).IDENT = match(IDENT);
			if(!(tabela.existeSimbolo((((InsrtContext)_localctx).IDENT!=null?((InsrtContext)_localctx).IDENT.getText():null)))){MyErrorListener.erroSemantico2((((InsrtContext)_localctx).IDENT!=null?((InsrtContext)_localctx).IDENT.getText():null), ((InsrtContext)_localctx).IDENT.getLine());}
			setState(259);
			match(T__5);
			setState(260);
			((InsrtContext)_localctx).colunas = colunas();
			setState(261);
			match(T__6);
			setState(262);
			match(INSERE);
			setState(263);
			((InsrtContext)_localctx).valores1 = valores1();
			 geradorInsert((((InsrtContext)_localctx).IDENT!=null?((InsrtContext)_localctx).IDENT.getText():null), ((InsrtContext)_localctx).colunas.text, ((InsrtContext)_localctx).valores1.text);
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

	public static class ColunasContext extends ParserRuleContext {
		public ArrayList<String> text;
		public Token IDENT;
		public Colunas2Context colunas2;
		public TerminalNode IDENT() { return getToken(SeQueLaParser.IDENT, 0); }
		public Colunas2Context colunas2() {
			return getRuleContext(Colunas2Context.class,0);
		}
		public ColunasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colunas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterColunas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitColunas(this);
		}
	}

	public final ColunasContext colunas() throws RecognitionException {
		ColunasContext _localctx = new ColunasContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_colunas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			((ColunasContext)_localctx).IDENT = match(IDENT);
			((ColunasContext)_localctx).text =  new ArrayList<>();
			                                _localctx.text.add((((ColunasContext)_localctx).IDENT!=null?((ColunasContext)_localctx).IDENT.getText():null));
			setState(272);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(268);
				match(T__0);
				setState(269);
				((ColunasContext)_localctx).colunas2 = colunas2();
				_localctx.text.addAll(((ColunasContext)_localctx).colunas2.text);
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

	public static class Colunas2Context extends ParserRuleContext {
		public ArrayList<String> text;
		public Token IDENT;
		public ColunasContext colunas;
		public TerminalNode IDENT() { return getToken(SeQueLaParser.IDENT, 0); }
		public ColunasContext colunas() {
			return getRuleContext(ColunasContext.class,0);
		}
		public Colunas2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colunas2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterColunas2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitColunas2(this);
		}
	}

	public final Colunas2Context colunas2() throws RecognitionException {
		Colunas2Context _localctx = new Colunas2Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_colunas2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			((Colunas2Context)_localctx).IDENT = match(IDENT);
			((Colunas2Context)_localctx).text =  new ArrayList<>();
			                                _localctx.text.add((((Colunas2Context)_localctx).IDENT!=null?((Colunas2Context)_localctx).IDENT.getText():null));
			setState(280);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(276);
				match(T__0);
				setState(277);
				((Colunas2Context)_localctx).colunas = colunas();
				_localctx.text.addAll(((Colunas2Context)_localctx).colunas.text);
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

	public static class Valores1Context extends ParserRuleContext {
		public ArrayList<String> text;
		public ValoresContext valores;
		public Valores2Context valores2;
		public ValoresContext valores() {
			return getRuleContext(ValoresContext.class,0);
		}
		public TerminalNode TABULACAO() { return getToken(SeQueLaParser.TABULACAO, 0); }
		public Valores2Context valores2() {
			return getRuleContext(Valores2Context.class,0);
		}
		public Valores1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valores1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterValores1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitValores1(this);
		}
	}

	public final Valores1Context valores1() throws RecognitionException {
		Valores1Context _localctx = new Valores1Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_valores1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if (_la==TABULACAO) {
				{
				setState(282);
				match(TABULACAO);
				}
			}

			setState(285);
			match(T__5);
			setState(286);
			((Valores1Context)_localctx).valores = valores();
			setState(287);
			match(T__6);
			((Valores1Context)_localctx).text =  new ArrayList<>();
			                                        _localctx.text.add((((Valores1Context)_localctx).valores!=null?_input.getText(((Valores1Context)_localctx).valores.start,((Valores1Context)_localctx).valores.stop):null));
			setState(293);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(289);
				match(T__0);
				setState(290);
				((Valores1Context)_localctx).valores2 = valores2();
				_localctx.text.addAll(((Valores1Context)_localctx).valores2.text);
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

	public static class Valores2Context extends ParserRuleContext {
		public ArrayList<String> text;
		public ValoresContext valores;
		public Valores1Context valores1;
		public ValoresContext valores() {
			return getRuleContext(ValoresContext.class,0);
		}
		public TerminalNode TABULACAO() { return getToken(SeQueLaParser.TABULACAO, 0); }
		public Valores1Context valores1() {
			return getRuleContext(Valores1Context.class,0);
		}
		public Valores2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valores2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterValores2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitValores2(this);
		}
	}

	public final Valores2Context valores2() throws RecognitionException {
		Valores2Context _localctx = new Valores2Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_valores2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_la = _input.LA(1);
			if (_la==TABULACAO) {
				{
				setState(295);
				match(TABULACAO);
				}
			}

			setState(298);
			match(T__5);
			setState(299);
			((Valores2Context)_localctx).valores = valores();
			setState(300);
			match(T__6);
			((Valores2Context)_localctx).text =  new ArrayList<>();
			                                        _localctx.text.add((((Valores2Context)_localctx).valores!=null?_input.getText(((Valores2Context)_localctx).valores.start,((Valores2Context)_localctx).valores.stop):null));
			setState(306);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(302);
				match(T__0);
				setState(303);
				((Valores2Context)_localctx).valores1 = valores1();
				_localctx.text.addAll(((Valores2Context)_localctx).valores1.text);
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

	public static class ColunaContext extends ParserRuleContext {
		public String text;
		public Token IDENT;
		public AtrContext atr;
		public TerminalNode IDENT() { return getToken(SeQueLaParser.IDENT, 0); }
		public AtrContext atr() {
			return getRuleContext(AtrContext.class,0);
		}
		public ColunaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coluna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterColuna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitColuna(this);
		}
	}

	public final ColunaContext coluna() throws RecognitionException {
		ColunaContext _localctx = new ColunaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_coluna);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			((ColunaContext)_localctx).IDENT = match(IDENT);
			((ColunaContext)_localctx).text =  (((ColunaContext)_localctx).IDENT!=null?((ColunaContext)_localctx).IDENT.getText():null);
			setState(314);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(310);
				match(T__7);
				setState(311);
				((ColunaContext)_localctx).atr = atr();
				_localctx.text += "." + ((ColunaContext)_localctx).atr.text;
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

	public static class AtrContext extends ParserRuleContext {
		public String text;
		public Token IDENT;
		public TerminalNode IDENT() { return getToken(SeQueLaParser.IDENT, 0); }
		public AtrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterAtr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitAtr(this);
		}
	}

	public final AtrContext atr() throws RecognitionException {
		AtrContext _localctx = new AtrContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			((AtrContext)_localctx).IDENT = match(IDENT);
			((AtrContext)_localctx).text =  (((AtrContext)_localctx).IDENT!=null?((AtrContext)_localctx).IDENT.getText():null);
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

	public static class FromContext extends ParserRuleContext {
		public ArrayList<String> text;
		public Token IDENT;
		public From2Context from2;
		public TerminalNode IDENT() { return getToken(SeQueLaParser.IDENT, 0); }
		public From2Context from2() {
			return getRuleContext(From2Context.class,0);
		}
		public FromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitFrom(this);
		}
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_from);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			((FromContext)_localctx).IDENT = match(IDENT);
			if(!(tabela.existeSimbolo((((FromContext)_localctx).IDENT!=null?((FromContext)_localctx).IDENT.getText():null)))){MyErrorListener.erroSemantico2((((FromContext)_localctx).IDENT!=null?((FromContext)_localctx).IDENT.getText():null), ((FromContext)_localctx).IDENT.getLine());}
			((FromContext)_localctx).text =  new ArrayList<>();
			                                _localctx.text.add((((FromContext)_localctx).IDENT!=null?((FromContext)_localctx).IDENT.getText():null));
			setState(326);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(322);
				match(T__0);
				setState(323);
				((FromContext)_localctx).from2 = from2();
				_localctx.text.addAll(((FromContext)_localctx).from2.text);
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

	public static class From2Context extends ParserRuleContext {
		public ArrayList<String> text;
		public Token IDENT;
		public FromContext from;
		public TerminalNode IDENT() { return getToken(SeQueLaParser.IDENT, 0); }
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public From2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterFrom2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitFrom2(this);
		}
	}

	public final From2Context from2() throws RecognitionException {
		From2Context _localctx = new From2Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_from2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			((From2Context)_localctx).IDENT = match(IDENT);
			if(!(tabela.existeSimbolo((((From2Context)_localctx).IDENT!=null?((From2Context)_localctx).IDENT.getText():null)))){MyErrorListener.erroSemantico2((((From2Context)_localctx).IDENT!=null?((From2Context)_localctx).IDENT.getText():null), ((From2Context)_localctx).IDENT.getLine());}
			((From2Context)_localctx).text =  new ArrayList<>();
			                                _localctx.text.add((((From2Context)_localctx).IDENT!=null?((From2Context)_localctx).IDENT.getText():null));
			setState(335);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(331);
				match(T__0);
				setState(332);
				((From2Context)_localctx).from = from();
				_localctx.text.addAll(((From2Context)_localctx).from.text);
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

	public static class ViewContext extends ParserRuleContext {
		public Token IDENT;
		public ColunasContext colunas;
		public FromContext from;
		public ExpressaoContext expressao;
		public TerminalNode VIEW() { return getToken(SeQueLaParser.VIEW, 0); }
		public TerminalNode IDENT() { return getToken(SeQueLaParser.IDENT, 0); }
		public TerminalNode COMO() { return getToken(SeQueLaParser.COMO, 0); }
		public TerminalNode SELECIONA() { return getToken(SeQueLaParser.SELECIONA, 0); }
		public TerminalNode DE() { return getToken(SeQueLaParser.DE, 0); }
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public List<ColunasContext> colunas() {
			return getRuleContexts(ColunasContext.class);
		}
		public ColunasContext colunas(int i) {
			return getRuleContext(ColunasContext.class,i);
		}
		public TerminalNode TUDO() { return getToken(SeQueLaParser.TUDO, 0); }
		public TerminalNode DISTINCT() { return getToken(SeQueLaParser.DISTINCT, 0); }
		public List<TerminalNode> TABULACAO() { return getTokens(SeQueLaParser.TABULACAO); }
		public TerminalNode TABULACAO(int i) {
			return getToken(SeQueLaParser.TABULACAO, i);
		}
		public TerminalNode ONDE() { return getToken(SeQueLaParser.ONDE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode GROUP() { return getToken(SeQueLaParser.GROUP, 0); }
		public ViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitView(this);
		}
	}

	public final ViewContext view() throws RecognitionException {
		ViewContext _localctx = new ViewContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_view);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(VIEW);
			setState(338);
			((ViewContext)_localctx).IDENT = match(IDENT);
			if(!(tabela.existeSimbolo((((ViewContext)_localctx).IDENT!=null?((ViewContext)_localctx).IDENT.getText():null)))){
			                                            tabela.adicionarSimbolo((((ViewContext)_localctx).IDENT!=null?((ViewContext)_localctx).IDENT.getText():null), "VIEW");
			                                        }
			                                        else{
			                                            MyErrorListener.erroSemantico1((((ViewContext)_localctx).IDENT!=null?((ViewContext)_localctx).IDENT.getText():null), ((ViewContext)_localctx).IDENT.getLine());
			                 }
			setState(340);
			match(COMO);
			setState(341);
			match(SELECIONA);
			setState(344);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(342);
				match(DISTINCT);
				setDistinct();
				}
			}

			setState(351);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(346);
				((ViewContext)_localctx).colunas = colunas();
				geradorViewCabesalho((((ViewContext)_localctx).IDENT!=null?((ViewContext)_localctx).IDENT.getText():null), ((ViewContext)_localctx).colunas.text);
				}
				break;
			case TUDO:
				{
				setState(349);
				match(TUDO);
				geradorViewCabesalho((((ViewContext)_localctx).IDENT!=null?((ViewContext)_localctx).IDENT.getText():null), new ArrayList<>());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(354);
			_la = _input.LA(1);
			if (_la==TABULACAO) {
				{
				setState(353);
				match(TABULACAO);
				}
			}

			setState(356);
			match(DE);
			setState(357);
			((ViewContext)_localctx).from = from();
			geradorViewFrom(((ViewContext)_localctx).from.text);
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(360);
				_la = _input.LA(1);
				if (_la==TABULACAO) {
					{
					setState(359);
					match(TABULACAO);
					}
				}

				setState(362);
				match(ONDE);
				setState(363);
				((ViewContext)_localctx).expressao = expressao();
				geradorViewWhere(((ViewContext)_localctx).expressao.text);
				}
				break;
			}
			setState(375);
			_la = _input.LA(1);
			if (_la==GROUP || _la==TABULACAO) {
				{
				setState(369);
				_la = _input.LA(1);
				if (_la==TABULACAO) {
					{
					setState(368);
					match(TABULACAO);
					}
				}

				setState(371);
				match(GROUP);
				setState(372);
				((ViewContext)_localctx).colunas = colunas();
				geradorViewGroup(((ViewContext)_localctx).colunas.text);
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

	public static class SlctContext extends ParserRuleContext {
		public ColunasContext colunas;
		public FromContext from;
		public ExpressaoContext expressao;
		public TerminalNode SELECIONA() { return getToken(SeQueLaParser.SELECIONA, 0); }
		public TerminalNode DE() { return getToken(SeQueLaParser.DE, 0); }
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public List<ColunasContext> colunas() {
			return getRuleContexts(ColunasContext.class);
		}
		public ColunasContext colunas(int i) {
			return getRuleContext(ColunasContext.class,i);
		}
		public TerminalNode TUDO() { return getToken(SeQueLaParser.TUDO, 0); }
		public TerminalNode DISTINCT() { return getToken(SeQueLaParser.DISTINCT, 0); }
		public List<TerminalNode> TABULACAO() { return getTokens(SeQueLaParser.TABULACAO); }
		public TerminalNode TABULACAO(int i) {
			return getToken(SeQueLaParser.TABULACAO, i);
		}
		public TerminalNode ONDE() { return getToken(SeQueLaParser.ONDE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode GROUP() { return getToken(SeQueLaParser.GROUP, 0); }
		public SlctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterSlct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitSlct(this);
		}
	}

	public final SlctContext slct() throws RecognitionException {
		SlctContext _localctx = new SlctContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_slct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(SELECIONA);
			setState(380);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(378);
				match(DISTINCT);
				setDistinct();
				}
			}

			setState(387);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(382);
				((SlctContext)_localctx).colunas = colunas();
				geradorSelectCabesalho(((SlctContext)_localctx).colunas.text);
				}
				break;
			case TUDO:
				{
				setState(385);
				match(TUDO);
				geradorSelectCabesalho(new ArrayList<>());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(390);
			_la = _input.LA(1);
			if (_la==TABULACAO) {
				{
				setState(389);
				match(TABULACAO);
				}
			}

			setState(392);
			match(DE);
			setState(393);
			((SlctContext)_localctx).from = from();
			geradorSelectFrom(((SlctContext)_localctx).from.text);
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(396);
				_la = _input.LA(1);
				if (_la==TABULACAO) {
					{
					setState(395);
					match(TABULACAO);
					}
				}

				setState(398);
				match(ONDE);
				setState(399);
				((SlctContext)_localctx).expressao = expressao();
				geradorSelectWhere(((SlctContext)_localctx).expressao.text);
				}
				break;
			}
			setState(411);
			_la = _input.LA(1);
			if (_la==GROUP || _la==TABULACAO) {
				{
				setState(405);
				_la = _input.LA(1);
				if (_la==TABULACAO) {
					{
					setState(404);
					match(TABULACAO);
					}
				}

				setState(407);
				match(GROUP);
				setState(408);
				((SlctContext)_localctx).colunas = colunas();
				geradorSelectGroup(((SlctContext)_localctx).colunas.text);
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

	public static class ExpressaoContext extends ParserRuleContext {
		public ArrayList<String> text;
		public ColunaContext coluna;
		public Token OP;
		public AlgoContext algo;
		public Expressao1Context expressao1;
		public ColunaContext coluna() {
			return getRuleContext(ColunaContext.class,0);
		}
		public TerminalNode OP() { return getToken(SeQueLaParser.OP, 0); }
		public AlgoContext algo() {
			return getRuleContext(AlgoContext.class,0);
		}
		public Expressao1Context expressao1() {
			return getRuleContext(Expressao1Context.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			((ExpressaoContext)_localctx).coluna = coluna();
			setState(414);
			((ExpressaoContext)_localctx).OP = match(OP);
			setState(415);
			((ExpressaoContext)_localctx).algo = algo();
			((ExpressaoContext)_localctx).text =  new ArrayList<String>();
			                                _localctx.text.add(((ExpressaoContext)_localctx).coluna.text +" "+ (((ExpressaoContext)_localctx).OP!=null?((ExpressaoContext)_localctx).OP.getText():null) +" "+ ((ExpressaoContext)_localctx).algo.text);
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(417);
				((ExpressaoContext)_localctx).expressao1 = expressao1();
				_localctx.text.addAll(((ExpressaoContext)_localctx).expressao1.text);
				}
				break;
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

	public static class Expressao1Context extends ParserRuleContext {
		public ArrayList<String> text;
		public LogicoContext logico;
		public ColunaContext coluna;
		public Token OP;
		public AlgoContext algo;
		public Expressao2Context expressao2;
		public LogicoContext logico() {
			return getRuleContext(LogicoContext.class,0);
		}
		public ColunaContext coluna() {
			return getRuleContext(ColunaContext.class,0);
		}
		public TerminalNode OP() { return getToken(SeQueLaParser.OP, 0); }
		public AlgoContext algo() {
			return getRuleContext(AlgoContext.class,0);
		}
		public TerminalNode TABULACAO() { return getToken(SeQueLaParser.TABULACAO, 0); }
		public Expressao2Context expressao2() {
			return getRuleContext(Expressao2Context.class,0);
		}
		public Expressao1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterExpressao1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitExpressao1(this);
		}
	}

	public final Expressao1Context expressao1() throws RecognitionException {
		Expressao1Context _localctx = new Expressao1Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_expressao1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			_la = _input.LA(1);
			if (_la==TABULACAO) {
				{
				setState(422);
				match(TABULACAO);
				}
			}

			setState(425);
			((Expressao1Context)_localctx).logico = logico();
			setState(426);
			((Expressao1Context)_localctx).coluna = coluna();
			setState(427);
			((Expressao1Context)_localctx).OP = match(OP);
			setState(428);
			((Expressao1Context)_localctx).algo = algo();
			((Expressao1Context)_localctx).text =  new ArrayList<String>();
			                                 _localctx.text.add(((Expressao1Context)_localctx).logico.text +" "+ ((Expressao1Context)_localctx).coluna.text +" "+ (((Expressao1Context)_localctx).OP!=null?((Expressao1Context)_localctx).OP.getText():null) + " " + ((Expressao1Context)_localctx).algo.text);
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(430);
				((Expressao1Context)_localctx).expressao2 = expressao2();
				_localctx.text.addAll(((Expressao1Context)_localctx).expressao2.text);
				}
				break;
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

	public static class Expressao2Context extends ParserRuleContext {
		public ArrayList<String> text;
		public LogicoContext logico;
		public ColunaContext coluna;
		public Token OP;
		public AlgoContext algo;
		public Expressao1Context expressao1;
		public LogicoContext logico() {
			return getRuleContext(LogicoContext.class,0);
		}
		public ColunaContext coluna() {
			return getRuleContext(ColunaContext.class,0);
		}
		public TerminalNode OP() { return getToken(SeQueLaParser.OP, 0); }
		public AlgoContext algo() {
			return getRuleContext(AlgoContext.class,0);
		}
		public TerminalNode TABULACAO() { return getToken(SeQueLaParser.TABULACAO, 0); }
		public Expressao1Context expressao1() {
			return getRuleContext(Expressao1Context.class,0);
		}
		public Expressao2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterExpressao2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitExpressao2(this);
		}
	}

	public final Expressao2Context expressao2() throws RecognitionException {
		Expressao2Context _localctx = new Expressao2Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_expressao2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			_la = _input.LA(1);
			if (_la==TABULACAO) {
				{
				setState(435);
				match(TABULACAO);
				}
			}

			setState(438);
			((Expressao2Context)_localctx).logico = logico();
			setState(439);
			((Expressao2Context)_localctx).coluna = coluna();
			setState(440);
			((Expressao2Context)_localctx).OP = match(OP);
			setState(441);
			((Expressao2Context)_localctx).algo = algo();
			((Expressao2Context)_localctx).text =  new ArrayList<String>();
			                                 _localctx.text.add(((Expressao2Context)_localctx).logico.text +" "+ ((Expressao2Context)_localctx).coluna.text +" "+ (((Expressao2Context)_localctx).OP!=null?((Expressao2Context)_localctx).OP.getText():null) + " " + ((Expressao2Context)_localctx).algo.text);
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(443);
				((Expressao2Context)_localctx).expressao1 = expressao1();
				_localctx.text.addAll(((Expressao2Context)_localctx).expressao1.text);
				}
				break;
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

	public static class AlgoContext extends ParserRuleContext {
		public String text;
		public ColunaContext coluna;
		public ValoresContext valores;
		public ColunaContext coluna() {
			return getRuleContext(ColunaContext.class,0);
		}
		public ValoresContext valores() {
			return getRuleContext(ValoresContext.class,0);
		}
		public AlgoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).enterAlgo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeQueLaListener ) ((SeQueLaListener)listener).exitAlgo(this);
		}
	}

	public final AlgoContext algo() throws RecognitionException {
		AlgoContext _localctx = new AlgoContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_algo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(448);
				((AlgoContext)_localctx).coluna = coluna();
				((AlgoContext)_localctx).text =  ((AlgoContext)_localctx).coluna.text;
				}
				break;
			case LITERAL:
			case INTEIRO:
			case REAL:
			case VERDADEIRO:
			case FALSO:
			case DATA:
			case HORA:
				{
				setState(451);
				((AlgoContext)_localctx).valores = valores();
				((AlgoContext)_localctx).text =  (((AlgoContext)_localctx).valores!=null?_input.getText(((AlgoContext)_localctx).valores.start,((AlgoContext)_localctx).valores.stop):null);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\u01cb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3Y\n\3\3\4\3\4\3\4\7\4^\n\4\f\4\16\4a\13\4\3\5\3\5\3\5"+
		"\3\5\5\5g\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6r\n\6\f\6\16\6u\13"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u0086"+
		"\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u0090\n\n\3\13\3\13\3\13\3\13"+
		"\7\13\u0096\n\13\f\13\16\13\u0099\13\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00a0\n\13\3\f\3\f\3\r\3\r\5\r\u00a6\n\r\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00ad\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u00b6\n\17\f\17\16"+
		"\17\u00b9\13\17\3\17\5\17\u00bc\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u00cd\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u00d7\n\23\6\23\u00d9\n\23\r\23\16\23\u00da"+
		"\3\24\3\24\5\24\u00df\n\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\5\26\u00ec\n\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u0113\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u011b\n\34\3\35\5"+
		"\35\u011e\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0128\n\35"+
		"\3\36\5\36\u012b\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0135"+
		"\n\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u013d\n\37\3 \3 \3 \3!\3!\3!"+
		"\3!\3!\3!\3!\5!\u0149\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0152\n\"\3#"+
		"\3#\3#\3#\3#\3#\3#\5#\u015b\n#\3#\3#\3#\3#\3#\5#\u0162\n#\3#\5#\u0165"+
		"\n#\3#\3#\3#\3#\5#\u016b\n#\3#\3#\3#\3#\5#\u0171\n#\3#\5#\u0174\n#\3#"+
		"\3#\3#\3#\5#\u017a\n#\3$\3$\3$\5$\u017f\n$\3$\3$\3$\3$\3$\5$\u0186\n$"+
		"\3$\5$\u0189\n$\3$\3$\3$\3$\5$\u018f\n$\3$\3$\3$\3$\5$\u0195\n$\3$\5$"+
		"\u0198\n$\3$\3$\3$\3$\5$\u019e\n$\3%\3%\3%\3%\3%\3%\3%\5%\u01a7\n%\3&"+
		"\5&\u01aa\n&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01b4\n&\3\'\5\'\u01b7\n\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01c1\n\'\3(\3(\3(\3(\3(\3(\5(\u01c9"+
		"\n(\3(\2\2)\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLN\2\3\3\2./\u01e0\2P\3\2\2\2\4X\3\2\2\2\6Z\3\2\2\2\bf\3\2\2"+
		"\2\ns\3\2\2\2\fx\3\2\2\2\16\u0085\3\2\2\2\20\u0087\3\2\2\2\22\u008f\3"+
		"\2\2\2\24\u009f\3\2\2\2\26\u00a1\3\2\2\2\30\u00a5\3\2\2\2\32\u00a7\3\2"+
		"\2\2\34\u00b0\3\2\2\2\36\u00bd\3\2\2\2 \u00c3\3\2\2\2\"\u00cc\3\2\2\2"+
		"$\u00ce\3\2\2\2&\u00dc\3\2\2\2(\u00e4\3\2\2\2*\u00e9\3\2\2\2,\u00f0\3"+
		"\2\2\2.\u00f5\3\2\2\2\60\u00f8\3\2\2\2\62\u0103\3\2\2\2\64\u010c\3\2\2"+
		"\2\66\u0114\3\2\2\28\u011d\3\2\2\2:\u012a\3\2\2\2<\u0136\3\2\2\2>\u013e"+
		"\3\2\2\2@\u0141\3\2\2\2B\u014a\3\2\2\2D\u0153\3\2\2\2F\u017b\3\2\2\2H"+
		"\u019f\3\2\2\2J\u01a9\3\2\2\2L\u01b6\3\2\2\2N\u01c8\3\2\2\2PQ\t\2\2\2"+
		"Q\3\3\2\2\2RY\7+\2\2SY\7,\2\2TY\7-\2\2UY\5\2\2\2VY\7\60\2\2WY\7\62\2\2"+
		"XR\3\2\2\2XS\3\2\2\2XT\3\2\2\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\5\3\2\2"+
		"\2Z_\5\4\3\2[\\\7\3\2\2\\^\5\4\3\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2"+
		"\2\2`\7\3\2\2\2a_\3\2\2\2bc\7#\2\2cg\b\5\1\2de\7$\2\2eg\b\5\1\2fb\3\2"+
		"\2\2fd\3\2\2\2g\t\3\2\2\2hr\5\f\7\2ir\5\30\r\2jr\5$\23\2kr\5,\27\2lr\5"+
		".\30\2mr\5\62\32\2nr\5F$\2or\5D#\2pr\5\60\31\2qh\3\2\2\2qi\3\2\2\2qj\3"+
		"\2\2\2qk\3\2\2\2ql\3\2\2\2qm\3\2\2\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2ru\3"+
		"\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\b\6\1\2w\13\3\2\2\2x"+
		"y\7\r\2\2yz\7&\2\2z{\b\7\1\2{|\b\7\1\2|}\5\16\b\2}~\b\7\1\2~\177\5\20"+
		"\t\2\177\u0080\b\7\1\2\u0080\r\3\2\2\2\u0081\u0082\7\4\2\2\u0082\u0086"+
		"\7&\2\2\u0083\u0086\7\5\2\2\u0084\u0086\3\2\2\2\u0085\u0081\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\17\3\2\2\2\u0087\u0088\5\24\13"+
		"\2\u0088\u0089\5\22\n\2\u0089\u008a\b\t\1\2\u008a\21\3\2\2\2\u008b\u008c"+
		"\5\20\t\2\u008c\u008d\b\n\1\2\u008d\u0090\3\2\2\2\u008e\u0090\3\2\2\2"+
		"\u008f\u008b\3\2\2\2\u008f\u008e\3\2\2\2\u0090\23\3\2\2\2\u0091\u0092"+
		"\7\'\2\2\u0092\u0093\7&\2\2\u0093\u0097\7\37\2\2\u0094\u0096\7!\2\2\u0095"+
		"\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u00a0\b\13\1\2\u009b"+
		"\u009c\7\'\2\2\u009c\u009d\7&\2\2\u009d\u009e\7 \2\2\u009e\u00a0\5\26"+
		"\f\2\u009f\u0091\3\2\2\2\u009f\u009b\3\2\2\2\u00a0\25\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\27\3\2\2\2\u00a3\u00a6\5\32\16\2\u00a4\u00a6\5\34\17\2"+
		"\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\31\3\2\2\2\u00a7\u00a8"+
		"\5\36\20\2\u00a8\u00a9\7&\2\2\u00a9\u00aa\5 \21\2\u00aa\u00ac\7\"\2\2"+
		"\u00ab\u00ad\5\20\t\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae"+
		"\3\2\2\2\u00ae\u00af\b\16\1\2\u00af\33\3\2\2\2\u00b0\u00b1\7&\2\2\u00b1"+
		"\u00b2\b\17\1\2\u00b2\u00b7\5\36\20\2\u00b3\u00b4\7\3\2\2\u00b4\u00b6"+
		"\5\36\20\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2"+
		"\u00b7\u00b8\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bc"+
		"\5\20\t\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\35\3\2\2\2\u00bd"+
		"\u00be\7&\2\2\u00be\u00bf\b\20\1\2\u00bf\u00c0\7%\2\2\u00c0\u00c1\b\20"+
		"\1\2\u00c1\u00c2\5\"\22\2\u00c2\37\3\2\2\2\u00c3\u00c4\5\"\22\2\u00c4"+
		"\u00c5\7%\2\2\u00c5\u00c6\b\21\1\2\u00c6\u00c7\7&\2\2\u00c7\u00c8\b\21"+
		"\1\2\u00c8!\3\2\2\2\u00c9\u00cd\7\6\2\2\u00ca\u00cd\7\7\2\2\u00cb\u00cd"+
		"\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd"+
		"#\3\2\2\2\u00ce\u00cf\7\17\2\2\u00cf\u00d0\7&\2\2\u00d0\u00d1\b\23\1\2"+
		"\u00d1\u00d8\b\23\1\2\u00d2\u00d6\7\'\2\2\u00d3\u00d7\5&\24\2\u00d4\u00d7"+
		"\5(\25\2\u00d5\u00d7\5*\26\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d5\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d2\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db%\3\2\2\2\u00dc\u00de"+
		"\7\17\2\2\u00dd\u00df\7\24\2\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2"+
		"\u00df\u00e0\3\2\2\2\u00e0\u00e1\7&\2\2\u00e1\u00e2\7\37\2\2\u00e2\u00e3"+
		"\b\24\1\2\u00e3\'\3\2\2\2\u00e4\u00e5\7\22\2\2\u00e5\u00e6\7&\2\2\u00e6"+
		"\u00e7\7\37\2\2\u00e7\u00e8\b\25\1\2\u00e8)\3\2\2\2\u00e9\u00eb\7\20\2"+
		"\2\u00ea\u00ec\7\24\2\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00ee\7&\2\2\u00ee\u00ef\b\26\1\2\u00ef+\3\2\2\2"+
		"\u00f0\u00f1\7\20\2\2\u00f1\u00f2\7&\2\2\u00f2\u00f3\b\27\1\2\u00f3\u00f4"+
		"\b\27\1\2\u00f4-\3\2\2\2\u00f5\u00f6\7\32\2\2\u00f6\u00f7\7&\2\2\u00f7"+
		"/\3\2\2\2\u00f8\u00f9\7\23\2\2\u00f9\u00fa\7&\2\2\u00fa\u00fb\b\31\1\2"+
		"\u00fb\u00fc\7\30\2\2\u00fc\u00fd\7&\2\2\u00fd\u00fe\b\31\1\2\u00fe\u00ff"+
		"\7\b\2\2\u00ff\u0100\5\64\33\2\u0100\u0101\7\t\2\2\u0101\u0102\b\31\1"+
		"\2\u0102\61\3\2\2\2\u0103\u0104\7&\2\2\u0104\u0105\b\32\1\2\u0105\u0106"+
		"\7\b\2\2\u0106\u0107\5\64\33\2\u0107\u0108\7\t\2\2\u0108\u0109\7\21\2"+
		"\2\u0109\u010a\58\35\2\u010a\u010b\b\32\1\2\u010b\63\3\2\2\2\u010c\u010d"+
		"\7&\2\2\u010d\u0112\b\33\1\2\u010e\u010f\7\3\2\2\u010f\u0110\5\66\34\2"+
		"\u0110\u0111\b\33\1\2\u0111\u0113\3\2\2\2\u0112\u010e\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113\65\3\2\2\2\u0114\u0115\7&\2\2\u0115\u011a\b\34\1\2\u0116"+
		"\u0117\7\3\2\2\u0117\u0118\5\64\33\2\u0118\u0119\b\34\1\2\u0119\u011b"+
		"\3\2\2\2\u011a\u0116\3\2\2\2\u011a\u011b\3\2\2\2\u011b\67\3\2\2\2\u011c"+
		"\u011e\7\'\2\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f\u0120\7\b\2\2\u0120\u0121\5\6\4\2\u0121\u0122\7\t\2\2\u0122"+
		"\u0127\b\35\1\2\u0123\u0124\7\3\2\2\u0124\u0125\5:\36\2\u0125\u0126\b"+
		"\35\1\2\u0126\u0128\3\2\2\2\u0127\u0123\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"9\3\2\2\2\u0129\u012b\7\'\2\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2"+
		"\u012b\u012c\3\2\2\2\u012c\u012d\7\b\2\2\u012d\u012e\5\6\4\2\u012e\u012f"+
		"\7\t\2\2\u012f\u0134\b\36\1\2\u0130\u0131\7\3\2\2\u0131\u0132\58\35\2"+
		"\u0132\u0133\b\36\1\2\u0133\u0135\3\2\2\2\u0134\u0130\3\2\2\2\u0134\u0135"+
		"\3\2\2\2\u0135;\3\2\2\2\u0136\u0137\7&\2\2\u0137\u013c\b\37\1\2\u0138"+
		"\u0139\7\n\2\2\u0139\u013a\5> \2\u013a\u013b\b\37\1\2\u013b\u013d\3\2"+
		"\2\2\u013c\u0138\3\2\2\2\u013c\u013d\3\2\2\2\u013d=\3\2\2\2\u013e\u013f"+
		"\7&\2\2\u013f\u0140\b \1\2\u0140?\3\2\2\2\u0141\u0142\7&\2\2\u0142\u0143"+
		"\b!\1\2\u0143\u0148\b!\1\2\u0144\u0145\7\3\2\2\u0145\u0146\5B\"\2\u0146"+
		"\u0147\b!\1\2\u0147\u0149\3\2\2\2\u0148\u0144\3\2\2\2\u0148\u0149\3\2"+
		"\2\2\u0149A\3\2\2\2\u014a\u014b\7&\2\2\u014b\u014c\b\"\1\2\u014c\u0151"+
		"\b\"\1\2\u014d\u014e\7\3\2\2\u014e\u014f\5@!\2\u014f\u0150\b\"\1\2\u0150"+
		"\u0152\3\2\2\2\u0151\u014d\3\2\2\2\u0151\u0152\3\2\2\2\u0152C\3\2\2\2"+
		"\u0153\u0154\7\33\2\2\u0154\u0155\7&\2\2\u0155\u0156\b#\1\2\u0156\u0157"+
		"\7\36\2\2\u0157\u015a\7\26\2\2\u0158\u0159\7\35\2\2\u0159\u015b\b#\1\2"+
		"\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u0161\3\2\2\2\u015c\u015d"+
		"\5\64\33\2\u015d\u015e\b#\1\2\u015e\u0162\3\2\2\2\u015f\u0160\7\25\2\2"+
		"\u0160\u0162\b#\1\2\u0161\u015c\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0164"+
		"\3\2\2\2\u0163\u0165\7\'\2\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0167\7\27\2\2\u0167\u0168\5@!\2\u0168\u0170\b#\1"+
		"\2\u0169\u016b\7\'\2\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c"+
		"\3\2\2\2\u016c\u016d\7\31\2\2\u016d\u016e\5H%\2\u016e\u016f\b#\1\2\u016f"+
		"\u0171\3\2\2\2\u0170\u016a\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0179\3\2"+
		"\2\2\u0172\u0174\7\'\2\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u0176\7\34\2\2\u0176\u0177\5\64\33\2\u0177\u0178"+
		"\b#\1\2\u0178\u017a\3\2\2\2\u0179\u0173\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"E\3\2\2\2\u017b\u017e\7\26\2\2\u017c\u017d\7\35\2\2\u017d\u017f\b$\1\2"+
		"\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0185\3\2\2\2\u0180\u0181"+
		"\5\64\33\2\u0181\u0182\b$\1\2\u0182\u0186\3\2\2\2\u0183\u0184\7\25\2\2"+
		"\u0184\u0186\b$\1\2\u0185\u0180\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0188"+
		"\3\2\2\2\u0187\u0189\7\'\2\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u018b\7\27\2\2\u018b\u018c\5@!\2\u018c\u0194\b$\1"+
		"\2\u018d\u018f\7\'\2\2\u018e\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190"+
		"\3\2\2\2\u0190\u0191\7\31\2\2\u0191\u0192\5H%\2\u0192\u0193\b$\1\2\u0193"+
		"\u0195\3\2\2\2\u0194\u018e\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u019d\3\2"+
		"\2\2\u0196\u0198\7\'\2\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\u019a\7\34\2\2\u019a\u019b\5\64\33\2\u019b\u019c"+
		"\b$\1\2\u019c\u019e\3\2\2\2\u019d\u0197\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"G\3\2\2\2\u019f\u01a0\5<\37\2\u01a0\u01a1\7)\2\2\u01a1\u01a2\5N(\2\u01a2"+
		"\u01a6\b%\1\2\u01a3\u01a4\5J&\2\u01a4\u01a5\b%\1\2\u01a5\u01a7\3\2\2\2"+
		"\u01a6\u01a3\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7I\3\2\2\2\u01a8\u01aa\7"+
		"\'\2\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab"+
		"\u01ac\5\b\5\2\u01ac\u01ad\5<\37\2\u01ad\u01ae\7)\2\2\u01ae\u01af\5N("+
		"\2\u01af\u01b3\b&\1\2\u01b0\u01b1\5L\'\2\u01b1\u01b2\b&\1\2\u01b2\u01b4"+
		"\3\2\2\2\u01b3\u01b0\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4K\3\2\2\2\u01b5"+
		"\u01b7\7\'\2\2\u01b6\u01b5\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\3\2"+
		"\2\2\u01b8\u01b9\5\b\5\2\u01b9\u01ba\5<\37\2\u01ba\u01bb\7)\2\2\u01bb"+
		"\u01bc\5N(\2\u01bc\u01c0\b\'\1\2\u01bd\u01be\5J&\2\u01be\u01bf\b\'\1\2"+
		"\u01bf\u01c1\3\2\2\2\u01c0\u01bd\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1M\3"+
		"\2\2\2\u01c2\u01c3\5<\37\2\u01c3\u01c4\b(\1\2\u01c4\u01c9\3\2\2\2\u01c5"+
		"\u01c6\5\6\4\2\u01c6\u01c7\b(\1\2\u01c7\u01c9\3\2\2\2\u01c8\u01c2\3\2"+
		"\2\2\u01c8\u01c5\3\2\2\2\u01c9O\3\2\2\2\61X_fqs\u0085\u008f\u0097\u009f"+
		"\u00a5\u00ac\u00b7\u00bb\u00cc\u00d6\u00da\u00de\u00eb\u0112\u011a\u011d"+
		"\u0127\u012a\u0134\u013c\u0148\u0151\u015a\u0161\u0164\u016a\u0170\u0173"+
		"\u0179\u017e\u0185\u0188\u018e\u0194\u0197\u019d\u01a6\u01a9\u01b3\u01b6"+
		"\u01c0\u01c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}