// Generated from Lex.g by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KEYWORD=1, IDENTIFIER=2, OPERATOR=3, INTLITERAL=4, FLOATLITERAL=5, STRINGLITERAL=6, 
		DIGITS=7, WORDS=8, COMMENT=9, WS=10;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'"
	};
	public static final String[] ruleNames = {
		"KEYWORD", "IDENTIFIER", "OPERATOR", "INTLITERAL", "FLOATLITERAL", "STRINGLITERAL", 
		"DIGITS", "WORDS", "COMMENT", "WS"
	};


	public LexLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lex.g"; }

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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\f\u00d1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2u\n\2\3\3\3\3\5\3y\n\3\3\3\3\3\3\3\7\3"+
		"~\n\3\f\3\16\3\u0081\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4\u0090\n\4\3\5\5\5\u0093\n\5\3\5\6\5\u0096\n\5\r\5\16\5\u0097"+
		"\3\6\5\6\u009b\n\6\3\6\7\6\u009e\n\6\f\6\16\6\u00a1\13\6\3\6\3\6\6\6\u00a5"+
		"\n\6\r\6\16\6\u00a6\3\6\5\6\u00aa\n\6\3\6\6\6\u00ad\n\6\r\6\16\6\u00ae"+
		"\3\6\3\6\5\6\u00b3\n\6\3\7\3\7\7\7\u00b7\n\7\f\7\16\7\u00ba\13\7\3\7\3"+
		"\7\3\b\3\b\3\t\6\t\u00c1\n\t\r\t\16\t\u00c2\3\n\3\n\3\n\3\n\7\n\u00c9"+
		"\n\n\f\n\16\n\u00cc\13\n\3\n\3\n\3\13\3\13\3\u00b8\2\f\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\3\2\t\6\2,-//\61\61??\5\2*+>>@@\4\2..="+
		"=\3\2\62;\4\2C\\c|\3\2\f\f\5\2\13\f\17\17\"\"\u00f7\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3t\3\2\2\2\5x\3\2\2\2\7\u008f\3"+
		"\2\2\2\t\u0092\3\2\2\2\13\u00b2\3\2\2\2\r\u00b4\3\2\2\2\17\u00bd\3\2\2"+
		"\2\21\u00c0\3\2\2\2\23\u00c4\3\2\2\2\25\u00cf\3\2\2\2\27\30\7R\2\2\30"+
		"\31\7T\2\2\31\32\7Q\2\2\32\33\7I\2\2\33\34\7T\2\2\34\35\7C\2\2\35u\7O"+
		"\2\2\36\37\7D\2\2\37 \7G\2\2 !\7I\2\2!\"\7K\2\2\"u\7P\2\2#$\7G\2\2$%\7"+
		"P\2\2%u\7F\2\2&\'\7H\2\2\'(\7W\2\2()\7P\2\2)*\7E\2\2*+\7V\2\2+,\7K\2\2"+
		",-\7Q\2\2-u\7P\2\2./\7T\2\2/\60\7G\2\2\60\61\7C\2\2\61u\7F\2\2\62\63\7"+
		"Y\2\2\63\64\7T\2\2\64\65\7K\2\2\65\66\7V\2\2\66u\7G\2\2\678\7K\2\28u\7"+
		"H\2\29:\7G\2\2:;\7N\2\2;<\7U\2\2<u\7G\2\2=>\7G\2\2>?\7P\2\2?@\7F\2\2@"+
		"A\7K\2\2Au\7H\2\2BC\7Y\2\2CD\7J\2\2DE\7K\2\2EF\7N\2\2Fu\7G\2\2GH\7G\2"+
		"\2HI\7P\2\2IJ\7F\2\2JK\7Y\2\2KL\7J\2\2LM\7K\2\2MN\7N\2\2Nu\7G\2\2OP\7"+
		"E\2\2PQ\7Q\2\2QR\7P\2\2RS\7V\2\2ST\7K\2\2TU\7P\2\2UV\7W\2\2Vu\7G\2\2W"+
		"X\7D\2\2XY\7T\2\2YZ\7G\2\2Z[\7C\2\2[u\7M\2\2\\]\7T\2\2]^\7G\2\2^_\7V\2"+
		"\2_`\7W\2\2`a\7T\2\2au\7P\2\2bc\7K\2\2cd\7P\2\2du\7V\2\2ef\7X\2\2fg\7"+
		"Q\2\2gh\7K\2\2hu\7F\2\2ij\7U\2\2jk\7V\2\2kl\7T\2\2lm\7K\2\2mn\7P\2\2n"+
		"u\7I\2\2op\7H\2\2pq\7N\2\2qr\7Q\2\2rs\7C\2\2su\7V\2\2t\27\3\2\2\2t\36"+
		"\3\2\2\2t#\3\2\2\2t&\3\2\2\2t.\3\2\2\2t\62\3\2\2\2t\67\3\2\2\2t9\3\2\2"+
		"\2t=\3\2\2\2tB\3\2\2\2tG\3\2\2\2tO\3\2\2\2tW\3\2\2\2t\\\3\2\2\2tb\3\2"+
		"\2\2te\3\2\2\2ti\3\2\2\2to\3\2\2\2u\4\3\2\2\2vy\7a\2\2wy\5\21\t\2xv\3"+
		"\2\2\2xw\3\2\2\2y\177\3\2\2\2z~\7a\2\2{~\5\21\t\2|~\5\17\b\2}z\3\2\2\2"+
		"}{\3\2\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\6\3\2\2\2\u0081\177\3\2\2\2\u0082\u0090\t\2\2\2\u0083\u0084\7?\2\2\u0084"+
		"\u0090\7?\2\2\u0085\u0086\7#\2\2\u0086\u0090\7?\2\2\u0087\u0090\t\3\2"+
		"\2\u0088\u0089\7>\2\2\u0089\u0090\7?\2\2\u008a\u008b\7@\2\2\u008b\u0090"+
		"\7?\2\2\u008c\u008d\7<\2\2\u008d\u0090\7?\2\2\u008e\u0090\t\4\2\2\u008f"+
		"\u0082\3\2\2\2\u008f\u0083\3\2\2\2\u008f\u0085\3\2\2\2\u008f\u0087\3\2"+
		"\2\2\u008f\u0088\3\2\2\2\u008f\u008a\3\2\2\2\u008f\u008c\3\2\2\2\u008f"+
		"\u008e\3\2\2\2\u0090\b\3\2\2\2\u0091\u0093\7/\2\2\u0092\u0091\3\2\2\2"+
		"\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0096\t\5\2\2\u0095\u0094"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\n\3\2\2\2\u0099\u009b\7/\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2"+
		"\u009b\u009f\3\2\2\2\u009c\u009e\5\17\b\2\u009d\u009c\3\2\2\2\u009e\u00a1"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a4\7\60\2\2\u00a3\u00a5\5\17\b\2\u00a4\u00a3\3"+
		"\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00b3\3\2\2\2\u00a8\u00aa\7/\2\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00ad\5\17\b\2\u00ac\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b1\7\60\2\2\u00b1\u00b3\3\2\2\2\u00b2\u009a\3\2\2\2\u00b2"+
		"\u00a9\3\2\2\2\u00b3\f\3\2\2\2\u00b4\u00b8\7$\2\2\u00b5\u00b7\13\2\2\2"+
		"\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7$\2\2\u00bc"+
		"\16\3\2\2\2\u00bd\u00be\t\5\2\2\u00be\20\3\2\2\2\u00bf\u00c1\t\6\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\22\3\2\2\2\u00c4\u00c5\7/\2\2\u00c5\u00c6\7/\2\2\u00c6\u00ca"+
		"\3\2\2\2\u00c7\u00c9\n\7\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cd\u00ce\7\f\2\2\u00ce\24\3\2\2\2\u00cf\u00d0\t\b\2\2\u00d0\26"+
		"\3\2\2\2\23\2tx}\177\u008f\u0092\u0097\u009a\u009f\u00a6\u00a9\u00ae\u00b2"+
		"\u00b8\u00c2\u00ca\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}