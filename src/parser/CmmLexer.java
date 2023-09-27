// Generated from C:/Users/hoooc/IdeaProjects/lab3_lexer/src/parser/Cmm.g4 by ANTLR 4.13.1
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ONE_LINE_COMMENT=1, MULTI_LINE_COMMENT=2, WS=3, ID=4, CHAR_CONSTANT=5, 
		REAL_CONSTANT=6, INT_CONSTANT=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ONE_LINE_COMMENT", "MULTI_LINE_COMMENT", "WS", "ID", "CHAR_CONSTANT", 
			"ESCAPE_SEQUENCE", "REAL_CONSTANT", "EXPONENT", "INT_CONSTANT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ONE_LINE_COMMENT", "MULTI_LINE_COMMENT", "WS", "ID", "CHAR_CONSTANT", 
			"REAL_CONSTANT", "INT_CONSTANT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public CmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0007\u007f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\u0018\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001#\b\u0001\n\u0001\f\u0001&\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u0002.\b\u0002\u000b"+
		"\u0002\f\u0002/\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0005"+
		"\u00036\b\u0003\n\u0003\f\u00039\t\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004>\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005G\b\u0005\u0001"+
		"\u0005\u0003\u0005J\b\u0005\u0003\u0005L\b\u0005\u0001\u0006\u0004\u0006"+
		"O\b\u0006\u000b\u0006\f\u0006P\u0001\u0006\u0001\u0006\u0005\u0006U\b"+
		"\u0006\n\u0006\f\u0006X\t\u0006\u0001\u0006\u0003\u0006[\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0004\u0006_\b\u0006\u000b\u0006\f\u0006`\u0001\u0006"+
		"\u0003\u0006d\b\u0006\u0001\u0006\u0004\u0006g\b\u0006\u000b\u0006\f\u0006"+
		"h\u0001\u0006\u0003\u0006l\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007"+
		"p\b\u0007\u0001\u0007\u0004\u0007s\b\u0007\u000b\u0007\f\u0007t\u0001"+
		"\b\u0001\b\u0004\by\b\b\u000b\b\f\bz\u0001\b\u0003\b~\b\b\u0001$\u0000"+
		"\t\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0000"+
		"\r\u0006\u000f\u0000\u0011\u0007\u0001\u0000\u000b\u0001\u0000\n\n\u0003"+
		"\u0000\t\n\r\r  \u0003\u0000AZ__az\u0004\u000009AZ__az\u0002\u0000\'\'"+
		"\\\\\u0006\u0000\'\'\\\\bbnnrrtt\u0001\u000007\u0001\u000009\u0002\u0000"+
		"EEee\u0002\u0000++--\u0001\u000019\u0090\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0001"+
		"\u0013\u0001\u0000\u0000\u0000\u0003\u001e\u0001\u0000\u0000\u0000\u0005"+
		"-\u0001\u0000\u0000\u0000\u00073\u0001\u0000\u0000\u0000\t:\u0001\u0000"+
		"\u0000\u0000\u000bK\u0001\u0000\u0000\u0000\rk\u0001\u0000\u0000\u0000"+
		"\u000fm\u0001\u0000\u0000\u0000\u0011}\u0001\u0000\u0000\u0000\u0013\u0014"+
		"\u0005/\u0000\u0000\u0014\u0015\u0005/\u0000\u0000\u0015\u0019\u0001\u0000"+
		"\u0000\u0000\u0016\u0018\b\u0000\u0000\u0000\u0017\u0016\u0001\u0000\u0000"+
		"\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000"+
		"\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001c\u0001\u0000\u0000"+
		"\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c\u001d\u0006\u0000\u0000"+
		"\u0000\u001d\u0002\u0001\u0000\u0000\u0000\u001e\u001f\u0005/\u0000\u0000"+
		"\u001f \u0005*\u0000\u0000 $\u0001\u0000\u0000\u0000!#\t\u0000\u0000\u0000"+
		"\"!\u0001\u0000\u0000\u0000#&\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000"+
		"\u0000$\"\u0001\u0000\u0000\u0000%\'\u0001\u0000\u0000\u0000&$\u0001\u0000"+
		"\u0000\u0000\'(\u0005*\u0000\u0000()\u0005/\u0000\u0000)*\u0001\u0000"+
		"\u0000\u0000*+\u0006\u0001\u0000\u0000+\u0004\u0001\u0000\u0000\u0000"+
		",.\u0007\u0001\u0000\u0000-,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000"+
		"\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000001\u0001\u0000"+
		"\u0000\u000012\u0006\u0002\u0000\u00002\u0006\u0001\u0000\u0000\u0000"+
		"37\u0007\u0002\u0000\u000046\u0007\u0003\u0000\u000054\u0001\u0000\u0000"+
		"\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u00008\b\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:=\u0005"+
		"\'\u0000\u0000;>\u0003\u000b\u0005\u0000<>\b\u0004\u0000\u0000=;\u0001"+
		"\u0000\u0000\u0000=<\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000"+
		"?@\u0005\'\u0000\u0000@\n\u0001\u0000\u0000\u0000AB\u0005\\\u0000\u0000"+
		"BL\u0007\u0005\u0000\u0000CD\u0005\\\u0000\u0000DF\u0007\u0006\u0000\u0000"+
		"EG\u0007\u0006\u0000\u0000FE\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000"+
		"\u0000GI\u0001\u0000\u0000\u0000HJ\u0007\u0006\u0000\u0000IH\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000\u0000KA\u0001"+
		"\u0000\u0000\u0000KC\u0001\u0000\u0000\u0000L\f\u0001\u0000\u0000\u0000"+
		"MO\u0007\u0007\u0000\u0000NM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000RV\u0005.\u0000\u0000SU\u0007\u0007\u0000\u0000TS\u0001\u0000"+
		"\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000"+
		"Y[\u0003\u000f\u0007\u0000ZY\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[l\u0001\u0000\u0000\u0000\\^\u0005.\u0000\u0000]_\u0007\u0007\u0000"+
		"\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`^\u0001\u0000"+
		"\u0000\u0000`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000bd\u0003"+
		"\u000f\u0007\u0000cb\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000"+
		"dl\u0001\u0000\u0000\u0000eg\u0007\u0007\u0000\u0000fe\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0003\u000f\u0007\u0000kN\u0001"+
		"\u0000\u0000\u0000k\\\u0001\u0000\u0000\u0000kf\u0001\u0000\u0000\u0000"+
		"l\u000e\u0001\u0000\u0000\u0000mo\u0007\b\u0000\u0000np\u0007\t\u0000"+
		"\u0000on\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pr\u0001\u0000"+
		"\u0000\u0000qs\u0007\u0007\u0000\u0000rq\u0001\u0000\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"u\u0010\u0001\u0000\u0000\u0000vx\u0007\n\u0000\u0000wy\u0007\u0007\u0000"+
		"\u0000xw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000zx\u0001\u0000"+
		"\u0000\u0000z{\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|~\u0005"+
		"0\u0000\u0000}v\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0012"+
		"\u0001\u0000\u0000\u0000\u0014\u0000\u0019$/7=FIKPVZ`chkotz}\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}