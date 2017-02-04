// Generated from SeQueLa.g4 by ANTLR 4.5.3
package grammar;

    import t3.*;
      import static t3.TabelaDeSimbolos.*;
      import static t3.MyErrorListener.*;
      import static t3.GeradorDeCodigo.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SeQueLaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, COMENTARIO=9, 
		COMENTARIO_ERRADO=10, ENTIDADE=11, RELACIONAMENTO=12, ALTERA=13, EXCLUI=14, 
		INSERE=15, SELECIONA=16, DE=17, ONDE=18, EXIBE=19, TIPO=20, COMPOSTO=21, 
		RESTRICAO=22, TIPO_MAPEAMENTO=23, CARDINALIDADE=24, IDENT=25, TABULACAO=26, 
		WS=27, OP=28, LITERAL=29, INTEIRO=30, REAL=31, VERDADEIRO=32, FALSO=33, 
		DATA=34, SEP1=35, HORA=36, SEP2=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "COMENTARIO", 
		"COMENTARIO_ERRADO", "ENTIDADE", "RELACIONAMENTO", "ALTERA", "EXCLUI", 
		"INSERE", "SELECIONA", "DE", "ONDE", "EXIBE", "TIPO", "COMPOSTO", "RESTRICAO", 
		"TIPO_MAPEAMENTO", "CARDINALIDADE", "IDENT", "TABULACAO", "WS", "LETRA_MIN", 
		"LETRA_MAI", "DIGITO", "OP", "LITERAL", "INTEIRO", "REAL", "VERDADEIRO", 
		"FALSO", "DATA", "SEP1", "HORA", "SEP2"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'fraca'", "'forte'", "'parcial'", "'total'", "'('", "')'", 
		"'.'", null, null, null, null, null, null, null, null, null, null, null, 
		null, "'composto'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "COMENTARIO", "COMENTARIO_ERRADO", 
		"ENTIDADE", "RELACIONAMENTO", "ALTERA", "EXCLUI", "INSERE", "SELECIONA", 
		"DE", "ONDE", "EXIBE", "TIPO", "COMPOSTO", "RESTRICAO", "TIPO_MAPEAMENTO", 
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


	   private void stop(String msg)
	   {
	      throw new ParseCancellationException(msg);
	   }
	   


	public SeQueLaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SeQueLa.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 8:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			COMENTARIO_ERRADO_action((RuleContext)_localctx, actionIndex);
			break;
		case 26:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void COMENTARIO_ERRADO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			stop("Linha "+getLine()+": comentario nao fechado"); 
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\'\u032e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\7\nx\n\n"+
		"\f\n\16\n{\13\n\3\n\3\n\3\n\3\13\3\13\7\13\u0082\n\13\f\13\16\13\u0085"+
		"\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a1\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u00cd\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0108\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0143\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u017e\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u01d4\n\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u01dc\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u01ea\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u021c\n\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u0240\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u0285\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u029f\n\30\3\31\3\31\3\32\3\32\3\32\6\32\u02a6\n"+
		"\32\r\32\16\32\u02a7\3\32\3\32\3\32\3\32\7\32\u02ae\n\32\f\32\16\32\u02b1"+
		"\13\32\3\33\3\33\6\33\u02b5\n\33\r\33\16\33\u02b6\3\34\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \5 \u02c7\n \3!\3!\7!\u02cb\n"+
		"!\f!\16!\u02ce\13!\3!\3!\3\"\6\"\u02d3\n\"\r\"\16\"\u02d4\3#\6#\u02d8"+
		"\n#\r#\16#\u02d9\3#\3#\6#\u02de\n#\r#\16#\u02df\5#\u02e2\n#\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\5$\u0302\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5"+
		"%\u0313\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3)\3)\2\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\2;\2=\2?\36A\37C E!G\"I#K$M%O&Q\'\3\2\t\3\2\177\177"+
		"\5\2\62\63OPop\5\2\13\f\17\17\"\"\5\2\f\f\17\17$$\4\2..\60\60\5\2\"\""+
		"//\61\61\4\2//<<\u037e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5U\3\2\2\2\7"+
		"[\3\2\2\2\ta\3\2\2\2\13i\3\2\2\2\ro\3\2\2\2\17q\3\2\2\2\21s\3\2\2\2\23"+
		"u\3\2\2\2\25\177\3\2\2\2\27\u00a0\3\2\2\2\31\u00cc\3\2\2\2\33\u0107\3"+
		"\2\2\2\35\u0142\3\2\2\2\37\u017d\3\2\2\2!\u01d3\3\2\2\2#\u01db\3\2\2\2"+
		"%\u01e9\3\2\2\2\'\u021b\3\2\2\2)\u023f\3\2\2\2+\u0241\3\2\2\2-\u0284\3"+
		"\2\2\2/\u029e\3\2\2\2\61\u02a0\3\2\2\2\63\u02a5\3\2\2\2\65\u02b2\3\2\2"+
		"\2\67\u02b8\3\2\2\29\u02bb\3\2\2\2;\u02bd\3\2\2\2=\u02bf\3\2\2\2?\u02c6"+
		"\3\2\2\2A\u02c8\3\2\2\2C\u02d2\3\2\2\2E\u02d7\3\2\2\2G\u0301\3\2\2\2I"+
		"\u0312\3\2\2\2K\u0314\3\2\2\2M\u031f\3\2\2\2O\u0321\3\2\2\2Q\u032c\3\2"+
		"\2\2ST\7.\2\2T\4\3\2\2\2UV\7h\2\2VW\7t\2\2WX\7c\2\2XY\7e\2\2YZ\7c\2\2"+
		"Z\6\3\2\2\2[\\\7h\2\2\\]\7q\2\2]^\7t\2\2^_\7v\2\2_`\7g\2\2`\b\3\2\2\2"+
		"ab\7r\2\2bc\7c\2\2cd\7t\2\2de\7e\2\2ef\7k\2\2fg\7c\2\2gh\7n\2\2h\n\3\2"+
		"\2\2ij\7v\2\2jk\7q\2\2kl\7v\2\2lm\7c\2\2mn\7n\2\2n\f\3\2\2\2op\7*\2\2"+
		"p\16\3\2\2\2qr\7+\2\2r\20\3\2\2\2st\7\60\2\2t\22\3\2\2\2uy\7}\2\2vx\n"+
		"\2\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7"+
		"\177\2\2}~\b\n\2\2~\24\3\2\2\2\177\u0083\7}\2\2\u0080\u0082\n\2\2\2\u0081"+
		"\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\b\13\3\2\u0087"+
		"\26\3\2\2\2\u0088\u0089\7G\2\2\u0089\u008a\7p\2\2\u008a\u008b\7v\2\2\u008b"+
		"\u008c\7k\2\2\u008c\u008d\7f\2\2\u008d\u008e\7c\2\2\u008e\u008f\7f\2\2"+
		"\u008f\u00a1\7g\2\2\u0090\u0091\7g\2\2\u0091\u0092\7p\2\2\u0092\u0093"+
		"\7v\2\2\u0093\u0094\7k\2\2\u0094\u0095\7f\2\2\u0095\u0096\7c\2\2\u0096"+
		"\u0097\7f\2\2\u0097\u00a1\7g\2\2\u0098\u0099\7G\2\2\u0099\u009a\7P\2\2"+
		"\u009a\u009b\7V\2\2\u009b\u009c\7K\2\2\u009c\u009d\7F\2\2\u009d\u009e"+
		"\7C\2\2\u009e\u009f\7F\2\2\u009f\u00a1\7G\2\2\u00a0\u0088\3\2\2\2\u00a0"+
		"\u0090\3\2\2\2\u00a0\u0098\3\2\2\2\u00a1\30\3\2\2\2\u00a2\u00a3\7T\2\2"+
		"\u00a3\u00a4\7g\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7"+
		"\7e\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7p\2\2\u00aa"+
		"\u00ab\7c\2\2\u00ab\u00ac\7o\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7p\2\2"+
		"\u00ae\u00af\7v\2\2\u00af\u00cd\7q\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2"+
		"\7g\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7e\2\2\u00b5"+
		"\u00b6\7k\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7c\2\2"+
		"\u00b9\u00ba\7o\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd"+
		"\7v\2\2\u00bd\u00cd\7q\2\2\u00be\u00bf\7T\2\2\u00bf\u00c0\7G\2\2\u00c0"+
		"\u00c1\7N\2\2\u00c1\u00c2\7C\2\2\u00c2\u00c3\7E\2\2\u00c3\u00c4\7K\2\2"+
		"\u00c4\u00c5\7Q\2\2\u00c5\u00c6\7P\2\2\u00c6\u00c7\7C\2\2\u00c7\u00c8"+
		"\7O\2\2\u00c8\u00c9\7G\2\2\u00c9\u00ca\7P\2\2\u00ca\u00cb\7V\2\2\u00cb"+
		"\u00cd\7Q\2\2\u00cc\u00a2\3\2\2\2\u00cc\u00b0\3\2\2\2\u00cc\u00be\3\2"+
		"\2\2\u00cd\32\3\2\2\2\u00ce\u00cf\7C\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1"+
		"\7v\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7t\2\2\u00d3\u0108\7c\2\2\u00d4"+
		"\u00d5\7c\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7g\2\2"+
		"\u00d8\u00d9\7t\2\2\u00d9\u0108\7c\2\2\u00da\u00db\7C\2\2\u00db\u00dc"+
		"\7N\2\2\u00dc\u00dd\7V\2\2\u00dd\u00de\7G\2\2\u00de\u00df\7T\2\2\u00df"+
		"\u0108\7C\2\2\u00e0\u00e1\7C\2\2\u00e1\u00e2\7n\2\2\u00e2\u00e3\7v\2\2"+
		"\u00e3\u00e4\7g\2\2\u00e4\u00e5\7t\2\2\u00e5\u0108\7g\2\2\u00e6\u00e7"+
		"\7c\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7g\2\2\u00ea"+
		"\u00eb\7t\2\2\u00eb\u0108\7g\2\2\u00ec\u00ed\7C\2\2\u00ed\u00ee\7N\2\2"+
		"\u00ee\u00ef\7V\2\2\u00ef\u00f0\7G\2\2\u00f0\u00f1\7T\2\2\u00f1\u0108"+
		"\7G\2\2\u00f2\u00f3\7C\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7v\2\2\u00f5"+
		"\u00f6\7g\2\2\u00f6\u00f7\7t\2\2\u00f7\u00f8\7c\2\2\u00f8\u0108\7t\2\2"+
		"\u00f9\u00fa\7c\2\2\u00fa\u00fb\7n\2\2\u00fb\u00fc\7v\2\2\u00fc\u00fd"+
		"\7g\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7c\2\2\u00ff\u0108\7t\2\2\u0100"+
		"\u0101\7C\2\2\u0101\u0102\7N\2\2\u0102\u0103\7V\2\2\u0103\u0104\7G\2\2"+
		"\u0104\u0105\7T\2\2\u0105\u0106\7C\2\2\u0106\u0108\7T\2\2\u0107\u00ce"+
		"\3\2\2\2\u0107\u00d4\3\2\2\2\u0107\u00da\3\2\2\2\u0107\u00e0\3\2\2\2\u0107"+
		"\u00e6\3\2\2\2\u0107\u00ec\3\2\2\2\u0107\u00f2\3\2\2\2\u0107\u00f9\3\2"+
		"\2\2\u0107\u0100\3\2\2\2\u0108\34\3\2\2\2\u0109\u010a\7G\2\2\u010a\u010b"+
		"\7z\2\2\u010b\u010c\7e\2\2\u010c\u010d\7n\2\2\u010d\u010e\7w\2\2\u010e"+
		"\u0143\7k\2\2\u010f\u0110\7g\2\2\u0110\u0111\7z\2\2\u0111\u0112\7e\2\2"+
		"\u0112\u0113\7n\2\2\u0113\u0114\7w\2\2\u0114\u0143\7k\2\2\u0115\u0116"+
		"\7G\2\2\u0116\u0117\7Z\2\2\u0117\u0118\7E\2\2\u0118\u0119\7N\2\2\u0119"+
		"\u011a\7W\2\2\u011a\u0143\7K\2\2\u011b\u011c\7G\2\2\u011c\u011d\7z\2\2"+
		"\u011d\u011e\7e\2\2\u011e\u011f\7n\2\2\u011f\u0120\7w\2\2\u0120\u0143"+
		"\7c\2\2\u0121\u0122\7g\2\2\u0122\u0123\7z\2\2\u0123\u0124\7e\2\2\u0124"+
		"\u0125\7n\2\2\u0125\u0126\7w\2\2\u0126\u0143\7c\2\2\u0127\u0128\7G\2\2"+
		"\u0128\u0129\7Z\2\2\u0129\u012a\7E\2\2\u012a\u012b\7N\2\2\u012b\u012c"+
		"\7W\2\2\u012c\u0143\7C\2\2\u012d\u012e\7G\2\2\u012e\u012f\7z\2\2\u012f"+
		"\u0130\7e\2\2\u0130\u0131\7n\2\2\u0131\u0132\7w\2\2\u0132\u0133\7k\2\2"+
		"\u0133\u0143\7t\2\2\u0134\u0135\7g\2\2\u0135\u0136\7z\2\2\u0136\u0137"+
		"\7e\2\2\u0137\u0138\7n\2\2\u0138\u0139\7w\2\2\u0139\u013a\7k\2\2\u013a"+
		"\u0143\7t\2\2\u013b\u013c\7G\2\2\u013c\u013d\7Z\2\2\u013d\u013e\7E\2\2"+
		"\u013e\u013f\7N\2\2\u013f\u0140\7W\2\2\u0140\u0141\7K\2\2\u0141\u0143"+
		"\7T\2\2\u0142\u0109\3\2\2\2\u0142\u010f\3\2\2\2\u0142\u0115\3\2\2\2\u0142"+
		"\u011b\3\2\2\2\u0142\u0121\3\2\2\2\u0142\u0127\3\2\2\2\u0142\u012d\3\2"+
		"\2\2\u0142\u0134\3\2\2\2\u0142\u013b\3\2\2\2\u0143\36\3\2\2\2\u0144\u0145"+
		"\7K\2\2\u0145\u0146\7p\2\2\u0146\u0147\7u\2\2\u0147\u0148\7k\2\2\u0148"+
		"\u0149\7t\2\2\u0149\u017e\7g\2\2\u014a\u014b\7k\2\2\u014b\u014c\7p\2\2"+
		"\u014c\u014d\7u\2\2\u014d\u014e\7g\2\2\u014e\u014f\7t\2\2\u014f\u017e"+
		"\7g\2\2\u0150\u0151\7K\2\2\u0151\u0152\7P\2\2\u0152\u0153\7U\2\2\u0153"+
		"\u0154\7G\2\2\u0154\u0155\7T\2\2\u0155\u017e\7G\2\2\u0156\u0157\7K\2\2"+
		"\u0157\u0158\7p\2\2\u0158\u0159\7u\2\2\u0159\u015a\7k\2\2\u015a\u015b"+
		"\7t\2\2\u015b\u017e\7c\2\2\u015c\u015d\7k\2\2\u015d\u015e\7p\2\2\u015e"+
		"\u015f\7u\2\2\u015f\u0160\7k\2\2\u0160\u0161\7t\2\2\u0161\u017e\7c\2\2"+
		"\u0162\u0163\7K\2\2\u0163\u0164\7P\2\2\u0164\u0165\7U\2\2\u0165\u0166"+
		"\7K\2\2\u0166\u0167\7T\2\2\u0167\u017e\7C\2\2\u0168\u0169\7K\2\2\u0169"+
		"\u016a\7p\2\2\u016a\u016b\7u\2\2\u016b\u016c\7g\2\2\u016c\u016d\7t\2\2"+
		"\u016d\u016e\7k\2\2\u016e\u017e\7t\2\2\u016f\u0170\7k\2\2\u0170\u0171"+
		"\7p\2\2\u0171\u0172\7u\2\2\u0172\u0173\7g\2\2\u0173\u0174\7t\2\2\u0174"+
		"\u0175\7k\2\2\u0175\u017e\7t\2\2\u0176\u0177\7K\2\2\u0177\u0178\7P\2\2"+
		"\u0178\u0179\7U\2\2\u0179\u017a\7G\2\2\u017a\u017b\7T\2\2\u017b\u017c"+
		"\7K\2\2\u017c\u017e\7T\2\2\u017d\u0144\3\2\2\2\u017d\u014a\3\2\2\2\u017d"+
		"\u0150\3\2\2\2\u017d\u0156\3\2\2\2\u017d\u015c\3\2\2\2\u017d\u0162\3\2"+
		"\2\2\u017d\u0168\3\2\2\2\u017d\u016f\3\2\2\2\u017d\u0176\3\2\2\2\u017e"+
		" \3\2\2\2\u017f\u0180\7U\2\2\u0180\u0181\7g\2\2\u0181\u0182\7n\2\2\u0182"+
		"\u0183\7g\2\2\u0183\u0184\7e\2\2\u0184\u0185\7k\2\2\u0185\u0186\7q\2\2"+
		"\u0186\u0187\7p\2\2\u0187\u01d4\7c\2\2\u0188\u0189\7u\2\2\u0189\u018a"+
		"\7g\2\2\u018a\u018b\7n\2\2\u018b\u018c\7g\2\2\u018c\u018d\7e\2\2\u018d"+
		"\u018e\7k\2\2\u018e\u018f\7q\2\2\u018f\u0190\7p\2\2\u0190\u01d4\7c\2\2"+
		"\u0191\u0192\7U\2\2\u0192\u0193\7G\2\2\u0193\u0194\7N\2\2\u0194\u0195"+
		"\7G\2\2\u0195\u0196\7E\2\2\u0196\u0197\7K\2\2\u0197\u0198\7Q\2\2\u0198"+
		"\u0199\7P\2\2\u0199\u01d4\7C\2\2\u019a\u019b\7U\2\2\u019b\u019c\7g\2\2"+
		"\u019c\u019d\7n\2\2\u019d\u019e\7g\2\2\u019e\u019f\7e\2\2\u019f\u01a0"+
		"\7k\2\2\u01a0\u01a1\7q\2\2\u01a1\u01a2\7p\2\2\u01a2\u01d4\7g\2\2\u01a3"+
		"\u01a4\7u\2\2\u01a4\u01a5\7g\2\2\u01a5\u01a6\7n\2\2\u01a6\u01a7\7g\2\2"+
		"\u01a7\u01a8\7e\2\2\u01a8\u01a9\7k\2\2\u01a9\u01aa\7q\2\2\u01aa\u01ab"+
		"\7p\2\2\u01ab\u01d4\7g\2\2\u01ac\u01ad\7U\2\2\u01ad\u01ae\7G\2\2\u01ae"+
		"\u01af\7N\2\2\u01af\u01b0\7G\2\2\u01b0\u01b1\7E\2\2\u01b1\u01b2\7K\2\2"+
		"\u01b2\u01b3\7Q\2\2\u01b3\u01b4\7P\2\2\u01b4\u01d4\7G\2\2\u01b5\u01b6"+
		"\7U\2\2\u01b6\u01b7\7g\2\2\u01b7\u01b8\7n\2\2\u01b8\u01b9\7g\2\2\u01b9"+
		"\u01ba\7e\2\2\u01ba\u01bb\7k\2\2\u01bb\u01bc\7q\2\2\u01bc\u01bd\7p\2\2"+
		"\u01bd\u01be\7c\2\2\u01be\u01d4\7t\2\2\u01bf\u01c0\7u\2\2\u01c0\u01c1"+
		"\7g\2\2\u01c1\u01c2\7n\2\2\u01c2\u01c3\7g\2\2\u01c3\u01c4\7e\2\2\u01c4"+
		"\u01c5\7k\2\2\u01c5\u01c6\7q\2\2\u01c6\u01c7\7p\2\2\u01c7\u01c8\7c\2\2"+
		"\u01c8\u01d4\7t\2\2\u01c9\u01ca\7U\2\2\u01ca\u01cb\7G\2\2\u01cb\u01cc"+
		"\7N\2\2\u01cc\u01cd\7G\2\2\u01cd\u01ce\7E\2\2\u01ce\u01cf\7K\2\2\u01cf"+
		"\u01d0\7Q\2\2\u01d0\u01d1\7P\2\2\u01d1\u01d2\7C\2\2\u01d2\u01d4\7T\2\2"+
		"\u01d3\u017f\3\2\2\2\u01d3\u0188\3\2\2\2\u01d3\u0191\3\2\2\2\u01d3\u019a"+
		"\3\2\2\2\u01d3\u01a3\3\2\2\2\u01d3\u01ac\3\2\2\2\u01d3\u01b5\3\2\2\2\u01d3"+
		"\u01bf\3\2\2\2\u01d3\u01c9\3\2\2\2\u01d4\"\3\2\2\2\u01d5\u01d6\7F\2\2"+
		"\u01d6\u01dc\7g\2\2\u01d7\u01d8\7f\2\2\u01d8\u01dc\7g\2\2\u01d9\u01da"+
		"\7F\2\2\u01da\u01dc\7G\2\2\u01db\u01d5\3\2\2\2\u01db\u01d7\3\2\2\2\u01db"+
		"\u01d9\3\2\2\2\u01dc$\3\2\2\2\u01dd\u01de\7Q\2\2\u01de\u01df\7p\2\2\u01df"+
		"\u01e0\7f\2\2\u01e0\u01ea\7g\2\2\u01e1\u01e2\7q\2\2\u01e2\u01e3\7p\2\2"+
		"\u01e3\u01e4\7f\2\2\u01e4\u01ea\7g\2\2\u01e5\u01e6\7Q\2\2\u01e6\u01e7"+
		"\7P\2\2\u01e7\u01e8\7F\2\2\u01e8\u01ea\7G\2\2\u01e9\u01dd\3\2\2\2\u01e9"+
		"\u01e1\3\2\2\2\u01e9\u01e5\3\2\2\2\u01ea&\3\2\2\2\u01eb\u01ec\7G\2\2\u01ec"+
		"\u01ed\7z\2\2\u01ed\u01ee\7k\2\2\u01ee\u01ef\7d\2\2\u01ef\u021c\7g\2\2"+
		"\u01f0\u01f1\7g\2\2\u01f1\u01f2\7z\2\2\u01f2\u01f3\7k\2\2\u01f3\u01f4"+
		"\7d\2\2\u01f4\u021c\7g\2\2\u01f5\u01f6\7G\2\2\u01f6\u01f7\7Z\2\2\u01f7"+
		"\u01f8\7K\2\2\u01f8\u01f9\7D\2\2\u01f9\u021c\7G\2\2\u01fa\u01fb\7G\2\2"+
		"\u01fb\u01fc\7z\2\2\u01fc\u01fd\7k\2\2\u01fd\u01fe\7d\2\2\u01fe\u021c"+
		"\7c\2\2\u01ff\u0200\7g\2\2\u0200\u0201\7z\2\2\u0201\u0202\7k\2\2\u0202"+
		"\u0203\7d\2\2\u0203\u021c\7c\2\2\u0204\u0205\7G\2\2\u0205\u0206\7Z\2\2"+
		"\u0206\u0207\7K\2\2\u0207\u0208\7D\2\2\u0208\u021c\7C\2\2\u0209\u020a"+
		"\7G\2\2\u020a\u020b\7z\2\2\u020b\u020c\7k\2\2\u020c\u020d\7d\2\2\u020d"+
		"\u020e\7k\2\2\u020e\u021c\7t\2\2\u020f\u0210\7g\2\2\u0210\u0211\7z\2\2"+
		"\u0211\u0212\7k\2\2\u0212\u0213\7d\2\2\u0213\u0214\7k\2\2\u0214\u021c"+
		"\7t\2\2\u0215\u0216\7G\2\2\u0216\u0217\7Z\2\2\u0217\u0218\7K\2\2\u0218"+
		"\u0219\7D\2\2\u0219\u021a\7K\2\2\u021a\u021c\7T\2\2\u021b\u01eb\3\2\2"+
		"\2\u021b\u01f0\3\2\2\2\u021b\u01f5\3\2\2\2\u021b\u01fa\3\2\2\2\u021b\u01ff"+
		"\3\2\2\2\u021b\u0204\3\2\2\2\u021b\u0209\3\2\2\2\u021b\u020f\3\2\2\2\u021b"+
		"\u0215\3\2\2\2\u021c(\3\2\2\2\u021d\u021e\7k\2\2\u021e\u021f\7p\2\2\u021f"+
		"\u0220\7v\2\2\u0220\u0221\7g\2\2\u0221\u0222\7k\2\2\u0222\u0223\7t\2\2"+
		"\u0223\u0240\7q\2\2\u0224\u0225\7t\2\2\u0225\u0226\7g\2\2\u0226\u0227"+
		"\7c\2\2\u0227\u0240\7n\2\2\u0228\u0229\7f\2\2\u0229\u022a\7c\2\2\u022a"+
		"\u022b\7v\2\2\u022b\u0240\7c\2\2\u022c\u022d\7j\2\2\u022d\u022e\7q\2\2"+
		"\u022e\u022f\7t\2\2\u022f\u0240\7c\2\2\u0230\u0231\7d\2\2\u0231\u0232"+
		"\7q\2\2\u0232\u0233\7q\2\2\u0233\u0234\7n\2\2\u0234\u0235\7g\2\2\u0235"+
		"\u0236\7c\2\2\u0236\u0237\7p\2\2\u0237\u0240\7q\2\2\u0238\u0239\7n\2\2"+
		"\u0239\u023a\7k\2\2\u023a\u023b\7v\2\2\u023b\u023c\7g\2\2\u023c\u023d"+
		"\7t\2\2\u023d\u023e\7c\2\2\u023e\u0240\7n\2\2\u023f\u021d\3\2\2\2\u023f"+
		"\u0224\3\2\2\2\u023f\u0228\3\2\2\2\u023f\u022c\3\2\2\2\u023f\u0230\3\2"+
		"\2\2\u023f\u0238\3\2\2\2\u0240*\3\2\2\2\u0241\u0242\7e\2\2\u0242\u0243"+
		"\7q\2\2\u0243\u0244\7o\2\2\u0244\u0245\7r\2\2\u0245\u0246\7q\2\2\u0246"+
		"\u0247\7u\2\2\u0247\u0248\7v\2\2\u0248\u0249\7q\2\2\u0249,\3\2\2\2\u024a"+
		"\u024b\7e\2\2\u024b\u024c\7j\2\2\u024c\u024d\7c\2\2\u024d\u024e\7x\2\2"+
		"\u024e\u024f\7g\2\2\u024f\u0250\7\"\2\2\u0250\u0251\7r\2\2\u0251\u0252"+
		"\7t\2\2\u0252\u0253\7k\2\2\u0253\u0254\7o\2\2\u0254\u0255\7c\2\2\u0255"+
		"\u0256\7t\2\2\u0256\u0257\7k\2\2\u0257\u0285\7c\2\2\u0258\u0259\7e\2\2"+
		"\u0259\u025a\7j\2\2\u025a\u025b\7c\2\2\u025b\u025c\7x\2\2\u025c\u025d"+
		"\7g\2\2\u025d\u025e\7\"\2\2\u025e\u025f\7g\2\2\u025f\u0260\7u\2\2\u0260"+
		"\u0261\7v\2\2\u0261\u0262\7t\2\2\u0262\u0263\7c\2\2\u0263\u0264\7p\2\2"+
		"\u0264\u0265\7i\2\2\u0265\u0266\7g\2\2\u0266\u0267\7k\2\2\u0267\u0268"+
		"\7t\2\2\u0268\u0285\7c\2\2\u0269\u026a\7p\2\2\u026a\u026b\7c\2\2\u026b"+
		"\u026c\7q\2\2\u026c\u026d\7\"\2\2\u026d\u026e\7p\2\2\u026e\u026f\7w\2"+
		"\2\u026f\u0270\7n\2\2\u0270\u0285\7q\2\2\u0271\u0272\7r\2\2\u0272\u0273"+
		"\7c\2\2\u0273\u0274\7f\2\2\u0274\u0275\7t\2\2\u0275\u0276\7c\2\2\u0276"+
		"\u0285\7q\2\2\u0277\u0278\7x\2\2\u0278\u0279\7g\2\2\u0279\u027a\7t\2\2"+
		"\u027a\u027b\7k\2\2\u027b\u027c\7h\2\2\u027c\u027d\7k\2\2\u027d\u027e"+
		"\7e\2\2\u027e\u0285\7c\2\2\u027f\u0280\7w\2\2\u0280\u0281\7p\2\2\u0281"+
		"\u0282\7k\2\2\u0282\u0283\7e\2\2\u0283\u0285\7q\2\2\u0284\u024a\3\2\2"+
		"\2\u0284\u0258\3\2\2\2\u0284\u0269\3\2\2\2\u0284\u0271\3\2\2\2\u0284\u0277"+
		"\3\2\2\2\u0284\u027f\3\2\2\2\u0285.\3\2\2\2\u0286\u0287\7o\2\2\u0287\u0288"+
		"\7c\2\2\u0288\u0289\7r\2\2\u0289\u029f\7\63\2\2\u028a\u028b\7o\2\2\u028b"+
		"\u028c\7c\2\2\u028c\u028d\7r\2\2\u028d\u029f\7\64\2\2\u028e\u028f\7o\2"+
		"\2\u028f\u0290\7c\2\2\u0290\u0291\7r\2\2\u0291\u029f\7\65\2\2\u0292\u0293"+
		"\7o\2\2\u0293\u0294\7c\2\2\u0294\u0295\7r\2\2\u0295\u029f\7\66\2\2\u0296"+
		"\u0297\7o\2\2\u0297\u0298\7c\2\2\u0298\u0299\7r\2\2\u0299\u029f\7\67\2"+
		"\2\u029a\u029b\7o\2\2\u029b\u029c\7c\2\2\u029c\u029d\7r\2\2\u029d\u029f"+
		"\78\2\2\u029e\u0286\3\2\2\2\u029e\u028a\3\2\2\2\u029e\u028e\3\2\2\2\u029e"+
		"\u0292\3\2\2\2\u029e\u0296\3\2\2\2\u029e\u029a\3\2\2\2\u029f\60\3\2\2"+
		"\2\u02a0\u02a1\t\3\2\2\u02a1\62\3\2\2\2\u02a2\u02a6\59\35\2\u02a3\u02a6"+
		"\5;\36\2\u02a4\u02a6\7a\2\2\u02a5\u02a2\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5"+
		"\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2"+
		"\2\2\u02a8\u02af\3\2\2\2\u02a9\u02ae\59\35\2\u02aa\u02ae\5;\36\2\u02ab"+
		"\u02ae\7a\2\2\u02ac\u02ae\5=\37\2\u02ad\u02a9\3\2\2\2\u02ad\u02aa\3\2"+
		"\2\2\u02ad\u02ab\3\2\2\2\u02ad\u02ac\3\2\2\2\u02ae\u02b1\3\2\2\2\u02af"+
		"\u02ad\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\64\3\2\2\2\u02b1\u02af\3\2\2"+
		"\2\u02b2\u02b4\7\f\2\2\u02b3\u02b5\7\13\2\2\u02b4\u02b3\3\2\2\2\u02b5"+
		"\u02b6\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\66\3\2\2"+
		"\2\u02b8\u02b9\t\4\2\2\u02b9\u02ba\b\34\4\2\u02ba8\3\2\2\2\u02bb\u02bc"+
		"\4c|\2\u02bc:\3\2\2\2\u02bd\u02be\4C\\\2\u02be<\3\2\2\2\u02bf\u02c0\4"+
		"\62;\2\u02c0>\3\2\2\2\u02c1\u02c7\4>@\2\u02c2\u02c3\7@\2\2\u02c3\u02c7"+
		"\7?\2\2\u02c4\u02c5\7>\2\2\u02c5\u02c7\7?\2\2\u02c6\u02c1\3\2\2\2\u02c6"+
		"\u02c2\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7@\3\2\2\2\u02c8\u02cc\7$\2\2\u02c9"+
		"\u02cb\n\5\2\2\u02ca\u02c9\3\2\2\2\u02cb\u02ce\3\2\2\2\u02cc\u02ca\3\2"+
		"\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02cf\3\2\2\2\u02ce\u02cc\3\2\2\2\u02cf"+
		"\u02d0\7$\2\2\u02d0B\3\2\2\2\u02d1\u02d3\5=\37\2\u02d2\u02d1\3\2\2\2\u02d3"+
		"\u02d4\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5D\3\2\2\2"+
		"\u02d6\u02d8\5=\37\2\u02d7\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02d7"+
		"\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02e1\3\2\2\2\u02db\u02dd\t\6\2\2\u02dc"+
		"\u02de\5=\37\2\u02dd\u02dc\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02dd\3\2"+
		"\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e2\3\2\2\2\u02e1\u02db\3\2\2\2\u02e1"+
		"\u02e2\3\2\2\2\u02e2F\3\2\2\2\u02e3\u02e4\7x\2\2\u02e4\u02e5\7g\2\2\u02e5"+
		"\u02e6\7t\2\2\u02e6\u02e7\7f\2\2\u02e7\u02e8\7c\2\2\u02e8\u02e9\7f\2\2"+
		"\u02e9\u02ea\7g\2\2\u02ea\u02eb\7k\2\2\u02eb\u02ec\7t\2\2\u02ec\u0302"+
		"\7q\2\2\u02ed\u02ee\7X\2\2\u02ee\u02ef\7g\2\2\u02ef\u02f0\7t\2\2\u02f0"+
		"\u02f1\7f\2\2\u02f1\u02f2\7c\2\2\u02f2\u02f3\7f\2\2\u02f3\u02f4\7g\2\2"+
		"\u02f4\u02f5\7k\2\2\u02f5\u02f6\7t\2\2\u02f6\u0302\7q\2\2\u02f7\u02f8"+
		"\7X\2\2\u02f8\u02f9\7G\2\2\u02f9\u02fa\7T\2\2\u02fa\u02fb\7F\2\2\u02fb"+
		"\u02fc\7C\2\2\u02fc\u02fd\7F\2\2\u02fd\u02fe\7G\2\2\u02fe\u02ff\7K\2\2"+
		"\u02ff\u0300\7T\2\2\u0300\u0302\7Q\2\2\u0301\u02e3\3\2\2\2\u0301\u02ed"+
		"\3\2\2\2\u0301\u02f7\3\2\2\2\u0302H\3\2\2\2\u0303\u0304\7h\2\2\u0304\u0305"+
		"\7c\2\2\u0305\u0306\7n\2\2\u0306\u0307\7u\2\2\u0307\u0313\7q\2\2\u0308"+
		"\u0309\7H\2\2\u0309\u030a\7c\2\2\u030a\u030b\7n\2\2\u030b\u030c\7u\2\2"+
		"\u030c\u0313\7q\2\2\u030d\u030e\7H\2\2\u030e\u030f\7C\2\2\u030f\u0310"+
		"\7N\2\2\u0310\u0311\7U\2\2\u0311\u0313\7Q\2\2\u0312\u0303\3\2\2\2\u0312"+
		"\u0308\3\2\2\2\u0312\u030d\3\2\2\2\u0313J\3\2\2\2\u0314\u0315\5=\37\2"+
		"\u0315\u0316\5=\37\2\u0316\u0317\5M\'\2\u0317\u0318\5=\37\2\u0318\u0319"+
		"\5=\37\2\u0319\u031a\5M\'\2\u031a\u031b\5=\37\2\u031b\u031c\5=\37\2\u031c"+
		"\u031d\5=\37\2\u031d\u031e\5=\37\2\u031eL\3\2\2\2\u031f\u0320\t\7\2\2"+
		"\u0320N\3\2\2\2\u0321\u0322\5=\37\2\u0322\u0323\5=\37\2\u0323\u0324\5"+
		"Q)\2\u0324\u0325\5=\37\2\u0325\u0326\5=\37\2\u0326\u0327\5Q)\2\u0327\u0328"+
		"\5=\37\2\u0328\u0329\5=\37\2\u0329\u032a\5=\37\2\u032a\u032b\5=\37\2\u032b"+
		"P\3\2\2\2\u032c\u032d\t\b\2\2\u032dR\3\2\2\2\36\2y\u0083\u00a0\u00cc\u0107"+
		"\u0142\u017d\u01d3\u01db\u01e9\u021b\u023f\u0284\u029e\u02a5\u02a7\u02ad"+
		"\u02af\u02b6\u02c6\u02cc\u02d4\u02d9\u02df\u02e1\u0301\u0312\5\3\n\2\3"+
		"\13\3\3\34\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}