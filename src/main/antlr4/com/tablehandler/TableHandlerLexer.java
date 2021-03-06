// Generated from com/tablehandler/TableHandler.g4 by ANTLR 4.5
package com.tablehandler;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TableHandlerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		NULL=67, BOOLEAN=68, INTEGER=69, DOUBLE=70, ID=71, DELIMITER=72, STRING=73, 
		SL_COMMENT=74, ML_COMMENT=75, WS=76;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
		"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "T__56", 
		"T__57", "T__58", "T__59", "T__60", "T__61", "T__62", "T__63", "T__64", 
		"T__65", "NULL", "BOOLEAN", "INTEGER", "DOUBLE", "ID", "DELIMITER", "STRING", 
		"SL_COMMENT", "ML_COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'print'", "'if'", "'('", "')'", "'else if'", "'else'", "'{'", 
		"'}'", "'+'", "'-'", "'*'", "'/'", "'||'", "'&&'", "'=='", "'!='", "'<'", 
		"'>'", "'<='", "'>='", "'table('", "'read'", "'to'", "'add row'", "'at'", 
		"'get value('", "','", "') from'", "'insert into'", "'value='", "'at cell('", 
		"'clear row at'", "'from'", "'remove row at'", "'add column'", "'remove column at'", 
		"'clear field('", "'get col size from'", "'get row size from'", "'get unique column from'", 
		"'get column from'", "'header='", "'get row from'", "'get index from'", 
		"'of value='", "'col-subtable from'", "'start='", "'end='", "'row-subtable from'", 
		"'add'", "'with'", "'subtract'", "'sort'", "'sort descendent'", "'equals'", 
		"'export'", "'print first'", "'lines of'", "'print last'", "'int'", "'double'", 
		"'table'", "'boolean'", "'string'", "'.csv'", "'null'", null, null, null, 
		null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "NULL", "BOOLEAN", "INTEGER", 
		"DOUBLE", "ID", "DELIMITER", "STRING", "SL_COMMENT", "ML_COMMENT", "WS"
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


	public TableHandlerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TableHandler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2N\u02e1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3"+
		"\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3"+
		"\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3"+
		"\67\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\39\39\39\39\39\39"+
		"\39\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<"+
		"\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3?\3?"+
		"\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B"+
		"\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E"+
		"\u029e\nE\3F\6F\u02a1\nF\rF\16F\u02a2\3G\6G\u02a6\nG\rG\16G\u02a7\3G\3"+
		"G\6G\u02ac\nG\rG\16G\u02ad\3H\6H\u02b1\nH\rH\16H\u02b2\3I\3I\3J\3J\7J"+
		"\u02b9\nJ\fJ\16J\u02bc\13J\3J\3J\3K\3K\3K\3K\7K\u02c4\nK\fK\16K\u02c7"+
		"\13K\3K\3K\3K\3K\3L\3L\3L\3L\7L\u02d1\nL\fL\16L\u02d4\13L\3L\3L\3L\3L"+
		"\3L\3M\6M\u02dc\nM\rM\16M\u02dd\3M\3M\4\u02c5\u02d2\2N\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093"+
		"K\u0095L\u0097M\u0099N\3\2\6\3\2\62;\6\2\62;C\\aac|\3\2$$\5\2\13\f\17"+
		"\17\"\"\u02e9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2"+
		"y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\3\u009b\3\2\2\2\5\u009d\3\2\2"+
		"\2\7\u00a3\3\2\2\2\t\u00a6\3\2\2\2\13\u00a8\3\2\2\2\r\u00aa\3\2\2\2\17"+
		"\u00b2\3\2\2\2\21\u00b7\3\2\2\2\23\u00b9\3\2\2\2\25\u00bb\3\2\2\2\27\u00bd"+
		"\3\2\2\2\31\u00bf\3\2\2\2\33\u00c1\3\2\2\2\35\u00c3\3\2\2\2\37\u00c6\3"+
		"\2\2\2!\u00c9\3\2\2\2#\u00cc\3\2\2\2%\u00cf\3\2\2\2\'\u00d1\3\2\2\2)\u00d3"+
		"\3\2\2\2+\u00d6\3\2\2\2-\u00d9\3\2\2\2/\u00e0\3\2\2\2\61\u00e5\3\2\2\2"+
		"\63\u00e8\3\2\2\2\65\u00f0\3\2\2\2\67\u00f3\3\2\2\29\u00fe\3\2\2\2;\u0100"+
		"\3\2\2\2=\u0107\3\2\2\2?\u0113\3\2\2\2A\u011a\3\2\2\2C\u0123\3\2\2\2E"+
		"\u0130\3\2\2\2G\u0135\3\2\2\2I\u0143\3\2\2\2K\u014e\3\2\2\2M\u015f\3\2"+
		"\2\2O\u016c\3\2\2\2Q\u017e\3\2\2\2S\u0190\3\2\2\2U\u01a7\3\2\2\2W\u01b7"+
		"\3\2\2\2Y\u01bf\3\2\2\2[\u01cc\3\2\2\2]\u01db\3\2\2\2_\u01e5\3\2\2\2a"+
		"\u01f7\3\2\2\2c\u01fe\3\2\2\2e\u0203\3\2\2\2g\u0215\3\2\2\2i\u0219\3\2"+
		"\2\2k\u021e\3\2\2\2m\u0227\3\2\2\2o\u022c\3\2\2\2q\u023c\3\2\2\2s\u0243"+
		"\3\2\2\2u\u024a\3\2\2\2w\u0256\3\2\2\2y\u025f\3\2\2\2{\u026a\3\2\2\2}"+
		"\u026e\3\2\2\2\177\u0275\3\2\2\2\u0081\u027b\3\2\2\2\u0083\u0283\3\2\2"+
		"\2\u0085\u028a\3\2\2\2\u0087\u028f\3\2\2\2\u0089\u029d\3\2\2\2\u008b\u02a0"+
		"\3\2\2\2\u008d\u02a5\3\2\2\2\u008f\u02b0\3\2\2\2\u0091\u02b4\3\2\2\2\u0093"+
		"\u02b6\3\2\2\2\u0095\u02bf\3\2\2\2\u0097\u02cc\3\2\2\2\u0099\u02db\3\2"+
		"\2\2\u009b\u009c\7?\2\2\u009c\4\3\2\2\2\u009d\u009e\7r\2\2\u009e\u009f"+
		"\7t\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7v\2\2\u00a2"+
		"\6\3\2\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7h\2\2\u00a5\b\3\2\2\2\u00a6"+
		"\u00a7\7*\2\2\u00a7\n\3\2\2\2\u00a8\u00a9\7+\2\2\u00a9\f\3\2\2\2\u00aa"+
		"\u00ab\7g\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7g\2\2"+
		"\u00ae\u00af\7\"\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7h\2\2\u00b1\16\3"+
		"\2\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7u\2\2\u00b5"+
		"\u00b6\7g\2\2\u00b6\20\3\2\2\2\u00b7\u00b8\7}\2\2\u00b8\22\3\2\2\2\u00b9"+
		"\u00ba\7\177\2\2\u00ba\24\3\2\2\2\u00bb\u00bc\7-\2\2\u00bc\26\3\2\2\2"+
		"\u00bd\u00be\7/\2\2\u00be\30\3\2\2\2\u00bf\u00c0\7,\2\2\u00c0\32\3\2\2"+
		"\2\u00c1\u00c2\7\61\2\2\u00c2\34\3\2\2\2\u00c3\u00c4\7~\2\2\u00c4\u00c5"+
		"\7~\2\2\u00c5\36\3\2\2\2\u00c6\u00c7\7(\2\2\u00c7\u00c8\7(\2\2\u00c8 "+
		"\3\2\2\2\u00c9\u00ca\7?\2\2\u00ca\u00cb\7?\2\2\u00cb\"\3\2\2\2\u00cc\u00cd"+
		"\7#\2\2\u00cd\u00ce\7?\2\2\u00ce$\3\2\2\2\u00cf\u00d0\7>\2\2\u00d0&\3"+
		"\2\2\2\u00d1\u00d2\7@\2\2\u00d2(\3\2\2\2\u00d3\u00d4\7>\2\2\u00d4\u00d5"+
		"\7?\2\2\u00d5*\3\2\2\2\u00d6\u00d7\7@\2\2\u00d7\u00d8\7?\2\2\u00d8,\3"+
		"\2\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7d\2\2\u00dc"+
		"\u00dd\7n\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7*\2\2\u00df.\3\2\2\2\u00e0"+
		"\u00e1\7t\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7f\2\2"+
		"\u00e4\60\3\2\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7q\2\2\u00e7\62\3\2\2"+
		"\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7f\2\2\u00ea\u00eb\7f\2\2\u00eb\u00ec"+
		"\7\"\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7y\2\2\u00ef"+
		"\64\3\2\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7v\2\2\u00f2\66\3\2\2\2\u00f3"+
		"\u00f4\7i\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f7\7\"\2"+
		"\2\u00f7\u00f8\7x\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7n\2\2\u00fa\u00fb"+
		"\7w\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7*\2\2\u00fd8\3\2\2\2\u00fe\u00ff"+
		"\7.\2\2\u00ff:\3\2\2\2\u0100\u0101\7+\2\2\u0101\u0102\7\"\2\2\u0102\u0103"+
		"\7h\2\2\u0103\u0104\7t\2\2\u0104\u0105\7q\2\2\u0105\u0106\7o\2\2\u0106"+
		"<\3\2\2\2\u0107\u0108\7k\2\2\u0108\u0109\7p\2\2\u0109\u010a\7u\2\2\u010a"+
		"\u010b\7g\2\2\u010b\u010c\7t\2\2\u010c\u010d\7v\2\2\u010d\u010e\7\"\2"+
		"\2\u010e\u010f\7k\2\2\u010f\u0110\7p\2\2\u0110\u0111\7v\2\2\u0111\u0112"+
		"\7q\2\2\u0112>\3\2\2\2\u0113\u0114\7x\2\2\u0114\u0115\7c\2\2\u0115\u0116"+
		"\7n\2\2\u0116\u0117\7w\2\2\u0117\u0118\7g\2\2\u0118\u0119\7?\2\2\u0119"+
		"@\3\2\2\2\u011a\u011b\7c\2\2\u011b\u011c\7v\2\2\u011c\u011d\7\"\2\2\u011d"+
		"\u011e\7e\2\2\u011e\u011f\7g\2\2\u011f\u0120\7n\2\2\u0120\u0121\7n\2\2"+
		"\u0121\u0122\7*\2\2\u0122B\3\2\2\2\u0123\u0124\7e\2\2\u0124\u0125\7n\2"+
		"\2\u0125\u0126\7g\2\2\u0126\u0127\7c\2\2\u0127\u0128\7t\2\2\u0128\u0129"+
		"\7\"\2\2\u0129\u012a\7t\2\2\u012a\u012b\7q\2\2\u012b\u012c\7y\2\2\u012c"+
		"\u012d\7\"\2\2\u012d\u012e\7c\2\2\u012e\u012f\7v\2\2\u012fD\3\2\2\2\u0130"+
		"\u0131\7h\2\2\u0131\u0132\7t\2\2\u0132\u0133\7q\2\2\u0133\u0134\7o\2\2"+
		"\u0134F\3\2\2\2\u0135\u0136\7t\2\2\u0136\u0137\7g\2\2\u0137\u0138\7o\2"+
		"\2\u0138\u0139\7q\2\2\u0139\u013a\7x\2\2\u013a\u013b\7g\2\2\u013b\u013c"+
		"\7\"\2\2\u013c\u013d\7t\2\2\u013d\u013e\7q\2\2\u013e\u013f\7y\2\2\u013f"+
		"\u0140\7\"\2\2\u0140\u0141\7c\2\2\u0141\u0142\7v\2\2\u0142H\3\2\2\2\u0143"+
		"\u0144\7c\2\2\u0144\u0145\7f\2\2\u0145\u0146\7f\2\2\u0146\u0147\7\"\2"+
		"\2\u0147\u0148\7e\2\2\u0148\u0149\7q\2\2\u0149\u014a\7n\2\2\u014a\u014b"+
		"\7w\2\2\u014b\u014c\7o\2\2\u014c\u014d\7p\2\2\u014dJ\3\2\2\2\u014e\u014f"+
		"\7t\2\2\u014f\u0150\7g\2\2\u0150\u0151\7o\2\2\u0151\u0152\7q\2\2\u0152"+
		"\u0153\7x\2\2\u0153\u0154\7g\2\2\u0154\u0155\7\"\2\2\u0155\u0156\7e\2"+
		"\2\u0156\u0157\7q\2\2\u0157\u0158\7n\2\2\u0158\u0159\7w\2\2\u0159\u015a"+
		"\7o\2\2\u015a\u015b\7p\2\2\u015b\u015c\7\"\2\2\u015c\u015d\7c\2\2\u015d"+
		"\u015e\7v\2\2\u015eL\3\2\2\2\u015f\u0160\7e\2\2\u0160\u0161\7n\2\2\u0161"+
		"\u0162\7g\2\2\u0162\u0163\7c\2\2\u0163\u0164\7t\2\2\u0164\u0165\7\"\2"+
		"\2\u0165\u0166\7h\2\2\u0166\u0167\7k\2\2\u0167\u0168\7g\2\2\u0168\u0169"+
		"\7n\2\2\u0169\u016a\7f\2\2\u016a\u016b\7*\2\2\u016bN\3\2\2\2\u016c\u016d"+
		"\7i\2\2\u016d\u016e\7g\2\2\u016e\u016f\7v\2\2\u016f\u0170\7\"\2\2\u0170"+
		"\u0171\7e\2\2\u0171\u0172\7q\2\2\u0172\u0173\7n\2\2\u0173\u0174\7\"\2"+
		"\2\u0174\u0175\7u\2\2\u0175\u0176\7k\2\2\u0176\u0177\7|\2\2\u0177\u0178"+
		"\7g\2\2\u0178\u0179\7\"\2\2\u0179\u017a\7h\2\2\u017a\u017b\7t\2\2\u017b"+
		"\u017c\7q\2\2\u017c\u017d\7o\2\2\u017dP\3\2\2\2\u017e\u017f\7i\2\2\u017f"+
		"\u0180\7g\2\2\u0180\u0181\7v\2\2\u0181\u0182\7\"\2\2\u0182\u0183\7t\2"+
		"\2\u0183\u0184\7q\2\2\u0184\u0185\7y\2\2\u0185\u0186\7\"\2\2\u0186\u0187"+
		"\7u\2\2\u0187\u0188\7k\2\2\u0188\u0189\7|\2\2\u0189\u018a\7g\2\2\u018a"+
		"\u018b\7\"\2\2\u018b\u018c\7h\2\2\u018c\u018d\7t\2\2\u018d\u018e\7q\2"+
		"\2\u018e\u018f\7o\2\2\u018fR\3\2\2\2\u0190\u0191\7i\2\2\u0191\u0192\7"+
		"g\2\2\u0192\u0193\7v\2\2\u0193\u0194\7\"\2\2\u0194\u0195\7w\2\2\u0195"+
		"\u0196\7p\2\2\u0196\u0197\7k\2\2\u0197\u0198\7s\2\2\u0198\u0199\7w\2\2"+
		"\u0199\u019a\7g\2\2\u019a\u019b\7\"\2\2\u019b\u019c\7e\2\2\u019c\u019d"+
		"\7q\2\2\u019d\u019e\7n\2\2\u019e\u019f\7w\2\2\u019f\u01a0\7o\2\2\u01a0"+
		"\u01a1\7p\2\2\u01a1\u01a2\7\"\2\2\u01a2\u01a3\7h\2\2\u01a3\u01a4\7t\2"+
		"\2\u01a4\u01a5\7q\2\2\u01a5\u01a6\7o\2\2\u01a6T\3\2\2\2\u01a7\u01a8\7"+
		"i\2\2\u01a8\u01a9\7g\2\2\u01a9\u01aa\7v\2\2\u01aa\u01ab\7\"\2\2\u01ab"+
		"\u01ac\7e\2\2\u01ac\u01ad\7q\2\2\u01ad\u01ae\7n\2\2\u01ae\u01af\7w\2\2"+
		"\u01af\u01b0\7o\2\2\u01b0\u01b1\7p\2\2\u01b1\u01b2\7\"\2\2\u01b2\u01b3"+
		"\7h\2\2\u01b3\u01b4\7t\2\2\u01b4\u01b5\7q\2\2\u01b5\u01b6\7o\2\2\u01b6"+
		"V\3\2\2\2\u01b7\u01b8\7j\2\2\u01b8\u01b9\7g\2\2\u01b9\u01ba\7c\2\2\u01ba"+
		"\u01bb\7f\2\2\u01bb\u01bc\7g\2\2\u01bc\u01bd\7t\2\2\u01bd\u01be\7?\2\2"+
		"\u01beX\3\2\2\2\u01bf\u01c0\7i\2\2\u01c0\u01c1\7g\2\2\u01c1\u01c2\7v\2"+
		"\2\u01c2\u01c3\7\"\2\2\u01c3\u01c4\7t\2\2\u01c4\u01c5\7q\2\2\u01c5\u01c6"+
		"\7y\2\2\u01c6\u01c7\7\"\2\2\u01c7\u01c8\7h\2\2\u01c8\u01c9\7t\2\2\u01c9"+
		"\u01ca\7q\2\2\u01ca\u01cb\7o\2\2\u01cbZ\3\2\2\2\u01cc\u01cd\7i\2\2\u01cd"+
		"\u01ce\7g\2\2\u01ce\u01cf\7v\2\2\u01cf\u01d0\7\"\2\2\u01d0\u01d1\7k\2"+
		"\2\u01d1\u01d2\7p\2\2\u01d2\u01d3\7f\2\2\u01d3\u01d4\7g\2\2\u01d4\u01d5"+
		"\7z\2\2\u01d5\u01d6\7\"\2\2\u01d6\u01d7\7h\2\2\u01d7\u01d8\7t\2\2\u01d8"+
		"\u01d9\7q\2\2\u01d9\u01da\7o\2\2\u01da\\\3\2\2\2\u01db\u01dc\7q\2\2\u01dc"+
		"\u01dd\7h\2\2\u01dd\u01de\7\"\2\2\u01de\u01df\7x\2\2\u01df\u01e0\7c\2"+
		"\2\u01e0\u01e1\7n\2\2\u01e1\u01e2\7w\2\2\u01e2\u01e3\7g\2\2\u01e3\u01e4"+
		"\7?\2\2\u01e4^\3\2\2\2\u01e5\u01e6\7e\2\2\u01e6\u01e7\7q\2\2\u01e7\u01e8"+
		"\7n\2\2\u01e8\u01e9\7/\2\2\u01e9\u01ea\7u\2\2\u01ea\u01eb\7w\2\2\u01eb"+
		"\u01ec\7d\2\2\u01ec\u01ed\7v\2\2\u01ed\u01ee\7c\2\2\u01ee\u01ef\7d\2\2"+
		"\u01ef\u01f0\7n\2\2\u01f0\u01f1\7g\2\2\u01f1\u01f2\7\"\2\2\u01f2\u01f3"+
		"\7h\2\2\u01f3\u01f4\7t\2\2\u01f4\u01f5\7q\2\2\u01f5\u01f6\7o\2\2\u01f6"+
		"`\3\2\2\2\u01f7\u01f8\7u\2\2\u01f8\u01f9\7v\2\2\u01f9\u01fa\7c\2\2\u01fa"+
		"\u01fb\7t\2\2\u01fb\u01fc\7v\2\2\u01fc\u01fd\7?\2\2\u01fdb\3\2\2\2\u01fe"+
		"\u01ff\7g\2\2\u01ff\u0200\7p\2\2\u0200\u0201\7f\2\2\u0201\u0202\7?\2\2"+
		"\u0202d\3\2\2\2\u0203\u0204\7t\2\2\u0204\u0205\7q\2\2\u0205\u0206\7y\2"+
		"\2\u0206\u0207\7/\2\2\u0207\u0208\7u\2\2\u0208\u0209\7w\2\2\u0209\u020a"+
		"\7d\2\2\u020a\u020b\7v\2\2\u020b\u020c\7c\2\2\u020c\u020d\7d\2\2\u020d"+
		"\u020e\7n\2\2\u020e\u020f\7g\2\2\u020f\u0210\7\"\2\2\u0210\u0211\7h\2"+
		"\2\u0211\u0212\7t\2\2\u0212\u0213\7q\2\2\u0213\u0214\7o\2\2\u0214f\3\2"+
		"\2\2\u0215\u0216\7c\2\2\u0216\u0217\7f\2\2\u0217\u0218\7f\2\2\u0218h\3"+
		"\2\2\2\u0219\u021a\7y\2\2\u021a\u021b\7k\2\2\u021b\u021c\7v\2\2\u021c"+
		"\u021d\7j\2\2\u021dj\3\2\2\2\u021e\u021f\7u\2\2\u021f\u0220\7w\2\2\u0220"+
		"\u0221\7d\2\2\u0221\u0222\7v\2\2\u0222\u0223\7t\2\2\u0223\u0224\7c\2\2"+
		"\u0224\u0225\7e\2\2\u0225\u0226\7v\2\2\u0226l\3\2\2\2\u0227\u0228\7u\2"+
		"\2\u0228\u0229\7q\2\2\u0229\u022a\7t\2\2\u022a\u022b\7v\2\2\u022bn\3\2"+
		"\2\2\u022c\u022d\7u\2\2\u022d\u022e\7q\2\2\u022e\u022f\7t\2\2\u022f\u0230"+
		"\7v\2\2\u0230\u0231\7\"\2\2\u0231\u0232\7f\2\2\u0232\u0233\7g\2\2\u0233"+
		"\u0234\7u\2\2\u0234\u0235\7e\2\2\u0235\u0236\7g\2\2\u0236\u0237\7p\2\2"+
		"\u0237\u0238\7f\2\2\u0238\u0239\7g\2\2\u0239\u023a\7p\2\2\u023a\u023b"+
		"\7v\2\2\u023bp\3\2\2\2\u023c\u023d\7g\2\2\u023d\u023e\7s\2\2\u023e\u023f"+
		"\7w\2\2\u023f\u0240\7c\2\2\u0240\u0241\7n\2\2\u0241\u0242\7u\2\2\u0242"+
		"r\3\2\2\2\u0243\u0244\7g\2\2\u0244\u0245\7z\2\2\u0245\u0246\7r\2\2\u0246"+
		"\u0247\7q\2\2\u0247\u0248\7t\2\2\u0248\u0249\7v\2\2\u0249t\3\2\2\2\u024a"+
		"\u024b\7r\2\2\u024b\u024c\7t\2\2\u024c\u024d\7k\2\2\u024d\u024e\7p\2\2"+
		"\u024e\u024f\7v\2\2\u024f\u0250\7\"\2\2\u0250\u0251\7h\2\2\u0251\u0252"+
		"\7k\2\2\u0252\u0253\7t\2\2\u0253\u0254\7u\2\2\u0254\u0255\7v\2\2\u0255"+
		"v\3\2\2\2\u0256\u0257\7n\2\2\u0257\u0258\7k\2\2\u0258\u0259\7p\2\2\u0259"+
		"\u025a\7g\2\2\u025a\u025b\7u\2\2\u025b\u025c\7\"\2\2\u025c\u025d\7q\2"+
		"\2\u025d\u025e\7h\2\2\u025ex\3\2\2\2\u025f\u0260\7r\2\2\u0260\u0261\7"+
		"t\2\2\u0261\u0262\7k\2\2\u0262\u0263\7p\2\2\u0263\u0264\7v\2\2\u0264\u0265"+
		"\7\"\2\2\u0265\u0266\7n\2\2\u0266\u0267\7c\2\2\u0267\u0268\7u\2\2\u0268"+
		"\u0269\7v\2\2\u0269z\3\2\2\2\u026a\u026b\7k\2\2\u026b\u026c\7p\2\2\u026c"+
		"\u026d\7v\2\2\u026d|\3\2\2\2\u026e\u026f\7f\2\2\u026f\u0270\7q\2\2\u0270"+
		"\u0271\7w\2\2\u0271\u0272\7d\2\2\u0272\u0273\7n\2\2\u0273\u0274\7g\2\2"+
		"\u0274~\3\2\2\2\u0275\u0276\7v\2\2\u0276\u0277\7c\2\2\u0277\u0278\7d\2"+
		"\2\u0278\u0279\7n\2\2\u0279\u027a\7g\2\2\u027a\u0080\3\2\2\2\u027b\u027c"+
		"\7d\2\2\u027c\u027d\7q\2\2\u027d\u027e\7q\2\2\u027e\u027f\7n\2\2\u027f"+
		"\u0280\7g\2\2\u0280\u0281\7c\2\2\u0281\u0282\7p\2\2\u0282\u0082\3\2\2"+
		"\2\u0283\u0284\7u\2\2\u0284\u0285\7v\2\2\u0285\u0286\7t\2\2\u0286\u0287"+
		"\7k\2\2\u0287\u0288\7p\2\2\u0288\u0289\7i\2\2\u0289\u0084\3\2\2\2\u028a"+
		"\u028b\7\60\2\2\u028b\u028c\7e\2\2\u028c\u028d\7u\2\2\u028d\u028e\7x\2"+
		"\2\u028e\u0086\3\2\2\2\u028f\u0290\7p\2\2\u0290\u0291\7w\2\2\u0291\u0292"+
		"\7n\2\2\u0292\u0293\7n\2\2\u0293\u0088\3\2\2\2\u0294\u0295\7v\2\2\u0295"+
		"\u0296\7t\2\2\u0296\u0297\7w\2\2\u0297\u029e\7g\2\2\u0298\u0299\7h\2\2"+
		"\u0299\u029a\7c\2\2\u029a\u029b\7n\2\2\u029b\u029c\7u\2\2\u029c\u029e"+
		"\7g\2\2\u029d\u0294\3\2\2\2\u029d\u0298\3\2\2\2\u029e\u008a\3\2\2\2\u029f"+
		"\u02a1\t\2\2\2\u02a0\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a0\3\2"+
		"\2\2\u02a2\u02a3\3\2\2\2\u02a3\u008c\3\2\2\2\u02a4\u02a6\t\2\2\2\u02a5"+
		"\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2"+
		"\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ab\7\60\2\2\u02aa\u02ac\t\2\2\2\u02ab"+
		"\u02aa\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae\3\2"+
		"\2\2\u02ae\u008e\3\2\2\2\u02af\u02b1\t\3\2\2\u02b0\u02af\3\2\2\2\u02b1"+
		"\u02b2\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u0090\3\2"+
		"\2\2\u02b4\u02b5\7=\2\2\u02b5\u0092\3\2\2\2\u02b6\u02ba\7$\2\2\u02b7\u02b9"+
		"\n\4\2\2\u02b8\u02b7\3\2\2\2\u02b9\u02bc\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba"+
		"\u02bb\3\2\2\2\u02bb\u02bd\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bd\u02be\7$"+
		"\2\2\u02be\u0094\3\2\2\2\u02bf\u02c0\7\61\2\2\u02c0\u02c1\7\61\2\2\u02c1"+
		"\u02c5\3\2\2\2\u02c2\u02c4\13\2\2\2\u02c3\u02c2\3\2\2\2\u02c4\u02c7\3"+
		"\2\2\2\u02c5\u02c6\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c6\u02c8\3\2\2\2\u02c7"+
		"\u02c5\3\2\2\2\u02c8\u02c9\7\f\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cb\bK"+
		"\2\2\u02cb\u0096\3\2\2\2\u02cc\u02cd\7\61\2\2\u02cd\u02ce\7,\2\2\u02ce"+
		"\u02d2\3\2\2\2\u02cf\u02d1\13\2\2\2\u02d0\u02cf\3\2\2\2\u02d1\u02d4\3"+
		"\2\2\2\u02d2\u02d3\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d3\u02d5\3\2\2\2\u02d4"+
		"\u02d2\3\2\2\2\u02d5\u02d6\7,\2\2\u02d6\u02d7\7\61\2\2\u02d7\u02d8\3\2"+
		"\2\2\u02d8\u02d9\bL\2\2\u02d9\u0098\3\2\2\2\u02da\u02dc\t\5\2\2\u02db"+
		"\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd\u02de\3\2"+
		"\2\2\u02de\u02df\3\2\2\2\u02df\u02e0\bM\2\2\u02e0\u009a\3\2\2\2\f\2\u029d"+
		"\u02a2\u02a7\u02ad\u02b2\u02ba\u02c5\u02d2\u02dd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}