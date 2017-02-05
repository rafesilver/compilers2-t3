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
		TIPO=23, COMPOSTO=24, RESTRICAO=25, TIPO_MAPEAMENTO=26, LOGICO_E=27, LOGICO_OU=28, 
		CARDINALIDADE=29, IDENT=30, TABULACAO=31, WS=32, OP=33, ARITMETICO=34, 
		LITERAL=35, INTEIRO=36, REAL=37, VERDADEIRO=38, FALSO=39, DATA=40, SEP1=41, 
		HORA=42, SEP2=43;
	public static final int
		RULE_booleano = 0, RULE_valor = 1, RULE_valores = 2, RULE_logico = 3, 
		RULE_programa = 4, RULE_ent = 5, RULE_modificador_ent = 6, RULE_atributos = 7, 
		RULE_mais_declaracao = 8, RULE_declaracao = 9, RULE_dec_composto = 10, 
		RULE_rel = 11, RULE_rel_binaria = 12, RULE_rel_n = 13, RULE_rel_esq = 14, 
		RULE_rel_dir = 15, RULE_participacao = 16, RULE_alt = 17, RULE_alt_alt = 18, 
		RULE_alt_add = 19, RULE_alt_drop = 20, RULE_excl = 21, RULE_exibe = 22, 
		RULE_insrt = 23, RULE_colunas = 24, RULE_colunas2 = 25, RULE_valores1 = 26, 
		RULE_valores2 = 27, RULE_coluna = 28, RULE_atr = 29, RULE_from = 30, RULE_from2 = 31, 
		RULE_slct = 32, RULE_expressao = 33, RULE_expressao1 = 34, RULE_expressao2 = 35, 
		RULE_algo = 36;
	public static final String[] ruleNames = {
		"booleano", "valor", "valores", "logico", "programa", "ent", "modificador_ent", 
		"atributos", "mais_declaracao", "declaracao", "dec_composto", "rel", "rel_binaria", 
		"rel_n", "rel_esq", "rel_dir", "participacao", "alt", "alt_alt", "alt_add", 
		"alt_drop", "excl", "exibe", "insrt", "colunas", "colunas2", "valores1", 
		"valores2", "coluna", "atr", "from", "from2", "slct", "expressao", "expressao1", 
		"expressao2", "algo"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'fraca'", "'forte'", "'parcial'", "'total'", "'('", "')'", 
		"'.'", null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "'composto'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "COMENTARIO", "COMENTARIO_ERRADO", 
		"ENTIDADE", "RELACIONAMENTO", "ALTERA", "EXCLUI", "INSERE", "ADD", "COLUMN", 
		"TUDO", "SELECIONA", "DE", "ONDE", "EXIBE", "TIPO", "COMPOSTO", "RESTRICAO", 
		"TIPO_MAPEAMENTO", "LOGICO_E", "LOGICO_OU", "CARDINALIDADE", "IDENT", 
		"TABULACAO", "WS", "OP", "ARITMETICO", "LITERAL", "INTEIRO", "REAL", "VERDADEIRO", 
		"FALSO", "DATA", "SEP1", "HORA", "SEP2"
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
			setState(74);
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
			setState(82);
			switch (_input.LA(1)) {
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(LITERAL);
				}
				break;
			case INTEIRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(INTEIRO);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				match(REAL);
				}
				break;
			case VERDADEIRO:
			case FALSO:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				booleano();
				}
				break;
			case DATA:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				match(DATA);
				}
				break;
			case HORA:
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
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
			setState(84);
			valor();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(85);
				match(T__0);
				setState(86);
				valor();
				}
				}
				setState(91);
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
			setState(96);
			switch (_input.LA(1)) {
			case LOGICO_E:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(LOGICO_E);
				((LogicoContext)_localctx).text =  "AND";
				}
				break;
			case LOGICO_OU:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
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
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTIDADE) | (1L << ALTERA) | (1L << EXCLUI) | (1L << SELECIONA) | (1L << EXIBE) | (1L << IDENT))) != 0)) {
				{
				setState(105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(98);
					ent();
					}
					break;
				case 2:
					{
					setState(99);
					rel();
					}
					break;
				case 3:
					{
					setState(100);
					alt();
					}
					break;
				case 4:
					{
					setState(101);
					excl();
					}
					break;
				case 5:
					{
					setState(102);
					exibe();
					}
					break;
				case 6:
					{
					setState(103);
					insrt();
					}
					break;
				case 7:
					{
					setState(104);
					slct();
					}
					break;
				}
				}
				setState(109);
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
			setState(112);
			match(ENTIDADE);
			setState(113);
			((EntContext)_localctx).IDENT = match(IDENT);
			if(!(tabela.existeSimbolo((((EntContext)_localctx).IDENT!=null?((EntContext)_localctx).IDENT.getText():null)))){
			                                    tabela.adicionarSimbolo((((EntContext)_localctx).IDENT!=null?((EntContext)_localctx).IDENT.getText():null), "ENTIDADE");
			                                }
			                                else{
			                                    MyErrorListener.erroSemantico1((((EntContext)_localctx).IDENT!=null?((EntContext)_localctx).IDENT.getText():null), ((EntContext)_localctx).IDENT.getLine());
			                                }
			String aux=(((EntContext)_localctx).IDENT!=null?((EntContext)_localctx).IDENT.getText():null);
			                                 demarcador("nome-ent",aux);
			setState(116);
			modificador_ent();
			demarcador("abre-parent","");
			setState(118);
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
			setState(125);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(T__1);
				setState(122);
				match(IDENT);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
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
			setState(127);
			((AtributosContext)_localctx).declaracao = declaracao();
			setState(128);
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
			setState(135);
			switch (_input.LA(1)) {
			case TABULACAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
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
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(TABULACAO);
				setState(138);
				((DeclaracaoContext)_localctx).IDENT = match(IDENT);
				setState(139);
				((DeclaracaoContext)_localctx).TIPO = match(TIPO);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RESTRICAO) {
					{
					{
					setState(140);
					((DeclaracaoContext)_localctx).RESTRICAO = match(RESTRICAO);
					}
					}
					setState(145);
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
				setState(147);
				match(TABULACAO);
				setState(148);
				match(IDENT);
				setState(149);
				match(COMPOSTO);
				setState(150);
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
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				rel_binaria();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
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
			setState(159);
			((Rel_binariaContext)_localctx).rel_esq = rel_esq();
			setState(160);
			((Rel_binariaContext)_localctx).IDENT = match(IDENT);
			setState(161);
			((Rel_binariaContext)_localctx).rel_dir = rel_dir();
			setState(162);
			((Rel_binariaContext)_localctx).TIPO_MAPEAMENTO = match(TIPO_MAPEAMENTO);
			setState(164);
			_la = _input.LA(1);
			if (_la==TABULACAO) {
				{
				setState(163);
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
			setState(168);
			((Rel_nContext)_localctx).IDENT = match(IDENT);

			                    if(!(tabela.existeSimbolo((((Rel_nContext)_localctx).IDENT!=null?((Rel_nContext)_localctx).IDENT.getText():null))))
			                        MyErrorListener.erroSemantico2((((Rel_nContext)_localctx).IDENT!=null?((Rel_nContext)_localctx).IDENT.getText():null), ((Rel_nContext)_localctx).IDENT.getLine());
			                    
			setState(170);
			rel_esq();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(171);
				match(T__0);
				setState(172);
				rel_esq();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
			_la = _input.LA(1);
			if (_la==TABULACAO) {
				{
				setState(178);
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
			setState(181);
			((Rel_esqContext)_localctx).IDENT = match(IDENT);

			                    ((Rel_esqContext)_localctx).nomeEnt =  (((Rel_esqContext)_localctx).IDENT!=null?((Rel_esqContext)_localctx).IDENT.getText():null);
			                    if(!(tabela.existeSimbolo((((Rel_esqContext)_localctx).IDENT!=null?((Rel_esqContext)_localctx).IDENT.getText():null))))
			                        MyErrorListener.erroSemantico2((((Rel_esqContext)_localctx).IDENT!=null?((Rel_esqContext)_localctx).IDENT.getText():null), ((Rel_esqContext)_localctx).IDENT.getLine());
			                
			setState(183);
			((Rel_esqContext)_localctx).CARDINALIDADE = match(CARDINALIDADE);
			((Rel_esqContext)_localctx).card =  (((Rel_esqContext)_localctx).CARDINALIDADE!=null?((Rel_esqContext)_localctx).CARDINALIDADE.getText():null);
			setState(185);
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
			setState(187);
			participacao();
			setState(188);
			((Rel_dirContext)_localctx).CARDINALIDADE = match(CARDINALIDADE);
			((Rel_dirContext)_localctx).card =  (((Rel_dirContext)_localctx).CARDINALIDADE!=null?((Rel_dirContext)_localctx).CARDINALIDADE.getText():null);
			setState(190);
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
			setState(196);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
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
			setState(198);
			match(ALTERA);
			setState(199);
			match(IDENT);
			setState(206); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(200);
				match(TABULACAO);
				setState(204);
				switch (_input.LA(1)) {
				case ALTERA:
					{
					setState(201);
					alt_alt();
					}
					break;
				case ADD:
					{
					setState(202);
					alt_add();
					}
					break;
				case EXCLUI:
					{
					setState(203);
					alt_drop();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(208); 
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
			setState(210);
			match(ALTERA);
			setState(212);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(211);
				match(COLUMN);
				}
			}

			setState(214);
			match(IDENT);
			setState(215);
			match(TIPO);
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
			setState(217);
			match(ADD);
			setState(218);
			match(IDENT);
			setState(219);
			match(TIPO);
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
			setState(221);
			match(EXCLUI);
			setState(223);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(222);
				match(COLUMN);
				}
			}

			setState(225);
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

	public static class ExclContext extends ParserRuleContext {
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
			setState(227);
			match(EXCLUI);
			setState(228);
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
			setState(230);
			match(EXIBE);
			setState(231);
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
			setState(233);
			((InsrtContext)_localctx).IDENT = match(IDENT);
			if(!(tabela.existeSimbolo((((InsrtContext)_localctx).IDENT!=null?((InsrtContext)_localctx).IDENT.getText():null)))){MyErrorListener.erroSemantico2((((InsrtContext)_localctx).IDENT!=null?((InsrtContext)_localctx).IDENT.getText():null), ((InsrtContext)_localctx).IDENT.getLine());}
			setState(235);
			match(T__5);
			setState(236);
			((InsrtContext)_localctx).colunas = colunas();
			setState(237);
			match(T__6);
			setState(238);
			match(INSERE);
			setState(239);
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
			setState(242);
			((ColunasContext)_localctx).IDENT = match(IDENT);
			((ColunasContext)_localctx).text =  new ArrayList<>();
			                                _localctx.text.add((((ColunasContext)_localctx).IDENT!=null?((ColunasContext)_localctx).IDENT.getText():null));
			setState(248);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(244);
				match(T__0);
				setState(245);
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
			setState(250);
			((Colunas2Context)_localctx).IDENT = match(IDENT);
			((Colunas2Context)_localctx).text =  new ArrayList<>();
			                                _localctx.text.add((((Colunas2Context)_localctx).IDENT!=null?((Colunas2Context)_localctx).IDENT.getText():null));
			setState(256);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(252);
				match(T__0);
				setState(253);
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
			setState(259);
			_la = _input.LA(1);
			if (_la==TABULACAO) {
				{
				setState(258);
				match(TABULACAO);
				}
			}

			setState(261);
			match(T__5);
			setState(262);
			((Valores1Context)_localctx).valores = valores();
			setState(263);
			match(T__6);
			((Valores1Context)_localctx).text =  new ArrayList<>();
			                                        _localctx.text.add((((Valores1Context)_localctx).valores!=null?_input.getText(((Valores1Context)_localctx).valores.start,((Valores1Context)_localctx).valores.stop):null));
			setState(269);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(265);
				match(T__0);
				setState(266);
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
			setState(272);
			_la = _input.LA(1);
			if (_la==TABULACAO) {
				{
				setState(271);
				match(TABULACAO);
				}
			}

			setState(274);
			match(T__5);
			setState(275);
			((Valores2Context)_localctx).valores = valores();
			setState(276);
			match(T__6);
			((Valores2Context)_localctx).text =  new ArrayList<>();
			                                        _localctx.text.add((((Valores2Context)_localctx).valores!=null?_input.getText(((Valores2Context)_localctx).valores.start,((Valores2Context)_localctx).valores.stop):null));
			setState(282);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(278);
				match(T__0);
				setState(279);
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
			setState(284);
			((ColunaContext)_localctx).IDENT = match(IDENT);
			((ColunaContext)_localctx).text =  (((ColunaContext)_localctx).IDENT!=null?((ColunaContext)_localctx).IDENT.getText():null);
			setState(290);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(286);
				match(T__7);
				setState(287);
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
			setState(292);
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
			setState(295);
			((FromContext)_localctx).IDENT = match(IDENT);
			if(!(tabela.existeSimbolo((((FromContext)_localctx).IDENT!=null?((FromContext)_localctx).IDENT.getText():null)))){MyErrorListener.erroSemantico2((((FromContext)_localctx).IDENT!=null?((FromContext)_localctx).IDENT.getText():null), ((FromContext)_localctx).IDENT.getLine());}
			((FromContext)_localctx).text =  new ArrayList<>();
			                                _localctx.text.add((((FromContext)_localctx).IDENT!=null?((FromContext)_localctx).IDENT.getText():null));
			setState(302);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(298);
				match(T__0);
				setState(299);
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
			setState(304);
			((From2Context)_localctx).IDENT = match(IDENT);
			if(!(tabela.existeSimbolo((((From2Context)_localctx).IDENT!=null?((From2Context)_localctx).IDENT.getText():null)))){MyErrorListener.erroSemantico2((((From2Context)_localctx).IDENT!=null?((From2Context)_localctx).IDENT.getText():null), ((From2Context)_localctx).IDENT.getLine());}
			((From2Context)_localctx).text =  new ArrayList<>();
			                                _localctx.text.add((((From2Context)_localctx).IDENT!=null?((From2Context)_localctx).IDENT.getText():null));
			setState(311);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(307);
				match(T__0);
				setState(308);
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

	public static class SlctContext extends ParserRuleContext {
		public ColunasContext colunas;
		public FromContext from;
		public ExpressaoContext expressao;
		public TerminalNode SELECIONA() { return getToken(SeQueLaParser.SELECIONA, 0); }
		public TerminalNode DE() { return getToken(SeQueLaParser.DE, 0); }
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public ColunasContext colunas() {
			return getRuleContext(ColunasContext.class,0);
		}
		public TerminalNode TUDO() { return getToken(SeQueLaParser.TUDO, 0); }
		public TerminalNode ONDE() { return getToken(SeQueLaParser.ONDE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
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
		enterRule(_localctx, 64, RULE_slct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(SELECIONA);
			setState(319);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(314);
				((SlctContext)_localctx).colunas = colunas();
				geradorSelectCabesalho(((SlctContext)_localctx).colunas.text);
				}
				break;
			case TUDO:
				{
				setState(317);
				match(TUDO);
				geradorSelectCabesalho(new ArrayList<>());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(321);
			match(DE);
			setState(322);
			((SlctContext)_localctx).from = from();
			geradorSelectFrom(((SlctContext)_localctx).from.text);
			setState(328);
			_la = _input.LA(1);
			if (_la==ONDE) {
				{
				setState(324);
				match(ONDE);
				setState(325);
				((SlctContext)_localctx).expressao = expressao();
				geradorSelectWhere(((SlctContext)_localctx).expressao.text);
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
		enterRule(_localctx, 66, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			((ExpressaoContext)_localctx).coluna = coluna();
			setState(331);
			((ExpressaoContext)_localctx).OP = match(OP);
			setState(332);
			((ExpressaoContext)_localctx).algo = algo();
			((ExpressaoContext)_localctx).text =  new ArrayList<String>();
			                                _localctx.text.add(((ExpressaoContext)_localctx).coluna.text +" "+ (((ExpressaoContext)_localctx).OP!=null?((ExpressaoContext)_localctx).OP.getText():null) +" "+ ((ExpressaoContext)_localctx).algo.text);
			setState(337);
			_la = _input.LA(1);
			if (_la==LOGICO_E || _la==LOGICO_OU) {
				{
				setState(334);
				((ExpressaoContext)_localctx).expressao1 = expressao1();
				_localctx.text.addAll(((ExpressaoContext)_localctx).expressao1.text);
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

	public static class Expressao1Context extends ParserRuleContext {
		public ArrayList<String> text;
		public LogicoContext logico;
		public ColunaContext coluna;
		public Token OP;
		public AlgoContext algo;
		public Expressao2Context expressao2;
		public ColunaContext coluna() {
			return getRuleContext(ColunaContext.class,0);
		}
		public TerminalNode OP() { return getToken(SeQueLaParser.OP, 0); }
		public AlgoContext algo() {
			return getRuleContext(AlgoContext.class,0);
		}
		public LogicoContext logico() {
			return getRuleContext(LogicoContext.class,0);
		}
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
		enterRule(_localctx, 68, RULE_expressao1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(339);
			((Expressao1Context)_localctx).logico = logico();
			}
			setState(340);
			((Expressao1Context)_localctx).coluna = coluna();
			setState(341);
			((Expressao1Context)_localctx).OP = match(OP);
			setState(342);
			((Expressao1Context)_localctx).algo = algo();
			((Expressao1Context)_localctx).text =  new ArrayList<String>();
			                                 _localctx.text.add(((Expressao1Context)_localctx).logico.text +" "+ ((Expressao1Context)_localctx).coluna.text +" "+ (((Expressao1Context)_localctx).OP!=null?((Expressao1Context)_localctx).OP.getText():null) + " " + ((Expressao1Context)_localctx).algo.text);
			setState(347);
			_la = _input.LA(1);
			if (_la==LOGICO_E || _la==LOGICO_OU) {
				{
				setState(344);
				((Expressao1Context)_localctx).expressao2 = expressao2();
				_localctx.text.addAll(((Expressao1Context)_localctx).expressao2.text);
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

	public static class Expressao2Context extends ParserRuleContext {
		public ArrayList<String> text;
		public LogicoContext logico;
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
		public LogicoContext logico() {
			return getRuleContext(LogicoContext.class,0);
		}
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
		enterRule(_localctx, 70, RULE_expressao2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(349);
			((Expressao2Context)_localctx).logico = logico();
			}
			setState(350);
			((Expressao2Context)_localctx).coluna = coluna();
			setState(351);
			((Expressao2Context)_localctx).OP = match(OP);
			setState(352);
			((Expressao2Context)_localctx).algo = algo();
			((Expressao2Context)_localctx).text =  new ArrayList<String>();
			                                 _localctx.text.add(((Expressao2Context)_localctx).logico.text +" "+ ((Expressao2Context)_localctx).coluna.text +" "+ (((Expressao2Context)_localctx).OP!=null?((Expressao2Context)_localctx).OP.getText():null) + " " + ((Expressao2Context)_localctx).algo.text);
			setState(357);
			_la = _input.LA(1);
			if (_la==LOGICO_E || _la==LOGICO_OU) {
				{
				setState(354);
				((Expressao2Context)_localctx).expressao1 = expressao1();
				_localctx.text.addAll(((Expressao2Context)_localctx).expressao1.text);
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
		enterRule(_localctx, 72, RULE_algo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(359);
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
				setState(362);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-\u0172\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3U\n\3\3\4\3\4\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\5\3\5\3\5\3\5\5\5c\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6l\n\6\f\6\16\6o\13\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u0080\n\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\5\n\u008a\n\n\3\13\3\13\3\13\3\13\7\13\u0090\n\13\f\13"+
		"\16\13\u0093\13\13\3\13\3\13\3\13\3\13\3\13\5\13\u009a\n\13\3\f\3\f\3"+
		"\r\3\r\5\r\u00a0\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u00a7\n\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\7\17\u00b0\n\17\f\17\16\17\u00b3\13\17\3\17"+
		"\5\17\u00b6\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\5\22\u00c7\n\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u00cf\n\23\6\23\u00d1\n\23\r\23\16\23\u00d2\3\24\3\24\5\24\u00d7\n\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\5\26\u00e2\n\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00fb\n\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u0103\n\33\3\34\5\34\u0106\n\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\5\34\u0110\n\34\3\35\5\35\u0113\n\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u011d\n\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u0125\n\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \5 \u0131\n \3!\3"+
		"!\3!\3!\3!\3!\3!\5!\u013a\n!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0142\n\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u014b\n\"\3#\3#\3#\3#\3#\3#\3#\5#\u0154\n"+
		"#\3$\3$\3$\3$\3$\3$\3$\3$\5$\u015e\n$\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0168"+
		"\n%\3&\3&\3&\3&\3&\3&\5&\u0170\n&\3&\2\2\'\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\3\3\2()\u0179\2L\3\2\2\2"+
		"\4T\3\2\2\2\6V\3\2\2\2\bb\3\2\2\2\nm\3\2\2\2\fr\3\2\2\2\16\177\3\2\2\2"+
		"\20\u0081\3\2\2\2\22\u0089\3\2\2\2\24\u0099\3\2\2\2\26\u009b\3\2\2\2\30"+
		"\u009f\3\2\2\2\32\u00a1\3\2\2\2\34\u00aa\3\2\2\2\36\u00b7\3\2\2\2 \u00bd"+
		"\3\2\2\2\"\u00c6\3\2\2\2$\u00c8\3\2\2\2&\u00d4\3\2\2\2(\u00db\3\2\2\2"+
		"*\u00df\3\2\2\2,\u00e5\3\2\2\2.\u00e8\3\2\2\2\60\u00eb\3\2\2\2\62\u00f4"+
		"\3\2\2\2\64\u00fc\3\2\2\2\66\u0105\3\2\2\28\u0112\3\2\2\2:\u011e\3\2\2"+
		"\2<\u0126\3\2\2\2>\u0129\3\2\2\2@\u0132\3\2\2\2B\u013b\3\2\2\2D\u014c"+
		"\3\2\2\2F\u0155\3\2\2\2H\u015f\3\2\2\2J\u016f\3\2\2\2LM\t\2\2\2M\3\3\2"+
		"\2\2NU\7%\2\2OU\7&\2\2PU\7\'\2\2QU\5\2\2\2RU\7*\2\2SU\7,\2\2TN\3\2\2\2"+
		"TO\3\2\2\2TP\3\2\2\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2U\5\3\2\2\2V[\5\4\3"+
		"\2WX\7\3\2\2XZ\5\4\3\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\7\3"+
		"\2\2\2][\3\2\2\2^_\7\35\2\2_c\b\5\1\2`a\7\36\2\2ac\b\5\1\2b^\3\2\2\2b"+
		"`\3\2\2\2c\t\3\2\2\2dl\5\f\7\2el\5\30\r\2fl\5$\23\2gl\5,\27\2hl\5.\30"+
		"\2il\5\60\31\2jl\5B\"\2kd\3\2\2\2ke\3\2\2\2kf\3\2\2\2kg\3\2\2\2kh\3\2"+
		"\2\2ki\3\2\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2"+
		"\2\2pq\b\6\1\2q\13\3\2\2\2rs\7\r\2\2st\7 \2\2tu\b\7\1\2uv\b\7\1\2vw\5"+
		"\16\b\2wx\b\7\1\2xy\5\20\t\2yz\b\7\1\2z\r\3\2\2\2{|\7\4\2\2|\u0080\7 "+
		"\2\2}\u0080\7\5\2\2~\u0080\3\2\2\2\177{\3\2\2\2\177}\3\2\2\2\177~\3\2"+
		"\2\2\u0080\17\3\2\2\2\u0081\u0082\5\24\13\2\u0082\u0083\5\22\n\2\u0083"+
		"\u0084\b\t\1\2\u0084\21\3\2\2\2\u0085\u0086\5\20\t\2\u0086\u0087\b\n\1"+
		"\2\u0087\u008a\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0085\3\2\2\2\u0089\u0088"+
		"\3\2\2\2\u008a\23\3\2\2\2\u008b\u008c\7!\2\2\u008c\u008d\7 \2\2\u008d"+
		"\u0091\7\31\2\2\u008e\u0090\7\33\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3"+
		"\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\u009a\b\13\1\2\u0095\u0096\7!\2\2\u0096\u0097\7 "+
		"\2\2\u0097\u0098\7\32\2\2\u0098\u009a\5\26\f\2\u0099\u008b\3\2\2\2\u0099"+
		"\u0095\3\2\2\2\u009a\25\3\2\2\2\u009b\u009c\3\2\2\2\u009c\27\3\2\2\2\u009d"+
		"\u00a0\5\32\16\2\u009e\u00a0\5\34\17\2\u009f\u009d\3\2\2\2\u009f\u009e"+
		"\3\2\2\2\u00a0\31\3\2\2\2\u00a1\u00a2\5\36\20\2\u00a2\u00a3\7 \2\2\u00a3"+
		"\u00a4\5 \21\2\u00a4\u00a6\7\34\2\2\u00a5\u00a7\5\20\t\2\u00a6\u00a5\3"+
		"\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\b\16\1\2\u00a9"+
		"\33\3\2\2\2\u00aa\u00ab\7 \2\2\u00ab\u00ac\b\17\1\2\u00ac\u00b1\5\36\20"+
		"\2\u00ad\u00ae\7\3\2\2\u00ae\u00b0\5\36\20\2\u00af\u00ad\3\2\2\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b5\3\2"+
		"\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b6\5\20\t\2\u00b5\u00b4\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\35\3\2\2\2\u00b7\u00b8\7 \2\2\u00b8\u00b9\b\20\1"+
		"\2\u00b9\u00ba\7\37\2\2\u00ba\u00bb\b\20\1\2\u00bb\u00bc\5\"\22\2\u00bc"+
		"\37\3\2\2\2\u00bd\u00be\5\"\22\2\u00be\u00bf\7\37\2\2\u00bf\u00c0\b\21"+
		"\1\2\u00c0\u00c1\7 \2\2\u00c1\u00c2\b\21\1\2\u00c2!\3\2\2\2\u00c3\u00c7"+
		"\7\6\2\2\u00c4\u00c7\7\7\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7#\3\2\2\2\u00c8\u00c9\7\17\2\2"+
		"\u00c9\u00d0\7 \2\2\u00ca\u00ce\7!\2\2\u00cb\u00cf\5&\24\2\u00cc\u00cf"+
		"\5(\25\2\u00cd\u00cf\5*\26\2\u00ce\u00cb\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cd\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3%\3\2\2\2\u00d4\u00d6"+
		"\7\17\2\2\u00d5\u00d7\7\23\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2"+
		"\u00d7\u00d8\3\2\2\2\u00d8\u00d9\7 \2\2\u00d9\u00da\7\31\2\2\u00da\'\3"+
		"\2\2\2\u00db\u00dc\7\22\2\2\u00dc\u00dd\7 \2\2\u00dd\u00de\7\31\2\2\u00de"+
		")\3\2\2\2\u00df\u00e1\7\20\2\2\u00e0\u00e2\7\23\2\2\u00e1\u00e0\3\2\2"+
		"\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\7 \2\2\u00e4+\3"+
		"\2\2\2\u00e5\u00e6\7\20\2\2\u00e6\u00e7\7 \2\2\u00e7-\3\2\2\2\u00e8\u00e9"+
		"\7\30\2\2\u00e9\u00ea\7 \2\2\u00ea/\3\2\2\2\u00eb\u00ec\7 \2\2\u00ec\u00ed"+
		"\b\31\1\2\u00ed\u00ee\7\b\2\2\u00ee\u00ef\5\62\32\2\u00ef\u00f0\7\t\2"+
		"\2\u00f0\u00f1\7\21\2\2\u00f1\u00f2\5\66\34\2\u00f2\u00f3\b\31\1\2\u00f3"+
		"\61\3\2\2\2\u00f4\u00f5\7 \2\2\u00f5\u00fa\b\32\1\2\u00f6\u00f7\7\3\2"+
		"\2\u00f7\u00f8\5\64\33\2\u00f8\u00f9\b\32\1\2\u00f9\u00fb\3\2\2\2\u00fa"+
		"\u00f6\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\63\3\2\2\2\u00fc\u00fd\7 \2\2"+
		"\u00fd\u0102\b\33\1\2\u00fe\u00ff\7\3\2\2\u00ff\u0100\5\62\32\2\u0100"+
		"\u0101\b\33\1\2\u0101\u0103\3\2\2\2\u0102\u00fe\3\2\2\2\u0102\u0103\3"+
		"\2\2\2\u0103\65\3\2\2\2\u0104\u0106\7!\2\2\u0105\u0104\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\7\b\2\2\u0108\u0109\5\6\4\2\u0109"+
		"\u010a\7\t\2\2\u010a\u010f\b\34\1\2\u010b\u010c\7\3\2\2\u010c\u010d\5"+
		"8\35\2\u010d\u010e\b\34\1\2\u010e\u0110\3\2\2\2\u010f\u010b\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\67\3\2\2\2\u0111\u0113\7!\2\2\u0112\u0111\3\2\2\2"+
		"\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\7\b\2\2\u0115\u0116"+
		"\5\6\4\2\u0116\u0117\7\t\2\2\u0117\u011c\b\35\1\2\u0118\u0119\7\3\2\2"+
		"\u0119\u011a\5\66\34\2\u011a\u011b\b\35\1\2\u011b\u011d\3\2\2\2\u011c"+
		"\u0118\3\2\2\2\u011c\u011d\3\2\2\2\u011d9\3\2\2\2\u011e\u011f\7 \2\2\u011f"+
		"\u0124\b\36\1\2\u0120\u0121\7\n\2\2\u0121\u0122\5<\37\2\u0122\u0123\b"+
		"\36\1\2\u0123\u0125\3\2\2\2\u0124\u0120\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		";\3\2\2\2\u0126\u0127\7 \2\2\u0127\u0128\b\37\1\2\u0128=\3\2\2\2\u0129"+
		"\u012a\7 \2\2\u012a\u012b\b \1\2\u012b\u0130\b \1\2\u012c\u012d\7\3\2"+
		"\2\u012d\u012e\5@!\2\u012e\u012f\b \1\2\u012f\u0131\3\2\2\2\u0130\u012c"+
		"\3\2\2\2\u0130\u0131\3\2\2\2\u0131?\3\2\2\2\u0132\u0133\7 \2\2\u0133\u0134"+
		"\b!\1\2\u0134\u0139\b!\1\2\u0135\u0136\7\3\2\2\u0136\u0137\5> \2\u0137"+
		"\u0138\b!\1\2\u0138\u013a\3\2\2\2\u0139\u0135\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013aA\3\2\2\2\u013b\u0141\7\25\2\2\u013c\u013d\5\62\32\2\u013d\u013e"+
		"\b\"\1\2\u013e\u0142\3\2\2\2\u013f\u0140\7\24\2\2\u0140\u0142\b\"\1\2"+
		"\u0141\u013c\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144"+
		"\7\26\2\2\u0144\u0145\5> \2\u0145\u014a\b\"\1\2\u0146\u0147\7\27\2\2\u0147"+
		"\u0148\5D#\2\u0148\u0149\b\"\1\2\u0149\u014b\3\2\2\2\u014a\u0146\3\2\2"+
		"\2\u014a\u014b\3\2\2\2\u014bC\3\2\2\2\u014c\u014d\5:\36\2\u014d\u014e"+
		"\7#\2\2\u014e\u014f\5J&\2\u014f\u0153\b#\1\2\u0150\u0151\5F$\2\u0151\u0152"+
		"\b#\1\2\u0152\u0154\3\2\2\2\u0153\u0150\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"E\3\2\2\2\u0155\u0156\5\b\5\2\u0156\u0157\5:\36\2\u0157\u0158\7#\2\2\u0158"+
		"\u0159\5J&\2\u0159\u015d\b$\1\2\u015a\u015b\5H%\2\u015b\u015c\b$\1\2\u015c"+
		"\u015e\3\2\2\2\u015d\u015a\3\2\2\2\u015d\u015e\3\2\2\2\u015eG\3\2\2\2"+
		"\u015f\u0160\5\b\5\2\u0160\u0161\5:\36\2\u0161\u0162\7#\2\2\u0162\u0163"+
		"\5J&\2\u0163\u0167\b%\1\2\u0164\u0165\5F$\2\u0165\u0166\b%\1\2\u0166\u0168"+
		"\3\2\2\2\u0167\u0164\3\2\2\2\u0167\u0168\3\2\2\2\u0168I\3\2\2\2\u0169"+
		"\u016a\5:\36\2\u016a\u016b\b&\1\2\u016b\u0170\3\2\2\2\u016c\u016d\5\6"+
		"\4\2\u016d\u016e\b&\1\2\u016e\u0170\3\2\2\2\u016f\u0169\3\2\2\2\u016f"+
		"\u016c\3\2\2\2\u0170K\3\2\2\2#T[bkm\177\u0089\u0091\u0099\u009f\u00a6"+
		"\u00b1\u00b5\u00c6\u00ce\u00d2\u00d6\u00e1\u00fa\u0102\u0105\u010f\u0112"+
		"\u011c\u0124\u0130\u0139\u0141\u014a\u0153\u015d\u0167\u016f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}