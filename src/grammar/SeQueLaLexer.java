// Generated from C:\Comp2\comp2T3\src\trabalho3\SeQueLa.g4 by ANTLR 4.2.2

    package grammar;
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
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, COMENTARIO=6, COMENTARIO_ERRADO=7, 
		ENTIDADE=8, RELACIONAMENTO=9, ALTERA=10, EXCLUI=11, EXIBE=12, TIPO=13, 
		COMPOSTO=14, RESTRICAO=15, TIPO_MAPEAMENTO=16, CARDINALIDADE=17, NOME_ENTIDADE=18, 
		IDENT=19, TABULACAO=20, WS=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'fraca'", "'total'", "'forte'", "'parcial'", "','", "COMENTARIO", "COMENTARIO_ERRADO", 
		"ENTIDADE", "RELACIONAMENTO", "'Altera'", "'Exclui'", "'Exibe'", "TIPO", 
		"'composto'", "RESTRICAO", "TIPO_MAPEAMENTO", "CARDINALIDADE", "NOME_ENTIDADE", 
		"IDENT", "TABULACAO", "WS"
	};
	public static final String[] ruleNames = {
		"T__4", "T__3", "T__2", "T__1", "T__0", "COMENTARIO", "COMENTARIO_ERRADO", 
		"ENTIDADE", "RELACIONAMENTO", "ALTERA", "EXCLUI", "EXIBE", "TIPO", "COMPOSTO", 
		"RESTRICAO", "TIPO_MAPEAMENTO", "CARDINALIDADE", "NOME_ENTIDADE", "IDENT", 
		"TABULACAO", "WS", "LETRA_MIN", "LETRA_MAI", "DIGITO"
	};


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
	public String[] getTokenNames() { return tokenNames; }

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
		case 5: COMENTARIO_action((RuleContext)_localctx, actionIndex); break;

		case 6: COMENTARIO_ERRADO_action((RuleContext)_localctx, actionIndex); break;

		case 20: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void COMENTARIO_ERRADO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: stop("Linha "+getLine()+": comentario nao fechado");  break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27\u0156\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\7\7R\n\7\f\7"+
		"\16\7U\13\7\3\7\3\7\3\7\3\b\3\b\7\b\\\n\b\f\b\16\b_\13\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tt\n"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0092\n\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ca\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u010f\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0129\n\21\3\22\3\22\3\23\6\23\u012e"+
		"\n\23\r\23\16\23\u012f\3\23\3\23\3\23\7\23\u0135\n\23\f\23\16\23\u0138"+
		"\13\23\3\24\3\24\6\24\u013c\n\24\r\24\16\24\u013d\3\24\3\24\3\24\7\24"+
		"\u0143\n\24\f\24\16\24\u0146\13\24\3\25\3\25\6\25\u014a\n\25\r\25\16\25"+
		"\u014b\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\2\2\32\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\2/\2\61\2\3\2\7\3\2\177\177\5\2\f\f\17\17\177\177\4"+
		"\2\f\f\17\17\5\2\62\63OPop\5\2\13\f\17\17\"\"\u016f\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3\63\3\2\2\2\59\3\2\2\2\7?\3\2\2\2\tE\3"+
		"\2\2\2\13M\3\2\2\2\rO\3\2\2\2\17Y\3\2\2\2\21s\3\2\2\2\23\u0091\3\2\2\2"+
		"\25\u0093\3\2\2\2\27\u009a\3\2\2\2\31\u00a1\3\2\2\2\33\u00c9\3\2\2\2\35"+
		"\u00cb\3\2\2\2\37\u010e\3\2\2\2!\u0128\3\2\2\2#\u012a\3\2\2\2%\u012d\3"+
		"\2\2\2\'\u013b\3\2\2\2)\u0147\3\2\2\2+\u014d\3\2\2\2-\u0150\3\2\2\2/\u0152"+
		"\3\2\2\2\61\u0154\3\2\2\2\63\64\7h\2\2\64\65\7t\2\2\65\66\7c\2\2\66\67"+
		"\7e\2\2\678\7c\2\28\4\3\2\2\29:\7v\2\2:;\7q\2\2;<\7v\2\2<=\7c\2\2=>\7"+
		"n\2\2>\6\3\2\2\2?@\7h\2\2@A\7q\2\2AB\7t\2\2BC\7v\2\2CD\7g\2\2D\b\3\2\2"+
		"\2EF\7r\2\2FG\7c\2\2GH\7t\2\2HI\7e\2\2IJ\7k\2\2JK\7c\2\2KL\7n\2\2L\n\3"+
		"\2\2\2MN\7.\2\2N\f\3\2\2\2OS\7}\2\2PR\n\2\2\2QP\3\2\2\2RU\3\2\2\2SQ\3"+
		"\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\7\177\2\2WX\b\7\2\2X\16\3\2\2\2"+
		"Y]\7}\2\2Z\\\n\3\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2"+
		"\2_]\3\2\2\2`a\t\4\2\2ab\b\b\3\2b\20\3\2\2\2cd\7G\2\2de\7p\2\2ef\7v\2"+
		"\2fg\7k\2\2gh\7f\2\2hi\7c\2\2ij\7f\2\2jt\7g\2\2kl\7g\2\2lm\7p\2\2mn\7"+
		"v\2\2no\7k\2\2op\7f\2\2pq\7c\2\2qr\7f\2\2rt\7g\2\2sc\3\2\2\2sk\3\2\2\2"+
		"t\22\3\2\2\2uv\7T\2\2vw\7g\2\2wx\7n\2\2xy\7c\2\2yz\7e\2\2z{\7k\2\2{|\7"+
		"q\2\2|}\7p\2\2}~\7c\2\2~\177\7o\2\2\177\u0080\7g\2\2\u0080\u0081\7p\2"+
		"\2\u0081\u0082\7v\2\2\u0082\u0092\7q\2\2\u0083\u0084\7t\2\2\u0084\u0085"+
		"\7g\2\2\u0085\u0086\7n\2\2\u0086\u0087\7c\2\2\u0087\u0088\7e\2\2\u0088"+
		"\u0089\7k\2\2\u0089\u008a\7q\2\2\u008a\u008b\7p\2\2\u008b\u008c\7c\2\2"+
		"\u008c\u008d\7o\2\2\u008d\u008e\7g\2\2\u008e\u008f\7p\2\2\u008f\u0090"+
		"\7v\2\2\u0090\u0092\7q\2\2\u0091u\3\2\2\2\u0091\u0083\3\2\2\2\u0092\24"+
		"\3\2\2\2\u0093\u0094\7C\2\2\u0094\u0095\7n\2\2\u0095\u0096\7v\2\2\u0096"+
		"\u0097\7g\2\2\u0097\u0098\7t\2\2\u0098\u0099\7c\2\2\u0099\26\3\2\2\2\u009a"+
		"\u009b\7G\2\2\u009b\u009c\7z\2\2\u009c\u009d\7e\2\2\u009d\u009e\7n\2\2"+
		"\u009e\u009f\7w\2\2\u009f\u00a0\7k\2\2\u00a0\30\3\2\2\2\u00a1\u00a2\7"+
		"G\2\2\u00a2\u00a3\7z\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7d\2\2\u00a5\u00a6"+
		"\7g\2\2\u00a6\32\3\2\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa"+
		"\7v\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7t\2\2\u00ad"+
		"\u00ca\7q\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7c\2\2"+
		"\u00b1\u00ca\7n\2\2\u00b2\u00b3\7f\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5"+
		"\7v\2\2\u00b5\u00ca\7c\2\2\u00b6\u00b7\7j\2\2\u00b7\u00b8\7q\2\2\u00b8"+
		"\u00b9\7t\2\2\u00b9\u00ca\7c\2\2\u00ba\u00bb\7d\2\2\u00bb\u00bc\7q\2\2"+
		"\u00bc\u00bd\7q\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0"+
		"\7c\2\2\u00c0\u00c1\7p\2\2\u00c1\u00ca\7q\2\2\u00c2\u00c3\7n\2\2\u00c3"+
		"\u00c4\7k\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7t\2\2"+
		"\u00c7\u00c8\7c\2\2\u00c8\u00ca\7n\2\2\u00c9\u00a7\3\2\2\2\u00c9\u00ae"+
		"\3\2\2\2\u00c9\u00b2\3\2\2\2\u00c9\u00b6\3\2\2\2\u00c9\u00ba\3\2\2\2\u00c9"+
		"\u00c2\3\2\2\2\u00ca\34\3\2\2\2\u00cb\u00cc\7e\2\2\u00cc\u00cd\7q\2\2"+
		"\u00cd\u00ce\7o\2\2\u00ce\u00cf\7r\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1"+
		"\7u\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7q\2\2\u00d3\36\3\2\2\2\u00d4\u00d5"+
		"\7e\2\2\u00d5\u00d6\7j\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7x\2\2\u00d8"+
		"\u00d9\7g\2\2\u00d9\u00da\7\"\2\2\u00da\u00db\7r\2\2\u00db\u00dc\7t\2"+
		"\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7o\2\2\u00de\u00df\7c\2\2\u00df\u00e0"+
		"\7t\2\2\u00e0\u00e1\7k\2\2\u00e1\u010f\7c\2\2\u00e2\u00e3\7e\2\2\u00e3"+
		"\u00e4\7j\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7x\2\2\u00e6\u00e7\7g\2\2"+
		"\u00e7\u00e8\7\"\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb"+
		"\7v\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7p\2\2\u00ee"+
		"\u00ef\7i\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7t\2\2"+
		"\u00f2\u010f\7c\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6"+
		"\7q\2\2\u00f6\u00f7\7\"\2\2\u00f7\u00f8\7p\2\2\u00f8\u00f9\7w\2\2\u00f9"+
		"\u00fa\7n\2\2\u00fa\u010f\7q\2\2\u00fb\u00fc\7r\2\2\u00fc\u00fd\7c\2\2"+
		"\u00fd\u00fe\7f\2\2\u00fe\u00ff\7t\2\2\u00ff\u0100\7c\2\2\u0100\u010f"+
		"\7q\2\2\u0101\u0102\7x\2\2\u0102\u0103\7g\2\2\u0103\u0104\7t\2\2\u0104"+
		"\u0105\7k\2\2\u0105\u0106\7h\2\2\u0106\u0107\7k\2\2\u0107\u0108\7e\2\2"+
		"\u0108\u010f\7c\2\2\u0109\u010a\7w\2\2\u010a\u010b\7p\2\2\u010b\u010c"+
		"\7k\2\2\u010c\u010d\7e\2\2\u010d\u010f\7q\2\2\u010e\u00d4\3\2\2\2\u010e"+
		"\u00e2\3\2\2\2\u010e\u00f3\3\2\2\2\u010e\u00fb\3\2\2\2\u010e\u0101\3\2"+
		"\2\2\u010e\u0109\3\2\2\2\u010f \3\2\2\2\u0110\u0111\7o\2\2\u0111\u0112"+
		"\7c\2\2\u0112\u0113\7r\2\2\u0113\u0129\7\63\2\2\u0114\u0115\7o\2\2\u0115"+
		"\u0116\7c\2\2\u0116\u0117\7r\2\2\u0117\u0129\7\64\2\2\u0118\u0119\7o\2"+
		"\2\u0119\u011a\7c\2\2\u011a\u011b\7r\2\2\u011b\u0129\7\65\2\2\u011c\u011d"+
		"\7o\2\2\u011d\u011e\7c\2\2\u011e\u011f\7r\2\2\u011f\u0129\7\66\2\2\u0120"+
		"\u0121\7o\2\2\u0121\u0122\7c\2\2\u0122\u0123\7r\2\2\u0123\u0129\7\67\2"+
		"\2\u0124\u0125\7o\2\2\u0125\u0126\7c\2\2\u0126\u0127\7r\2\2\u0127\u0129"+
		"\78\2\2\u0128\u0110\3\2\2\2\u0128\u0114\3\2\2\2\u0128\u0118\3\2\2\2\u0128"+
		"\u011c\3\2\2\2\u0128\u0120\3\2\2\2\u0128\u0124\3\2\2\2\u0129\"\3\2\2\2"+
		"\u012a\u012b\t\5\2\2\u012b$\3\2\2\2\u012c\u012e\5/\30\2\u012d\u012c\3"+
		"\2\2\2\u012e\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0136\3\2\2\2\u0131\u0135\5/\30\2\u0132\u0135\7a\2\2\u0133\u0135\5\61"+
		"\31\2\u0134\u0131\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135"+
		"\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137&\3\2\2\2"+
		"\u0138\u0136\3\2\2\2\u0139\u013c\5-\27\2\u013a\u013c\7a\2\2\u013b\u0139"+
		"\3\2\2\2\u013b\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u0144\3\2\2\2\u013f\u0143\5-\27\2\u0140\u0143\7a"+
		"\2\2\u0141\u0143\5\61\31\2\u0142\u013f\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2"+
		"\2\2\u0145(\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0149\7\f\2\2\u0148\u014a"+
		"\7\13\2\2\u0149\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0149\3\2\2\2"+
		"\u014b\u014c\3\2\2\2\u014c*\3\2\2\2\u014d\u014e\t\6\2\2\u014e\u014f\b"+
		"\26\4\2\u014f,\3\2\2\2\u0150\u0151\4c|\2\u0151.\3\2\2\2\u0152\u0153\4"+
		"C\\\2\u0153\60\3\2\2\2\u0154\u0155\4\62;\2\u0155\62\3\2\2\2\22\2S]s\u0091"+
		"\u00c9\u010e\u0128\u012f\u0134\u0136\u013b\u013d\u0142\u0144\u014b\5\3"+
		"\7\2\3\b\3\3\26\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}