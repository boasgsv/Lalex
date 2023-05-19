// Generated from br/ufscar/dc/compiladores/la/lexico/LALexer.g4 by ANTLR 4.12.0
package br.ufscar.dc.compiladores.la.lexico;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LALexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMENTARIO=1, PALAVRAS_CHAVES=2, IDENT=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "CARACTERE_ESPECIAL", "TEXTO", "COMENTARIO", "PALAVRAS_CHAVES", 
			"IDENT"
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
			null, "COMENTARIO", "PALAVRAS_CHAVES", "IDENT"
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


	public LALexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LALexer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 4:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
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

	public static final String _serializedATN =
		"\u0004\u0000\u0003a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003\u0019\b\u0003\n\u0003\f\u0003\u001c"+
		"\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\""+
		"\b\u0004\n\u0004\f\u0004%\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005[\b\u0005\u0001\u0006\u0004\u0006^\b\u0006\u000b"+
		"\u0006\f\u0006_\u0001#\u0000\u0007\u0001\u0000\u0003\u0000\u0005\u0000"+
		"\u0007\u0000\t\u0001\u000b\u0002\r\u0003\u0001\u0000\u0001\u0002\u0000"+
		"  ()f\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0001\u000f\u0001\u0000\u0000\u0000\u0003"+
		"\u0011\u0001\u0000\u0000\u0000\u0005\u0013\u0001\u0000\u0000\u0000\u0007"+
		"\u001a\u0001\u0000\u0000\u0000\t\u001d\u0001\u0000\u0000\u0000\u000bZ"+
		"\u0001\u0000\u0000\u0000\r]\u0001\u0000\u0000\u0000\u000f\u0010\u0002"+
		"az\u0000\u0010\u0002\u0001\u0000\u0000\u0000\u0011\u0012\u000209\u0000"+
		"\u0012\u0004\u0001\u0000\u0000\u0000\u0013\u0014\u0007\u0000\u0000\u0000"+
		"\u0014\u0006\u0001\u0000\u0000\u0000\u0015\u0019\u0003\u0001\u0000\u0000"+
		"\u0016\u0019\u0003\u0003\u0001\u0000\u0017\u0019\u0003\u0005\u0002\u0000"+
		"\u0018\u0015\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000"+
		"\u0018\u0017\u0001\u0000\u0000\u0000\u0019\u001c\u0001\u0000\u0000\u0000"+
		"\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000"+
		"\u001b\b\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0005{\u0000\u0000\u001e\u001f\u0005 \u0000\u0000\u001f#\u0001"+
		"\u0000\u0000\u0000 \"\t\u0000\u0000\u0000! \u0001\u0000\u0000\u0000\""+
		"%\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000"+
		"\u0000$&\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000&\'\u0005 \u0000"+
		"\u0000\'(\u0005}\u0000\u0000()\u0001\u0000\u0000\u0000)*\u0006\u0004\u0000"+
		"\u0000*\n\u0001\u0000\u0000\u0000+,\u0005a\u0000\u0000,-\u0005l\u0000"+
		"\u0000-.\u0005g\u0000\u0000./\u0005o\u0000\u0000/0\u0005r\u0000\u0000"+
		"01\u0005i\u0000\u000012\u0005t\u0000\u000023\u0005m\u0000\u00003[\u0005"+
		"o\u0000\u000045\u0005f\u0000\u000056\u0005i\u0000\u000067\u0005m\u0000"+
		"\u000078\u0005_\u0000\u000089\u0005a\u0000\u00009:\u0005l\u0000\u0000"+
		":;\u0005g\u0000\u0000;<\u0005o\u0000\u0000<=\u0005r\u0000\u0000=>\u0005"+
		"i\u0000\u0000>?\u0005t\u0000\u0000?@\u0005m\u0000\u0000@[\u0005o\u0000"+
		"\u0000AB\u0005d\u0000\u0000BC\u0005e\u0000\u0000CD\u0005c\u0000\u0000"+
		"DE\u0005l\u0000\u0000EF\u0005a\u0000\u0000FG\u0005r\u0000\u0000G[\u0005"+
		"e\u0000\u0000HI\u0005l\u0000\u0000IJ\u0005i\u0000\u0000JK\u0005t\u0000"+
		"\u0000KL\u0005e\u0000\u0000LM\u0005r\u0000\u0000MN\u0005a\u0000\u0000"+
		"N[\u0005l\u0000\u0000OP\u0005l\u0000\u0000PQ\u0005e\u0000\u0000QR\u0005"+
		"i\u0000\u0000R[\u0005a\u0000\u0000ST\u0005e\u0000\u0000TU\u0005s\u0000"+
		"\u0000UV\u0005c\u0000\u0000VW\u0005r\u0000\u0000WX\u0005e\u0000\u0000"+
		"XY\u0005v\u0000\u0000Y[\u0005a\u0000\u0000Z+\u0001\u0000\u0000\u0000Z"+
		"4\u0001\u0000\u0000\u0000ZA\u0001\u0000\u0000\u0000ZH\u0001\u0000\u0000"+
		"\u0000ZO\u0001\u0000\u0000\u0000ZS\u0001\u0000\u0000\u0000[\f\u0001\u0000"+
		"\u0000\u0000\\^\u0003\u0001\u0000\u0000]\\\u0001\u0000\u0000\u0000^_\u0001"+
		"\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`\u000e\u0001\u0000\u0000\u0000\u0006\u0000\u0018\u001a#Z_\u0001\u0001"+
		"\u0004\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}