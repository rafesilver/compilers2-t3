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
		INSERE=15, ADD=16, COLUMN=17, TUDO=18, SELECIONA=19, DE=20, ONDE=21, EXIBE=22, 
		VIEW=23, GROUP=24, DISTINCT=25, COMO=26, TIPO=27, COMPOSTO=28, RESTRICAO=29, 
		TIPO_MAPEAMENTO=30, LOGICO_E=31, LOGICO_OU=32, CARDINALIDADE=33, IDENT=34, 
		TABULACAO=35, WS=36, OP=37, ARITMETICO=38, LITERAL=39, INTEIRO=40, REAL=41, 
		VERDADEIRO=42, FALSO=43, DATA=44, SEP1=45, HORA=46, SEP2=47;
	public static final int
		RULE_booleano = 0, RULE_valor = 1, RULE_valores = 2, RULE_logico = 3, 
		RULE_programa = 4, RULE_ent = 5, RULE_modificador_ent = 6, RULE_atributos = 7, 
		RULE_mais_declaracao = 8, RULE_declaracao = 9, RULE_dec_composto = 10, 
		RULE_rel = 11, RULE_rel_binaria = 12, RULE_rel_n = 13, RULE_rel_esq = 14, 
		RULE_rel_dir = 15, RULE_participacao = 16, RULE_alt = 17, RULE_alt_alt = 18, 
		RULE_alt_add = 19, RULE_alt_drop = 20, RULE_excl = 21, RULE_exibe = 22, 
		RULE_insrt = 23, RULE_colunas = 24, RULE_colunas2 = 25, RULE_valores1 = 26, 
		RULE_valores2 = 27, RULE_coluna = 28, RULE_atr = 29, RULE_from = 30, RULE_from2 = 31, 
		RULE_view = 32, RULE_slct = 33, RULE_expressao = 34, RULE_expressao1 = 35, 
		RULE_expressao2 = 36, RULE_algo = 37;
	public static final String[] ruleNames = {
		"booleano", "valor", "valores", "logico", "programa", "ent", "modificador_ent", 
		"atributos", "mais_declaracao", "declaracao", "dec_composto", "rel", "rel_binaria", 
		"rel_n", "rel_esq", "rel_dir", "participacao", "alt", "alt_alt", "alt_add", 
		"alt_drop", "excl", "exibe", "insrt", "colunas", "colunas2", "valores1", 
		"valores2", "coluna", "atr", "from", "from2", "view", "slct", "expressao", 
		"expressao1", "expressao2", "algo"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'fraca'", "'forte'", "'parcial'", "'total'", "'('", "')'", 
		"'.'", null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "'composto'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "COMENTARIO", "COMENTARIO_ERRADO", 
		"ENTIDADE", "RELACIONAMENTO", "ALTERA", "EXCLUI", "INSERE", "ADD", "COLUMN", 
		"TUDO", "SELECIONA", "DE", "ONDE", "EXIBE", "VIEW", "GROUP", "DISTINCT", 
		"COMO", "TIPO", "COMPOSTO", "RESTRICAO", "TIPO_MAPEAMENTO", "LOGICO_E", 
		"LOGICO_OU", "CARDINALIDADE", "IDENT", "TABULACAO", "WS", "OP", "ARITMETICO", 
		"LITERAL", "INTEIRO", "REAL", "VERDADEIRO", "FALSO", "DATA", "SEP1", "HORA", 
		"SEP2"
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
			setState(76);
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
			setState(84);
			switch (_input.LA(1)) {
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(LITERAL);
				}
				break;
			case INTEIRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(INTEIRO);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				match(REAL);
				}
				break;
			case VERDADEIRO:
			case FALSO:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				booleano();
				}
				break;
			case DATA:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				match(DATA);
				}
				break;
			case HORA:
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
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
			setState(86);
			valor();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(87);
				match(T__0);
				setState(88);
				valor();
				}
				}
				setState(93);
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
			setState(98);
			switch (_input.LA(1)) {
			case LOGICO_E:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(LOGICO_E);
				((LogicoContext)_localctx).text =  "AND";
				}
				break;
			case LOGICO_OU:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
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
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTIDADE) | (1L << ALTERA) | (1L << EXCLUI) | (1L << SELECIONA) | (1L << EXIBE) | (1L << VIEW) | (1L << IDENT))) != 0)) {
				{
				setState(108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(100);
					ent();
					}
					break;
				case 2:
					{
					setState(101);
					rel();
					}
					break;
				case 3:
					{
					setState(102);
					alt();
					}
					break;
				case 4:
					{
					setState(103);
					excl();
					}
					break;
				case 5:
					{
					setState(104);
					exibe();
					}
					break;
				case 6:
					{
					setState(105);
					insrt();
					}
					break;
				case 7:
					{
					setState(106);
					slct();
					}
					break;
				case 8:
					{
					setState(107);
					view();
					}
					break;
				}
				}
				setState(112);
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
			setState(115);
			match(ENTIDADE);
			setState(116);
			((EntContext)_localctx).IDENT = match(IDENT);
			if(!(tabela.existeSimbolo((((EntContext)_localctx).IDENT!=null?((EntContext)_localctx).IDENT.getText():null)))){
			                                    tabela.adicionarSimbolo((((EntContext)_localctx).IDENT!=null?((EntContext)_localctx).IDENT.getText():null), "ENTIDADE");
			                                }
			                                else{
			                                    MyErrorListener.erroSemantico1((((EntContext)_localctx).IDENT!=null?((EntContext)_localctx).IDENT.getText():null), ((EntContext)_localctx).IDENT.getLine());
			                                }
			String aux=(((EntContext)_localctx).IDENT!=null?((EntContext)_localctx).IDENT.getText():null);
			                                 demarcador("nome-ent",aux);
			setState(119);
			modificador_ent();
			demarcador("abre-parent","");
			setState(121);
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
			setState(128);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(T__1);
				setState(125);
				match(IDENT);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
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
			setState(130);
			((AtributosContext)_localctx).declaracao = declaracao();
			setState(131);
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
			setState(138);
			switch (_input.LA(1)) {
			case TABULACAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				((Mais_declaracaoContext)_localctx).atributos = atributos();

				                    _localctx.mais_dec.add(((Mais_declaracaoContext)_localctx).atributos.atrib);
				                
				}
				break;
			case EOF:
			case ENTIDADE:
			case ALTERA:
			case EXCLUI:
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
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(TABULACAO);
				setState(141);
				((DeclaracaoContext)_localctx).IDENT = match(IDENT);
				setState(142);
				((DeclaracaoContext)_localctx).TIPO = match(TIPO);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RESTRICAO) {
					{
					{
					setState(143);
					((DeclaracaoContext)_localctx).RESTRICAO = match(RESTRICAO);
					}
					}
					setState(148);
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
				setState(150);
				match(TABULACAO);
				setState(151);
				match(IDENT);
				setState(152);
				match(COMPOSTO);
				setState(153);
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
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				rel_binaria();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
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
			setState(162);
			((Rel_binariaContext)_localctx).rel_esq = rel_esq();
			setState(163);
			((Rel_binariaContext)_localctx).IDENT = match(IDENT);
			setState(164);
			((Rel_binariaContext)_localctx).rel_dir = rel_dir();
			setState(165);
			((Rel_binariaContext)_localctx).TIPO_MAPEAMENTO = match(TIPO_MAPEAMENTO);
			setState(167);
			_la = _input.LA(1);
			if (_la==TABULACAO) {
				{
				setState(166);
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
			setState(171);
			((Rel_nContext)_localctx).IDENT = match(IDENT);

			                    if(!(tabela.existeSimbolo((((Rel_nContext)_localctx).IDENT!=null?((Rel_nContext)_localctx).IDENT.getText():null))))
			                        MyErrorListener.erroSemantico2((((Rel_nContext)_localctx).IDENT!=null?((Rel_nContext)_localctx).IDENT.getText():null), ((Rel_nContext)_localctx).IDENT.getLine());
			                    
			setState(173);
			rel_esq();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(174);
				match(T__0);
				setState(175);
				rel_esq();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			_la = _input.LA(1);
			if (_la==TABULACAO) {
				{
				setState(181);
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
			setState(184);
			((Rel_esqContext)_localctx).IDENT = match(IDENT);

			                    ((Rel_esqContext)_localctx).nomeEnt =  (((Rel_esqContext)_localctx).IDENT!=null?((Rel_esqContext)_localctx).IDENT.getText():null);
			                    if(!(tabela.existeSimbolo((((Rel_esqContext)_localctx).IDENT!=null?((Rel_esqContext)_localctx).IDENT.getText():null))))
			                        MyErrorListener.erroSemantico2((((Rel_esqContext)_localctx).IDENT!=null?((Rel_esqContext)_localctx).IDENT.getText():null), ((Rel_esqContext)_localctx).IDENT.getLine());
			                
			setState(186);
			((Rel_esqContext)_localctx).CARDINALIDADE = match(CARDINALIDADE);
			((Rel_esqContext)_localctx).card =  (((Rel_esqContext)_localctx).CARDINALIDADE!=null?((Rel_esqContext)_localctx).CARDINALIDADE.getText():null);
			setState(188);
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
			setState(190);
			participacao();
			setState(191);
			((Rel_dirContext)_localctx).CARDINALIDADE = match(CARDINALIDADE);
			((Rel_dirContext)_localctx).card =  (((Rel_dirContext)_localctx).CARDINALIDADE!=null?((Rel_dirContext)_localctx).CARDINALIDADE.getText():null);
			setState(193);
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
			setState(199);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(T__4);
				}
				break;
			case EOF:
			case T__0:
			case ENTIDADE:
			case ALTERA:
			case EXCLUI:
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
			setState(201);
			match(ALTERA);
			setState(202);
			((AltContext)_localctx).IDENT = match(IDENT);
			if(!(tabela.existeSimbolo((((AltContext)_localctx).IDENT!=null?((AltContext)_localctx).IDENT.getText():null)))){MyErrorListener.erroSemantico2((((AltContext)_localctx).IDENT!=null?((AltContext)_localctx).IDENT.getText():null), ((AltContext)_localctx).IDENT.getLine());}
			geradorAltera("altera",(((AltContext)_localctx).IDENT!=null?((AltContext)_localctx).IDENT.getText():null),"");
			setState(211); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(205);
				match(TABULACAO);
				setState(209);
				switch (_input.LA(1)) {
				case ALTERA:
					{
					setState(206);
					alt_alt();
					}
					break;
				case ADD:
					{
					setState(207);
					alt_add();
					}
					break;
				case EXCLUI:
					{
					setState(208);
					alt_drop();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(213); 
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
			setState(215);
			match(ALTERA);
			setState(217);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(216);
				match(COLUMN);
				}
			}

			setState(219);
			((Alt_altContext)_localctx).IDENT = match(IDENT);
			setState(220);
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
			setState(223);
			match(ADD);
			setState(224);
			((Alt_addContext)_localctx).IDENT = match(IDENT);
			setState(225);
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
			setState(228);
			match(EXCLUI);
			setState(230);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(229);
				match(COLUMN);
				}
			}

			setState(232);
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
			setState(235);
			match(EXCLUI);
			setState(236);
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
			setState(240);
			match(EXIBE);
			setState(241);
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
		enterRule(_localctx, 46, RULE_insrt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			((InsrtContext)_localctx).IDENT = match(IDENT);
			if(!(tabela.existeSimbolo((((InsrtContext)_localctx).IDENT!=null?((InsrtContext)_localctx).IDENT.getText():null)))){MyErrorListener.erroSemantico2((((InsrtContext)_localctx).IDENT!=null?((InsrtContext)_localctx).IDENT.getText():null), ((InsrtContext)_localctx).IDENT.getLine());}
			setState(245);
			match(T__5);
			setState(246);
			((InsrtContext)_localctx).colunas = colunas();
			setState(247);
			match(T__6);
			setState(248);
			match(INSERE);
			setState(249);
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
		enterRule(_localctx, 48, RULE_colunas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			((ColunasContext)_localctx).IDENT = match(IDENT);
			((ColunasContext)_localctx).text =  new ArrayList<>();
			                                _localctx.text.add((((ColunasContext)_localctx).IDENT!=null?((ColunasContext)_localctx).IDENT.getText():null));
			setState(258);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(254);
				match(T__0);
				setState(255);
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
		enterRule(_localctx, 50, RULE_colunas2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			((Colunas2Context)_localctx).IDENT = match(IDENT);
			((Colunas2Context)_localctx).text =  new ArrayList<>();
			                                _localctx.text.add((((Colunas2Context)_localctx).IDENT!=null?((Colunas2Context)_localctx).IDENT.getText():null));
			setState(266);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(262);
				match(T__0);
				setState(263);
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
		enterRule(_localctx, 52, RULE_valores1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_la = _input.LA(1);
			if (_la==TABULACAO) {
				{
				setState(268);
				match(TABULACAO);
				}
			}

			setState(271);
			match(T__5);
			setState(272);
			((Valores1Context)_localctx).valores = valores();
			setState(273);
			match(T__6);
			((Valores1Context)_localctx).text =  new ArrayList<>();
			                                        _localctx.text.add((((Valores1Context)_localctx).valores!=null?_input.getText(((Valores1Context)_localctx).valores.start,((Valores1Context)_localctx).valores.stop):null));
			setState(279);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(275);
				match(T__0);
				setState(276);
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
		enterRule(_localctx, 54, RULE_valores2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_la = _input.LA(1);
			if (_la==TABULACAO) {
				{
				setState(281);
				match(TABULACAO);
				}
			}

			setState(284);
			match(T__5);
			setState(285);
			((Valores2Context)_localctx).valores = valores();
			setState(286);
			match(T__6);
			((Valores2Context)_localctx).text =  new ArrayList<>();
			                                        _localctx.text.add((((Valores2Context)_localctx).valores!=null?_input.getText(((Valores2Context)_localctx).valores.start,((Valores2Context)_localctx).valores.stop):null));
			setState(292);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(288);
				match(T__0);
				setState(289);
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
		enterRule(_localctx, 56, RULE_coluna);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			((ColunaContext)_localctx).IDENT = match(IDENT);
			((ColunaContext)_localctx).text =  (((ColunaContext)_localctx).IDENT!=null?((ColunaContext)_localctx).IDENT.getText():null);
			setState(300);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(296);
				match(T__7);
				setState(297);
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
		enterRule(_localctx, 58, RULE_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
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
		enterRule(_localctx, 60, RULE_from);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			((FromContext)_localctx).IDENT = match(IDENT);
			if(!(tabela.existeSimbolo((((FromContext)_localctx).IDENT!=null?((FromContext)_localctx).IDENT.getText():null)))){MyErrorListener.erroSemantico2((((FromContext)_localctx).IDENT!=null?((FromContext)_localctx).IDENT.getText():null), ((FromContext)_localctx).IDENT.getLine());}
			((FromContext)_localctx).text =  new ArrayList<>();
			                                _localctx.text.add((((FromContext)_localctx).IDENT!=null?((FromContext)_localctx).IDENT.getText():null));
			setState(312);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(308);
				match(T__0);
				setState(309);
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
		enterRule(_localctx, 62, RULE_from2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			((From2Context)_localctx).IDENT = match(IDENT);
			if(!(tabela.existeSimbolo((((From2Context)_localctx).IDENT!=null?((From2Context)_localctx).IDENT.getText():null)))){MyErrorListener.erroSemantico2((((From2Context)_localctx).IDENT!=null?((From2Context)_localctx).IDENT.getText():null), ((From2Context)_localctx).IDENT.getLine());}
			((From2Context)_localctx).text =  new ArrayList<>();
			                                _localctx.text.add((((From2Context)_localctx).IDENT!=null?((From2Context)_localctx).IDENT.getText():null));
			setState(321);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(317);
				match(T__0);
				setState(318);
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
		enterRule(_localctx, 64, RULE_view);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(VIEW);
			setState(324);
			((ViewContext)_localctx).IDENT = match(IDENT);
			if(!(tabela.existeSimbolo((((ViewContext)_localctx).IDENT!=null?((ViewContext)_localctx).IDENT.getText():null)))){
			                                            tabela.adicionarSimbolo((((ViewContext)_localctx).IDENT!=null?((ViewContext)_localctx).IDENT.getText():null), "VIEW");
			                                        }
			                                        else{
			                                            MyErrorListener.erroSemantico1((((ViewContext)_localctx).IDENT!=null?((ViewContext)_localctx).IDENT.getText():null), ((ViewContext)_localctx).IDENT.getLine());
			                 }
			setState(326);
			match(COMO);
			setState(327);
			match(SELECIONA);
			setState(330);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(328);
				match(DISTINCT);
				setDistinct();
				}
			}

			setState(337);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(332);
				((ViewContext)_localctx).colunas = colunas();
				geradorViewCabesalho((((ViewContext)_localctx).IDENT!=null?((ViewContext)_localctx).IDENT.getText():null), ((ViewContext)_localctx).colunas.text);
				}
				break;
			case TUDO:
				{
				setState(335);
				match(TUDO);
				geradorViewCabesalho((((ViewContext)_localctx).IDENT!=null?((ViewContext)_localctx).IDENT.getText():null), new ArrayList<>());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(340);
			_la = _input.LA(1);
			if (_la==TABULACAO) {
				{
				setState(339);
				match(TABULACAO);
				}
			}

			setState(342);
			match(DE);
			setState(343);
			((ViewContext)_localctx).from = from();
			geradorViewFrom(((ViewContext)_localctx).from.text);
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(346);
				_la = _input.LA(1);
				if (_la==TABULACAO) {
					{
					setState(345);
					match(TABULACAO);
					}
				}

				setState(348);
				match(ONDE);
				setState(349);
				((ViewContext)_localctx).expressao = expressao();
				geradorViewWhere(((ViewContext)_localctx).expressao.text);
				}
				break;
			}
			setState(361);
			_la = _input.LA(1);
			if (_la==GROUP || _la==TABULACAO) {
				{
				setState(355);
				_la = _input.LA(1);
				if (_la==TABULACAO) {
					{
					setState(354);
					match(TABULACAO);
					}
				}

				setState(357);
				match(GROUP);
				setState(358);
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
		enterRule(_localctx, 66, RULE_slct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(SELECIONA);
			setState(366);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(364);
				match(DISTINCT);
				setDistinct();
				}
			}

			setState(373);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(368);
				((SlctContext)_localctx).colunas = colunas();
				geradorSelectCabesalho(((SlctContext)_localctx).colunas.text);
				}
				break;
			case TUDO:
				{
				setState(371);
				match(TUDO);
				geradorSelectCabesalho(new ArrayList<>());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(376);
			_la = _input.LA(1);
			if (_la==TABULACAO) {
				{
				setState(375);
				match(TABULACAO);
				}
			}

			setState(378);
			match(DE);
			setState(379);
			((SlctContext)_localctx).from = from();
			geradorSelectFrom(((SlctContext)_localctx).from.text);
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(382);
				_la = _input.LA(1);
				if (_la==TABULACAO) {
					{
					setState(381);
					match(TABULACAO);
					}
				}

				setState(384);
				match(ONDE);
				setState(385);
				((SlctContext)_localctx).expressao = expressao();
				geradorSelectWhere(((SlctContext)_localctx).expressao.text);
				}
				break;
			}
			setState(397);
			_la = _input.LA(1);
			if (_la==GROUP || _la==TABULACAO) {
				{
				setState(391);
				_la = _input.LA(1);
				if (_la==TABULACAO) {
					{
					setState(390);
					match(TABULACAO);
					}
				}

				setState(393);
				match(GROUP);
				setState(394);
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
		enterRule(_localctx, 68, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			((ExpressaoContext)_localctx).coluna = coluna();
			setState(400);
			((ExpressaoContext)_localctx).OP = match(OP);
			setState(401);
			((ExpressaoContext)_localctx).algo = algo();
			((ExpressaoContext)_localctx).text =  new ArrayList<String>();
			                                _localctx.text.add(((ExpressaoContext)_localctx).coluna.text +" "+ (((ExpressaoContext)_localctx).OP!=null?((ExpressaoContext)_localctx).OP.getText():null) +" "+ ((ExpressaoContext)_localctx).algo.text);
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(403);
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
		enterRule(_localctx, 70, RULE_expressao1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			_la = _input.LA(1);
			if (_la==TABULACAO) {
				{
				setState(408);
				match(TABULACAO);
				}
			}

			setState(411);
			((Expressao1Context)_localctx).logico = logico();
			setState(412);
			((Expressao1Context)_localctx).coluna = coluna();
			setState(413);
			((Expressao1Context)_localctx).OP = match(OP);
			setState(414);
			((Expressao1Context)_localctx).algo = algo();
			((Expressao1Context)_localctx).text =  new ArrayList<String>();
			                                 _localctx.text.add(((Expressao1Context)_localctx).logico.text +" "+ ((Expressao1Context)_localctx).coluna.text +" "+ (((Expressao1Context)_localctx).OP!=null?((Expressao1Context)_localctx).OP.getText():null) + " " + ((Expressao1Context)_localctx).algo.text);
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(416);
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
		enterRule(_localctx, 72, RULE_expressao2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			_la = _input.LA(1);
			if (_la==TABULACAO) {
				{
				setState(421);
				match(TABULACAO);
				}
			}

			setState(424);
			((Expressao2Context)_localctx).logico = logico();
			setState(425);
			((Expressao2Context)_localctx).coluna = coluna();
			setState(426);
			((Expressao2Context)_localctx).OP = match(OP);
			setState(427);
			((Expressao2Context)_localctx).algo = algo();
			((Expressao2Context)_localctx).text =  new ArrayList<String>();
			                                 _localctx.text.add(((Expressao2Context)_localctx).logico.text +" "+ ((Expressao2Context)_localctx).coluna.text +" "+ (((Expressao2Context)_localctx).OP!=null?((Expressao2Context)_localctx).OP.getText():null) + " " + ((Expressao2Context)_localctx).algo.text);
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(429);
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
		enterRule(_localctx, 74, RULE_algo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(434);
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
				setState(437);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u01bd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3W\n\3\3\4\3\4\3\4\7\4\\\n\4\f\4\16\4_\13\4\3\5\3\5\3\5\3\5\5"+
		"\5e\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6o\n\6\f\6\16\6r\13\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u0083\n\b\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u008d\n\n\3\13\3\13\3\13\3\13\7\13"+
		"\u0093\n\13\f\13\16\13\u0096\13\13\3\13\3\13\3\13\3\13\3\13\5\13\u009d"+
		"\n\13\3\f\3\f\3\r\3\r\5\r\u00a3\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u00aa"+
		"\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u00b3\n\17\f\17\16\17\u00b6"+
		"\13\17\3\17\5\17\u00b9\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u00ca\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00d4\n\23\6\23\u00d6\n\23\r\23\16\23\u00d7"+
		"\3\24\3\24\5\24\u00dc\n\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\5\26\u00e9\n\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u0105\n\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u010d"+
		"\n\33\3\34\5\34\u0110\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u011a\n\34\3\35\5\35\u011d\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\5\35\u0127\n\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u012f\n\36\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \5 \u013b\n \3!\3!\3!\3!\3!\3!\3!\5!\u0144"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u014d\n\"\3\"\3\"\3\"\3\"\3\"\5\""+
		"\u0154\n\"\3\"\5\"\u0157\n\"\3\"\3\"\3\"\3\"\5\"\u015d\n\"\3\"\3\"\3\""+
		"\3\"\5\"\u0163\n\"\3\"\5\"\u0166\n\"\3\"\3\"\3\"\3\"\5\"\u016c\n\"\3#"+
		"\3#\3#\5#\u0171\n#\3#\3#\3#\3#\3#\5#\u0178\n#\3#\5#\u017b\n#\3#\3#\3#"+
		"\3#\5#\u0181\n#\3#\3#\3#\3#\5#\u0187\n#\3#\5#\u018a\n#\3#\3#\3#\3#\5#"+
		"\u0190\n#\3$\3$\3$\3$\3$\3$\3$\5$\u0199\n$\3%\5%\u019c\n%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\5%\u01a6\n%\3&\5&\u01a9\n&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01b3"+
		"\n&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01bb\n\'\3\'\2\2(\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\3\3\2,-\u01d2\2N"+
		"\3\2\2\2\4V\3\2\2\2\6X\3\2\2\2\bd\3\2\2\2\np\3\2\2\2\fu\3\2\2\2\16\u0082"+
		"\3\2\2\2\20\u0084\3\2\2\2\22\u008c\3\2\2\2\24\u009c\3\2\2\2\26\u009e\3"+
		"\2\2\2\30\u00a2\3\2\2\2\32\u00a4\3\2\2\2\34\u00ad\3\2\2\2\36\u00ba\3\2"+
		"\2\2 \u00c0\3\2\2\2\"\u00c9\3\2\2\2$\u00cb\3\2\2\2&\u00d9\3\2\2\2(\u00e1"+
		"\3\2\2\2*\u00e6\3\2\2\2,\u00ed\3\2\2\2.\u00f2\3\2\2\2\60\u00f5\3\2\2\2"+
		"\62\u00fe\3\2\2\2\64\u0106\3\2\2\2\66\u010f\3\2\2\28\u011c\3\2\2\2:\u0128"+
		"\3\2\2\2<\u0130\3\2\2\2>\u0133\3\2\2\2@\u013c\3\2\2\2B\u0145\3\2\2\2D"+
		"\u016d\3\2\2\2F\u0191\3\2\2\2H\u019b\3\2\2\2J\u01a8\3\2\2\2L\u01ba\3\2"+
		"\2\2NO\t\2\2\2O\3\3\2\2\2PW\7)\2\2QW\7*\2\2RW\7+\2\2SW\5\2\2\2TW\7.\2"+
		"\2UW\7\60\2\2VP\3\2\2\2VQ\3\2\2\2VR\3\2\2\2VS\3\2\2\2VT\3\2\2\2VU\3\2"+
		"\2\2W\5\3\2\2\2X]\5\4\3\2YZ\7\3\2\2Z\\\5\4\3\2[Y\3\2\2\2\\_\3\2\2\2]["+
		"\3\2\2\2]^\3\2\2\2^\7\3\2\2\2_]\3\2\2\2`a\7!\2\2ae\b\5\1\2bc\7\"\2\2c"+
		"e\b\5\1\2d`\3\2\2\2db\3\2\2\2e\t\3\2\2\2fo\5\f\7\2go\5\30\r\2ho\5$\23"+
		"\2io\5,\27\2jo\5.\30\2ko\5\60\31\2lo\5D#\2mo\5B\"\2nf\3\2\2\2ng\3\2\2"+
		"\2nh\3\2\2\2ni\3\2\2\2nj\3\2\2\2nk\3\2\2\2nl\3\2\2\2nm\3\2\2\2or\3\2\2"+
		"\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\b\6\1\2t\13\3\2\2\2uv\7\r"+
		"\2\2vw\7$\2\2wx\b\7\1\2xy\b\7\1\2yz\5\16\b\2z{\b\7\1\2{|\5\20\t\2|}\b"+
		"\7\1\2}\r\3\2\2\2~\177\7\4\2\2\177\u0083\7$\2\2\u0080\u0083\7\5\2\2\u0081"+
		"\u0083\3\2\2\2\u0082~\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2"+
		"\u0083\17\3\2\2\2\u0084\u0085\5\24\13\2\u0085\u0086\5\22\n\2\u0086\u0087"+
		"\b\t\1\2\u0087\21\3\2\2\2\u0088\u0089\5\20\t\2\u0089\u008a\b\n\1\2\u008a"+
		"\u008d\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u0088\3\2\2\2\u008c\u008b\3\2"+
		"\2\2\u008d\23\3\2\2\2\u008e\u008f\7%\2\2\u008f\u0090\7$\2\2\u0090\u0094"+
		"\7\35\2\2\u0091\u0093\7\37\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2"+
		"\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094"+
		"\3\2\2\2\u0097\u009d\b\13\1\2\u0098\u0099\7%\2\2\u0099\u009a\7$\2\2\u009a"+
		"\u009b\7\36\2\2\u009b\u009d\5\26\f\2\u009c\u008e\3\2\2\2\u009c\u0098\3"+
		"\2\2\2\u009d\25\3\2\2\2\u009e\u009f\3\2\2\2\u009f\27\3\2\2\2\u00a0\u00a3"+
		"\5\32\16\2\u00a1\u00a3\5\34\17\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2\2"+
		"\2\u00a3\31\3\2\2\2\u00a4\u00a5\5\36\20\2\u00a5\u00a6\7$\2\2\u00a6\u00a7"+
		"\5 \21\2\u00a7\u00a9\7 \2\2\u00a8\u00aa\5\20\t\2\u00a9\u00a8\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\b\16\1\2\u00ac\33\3\2\2"+
		"\2\u00ad\u00ae\7$\2\2\u00ae\u00af\b\17\1\2\u00af\u00b4\5\36\20\2\u00b0"+
		"\u00b1\7\3\2\2\u00b1\u00b3\5\36\20\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3"+
		"\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b7\u00b9\5\20\t\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3"+
		"\2\2\2\u00b9\35\3\2\2\2\u00ba\u00bb\7$\2\2\u00bb\u00bc\b\20\1\2\u00bc"+
		"\u00bd\7#\2\2\u00bd\u00be\b\20\1\2\u00be\u00bf\5\"\22\2\u00bf\37\3\2\2"+
		"\2\u00c0\u00c1\5\"\22\2\u00c1\u00c2\7#\2\2\u00c2\u00c3\b\21\1\2\u00c3"+
		"\u00c4\7$\2\2\u00c4\u00c5\b\21\1\2\u00c5!\3\2\2\2\u00c6\u00ca\7\6\2\2"+
		"\u00c7\u00ca\7\7\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c6\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca#\3\2\2\2\u00cb\u00cc\7\17\2\2\u00cc"+
		"\u00cd\7$\2\2\u00cd\u00ce\b\23\1\2\u00ce\u00d5\b\23\1\2\u00cf\u00d3\7"+
		"%\2\2\u00d0\u00d4\5&\24\2\u00d1\u00d4\5(\25\2\u00d2\u00d4\5*\26\2\u00d3"+
		"\u00d0\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d6\3\2"+
		"\2\2\u00d5\u00cf\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8%\3\2\2\2\u00d9\u00db\7\17\2\2\u00da\u00dc\7\23\2"+
		"\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de"+
		"\7$\2\2\u00de\u00df\7\35\2\2\u00df\u00e0\b\24\1\2\u00e0\'\3\2\2\2\u00e1"+
		"\u00e2\7\22\2\2\u00e2\u00e3\7$\2\2\u00e3\u00e4\7\35\2\2\u00e4\u00e5\b"+
		"\25\1\2\u00e5)\3\2\2\2\u00e6\u00e8\7\20\2\2\u00e7\u00e9\7\23\2\2\u00e8"+
		"\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\7$"+
		"\2\2\u00eb\u00ec\b\26\1\2\u00ec+\3\2\2\2\u00ed\u00ee\7\20\2\2\u00ee\u00ef"+
		"\7$\2\2\u00ef\u00f0\b\27\1\2\u00f0\u00f1\b\27\1\2\u00f1-\3\2\2\2\u00f2"+
		"\u00f3\7\30\2\2\u00f3\u00f4\7$\2\2\u00f4/\3\2\2\2\u00f5\u00f6\7$\2\2\u00f6"+
		"\u00f7\b\31\1\2\u00f7\u00f8\7\b\2\2\u00f8\u00f9\5\62\32\2\u00f9\u00fa"+
		"\7\t\2\2\u00fa\u00fb\7\21\2\2\u00fb\u00fc\5\66\34\2\u00fc\u00fd\b\31\1"+
		"\2\u00fd\61\3\2\2\2\u00fe\u00ff\7$\2\2\u00ff\u0104\b\32\1\2\u0100\u0101"+
		"\7\3\2\2\u0101\u0102\5\64\33\2\u0102\u0103\b\32\1\2\u0103\u0105\3\2\2"+
		"\2\u0104\u0100\3\2\2\2\u0104\u0105\3\2\2\2\u0105\63\3\2\2\2\u0106\u0107"+
		"\7$\2\2\u0107\u010c\b\33\1\2\u0108\u0109\7\3\2\2\u0109\u010a\5\62\32\2"+
		"\u010a\u010b\b\33\1\2\u010b\u010d\3\2\2\2\u010c\u0108\3\2\2\2\u010c\u010d"+
		"\3\2\2\2\u010d\65\3\2\2\2\u010e\u0110\7%\2\2\u010f\u010e\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\7\b\2\2\u0112\u0113\5\6"+
		"\4\2\u0113\u0114\7\t\2\2\u0114\u0119\b\34\1\2\u0115\u0116\7\3\2\2\u0116"+
		"\u0117\58\35\2\u0117\u0118\b\34\1\2\u0118\u011a\3\2\2\2\u0119\u0115\3"+
		"\2\2\2\u0119\u011a\3\2\2\2\u011a\67\3\2\2\2\u011b\u011d\7%\2\2\u011c\u011b"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\7\b\2\2\u011f"+
		"\u0120\5\6\4\2\u0120\u0121\7\t\2\2\u0121\u0126\b\35\1\2\u0122\u0123\7"+
		"\3\2\2\u0123\u0124\5\66\34\2\u0124\u0125\b\35\1\2\u0125\u0127\3\2\2\2"+
		"\u0126\u0122\3\2\2\2\u0126\u0127\3\2\2\2\u01279\3\2\2\2\u0128\u0129\7"+
		"$\2\2\u0129\u012e\b\36\1\2\u012a\u012b\7\n\2\2\u012b\u012c\5<\37\2\u012c"+
		"\u012d\b\36\1\2\u012d\u012f\3\2\2\2\u012e\u012a\3\2\2\2\u012e\u012f\3"+
		"\2\2\2\u012f;\3\2\2\2\u0130\u0131\7$\2\2\u0131\u0132\b\37\1\2\u0132=\3"+
		"\2\2\2\u0133\u0134\7$\2\2\u0134\u0135\b \1\2\u0135\u013a\b \1\2\u0136"+
		"\u0137\7\3\2\2\u0137\u0138\5@!\2\u0138\u0139\b \1\2\u0139\u013b\3\2\2"+
		"\2\u013a\u0136\3\2\2\2\u013a\u013b\3\2\2\2\u013b?\3\2\2\2\u013c\u013d"+
		"\7$\2\2\u013d\u013e\b!\1\2\u013e\u0143\b!\1\2\u013f\u0140\7\3\2\2\u0140"+
		"\u0141\5> \2\u0141\u0142\b!\1\2\u0142\u0144\3\2\2\2\u0143\u013f\3\2\2"+
		"\2\u0143\u0144\3\2\2\2\u0144A\3\2\2\2\u0145\u0146\7\31\2\2\u0146\u0147"+
		"\7$\2\2\u0147\u0148\b\"\1\2\u0148\u0149\7\34\2\2\u0149\u014c\7\25\2\2"+
		"\u014a\u014b\7\33\2\2\u014b\u014d\b\"\1\2\u014c\u014a\3\2\2\2\u014c\u014d"+
		"\3\2\2\2\u014d\u0153\3\2\2\2\u014e\u014f\5\62\32\2\u014f\u0150\b\"\1\2"+
		"\u0150\u0154\3\2\2\2\u0151\u0152\7\24\2\2\u0152\u0154\b\"\1\2\u0153\u014e"+
		"\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0157\7%\2\2\u0156"+
		"\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\7\26"+
		"\2\2\u0159\u015a\5> \2\u015a\u0162\b\"\1\2\u015b\u015d\7%\2\2\u015c\u015b"+
		"\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\7\27\2\2"+
		"\u015f\u0160\5F$\2\u0160\u0161\b\"\1\2\u0161\u0163\3\2\2\2\u0162\u015c"+
		"\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u016b\3\2\2\2\u0164\u0166\7%\2\2\u0165"+
		"\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\7\32"+
		"\2\2\u0168\u0169\5\62\32\2\u0169\u016a\b\"\1\2\u016a\u016c\3\2\2\2\u016b"+
		"\u0165\3\2\2\2\u016b\u016c\3\2\2\2\u016cC\3\2\2\2\u016d\u0170\7\25\2\2"+
		"\u016e\u016f\7\33\2\2\u016f\u0171\b#\1\2\u0170\u016e\3\2\2\2\u0170\u0171"+
		"\3\2\2\2\u0171\u0177\3\2\2\2\u0172\u0173\5\62\32\2\u0173\u0174\b#\1\2"+
		"\u0174\u0178\3\2\2\2\u0175\u0176\7\24\2\2\u0176\u0178\b#\1\2\u0177\u0172"+
		"\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u017b\7%\2\2\u017a"+
		"\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\7\26"+
		"\2\2\u017d\u017e\5> \2\u017e\u0186\b#\1\2\u017f\u0181\7%\2\2\u0180\u017f"+
		"\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\7\27\2\2"+
		"\u0183\u0184\5F$\2\u0184\u0185\b#\1\2\u0185\u0187\3\2\2\2\u0186\u0180"+
		"\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u018f\3\2\2\2\u0188\u018a\7%\2\2\u0189"+
		"\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\7\32"+
		"\2\2\u018c\u018d\5\62\32\2\u018d\u018e\b#\1\2\u018e\u0190\3\2\2\2\u018f"+
		"\u0189\3\2\2\2\u018f\u0190\3\2\2\2\u0190E\3\2\2\2\u0191\u0192\5:\36\2"+
		"\u0192\u0193\7\'\2\2\u0193\u0194\5L\'\2\u0194\u0198\b$\1\2\u0195\u0196"+
		"\5H%\2\u0196\u0197\b$\1\2\u0197\u0199\3\2\2\2\u0198\u0195\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199G\3\2\2\2\u019a\u019c\7%\2\2\u019b\u019a\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\5\b\5\2\u019e\u019f\5:"+
		"\36\2\u019f\u01a0\7\'\2\2\u01a0\u01a1\5L\'\2\u01a1\u01a5\b%\1\2\u01a2"+
		"\u01a3\5J&\2\u01a3\u01a4\b%\1\2\u01a4\u01a6\3\2\2\2\u01a5\u01a2\3\2\2"+
		"\2\u01a5\u01a6\3\2\2\2\u01a6I\3\2\2\2\u01a7\u01a9\7%\2\2\u01a8\u01a7\3"+
		"\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\5\b\5\2\u01ab"+
		"\u01ac\5:\36\2\u01ac\u01ad\7\'\2\2\u01ad\u01ae\5L\'\2\u01ae\u01b2\b&\1"+
		"\2\u01af\u01b0\5H%\2\u01b0\u01b1\b&\1\2\u01b1\u01b3\3\2\2\2\u01b2\u01af"+
		"\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3K\3\2\2\2\u01b4\u01b5\5:\36\2\u01b5"+
		"\u01b6\b\'\1\2\u01b6\u01bb\3\2\2\2\u01b7\u01b8\5\6\4\2\u01b8\u01b9\b\'"+
		"\1\2\u01b9\u01bb\3\2\2\2\u01ba\u01b4\3\2\2\2\u01ba\u01b7\3\2\2\2\u01bb"+
		"M\3\2\2\2\61V]dnp\u0082\u008c\u0094\u009c\u00a2\u00a9\u00b4\u00b8\u00c9"+
		"\u00d3\u00d7\u00db\u00e8\u0104\u010c\u010f\u0119\u011c\u0126\u012e\u013a"+
		"\u0143\u014c\u0153\u0156\u015c\u0162\u0165\u016b\u0170\u0177\u017a\u0180"+
		"\u0186\u0189\u018f\u0198\u019b\u01a5\u01a8\u01b2\u01ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}