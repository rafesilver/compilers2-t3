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
		INSERE=15, ADD=16, COLUMN=17, SELECIONA=18, DE=19, ONDE=20, EXIBE=21, 
		TIPO=22, COMPOSTO=23, RESTRICAO=24, TIPO_MAPEAMENTO=25, CARDINALIDADE=26, 
		IDENT=27, TABULACAO=28, WS=29, OP=30, LITERAL=31, INTEIRO=32, REAL=33, 
		VERDADEIRO=34, FALSO=35, DATA=36, SEP1=37, HORA=38, SEP2=39;
	public static final int
		RULE_booleano = 0, RULE_valor = 1, RULE_valores = 2, RULE_programa = 3, 
		RULE_ent = 4, RULE_modificador_ent = 5, RULE_atributos = 6, RULE_mais_declaracao = 7, 
		RULE_declaracao = 8, RULE_dec_composto = 9, RULE_rel = 10, RULE_rel_binaria = 11, 
		RULE_rel_n = 12, RULE_rel_esq = 13, RULE_rel_dir = 14, RULE_participacao = 15, 
		RULE_alt = 16, RULE_alt_alt = 17, RULE_alt_add = 18, RULE_alt_drop = 19, 
		RULE_excl = 20, RULE_exibe = 21, RULE_insrt = 22, RULE_colunas = 23, RULE_coluna = 24, 
		RULE_from = 25, RULE_slct = 26, RULE_expressao = 27;
	public static final String[] ruleNames = {
		"booleano", "valor", "valores", "programa", "ent", "modificador_ent", 
		"atributos", "mais_declaracao", "declaracao", "dec_composto", "rel", "rel_binaria", 
		"rel_n", "rel_esq", "rel_dir", "participacao", "alt", "alt_alt", "alt_add", 
		"alt_drop", "excl", "exibe", "insrt", "colunas", "coluna", "from", "slct", 
		"expressao"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'fraca'", "'forte'", "'parcial'", "'total'", "'('", "')'", 
		"'.'", null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "'composto'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "COMENTARIO", "COMENTARIO_ERRADO", 
		"ENTIDADE", "RELACIONAMENTO", "ALTERA", "EXCLUI", "INSERE", "ADD", "COLUMN", 
		"SELECIONA", "DE", "ONDE", "EXIBE", "TIPO", "COMPOSTO", "RESTRICAO", "TIPO_MAPEAMENTO", 
		"CARDINALIDADE", "IDENT", "TABULACAO", "WS", "OP", "LITERAL", "INTEIRO", 
		"REAL", "VERDADEIRO", "FALSO", "DATA", "SEP1", "HORA", "SEP2"
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
			setState(56);
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
			setState(64);
			switch (_input.LA(1)) {
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(LITERAL);
				}
				break;
			case INTEIRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(INTEIRO);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				match(REAL);
				}
				break;
			case VERDADEIRO:
			case FALSO:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				booleano();
				}
				break;
			case DATA:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				match(DATA);
				}
				break;
			case HORA:
				enterOuterAlt(_localctx, 6);
				{
				setState(63);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			valor();
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(67);
					match(T__0);
					setState(68);
					valor();
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
		enterRule(_localctx, 6, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTIDADE) | (1L << ALTERA) | (1L << EXCLUI) | (1L << SELECIONA) | (1L << EXIBE) | (1L << IDENT))) != 0)) {
				{
				setState(81);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(74);
					ent();
					}
					break;
				case 2:
					{
					setState(75);
					rel();
					}
					break;
				case 3:
					{
					setState(76);
					alt();
					}
					break;
				case 4:
					{
					setState(77);
					excl();
					}
					break;
				case 5:
					{
					setState(78);
					exibe();
					}
					break;
				case 6:
					{
					setState(79);
					insrt();
					}
					break;
				case 7:
					{
					setState(80);
					slct();
					}
					break;
				}
				}
				setState(85);
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
		enterRule(_localctx, 8, RULE_ent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(ENTIDADE);
			setState(89);
			((EntContext)_localctx).IDENT = match(IDENT);
			if(!(tabela.existeSimbolo((((EntContext)_localctx).IDENT!=null?((EntContext)_localctx).IDENT.getText():null)))){
			                                    tabela.adicionarSimbolo((((EntContext)_localctx).IDENT!=null?((EntContext)_localctx).IDENT.getText():null), "ENTIDADE");
			                                }
			                                else{
			                                    MyErrorListener.erroSemantico1((((EntContext)_localctx).IDENT!=null?((EntContext)_localctx).IDENT.getText():null), ((EntContext)_localctx).IDENT.getLine());
			                                }
			String aux=(((EntContext)_localctx).IDENT!=null?((EntContext)_localctx).IDENT.getText():null);
			                                 demarcador("nome-ent",aux);
			setState(92);
			modificador_ent();
			demarcador("abre-parent","");
			setState(94);
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
		enterRule(_localctx, 10, RULE_modificador_ent);
		try {
			setState(101);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(T__1);
				setState(98);
				match(IDENT);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
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
		enterRule(_localctx, 12, RULE_atributos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			((AtributosContext)_localctx).declaracao = declaracao();
			setState(104);
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
		enterRule(_localctx, 14, RULE_mais_declaracao);
		((Mais_declaracaoContext)_localctx).mais_dec =  new ArrayList<>();
		try {
			setState(111);
			switch (_input.LA(1)) {
			case TABULACAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
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
		enterRule(_localctx, 16, RULE_declaracao);
		int _la;
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(TABULACAO);
				setState(114);
				((DeclaracaoContext)_localctx).IDENT = match(IDENT);
				setState(115);
				((DeclaracaoContext)_localctx).TIPO = match(TIPO);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RESTRICAO) {
					{
					{
					setState(116);
					((DeclaracaoContext)_localctx).RESTRICAO = match(RESTRICAO);
					}
					}
					setState(121);
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
				setState(123);
				match(TABULACAO);
				setState(124);
				match(IDENT);
				setState(125);
				match(COMPOSTO);
				setState(126);
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
		enterRule(_localctx, 18, RULE_dec_composto);
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
		enterRule(_localctx, 20, RULE_rel);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				rel_binaria();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
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
		enterRule(_localctx, 22, RULE_rel_binaria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			((Rel_binariaContext)_localctx).rel_esq = rel_esq();
			setState(136);
			((Rel_binariaContext)_localctx).IDENT = match(IDENT);
			setState(137);
			((Rel_binariaContext)_localctx).rel_dir = rel_dir();
			setState(138);
			((Rel_binariaContext)_localctx).TIPO_MAPEAMENTO = match(TIPO_MAPEAMENTO);
			setState(140);
			_la = _input.LA(1);
			if (_la==TABULACAO) {
				{
				setState(139);
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
		enterRule(_localctx, 24, RULE_rel_n);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			((Rel_nContext)_localctx).IDENT = match(IDENT);

			                    if(!(tabela.existeSimbolo((((Rel_nContext)_localctx).IDENT!=null?((Rel_nContext)_localctx).IDENT.getText():null))))
			                        MyErrorListener.erroSemantico2((((Rel_nContext)_localctx).IDENT!=null?((Rel_nContext)_localctx).IDENT.getText():null), ((Rel_nContext)_localctx).IDENT.getLine());
			                    
			setState(146);
			rel_esq();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(147);
				match(T__0);
				setState(148);
				rel_esq();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			_la = _input.LA(1);
			if (_la==TABULACAO) {
				{
				setState(154);
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
		enterRule(_localctx, 26, RULE_rel_esq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			((Rel_esqContext)_localctx).IDENT = match(IDENT);

			                    ((Rel_esqContext)_localctx).nomeEnt =  (((Rel_esqContext)_localctx).IDENT!=null?((Rel_esqContext)_localctx).IDENT.getText():null);
			                    if(!(tabela.existeSimbolo((((Rel_esqContext)_localctx).IDENT!=null?((Rel_esqContext)_localctx).IDENT.getText():null))))
			                        MyErrorListener.erroSemantico2((((Rel_esqContext)_localctx).IDENT!=null?((Rel_esqContext)_localctx).IDENT.getText():null), ((Rel_esqContext)_localctx).IDENT.getLine());
			                
			setState(159);
			((Rel_esqContext)_localctx).CARDINALIDADE = match(CARDINALIDADE);
			((Rel_esqContext)_localctx).card =  (((Rel_esqContext)_localctx).CARDINALIDADE!=null?((Rel_esqContext)_localctx).CARDINALIDADE.getText():null);
			setState(161);
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
		enterRule(_localctx, 28, RULE_rel_dir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			participacao();
			setState(164);
			((Rel_dirContext)_localctx).CARDINALIDADE = match(CARDINALIDADE);
			((Rel_dirContext)_localctx).card =  (((Rel_dirContext)_localctx).CARDINALIDADE!=null?((Rel_dirContext)_localctx).CARDINALIDADE.getText():null);
			setState(166);
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
		enterRule(_localctx, 30, RULE_participacao);
		try {
			setState(172);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
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
		enterRule(_localctx, 32, RULE_alt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(ALTERA);
			setState(175);
			match(IDENT);
			setState(182); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(176);
				match(TABULACAO);
				setState(180);
				switch (_input.LA(1)) {
				case ALTERA:
					{
					setState(177);
					alt_alt();
					}
					break;
				case ADD:
					{
					setState(178);
					alt_add();
					}
					break;
				case EXCLUI:
					{
					setState(179);
					alt_drop();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(184); 
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
		enterRule(_localctx, 34, RULE_alt_alt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(ALTERA);
			setState(188);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(187);
				match(COLUMN);
				}
			}

			setState(190);
			match(IDENT);
			setState(191);
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
		enterRule(_localctx, 36, RULE_alt_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(ADD);
			setState(194);
			match(IDENT);
			setState(195);
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
		enterRule(_localctx, 38, RULE_alt_drop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(EXCLUI);
			setState(199);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(198);
				match(COLUMN);
				}
			}

			setState(201);
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
		enterRule(_localctx, 40, RULE_excl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(EXCLUI);
			setState(204);
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
		enterRule(_localctx, 42, RULE_exibe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(EXIBE);
			setState(207);
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
		public TerminalNode IDENT() { return getToken(SeQueLaParser.IDENT, 0); }
		public ColunasContext colunas() {
			return getRuleContext(ColunasContext.class,0);
		}
		public TerminalNode INSERE() { return getToken(SeQueLaParser.INSERE, 0); }
		public List<ValoresContext> valores() {
			return getRuleContexts(ValoresContext.class);
		}
		public ValoresContext valores(int i) {
			return getRuleContext(ValoresContext.class,i);
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
		enterRule(_localctx, 44, RULE_insrt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(IDENT);
			setState(210);
			match(T__5);
			setState(211);
			colunas();
			setState(212);
			match(T__6);
			setState(213);
			match(INSERE);
			setState(214);
			match(T__5);
			setState(215);
			valores();
			setState(216);
			match(T__6);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(217);
				match(T__0);
				setState(218);
				match(T__5);
				setState(219);
				valores();
				setState(220);
				match(T__6);
				}
				}
				setState(226);
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

	public static class ColunasContext extends ParserRuleContext {
		public List<ColunaContext> coluna() {
			return getRuleContexts(ColunaContext.class);
		}
		public ColunaContext coluna(int i) {
			return getRuleContext(ColunaContext.class,i);
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
		enterRule(_localctx, 46, RULE_colunas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			coluna();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(228);
				match(T__0);
				setState(229);
				coluna();
				}
				}
				setState(234);
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

	public static class ColunaContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(SeQueLaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(SeQueLaParser.IDENT, i);
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
		enterRule(_localctx, 48, RULE_coluna);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(IDENT);
			setState(238);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(236);
				match(T__7);
				setState(237);
				match(IDENT);
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

	public static class FromContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(SeQueLaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(SeQueLaParser.IDENT, i);
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
		enterRule(_localctx, 50, RULE_from);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(IDENT);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(241);
				match(T__0);
				setState(242);
				match(IDENT);
				}
				}
				setState(247);
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

	public static class SlctContext extends ParserRuleContext {
		public TerminalNode SELECIONA() { return getToken(SeQueLaParser.SELECIONA, 0); }
		public ColunasContext colunas() {
			return getRuleContext(ColunasContext.class,0);
		}
		public TerminalNode DE() { return getToken(SeQueLaParser.DE, 0); }
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
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
		enterRule(_localctx, 52, RULE_slct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(SELECIONA);
			setState(249);
			colunas();
			setState(250);
			match(DE);
			setState(251);
			from();
			setState(254);
			_la = _input.LA(1);
			if (_la==ONDE) {
				{
				setState(252);
				match(ONDE);
				setState(253);
				expressao();
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
		public List<ColunaContext> coluna() {
			return getRuleContexts(ColunaContext.class);
		}
		public ColunaContext coluna(int i) {
			return getRuleContext(ColunaContext.class,i);
		}
		public List<TerminalNode> OP() { return getTokens(SeQueLaParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(SeQueLaParser.OP, i);
		}
		public List<ValoresContext> valores() {
			return getRuleContexts(ValoresContext.class);
		}
		public ValoresContext valores(int i) {
			return getRuleContext(ValoresContext.class,i);
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
		enterRule(_localctx, 54, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			coluna();
			setState(257);
			match(OP);
			setState(260);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(258);
				coluna();
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
				setState(259);
				valores();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(262);
				match(T__0);
				setState(263);
				coluna();
				setState(264);
				match(OP);
				setState(267);
				switch (_input.LA(1)) {
				case IDENT:
					{
					setState(265);
					coluna();
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
					setState(266);
					valores();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(273);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u0115\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3C\n\3\3\4\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\7\5T\n\5\f\5\16\5W\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\5\7h\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\tr\n\t"+
		"\3\n\3\n\3\n\3\n\7\nx\n\n\f\n\16\n{\13\n\3\n\3\n\3\n\3\n\3\n\5\n\u0082"+
		"\n\n\3\13\3\13\3\f\3\f\5\f\u0088\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u008f\n\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\7\16\u0098\n\16\f\16\16\16\u009b\13"+
		"\16\3\16\5\16\u009e\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u00af\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00b7\n\22\6\22\u00b9\n\22\r\22\16\22\u00ba\3\23\3\23\5\23"+
		"\u00bf\n\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u00ca\n"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u00e1\n\30\f\30\16\30\u00e4"+
		"\13\30\3\31\3\31\3\31\7\31\u00e9\n\31\f\31\16\31\u00ec\13\31\3\32\3\32"+
		"\3\32\5\32\u00f1\n\32\3\33\3\33\3\33\7\33\u00f6\n\33\f\33\16\33\u00f9"+
		"\13\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0101\n\34\3\35\3\35\3\35\3"+
		"\35\5\35\u0107\n\35\3\35\3\35\3\35\3\35\3\35\5\35\u010e\n\35\7\35\u0110"+
		"\n\35\f\35\16\35\u0113\13\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668\2\3\3\2$%\u011d\2:\3\2\2\2\4B\3\2\2\2"+
		"\6D\3\2\2\2\bU\3\2\2\2\nZ\3\2\2\2\fg\3\2\2\2\16i\3\2\2\2\20q\3\2\2\2\22"+
		"\u0081\3\2\2\2\24\u0083\3\2\2\2\26\u0087\3\2\2\2\30\u0089\3\2\2\2\32\u0092"+
		"\3\2\2\2\34\u009f\3\2\2\2\36\u00a5\3\2\2\2 \u00ae\3\2\2\2\"\u00b0\3\2"+
		"\2\2$\u00bc\3\2\2\2&\u00c3\3\2\2\2(\u00c7\3\2\2\2*\u00cd\3\2\2\2,\u00d0"+
		"\3\2\2\2.\u00d3\3\2\2\2\60\u00e5\3\2\2\2\62\u00ed\3\2\2\2\64\u00f2\3\2"+
		"\2\2\66\u00fa\3\2\2\28\u0102\3\2\2\2:;\t\2\2\2;\3\3\2\2\2<C\7!\2\2=C\7"+
		"\"\2\2>C\7#\2\2?C\5\2\2\2@C\7&\2\2AC\7(\2\2B<\3\2\2\2B=\3\2\2\2B>\3\2"+
		"\2\2B?\3\2\2\2B@\3\2\2\2BA\3\2\2\2C\5\3\2\2\2DI\5\4\3\2EF\7\3\2\2FH\5"+
		"\4\3\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\7\3\2\2\2KI\3\2\2\2LT"+
		"\5\n\6\2MT\5\26\f\2NT\5\"\22\2OT\5*\26\2PT\5,\27\2QT\5.\30\2RT\5\66\34"+
		"\2SL\3\2\2\2SM\3\2\2\2SN\3\2\2\2SO\3\2\2\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2"+
		"\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\b\5\1\2Y\t\3\2"+
		"\2\2Z[\7\r\2\2[\\\7\35\2\2\\]\b\6\1\2]^\b\6\1\2^_\5\f\7\2_`\b\6\1\2`a"+
		"\5\16\b\2ab\b\6\1\2b\13\3\2\2\2cd\7\4\2\2dh\7\35\2\2eh\7\5\2\2fh\3\2\2"+
		"\2gc\3\2\2\2ge\3\2\2\2gf\3\2\2\2h\r\3\2\2\2ij\5\22\n\2jk\5\20\t\2kl\b"+
		"\b\1\2l\17\3\2\2\2mn\5\16\b\2no\b\t\1\2or\3\2\2\2pr\3\2\2\2qm\3\2\2\2"+
		"qp\3\2\2\2r\21\3\2\2\2st\7\36\2\2tu\7\35\2\2uy\7\30\2\2vx\7\32\2\2wv\3"+
		"\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|\u0082\b\n\1"+
		"\2}~\7\36\2\2~\177\7\35\2\2\177\u0080\7\31\2\2\u0080\u0082\5\24\13\2\u0081"+
		"s\3\2\2\2\u0081}\3\2\2\2\u0082\23\3\2\2\2\u0083\u0084\3\2\2\2\u0084\25"+
		"\3\2\2\2\u0085\u0088\5\30\r\2\u0086\u0088\5\32\16\2\u0087\u0085\3\2\2"+
		"\2\u0087\u0086\3\2\2\2\u0088\27\3\2\2\2\u0089\u008a\5\34\17\2\u008a\u008b"+
		"\7\35\2\2\u008b\u008c\5\36\20\2\u008c\u008e\7\33\2\2\u008d\u008f\5\16"+
		"\b\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\b\r\1\2\u0091\31\3\2\2\2\u0092\u0093\7\35\2\2\u0093\u0094\b\16"+
		"\1\2\u0094\u0099\5\34\17\2\u0095\u0096\7\3\2\2\u0096\u0098\5\34\17\2\u0097"+
		"\u0095\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009e\5\16\b\2\u009d"+
		"\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\33\3\2\2\2\u009f\u00a0\7\35\2"+
		"\2\u00a0\u00a1\b\17\1\2\u00a1\u00a2\7\34\2\2\u00a2\u00a3\b\17\1\2\u00a3"+
		"\u00a4\5 \21\2\u00a4\35\3\2\2\2\u00a5\u00a6\5 \21\2\u00a6\u00a7\7\34\2"+
		"\2\u00a7\u00a8\b\20\1\2\u00a8\u00a9\7\35\2\2\u00a9\u00aa\b\20\1\2\u00aa"+
		"\37\3\2\2\2\u00ab\u00af\7\6\2\2\u00ac\u00af\7\7\2\2\u00ad\u00af\3\2\2"+
		"\2\u00ae\u00ab\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af!"+
		"\3\2\2\2\u00b0\u00b1\7\17\2\2\u00b1\u00b8\7\35\2\2\u00b2\u00b6\7\36\2"+
		"\2\u00b3\u00b7\5$\23\2\u00b4\u00b7\5&\24\2\u00b5\u00b7\5(\25\2\u00b6\u00b3"+
		"\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"\u00b2\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb#\3\2\2\2\u00bc\u00be\7\17\2\2\u00bd\u00bf\7\23\2\2\u00be\u00bd"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7\35\2\2"+
		"\u00c1\u00c2\7\30\2\2\u00c2%\3\2\2\2\u00c3\u00c4\7\22\2\2\u00c4\u00c5"+
		"\7\35\2\2\u00c5\u00c6\7\30\2\2\u00c6\'\3\2\2\2\u00c7\u00c9\7\20\2\2\u00c8"+
		"\u00ca\7\23\2\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3"+
		"\2\2\2\u00cb\u00cc\7\35\2\2\u00cc)\3\2\2\2\u00cd\u00ce\7\20\2\2\u00ce"+
		"\u00cf\7\35\2\2\u00cf+\3\2\2\2\u00d0\u00d1\7\27\2\2\u00d1\u00d2\7\35\2"+
		"\2\u00d2-\3\2\2\2\u00d3\u00d4\7\35\2\2\u00d4\u00d5\7\b\2\2\u00d5\u00d6"+
		"\5\60\31\2\u00d6\u00d7\7\t\2\2\u00d7\u00d8\7\21\2\2\u00d8\u00d9\7\b\2"+
		"\2\u00d9\u00da\5\6\4\2\u00da\u00e2\7\t\2\2\u00db\u00dc\7\3\2\2\u00dc\u00dd"+
		"\7\b\2\2\u00dd\u00de\5\6\4\2\u00de\u00df\7\t\2\2\u00df\u00e1\3\2\2\2\u00e0"+
		"\u00db\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3/\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00ea\5\62\32\2\u00e6\u00e7"+
		"\7\3\2\2\u00e7\u00e9\5\62\32\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec\3\2\2\2"+
		"\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\61\3\2\2\2\u00ec\u00ea"+
		"\3\2\2\2\u00ed\u00f0\7\35\2\2\u00ee\u00ef\7\n\2\2\u00ef\u00f1\7\35\2\2"+
		"\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\63\3\2\2\2\u00f2\u00f7"+
		"\7\35\2\2\u00f3\u00f4\7\3\2\2\u00f4\u00f6\7\35\2\2\u00f5\u00f3\3\2\2\2"+
		"\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\65"+
		"\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7\24\2\2\u00fb\u00fc\5\60\31"+
		"\2\u00fc\u00fd\7\25\2\2\u00fd\u0100\5\64\33\2\u00fe\u00ff\7\26\2\2\u00ff"+
		"\u0101\58\35\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\67\3\2\2"+
		"\2\u0102\u0103\5\62\32\2\u0103\u0106\7 \2\2\u0104\u0107\5\62\32\2\u0105"+
		"\u0107\5\6\4\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107\u0111\3\2"+
		"\2\2\u0108\u0109\7\3\2\2\u0109\u010a\5\62\32\2\u010a\u010d\7 \2\2\u010b"+
		"\u010e\5\62\32\2\u010c\u010e\5\6\4\2\u010d\u010b\3\2\2\2\u010d\u010c\3"+
		"\2\2\2\u010e\u0110\3\2\2\2\u010f\u0108\3\2\2\2\u0110\u0113\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u01129\3\2\2\2\u0113\u0111\3\2\2\2"+
		"\33BISUgqy\u0081\u0087\u008e\u0099\u009d\u00ae\u00b6\u00ba\u00be\u00c9"+
		"\u00e2\u00ea\u00f0\u00f7\u0100\u0106\u010d\u0111";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}