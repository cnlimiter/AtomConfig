// Generated from org\tomlj\internal\TomlParser.g4 by ANTLR 4.9.1

package org.tomlj.internal;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TomlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TripleQuotationMark=1, TripleApostrophe=2, StringChar=3, Comma=4, Dot=5, 
		Equals=6, QuotationMark=7, Apostrophe=8, TableKeyStart=9, TableKeyEnd=10, 
		ArrayTableKeyStart=11, ArrayTableKeyEnd=12, UnquotedKey=13, WS=14, Comment=15, 
		NewLine=16, Error=17, DecimalInteger=18, HexInteger=19, OctalInteger=20, 
		BinaryInteger=21, FloatingPoint=22, FloatingPointInf=23, FloatingPointNaN=24, 
		TrueBoolean=25, FalseBoolean=26, ArrayStart=27, ArrayEnd=28, InlineTableStart=29, 
		EscapeSequence=30, Dash=31, Plus=32, Colon=33, Z=34, TimeDelimiter=35, 
		DateDigits=36, InlineTableEnd=37, InlineTableComma=38;
	public static final int
		RULE_toml = 0, RULE_expression = 1, RULE_tomlKey = 2, RULE_keyval = 3, 
		RULE_key = 4, RULE_simpleKey = 5, RULE_unquotedKey = 6, RULE_quotedKey = 7, 
		RULE_val = 8, RULE_string = 9, RULE_basicString = 10, RULE_basicChar = 11, 
		RULE_basicUnescaped = 12, RULE_escaped = 13, RULE_mlBasicString = 14, 
		RULE_mlBasicChar = 15, RULE_mlBasicUnescaped = 16, RULE_literalString = 17, 
		RULE_literalBody = 18, RULE_mlLiteralString = 19, RULE_mlLiteralBody = 20, 
		RULE_integer = 21, RULE_decInt = 22, RULE_hexInt = 23, RULE_octInt = 24, 
		RULE_binInt = 25, RULE_floatValue = 26, RULE_regularFloat = 27, RULE_regularFloatInf = 28, 
		RULE_regularFloatNaN = 29, RULE_booleanValue = 30, RULE_trueBool = 31, 
		RULE_falseBool = 32, RULE_dateTime = 33, RULE_offsetDateTime = 34, RULE_localDateTime = 35, 
		RULE_localDate = 36, RULE_localTime = 37, RULE_date = 38, RULE_time = 39, 
		RULE_timeOffset = 40, RULE_hourOffset = 41, RULE_minuteOffset = 42, RULE_secondFraction = 43, 
		RULE_year = 44, RULE_month = 45, RULE_day = 46, RULE_hour = 47, RULE_minute = 48, 
		RULE_second = 49, RULE_array = 50, RULE_arrayValues = 51, RULE_arrayValue = 52, 
		RULE_table = 53, RULE_standardTable = 54, RULE_inlineTable = 55, RULE_inlineTableValues = 56, 
		RULE_arrayTable = 57;
	private static String[] makeRuleNames() {
		return new String[] {
			"toml", "expression", "tomlKey", "keyval", "key", "simpleKey", "unquotedKey", 
			"quotedKey", "val", "string", "basicString", "basicChar", "basicUnescaped", 
			"escaped", "mlBasicString", "mlBasicChar", "mlBasicUnescaped", "literalString", 
			"literalBody", "mlLiteralString", "mlLiteralBody", "integer", "decInt", 
			"hexInt", "octInt", "binInt", "floatValue", "regularFloat", "regularFloatInf", 
			"regularFloatNaN", "booleanValue", "trueBool", "falseBool", "dateTime", 
			"offsetDateTime", "localDateTime", "localDate", "localTime", "date", 
			"time", "timeOffset", "hourOffset", "minuteOffset", "secondFraction", 
			"year", "month", "day", "hour", "minute", "second", "array", "arrayValues", 
			"arrayValue", "table", "standardTable", "inlineTable", "inlineTableValues", 
			"arrayTable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "'['", "']'", "'[['", 
			"']]'", null, null, null, null, null, null, null, null, null, null, null, 
			null, "'true'", "'false'", null, null, null, null, "'-'", "'+'", "':'", 
			null, null, null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TripleQuotationMark", "TripleApostrophe", "StringChar", "Comma", 
			"Dot", "Equals", "QuotationMark", "Apostrophe", "TableKeyStart", "TableKeyEnd", 
			"ArrayTableKeyStart", "ArrayTableKeyEnd", "UnquotedKey", "WS", "Comment", 
			"NewLine", "Error", "DecimalInteger", "HexInteger", "OctalInteger", "BinaryInteger", 
			"FloatingPoint", "FloatingPointInf", "FloatingPointNaN", "TrueBoolean", 
			"FalseBoolean", "ArrayStart", "ArrayEnd", "InlineTableStart", "EscapeSequence", 
			"Dash", "Plus", "Colon", "Z", "TimeDelimiter", "DateDigits", "InlineTableEnd", 
			"InlineTableComma"
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

	@Override
	public String getGrammarFileName() { return "TomlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TomlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TomlContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TomlParser.EOF, 0); }
		public List<TerminalNode> NewLine() { return getTokens(TomlParser.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(TomlParser.NewLine, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TomlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterToml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitToml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitToml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TomlContext toml() throws RecognitionException {
		TomlContext _localctx = new TomlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_toml);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(116);
				match(NewLine);
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QuotationMark) | (1L << Apostrophe) | (1L << TableKeyStart) | (1L << ArrayTableKeyStart) | (1L << UnquotedKey))) != 0)) {
				{
				setState(122);
				expression();
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(124); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(123);
							match(NewLine);
							}
							}
							setState(126); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==NewLine );
						setState(128);
						expression();
						}
						} 
					}
					setState(133);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NewLine) {
					{
					{
					setState(134);
					match(NewLine);
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(142);
			match(EOF);
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

	public static class ExpressionContext extends ParserRuleContext {
		public KeyvalContext keyval() {
			return getRuleContext(KeyvalContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QuotationMark:
			case Apostrophe:
			case UnquotedKey:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				keyval();
				}
				break;
			case TableKeyStart:
			case ArrayTableKeyStart:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				table();
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

	public static class TomlKeyContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TomlParser.EOF, 0); }
		public TomlKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tomlKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterTomlKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitTomlKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitTomlKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TomlKeyContext tomlKey() throws RecognitionException {
		TomlKeyContext _localctx = new TomlKeyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tomlKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			key();
			setState(149);
			match(EOF);
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

	public static class KeyvalContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public TerminalNode Equals() { return getToken(TomlParser.Equals, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public KeyvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterKeyval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitKeyval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitKeyval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyvalContext keyval() throws RecognitionException {
		KeyvalContext _localctx = new KeyvalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_keyval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			key();
			setState(152);
			match(Equals);
			setState(153);
			val();
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

	public static class KeyContext extends ParserRuleContext {
		public List<SimpleKeyContext> simpleKey() {
			return getRuleContexts(SimpleKeyContext.class);
		}
		public SimpleKeyContext simpleKey(int i) {
			return getRuleContext(SimpleKeyContext.class,i);
		}
		public List<TerminalNode> Dot() { return getTokens(TomlParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(TomlParser.Dot, i);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			simpleKey();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot) {
				{
				{
				setState(156);
				match(Dot);
				setState(157);
				simpleKey();
				}
				}
				setState(162);
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

	public static class SimpleKeyContext extends ParserRuleContext {
		public QuotedKeyContext quotedKey() {
			return getRuleContext(QuotedKeyContext.class,0);
		}
		public UnquotedKeyContext unquotedKey() {
			return getRuleContext(UnquotedKeyContext.class,0);
		}
		public SimpleKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterSimpleKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitSimpleKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitSimpleKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleKeyContext simpleKey() throws RecognitionException {
		SimpleKeyContext _localctx = new SimpleKeyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_simpleKey);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QuotationMark:
			case Apostrophe:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				quotedKey();
				}
				break;
			case UnquotedKey:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				unquotedKey();
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

	public static class UnquotedKeyContext extends ParserRuleContext {
		public TerminalNode UnquotedKey() { return getToken(TomlParser.UnquotedKey, 0); }
		public UnquotedKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unquotedKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterUnquotedKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitUnquotedKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitUnquotedKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnquotedKeyContext unquotedKey() throws RecognitionException {
		UnquotedKeyContext _localctx = new UnquotedKeyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unquotedKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(UnquotedKey);
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

	public static class QuotedKeyContext extends ParserRuleContext {
		public BasicStringContext basicString() {
			return getRuleContext(BasicStringContext.class,0);
		}
		public LiteralStringContext literalString() {
			return getRuleContext(LiteralStringContext.class,0);
		}
		public QuotedKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterQuotedKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitQuotedKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitQuotedKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedKeyContext quotedKey() throws RecognitionException {
		QuotedKeyContext _localctx = new QuotedKeyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_quotedKey);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QuotationMark:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				basicString();
				}
				break;
			case Apostrophe:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				literalString();
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

	public static class ValContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public FloatValueContext floatValue() {
			return getRuleContext(FloatValueContext.class,0);
		}
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public DateTimeContext dateTime() {
			return getRuleContext(DateTimeContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_val);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TripleQuotationMark:
			case TripleApostrophe:
			case QuotationMark:
			case Apostrophe:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				string();
				}
				break;
			case DecimalInteger:
			case HexInteger:
			case OctalInteger:
			case BinaryInteger:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				integer();
				}
				break;
			case FloatingPoint:
			case FloatingPointInf:
			case FloatingPointNaN:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				floatValue();
				}
				break;
			case TrueBoolean:
			case FalseBoolean:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				booleanValue();
				}
				break;
			case DateDigits:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				dateTime();
				}
				break;
			case ArrayStart:
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				array();
				}
				break;
			case InlineTableStart:
				enterOuterAlt(_localctx, 7);
				{
				setState(179);
				inlineTable();
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

	public static class StringContext extends ParserRuleContext {
		public MlBasicStringContext mlBasicString() {
			return getRuleContext(MlBasicStringContext.class,0);
		}
		public BasicStringContext basicString() {
			return getRuleContext(BasicStringContext.class,0);
		}
		public MlLiteralStringContext mlLiteralString() {
			return getRuleContext(MlLiteralStringContext.class,0);
		}
		public LiteralStringContext literalString() {
			return getRuleContext(LiteralStringContext.class,0);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_string);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TripleQuotationMark:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				mlBasicString();
				}
				break;
			case QuotationMark:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				basicString();
				}
				break;
			case TripleApostrophe:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				mlLiteralString();
				}
				break;
			case Apostrophe:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				literalString();
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

	public static class BasicStringContext extends ParserRuleContext {
		public List<TerminalNode> QuotationMark() { return getTokens(TomlParser.QuotationMark); }
		public TerminalNode QuotationMark(int i) {
			return getToken(TomlParser.QuotationMark, i);
		}
		public List<BasicCharContext> basicChar() {
			return getRuleContexts(BasicCharContext.class);
		}
		public BasicCharContext basicChar(int i) {
			return getRuleContext(BasicCharContext.class,i);
		}
		public BasicStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterBasicString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitBasicString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitBasicString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicStringContext basicString() throws RecognitionException {
		BasicStringContext _localctx = new BasicStringContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_basicString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(QuotationMark);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==StringChar || _la==EscapeSequence) {
				{
				{
				setState(189);
				basicChar();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			match(QuotationMark);
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

	public static class BasicCharContext extends ParserRuleContext {
		public BasicUnescapedContext basicUnescaped() {
			return getRuleContext(BasicUnescapedContext.class,0);
		}
		public EscapedContext escaped() {
			return getRuleContext(EscapedContext.class,0);
		}
		public BasicCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterBasicChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitBasicChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitBasicChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicCharContext basicChar() throws RecognitionException {
		BasicCharContext _localctx = new BasicCharContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_basicChar);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringChar:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				basicUnescaped();
				}
				break;
			case EscapeSequence:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				escaped();
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

	public static class BasicUnescapedContext extends ParserRuleContext {
		public TerminalNode StringChar() { return getToken(TomlParser.StringChar, 0); }
		public BasicUnescapedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicUnescaped; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterBasicUnescaped(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitBasicUnescaped(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitBasicUnescaped(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicUnescapedContext basicUnescaped() throws RecognitionException {
		BasicUnescapedContext _localctx = new BasicUnescapedContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_basicUnescaped);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(StringChar);
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

	public static class EscapedContext extends ParserRuleContext {
		public TerminalNode EscapeSequence() { return getToken(TomlParser.EscapeSequence, 0); }
		public EscapedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escaped; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterEscaped(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitEscaped(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitEscaped(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscapedContext escaped() throws RecognitionException {
		EscapedContext _localctx = new EscapedContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_escaped);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(EscapeSequence);
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

	public static class MlBasicStringContext extends ParserRuleContext {
		public List<TerminalNode> TripleQuotationMark() { return getTokens(TomlParser.TripleQuotationMark); }
		public TerminalNode TripleQuotationMark(int i) {
			return getToken(TomlParser.TripleQuotationMark, i);
		}
		public List<MlBasicCharContext> mlBasicChar() {
			return getRuleContexts(MlBasicCharContext.class);
		}
		public MlBasicCharContext mlBasicChar(int i) {
			return getRuleContext(MlBasicCharContext.class,i);
		}
		public MlBasicStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mlBasicString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterMlBasicString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitMlBasicString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitMlBasicString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MlBasicStringContext mlBasicString() throws RecognitionException {
		MlBasicStringContext _localctx = new MlBasicStringContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mlBasicString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(TripleQuotationMark);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==StringChar || _la==EscapeSequence) {
				{
				{
				setState(206);
				mlBasicChar();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212);
			match(TripleQuotationMark);
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

	public static class MlBasicCharContext extends ParserRuleContext {
		public MlBasicUnescapedContext mlBasicUnescaped() {
			return getRuleContext(MlBasicUnescapedContext.class,0);
		}
		public EscapedContext escaped() {
			return getRuleContext(EscapedContext.class,0);
		}
		public MlBasicCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mlBasicChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterMlBasicChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitMlBasicChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitMlBasicChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MlBasicCharContext mlBasicChar() throws RecognitionException {
		MlBasicCharContext _localctx = new MlBasicCharContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mlBasicChar);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringChar:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				mlBasicUnescaped();
				}
				break;
			case EscapeSequence:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				escaped();
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

	public static class MlBasicUnescapedContext extends ParserRuleContext {
		public TerminalNode StringChar() { return getToken(TomlParser.StringChar, 0); }
		public MlBasicUnescapedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mlBasicUnescaped; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterMlBasicUnescaped(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitMlBasicUnescaped(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitMlBasicUnescaped(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MlBasicUnescapedContext mlBasicUnescaped() throws RecognitionException {
		MlBasicUnescapedContext _localctx = new MlBasicUnescapedContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mlBasicUnescaped);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(StringChar);
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

	public static class LiteralStringContext extends ParserRuleContext {
		public List<TerminalNode> Apostrophe() { return getTokens(TomlParser.Apostrophe); }
		public TerminalNode Apostrophe(int i) {
			return getToken(TomlParser.Apostrophe, i);
		}
		public LiteralBodyContext literalBody() {
			return getRuleContext(LiteralBodyContext.class,0);
		}
		public LiteralStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterLiteralString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitLiteralString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitLiteralString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralStringContext literalString() throws RecognitionException {
		LiteralStringContext _localctx = new LiteralStringContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_literalString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(Apostrophe);
			setState(221);
			literalBody();
			setState(222);
			match(Apostrophe);
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

	public static class LiteralBodyContext extends ParserRuleContext {
		public List<TerminalNode> StringChar() { return getTokens(TomlParser.StringChar); }
		public TerminalNode StringChar(int i) {
			return getToken(TomlParser.StringChar, i);
		}
		public LiteralBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterLiteralBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitLiteralBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitLiteralBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralBodyContext literalBody() throws RecognitionException {
		LiteralBodyContext _localctx = new LiteralBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_literalBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==StringChar) {
				{
				{
				setState(224);
				match(StringChar);
				}
				}
				setState(229);
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

	public static class MlLiteralStringContext extends ParserRuleContext {
		public List<TerminalNode> TripleApostrophe() { return getTokens(TomlParser.TripleApostrophe); }
		public TerminalNode TripleApostrophe(int i) {
			return getToken(TomlParser.TripleApostrophe, i);
		}
		public MlLiteralBodyContext mlLiteralBody() {
			return getRuleContext(MlLiteralBodyContext.class,0);
		}
		public MlLiteralStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mlLiteralString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterMlLiteralString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitMlLiteralString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitMlLiteralString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MlLiteralStringContext mlLiteralString() throws RecognitionException {
		MlLiteralStringContext _localctx = new MlLiteralStringContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_mlLiteralString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(TripleApostrophe);
			setState(231);
			mlLiteralBody();
			setState(232);
			match(TripleApostrophe);
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

	public static class MlLiteralBodyContext extends ParserRuleContext {
		public List<TerminalNode> StringChar() { return getTokens(TomlParser.StringChar); }
		public TerminalNode StringChar(int i) {
			return getToken(TomlParser.StringChar, i);
		}
		public MlLiteralBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mlLiteralBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterMlLiteralBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitMlLiteralBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitMlLiteralBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MlLiteralBodyContext mlLiteralBody() throws RecognitionException {
		MlLiteralBodyContext _localctx = new MlLiteralBodyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_mlLiteralBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==StringChar) {
				{
				{
				setState(234);
				match(StringChar);
				}
				}
				setState(239);
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

	public static class IntegerContext extends ParserRuleContext {
		public DecIntContext decInt() {
			return getRuleContext(DecIntContext.class,0);
		}
		public HexIntContext hexInt() {
			return getRuleContext(HexIntContext.class,0);
		}
		public OctIntContext octInt() {
			return getRuleContext(OctIntContext.class,0);
		}
		public BinIntContext binInt() {
			return getRuleContext(BinIntContext.class,0);
		}
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_integer);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DecimalInteger:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				decInt();
				}
				break;
			case HexInteger:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				hexInt();
				}
				break;
			case OctalInteger:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				octInt();
				}
				break;
			case BinaryInteger:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				binInt();
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

	public static class DecIntContext extends ParserRuleContext {
		public TerminalNode DecimalInteger() { return getToken(TomlParser.DecimalInteger, 0); }
		public DecIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterDecInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitDecInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitDecInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecIntContext decInt() throws RecognitionException {
		DecIntContext _localctx = new DecIntContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_decInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(DecimalInteger);
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

	public static class HexIntContext extends ParserRuleContext {
		public TerminalNode HexInteger() { return getToken(TomlParser.HexInteger, 0); }
		public HexIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterHexInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitHexInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitHexInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexIntContext hexInt() throws RecognitionException {
		HexIntContext _localctx = new HexIntContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_hexInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(HexInteger);
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

	public static class OctIntContext extends ParserRuleContext {
		public TerminalNode OctalInteger() { return getToken(TomlParser.OctalInteger, 0); }
		public OctIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterOctInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitOctInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitOctInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OctIntContext octInt() throws RecognitionException {
		OctIntContext _localctx = new OctIntContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_octInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(OctalInteger);
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

	public static class BinIntContext extends ParserRuleContext {
		public TerminalNode BinaryInteger() { return getToken(TomlParser.BinaryInteger, 0); }
		public BinIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterBinInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitBinInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitBinInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinIntContext binInt() throws RecognitionException {
		BinIntContext _localctx = new BinIntContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_binInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(BinaryInteger);
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

	public static class FloatValueContext extends ParserRuleContext {
		public RegularFloatContext regularFloat() {
			return getRuleContext(RegularFloatContext.class,0);
		}
		public RegularFloatInfContext regularFloatInf() {
			return getRuleContext(RegularFloatInfContext.class,0);
		}
		public RegularFloatNaNContext regularFloatNaN() {
			return getRuleContext(RegularFloatNaNContext.class,0);
		}
		public FloatValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterFloatValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitFloatValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitFloatValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatValueContext floatValue() throws RecognitionException {
		FloatValueContext _localctx = new FloatValueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_floatValue);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FloatingPoint:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				regularFloat();
				}
				break;
			case FloatingPointInf:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				regularFloatInf();
				}
				break;
			case FloatingPointNaN:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				regularFloatNaN();
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

	public static class RegularFloatContext extends ParserRuleContext {
		public TerminalNode FloatingPoint() { return getToken(TomlParser.FloatingPoint, 0); }
		public RegularFloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFloat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterRegularFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitRegularFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitRegularFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularFloatContext regularFloat() throws RecognitionException {
		RegularFloatContext _localctx = new RegularFloatContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_regularFloat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(FloatingPoint);
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

	public static class RegularFloatInfContext extends ParserRuleContext {
		public TerminalNode FloatingPointInf() { return getToken(TomlParser.FloatingPointInf, 0); }
		public RegularFloatInfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFloatInf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterRegularFloatInf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitRegularFloatInf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitRegularFloatInf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularFloatInfContext regularFloatInf() throws RecognitionException {
		RegularFloatInfContext _localctx = new RegularFloatInfContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_regularFloatInf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(FloatingPointInf);
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

	public static class RegularFloatNaNContext extends ParserRuleContext {
		public TerminalNode FloatingPointNaN() { return getToken(TomlParser.FloatingPointNaN, 0); }
		public RegularFloatNaNContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFloatNaN; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterRegularFloatNaN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitRegularFloatNaN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitRegularFloatNaN(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularFloatNaNContext regularFloatNaN() throws RecognitionException {
		RegularFloatNaNContext _localctx = new RegularFloatNaNContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_regularFloatNaN);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(FloatingPointNaN);
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

	public static class BooleanValueContext extends ParserRuleContext {
		public TrueBoolContext trueBool() {
			return getRuleContext(TrueBoolContext.class,0);
		}
		public FalseBoolContext falseBool() {
			return getRuleContext(FalseBoolContext.class,0);
		}
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_booleanValue);
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TrueBoolean:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				trueBool();
				}
				break;
			case FalseBoolean:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				falseBool();
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

	public static class TrueBoolContext extends ParserRuleContext {
		public TerminalNode TrueBoolean() { return getToken(TomlParser.TrueBoolean, 0); }
		public TrueBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueBool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterTrueBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitTrueBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitTrueBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueBoolContext trueBool() throws RecognitionException {
		TrueBoolContext _localctx = new TrueBoolContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_trueBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(TrueBoolean);
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

	public static class FalseBoolContext extends ParserRuleContext {
		public TerminalNode FalseBoolean() { return getToken(TomlParser.FalseBoolean, 0); }
		public FalseBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_falseBool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterFalseBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitFalseBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitFalseBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FalseBoolContext falseBool() throws RecognitionException {
		FalseBoolContext _localctx = new FalseBoolContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_falseBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(FalseBoolean);
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

	public static class DateTimeContext extends ParserRuleContext {
		public OffsetDateTimeContext offsetDateTime() {
			return getRuleContext(OffsetDateTimeContext.class,0);
		}
		public LocalDateTimeContext localDateTime() {
			return getRuleContext(LocalDateTimeContext.class,0);
		}
		public LocalDateContext localDate() {
			return getRuleContext(LocalDateContext.class,0);
		}
		public LocalTimeContext localTime() {
			return getRuleContext(LocalTimeContext.class,0);
		}
		public DateTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterDateTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitDateTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitDateTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateTimeContext dateTime() throws RecognitionException {
		DateTimeContext _localctx = new DateTimeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_dateTime);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				offsetDateTime();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				localDateTime();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				localDate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				localTime();
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

	public static class OffsetDateTimeContext extends ParserRuleContext {
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public TerminalNode TimeDelimiter() { return getToken(TomlParser.TimeDelimiter, 0); }
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public TimeOffsetContext timeOffset() {
			return getRuleContext(TimeOffsetContext.class,0);
		}
		public OffsetDateTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offsetDateTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterOffsetDateTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitOffsetDateTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitOffsetDateTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetDateTimeContext offsetDateTime() throws RecognitionException {
		OffsetDateTimeContext _localctx = new OffsetDateTimeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_offsetDateTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			date();
			setState(280);
			match(TimeDelimiter);
			setState(281);
			time();
			setState(282);
			timeOffset();
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

	public static class LocalDateTimeContext extends ParserRuleContext {
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public TerminalNode TimeDelimiter() { return getToken(TomlParser.TimeDelimiter, 0); }
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public LocalDateTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDateTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterLocalDateTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitLocalDateTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitLocalDateTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalDateTimeContext localDateTime() throws RecognitionException {
		LocalDateTimeContext _localctx = new LocalDateTimeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_localDateTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			date();
			setState(285);
			match(TimeDelimiter);
			setState(286);
			time();
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

	public static class LocalDateContext extends ParserRuleContext {
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public LocalDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterLocalDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitLocalDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitLocalDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalDateContext localDate() throws RecognitionException {
		LocalDateContext _localctx = new LocalDateContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_localDate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			date();
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

	public static class LocalTimeContext extends ParserRuleContext {
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public LocalTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterLocalTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitLocalTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitLocalTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalTimeContext localTime() throws RecognitionException {
		LocalTimeContext _localctx = new LocalTimeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_localTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			time();
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

	public static class DateContext extends ParserRuleContext {
		public YearContext year() {
			return getRuleContext(YearContext.class,0);
		}
		public List<TerminalNode> Dash() { return getTokens(TomlParser.Dash); }
		public TerminalNode Dash(int i) {
			return getToken(TomlParser.Dash, i);
		}
		public MonthContext month() {
			return getRuleContext(MonthContext.class,0);
		}
		public DayContext day() {
			return getRuleContext(DayContext.class,0);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			year();
			setState(293);
			match(Dash);
			setState(294);
			month();
			setState(295);
			match(Dash);
			setState(296);
			day();
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

	public static class TimeContext extends ParserRuleContext {
		public HourContext hour() {
			return getRuleContext(HourContext.class,0);
		}
		public List<TerminalNode> Colon() { return getTokens(TomlParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(TomlParser.Colon, i);
		}
		public MinuteContext minute() {
			return getRuleContext(MinuteContext.class,0);
		}
		public SecondContext second() {
			return getRuleContext(SecondContext.class,0);
		}
		public TerminalNode Dot() { return getToken(TomlParser.Dot, 0); }
		public SecondFractionContext secondFraction() {
			return getRuleContext(SecondFractionContext.class,0);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_time);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			hour();
			setState(299);
			match(Colon);
			setState(300);
			minute();
			setState(301);
			match(Colon);
			setState(302);
			second();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Dot) {
				{
				setState(303);
				match(Dot);
				setState(304);
				secondFraction();
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

	public static class TimeOffsetContext extends ParserRuleContext {
		public TerminalNode Z() { return getToken(TomlParser.Z, 0); }
		public HourOffsetContext hourOffset() {
			return getRuleContext(HourOffsetContext.class,0);
		}
		public TerminalNode Colon() { return getToken(TomlParser.Colon, 0); }
		public MinuteOffsetContext minuteOffset() {
			return getRuleContext(MinuteOffsetContext.class,0);
		}
		public TimeOffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeOffset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterTimeOffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitTimeOffset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitTimeOffset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeOffsetContext timeOffset() throws RecognitionException {
		TimeOffsetContext _localctx = new TimeOffsetContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_timeOffset);
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Z:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(Z);
				}
				break;
			case Dash:
			case Plus:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				hourOffset();
				setState(309);
				match(Colon);
				setState(310);
				minuteOffset();
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

	public static class HourOffsetContext extends ParserRuleContext {
		public HourContext hour() {
			return getRuleContext(HourContext.class,0);
		}
		public TerminalNode Dash() { return getToken(TomlParser.Dash, 0); }
		public TerminalNode Plus() { return getToken(TomlParser.Plus, 0); }
		public HourOffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hourOffset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterHourOffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitHourOffset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitHourOffset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HourOffsetContext hourOffset() throws RecognitionException {
		HourOffsetContext _localctx = new HourOffsetContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_hourOffset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_la = _input.LA(1);
			if ( !(_la==Dash || _la==Plus) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(315);
			hour();
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

	public static class MinuteOffsetContext extends ParserRuleContext {
		public TerminalNode DateDigits() { return getToken(TomlParser.DateDigits, 0); }
		public MinuteOffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minuteOffset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterMinuteOffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitMinuteOffset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitMinuteOffset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinuteOffsetContext minuteOffset() throws RecognitionException {
		MinuteOffsetContext _localctx = new MinuteOffsetContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_minuteOffset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(DateDigits);
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

	public static class SecondFractionContext extends ParserRuleContext {
		public TerminalNode DateDigits() { return getToken(TomlParser.DateDigits, 0); }
		public SecondFractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondFraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterSecondFraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitSecondFraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitSecondFraction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecondFractionContext secondFraction() throws RecognitionException {
		SecondFractionContext _localctx = new SecondFractionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_secondFraction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(DateDigits);
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

	public static class YearContext extends ParserRuleContext {
		public TerminalNode DateDigits() { return getToken(TomlParser.DateDigits, 0); }
		public YearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_year; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterYear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitYear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitYear(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YearContext year() throws RecognitionException {
		YearContext _localctx = new YearContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_year);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(DateDigits);
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

	public static class MonthContext extends ParserRuleContext {
		public TerminalNode DateDigits() { return getToken(TomlParser.DateDigits, 0); }
		public MonthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_month; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterMonth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitMonth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitMonth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MonthContext month() throws RecognitionException {
		MonthContext _localctx = new MonthContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_month);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(DateDigits);
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

	public static class DayContext extends ParserRuleContext {
		public TerminalNode DateDigits() { return getToken(TomlParser.DateDigits, 0); }
		public DayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_day; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterDay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitDay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitDay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DayContext day() throws RecognitionException {
		DayContext _localctx = new DayContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_day);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(DateDigits);
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

	public static class HourContext extends ParserRuleContext {
		public TerminalNode DateDigits() { return getToken(TomlParser.DateDigits, 0); }
		public HourContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hour; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterHour(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitHour(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitHour(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HourContext hour() throws RecognitionException {
		HourContext _localctx = new HourContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_hour);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(DateDigits);
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

	public static class MinuteContext extends ParserRuleContext {
		public TerminalNode DateDigits() { return getToken(TomlParser.DateDigits, 0); }
		public MinuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterMinute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitMinute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitMinute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinuteContext minute() throws RecognitionException {
		MinuteContext _localctx = new MinuteContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_minute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(DateDigits);
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

	public static class SecondContext extends ParserRuleContext {
		public TerminalNode DateDigits() { return getToken(TomlParser.DateDigits, 0); }
		public SecondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_second; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterSecond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitSecond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitSecond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecondContext second() throws RecognitionException {
		SecondContext _localctx = new SecondContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_second);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(DateDigits);
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode ArrayStart() { return getToken(TomlParser.ArrayStart, 0); }
		public TerminalNode ArrayEnd() { return getToken(TomlParser.ArrayEnd, 0); }
		public ArrayValuesContext arrayValues() {
			return getRuleContext(ArrayValuesContext.class,0);
		}
		public List<TerminalNode> NewLine() { return getTokens(TomlParser.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(TomlParser.NewLine, i);
		}
		public TerminalNode Comma() { return getToken(TomlParser.Comma, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(ArrayStart);
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(334);
				arrayValues();
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(335);
						match(NewLine);
						}
						} 
					}
					setState(340);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(341);
					match(Comma);
					}
				}

				}
				break;
			}
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(346);
				match(NewLine);
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(352);
			match(ArrayEnd);
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

	public static class ArrayValuesContext extends ParserRuleContext {
		public List<ArrayValueContext> arrayValue() {
			return getRuleContexts(ArrayValueContext.class);
		}
		public ArrayValueContext arrayValue(int i) {
			return getRuleContext(ArrayValueContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TomlParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TomlParser.Comma, i);
		}
		public List<TerminalNode> NewLine() { return getTokens(TomlParser.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(TomlParser.NewLine, i);
		}
		public ArrayValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterArrayValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitArrayValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitArrayValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayValuesContext arrayValues() throws RecognitionException {
		ArrayValuesContext _localctx = new ArrayValuesContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_arrayValues);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			arrayValue();
			setState(365);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(358);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NewLine) {
						{
						{
						setState(355);
						match(NewLine);
						}
						}
						setState(360);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(361);
					match(Comma);
					setState(362);
					arrayValue();
					}
					} 
				}
				setState(367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class ArrayValueContext extends ParserRuleContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public List<TerminalNode> NewLine() { return getTokens(TomlParser.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(TomlParser.NewLine, i);
		}
		public ArrayValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterArrayValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitArrayValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitArrayValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayValueContext arrayValue() throws RecognitionException {
		ArrayValueContext _localctx = new ArrayValueContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_arrayValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(368);
				match(NewLine);
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(374);
			val();
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

	public static class TableContext extends ParserRuleContext {
		public StandardTableContext standardTable() {
			return getRuleContext(StandardTableContext.class,0);
		}
		public ArrayTableContext arrayTable() {
			return getRuleContext(ArrayTableContext.class,0);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_table);
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TableKeyStart:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				standardTable();
				}
				break;
			case ArrayTableKeyStart:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				arrayTable();
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

	public static class StandardTableContext extends ParserRuleContext {
		public TerminalNode TableKeyStart() { return getToken(TomlParser.TableKeyStart, 0); }
		public TerminalNode TableKeyEnd() { return getToken(TomlParser.TableKeyEnd, 0); }
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public StandardTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standardTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterStandardTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitStandardTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitStandardTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandardTableContext standardTable() throws RecognitionException {
		StandardTableContext _localctx = new StandardTableContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_standardTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(TableKeyStart);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QuotationMark) | (1L << Apostrophe) | (1L << UnquotedKey))) != 0)) {
				{
				setState(381);
				key();
				}
			}

			setState(384);
			match(TableKeyEnd);
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

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode InlineTableStart() { return getToken(TomlParser.InlineTableStart, 0); }
		public TerminalNode InlineTableEnd() { return getToken(TomlParser.InlineTableEnd, 0); }
		public InlineTableValuesContext inlineTableValues() {
			return getRuleContext(InlineTableValuesContext.class,0);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_inlineTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(InlineTableStart);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QuotationMark) | (1L << Apostrophe) | (1L << UnquotedKey))) != 0)) {
				{
				setState(387);
				inlineTableValues();
				}
			}

			setState(390);
			match(InlineTableEnd);
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

	public static class InlineTableValuesContext extends ParserRuleContext {
		public List<KeyvalContext> keyval() {
			return getRuleContexts(KeyvalContext.class);
		}
		public KeyvalContext keyval(int i) {
			return getRuleContext(KeyvalContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TomlParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TomlParser.Comma, i);
		}
		public InlineTableValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTableValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterInlineTableValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitInlineTableValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitInlineTableValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableValuesContext inlineTableValues() throws RecognitionException {
		InlineTableValuesContext _localctx = new InlineTableValuesContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_inlineTableValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			keyval();
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(393);
				match(Comma);
				setState(394);
				keyval();
				}
				}
				setState(399);
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

	public static class ArrayTableContext extends ParserRuleContext {
		public TerminalNode ArrayTableKeyStart() { return getToken(TomlParser.ArrayTableKeyStart, 0); }
		public TerminalNode ArrayTableKeyEnd() { return getToken(TomlParser.ArrayTableKeyEnd, 0); }
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public ArrayTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).enterArrayTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlParserListener ) ((TomlParserListener)listener).exitArrayTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TomlParserVisitor ) return ((TomlParserVisitor<? extends T>)visitor).visitArrayTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTableContext arrayTable() throws RecognitionException {
		ArrayTableContext _localctx = new ArrayTableContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_arrayTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(ArrayTableKeyStart);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QuotationMark) | (1L << Apostrophe) | (1L << UnquotedKey))) != 0)) {
				{
				setState(401);
				key();
				}
			}

			setState(404);
			match(ArrayTableKeyEnd);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u0199\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\7\2x\n\2"+
		"\f\2\16\2{\13\2\3\2\3\2\6\2\177\n\2\r\2\16\2\u0080\3\2\7\2\u0084\n\2\f"+
		"\2\16\2\u0087\13\2\3\2\7\2\u008a\n\2\f\2\16\2\u008d\13\2\5\2\u008f\n\2"+
		"\3\2\3\2\3\3\3\3\5\3\u0095\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\7\6\u00a1\n\6\f\6\16\6\u00a4\13\6\3\7\3\7\5\7\u00a8\n\7\3\b\3\b\3\t\3"+
		"\t\5\t\u00ae\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b7\n\n\3\13\3\13\3"+
		"\13\3\13\5\13\u00bd\n\13\3\f\3\f\7\f\u00c1\n\f\f\f\16\f\u00c4\13\f\3\f"+
		"\3\f\3\r\3\r\5\r\u00ca\n\r\3\16\3\16\3\17\3\17\3\20\3\20\7\20\u00d2\n"+
		"\20\f\20\16\20\u00d5\13\20\3\20\3\20\3\21\3\21\5\21\u00db\n\21\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\24\7\24\u00e4\n\24\f\24\16\24\u00e7\13\24\3"+
		"\25\3\25\3\25\3\25\3\26\7\26\u00ee\n\26\f\26\16\26\u00f1\13\26\3\27\3"+
		"\27\3\27\3\27\5\27\u00f7\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\34\5\34\u0104\n\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \5"+
		" \u010e\n \3!\3!\3\"\3\"\3#\3#\3#\3#\5#\u0118\n#\3$\3$\3$\3$\3$\3%\3%"+
		"\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\5)\u0134\n"+
		")\3*\3*\3*\3*\3*\5*\u013b\n*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\7\64\u0153\n\64\f\64\16"+
		"\64\u0156\13\64\3\64\5\64\u0159\n\64\5\64\u015b\n\64\3\64\7\64\u015e\n"+
		"\64\f\64\16\64\u0161\13\64\3\64\3\64\3\65\3\65\7\65\u0167\n\65\f\65\16"+
		"\65\u016a\13\65\3\65\3\65\7\65\u016e\n\65\f\65\16\65\u0171\13\65\3\66"+
		"\7\66\u0174\n\66\f\66\16\66\u0177\13\66\3\66\3\66\3\67\3\67\5\67\u017d"+
		"\n\67\38\38\58\u0181\n8\38\38\39\39\59\u0187\n9\39\39\3:\3:\3:\7:\u018e"+
		"\n:\f:\16:\u0191\13:\3;\3;\5;\u0195\n;\3;\3;\3;\2\2<\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprt\2\3\3\2!\"\2\u018d\2y\3\2\2\2\4\u0094\3\2\2\2\6\u0096\3\2\2\2\b"+
		"\u0099\3\2\2\2\n\u009d\3\2\2\2\f\u00a7\3\2\2\2\16\u00a9\3\2\2\2\20\u00ad"+
		"\3\2\2\2\22\u00b6\3\2\2\2\24\u00bc\3\2\2\2\26\u00be\3\2\2\2\30\u00c9\3"+
		"\2\2\2\32\u00cb\3\2\2\2\34\u00cd\3\2\2\2\36\u00cf\3\2\2\2 \u00da\3\2\2"+
		"\2\"\u00dc\3\2\2\2$\u00de\3\2\2\2&\u00e5\3\2\2\2(\u00e8\3\2\2\2*\u00ef"+
		"\3\2\2\2,\u00f6\3\2\2\2.\u00f8\3\2\2\2\60\u00fa\3\2\2\2\62\u00fc\3\2\2"+
		"\2\64\u00fe\3\2\2\2\66\u0103\3\2\2\28\u0105\3\2\2\2:\u0107\3\2\2\2<\u0109"+
		"\3\2\2\2>\u010d\3\2\2\2@\u010f\3\2\2\2B\u0111\3\2\2\2D\u0117\3\2\2\2F"+
		"\u0119\3\2\2\2H\u011e\3\2\2\2J\u0122\3\2\2\2L\u0124\3\2\2\2N\u0126\3\2"+
		"\2\2P\u012c\3\2\2\2R\u013a\3\2\2\2T\u013c\3\2\2\2V\u013f\3\2\2\2X\u0141"+
		"\3\2\2\2Z\u0143\3\2\2\2\\\u0145\3\2\2\2^\u0147\3\2\2\2`\u0149\3\2\2\2"+
		"b\u014b\3\2\2\2d\u014d\3\2\2\2f\u014f\3\2\2\2h\u0164\3\2\2\2j\u0175\3"+
		"\2\2\2l\u017c\3\2\2\2n\u017e\3\2\2\2p\u0184\3\2\2\2r\u018a\3\2\2\2t\u0192"+
		"\3\2\2\2vx\7\22\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\u008e\3\2"+
		"\2\2{y\3\2\2\2|\u0085\5\4\3\2}\177\7\22\2\2~}\3\2\2\2\177\u0080\3\2\2"+
		"\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084"+
		"\5\4\3\2\u0083~\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u008b\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a\7\22"+
		"\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008e|\3\2\2\2"+
		"\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\2\2\3\u0091\3\3"+
		"\2\2\2\u0092\u0095\5\b\5\2\u0093\u0095\5l\67\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0093\3\2\2\2\u0095\5\3\2\2\2\u0096\u0097\5\n\6\2\u0097\u0098\7\2\2\3"+
		"\u0098\7\3\2\2\2\u0099\u009a\5\n\6\2\u009a\u009b\7\b\2\2\u009b\u009c\5"+
		"\22\n\2\u009c\t\3\2\2\2\u009d\u00a2\5\f\7\2\u009e\u009f\7\7\2\2\u009f"+
		"\u00a1\5\f\7\2\u00a0\u009e\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\13\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a8"+
		"\5\20\t\2\u00a6\u00a8\5\16\b\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2"+
		"\u00a8\r\3\2\2\2\u00a9\u00aa\7\17\2\2\u00aa\17\3\2\2\2\u00ab\u00ae\5\26"+
		"\f\2\u00ac\u00ae\5$\23\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\21\3\2\2\2\u00af\u00b7\5\24\13\2\u00b0\u00b7\5,\27\2\u00b1\u00b7\5\66"+
		"\34\2\u00b2\u00b7\5> \2\u00b3\u00b7\5D#\2\u00b4\u00b7\5f\64\2\u00b5\u00b7"+
		"\5p9\2\u00b6\u00af\3\2\2\2\u00b6\u00b0\3\2\2\2\u00b6\u00b1\3\2\2\2\u00b6"+
		"\u00b2\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2"+
		"\2\2\u00b7\23\3\2\2\2\u00b8\u00bd\5\36\20\2\u00b9\u00bd\5\26\f\2\u00ba"+
		"\u00bd\5(\25\2\u00bb\u00bd\5$\23\2\u00bc\u00b8\3\2\2\2\u00bc\u00b9\3\2"+
		"\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\25\3\2\2\2\u00be\u00c2"+
		"\7\t\2\2\u00bf\u00c1\5\30\r\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2"+
		"\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c5\u00c6\7\t\2\2\u00c6\27\3\2\2\2\u00c7\u00ca\5\32\16\2\u00c8"+
		"\u00ca\5\34\17\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\31\3\2"+
		"\2\2\u00cb\u00cc\7\5\2\2\u00cc\33\3\2\2\2\u00cd\u00ce\7 \2\2\u00ce\35"+
		"\3\2\2\2\u00cf\u00d3\7\3\2\2\u00d0\u00d2\5 \21\2\u00d1\u00d0\3\2\2\2\u00d2"+
		"\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2"+
		"\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\7\3\2\2\u00d7\37\3\2\2\2\u00d8\u00db"+
		"\5\"\22\2\u00d9\u00db\5\34\17\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2"+
		"\2\u00db!\3\2\2\2\u00dc\u00dd\7\5\2\2\u00dd#\3\2\2\2\u00de\u00df\7\n\2"+
		"\2\u00df\u00e0\5&\24\2\u00e0\u00e1\7\n\2\2\u00e1%\3\2\2\2\u00e2\u00e4"+
		"\7\5\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\'\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7\4\2\2"+
		"\u00e9\u00ea\5*\26\2\u00ea\u00eb\7\4\2\2\u00eb)\3\2\2\2\u00ec\u00ee\7"+
		"\5\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0+\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f7\5.\30\2"+
		"\u00f3\u00f7\5\60\31\2\u00f4\u00f7\5\62\32\2\u00f5\u00f7\5\64\33\2\u00f6"+
		"\u00f2\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2"+
		"\2\2\u00f7-\3\2\2\2\u00f8\u00f9\7\24\2\2\u00f9/\3\2\2\2\u00fa\u00fb\7"+
		"\25\2\2\u00fb\61\3\2\2\2\u00fc\u00fd\7\26\2\2\u00fd\63\3\2\2\2\u00fe\u00ff"+
		"\7\27\2\2\u00ff\65\3\2\2\2\u0100\u0104\58\35\2\u0101\u0104\5:\36\2\u0102"+
		"\u0104\5<\37\2\u0103\u0100\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2"+
		"\2\2\u0104\67\3\2\2\2\u0105\u0106\7\30\2\2\u01069\3\2\2\2\u0107\u0108"+
		"\7\31\2\2\u0108;\3\2\2\2\u0109\u010a\7\32\2\2\u010a=\3\2\2\2\u010b\u010e"+
		"\5@!\2\u010c\u010e\5B\"\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e"+
		"?\3\2\2\2\u010f\u0110\7\33\2\2\u0110A\3\2\2\2\u0111\u0112\7\34\2\2\u0112"+
		"C\3\2\2\2\u0113\u0118\5F$\2\u0114\u0118\5H%\2\u0115\u0118\5J&\2\u0116"+
		"\u0118\5L\'\2\u0117\u0113\3\2\2\2\u0117\u0114\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0117\u0116\3\2\2\2\u0118E\3\2\2\2\u0119\u011a\5N(\2\u011a\u011b"+
		"\7%\2\2\u011b\u011c\5P)\2\u011c\u011d\5R*\2\u011dG\3\2\2\2\u011e\u011f"+
		"\5N(\2\u011f\u0120\7%\2\2\u0120\u0121\5P)\2\u0121I\3\2\2\2\u0122\u0123"+
		"\5N(\2\u0123K\3\2\2\2\u0124\u0125\5P)\2\u0125M\3\2\2\2\u0126\u0127\5Z"+
		".\2\u0127\u0128\7!\2\2\u0128\u0129\5\\/\2\u0129\u012a\7!\2\2\u012a\u012b"+
		"\5^\60\2\u012bO\3\2\2\2\u012c\u012d\5`\61\2\u012d\u012e\7#\2\2\u012e\u012f"+
		"\5b\62\2\u012f\u0130\7#\2\2\u0130\u0133\5d\63\2\u0131\u0132\7\7\2\2\u0132"+
		"\u0134\5X-\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134Q\3\2\2\2\u0135"+
		"\u013b\7$\2\2\u0136\u0137\5T+\2\u0137\u0138\7#\2\2\u0138\u0139\5V,\2\u0139"+
		"\u013b\3\2\2\2\u013a\u0135\3\2\2\2\u013a\u0136\3\2\2\2\u013bS\3\2\2\2"+
		"\u013c\u013d\t\2\2\2\u013d\u013e\5`\61\2\u013eU\3\2\2\2\u013f\u0140\7"+
		"&\2\2\u0140W\3\2\2\2\u0141\u0142\7&\2\2\u0142Y\3\2\2\2\u0143\u0144\7&"+
		"\2\2\u0144[\3\2\2\2\u0145\u0146\7&\2\2\u0146]\3\2\2\2\u0147\u0148\7&\2"+
		"\2\u0148_\3\2\2\2\u0149\u014a\7&\2\2\u014aa\3\2\2\2\u014b\u014c\7&\2\2"+
		"\u014cc\3\2\2\2\u014d\u014e\7&\2\2\u014ee\3\2\2\2\u014f\u015a\7\35\2\2"+
		"\u0150\u0154\5h\65\2\u0151\u0153\7\22\2\2\u0152\u0151\3\2\2\2\u0153\u0156"+
		"\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0158\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0157\u0159\7\6\2\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2"+
		"\2\2\u0159\u015b\3\2\2\2\u015a\u0150\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015f\3\2\2\2\u015c\u015e\7\22\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3"+
		"\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0162\u0163\7\36\2\2\u0163g\3\2\2\2\u0164\u016f\5j\66\2"+
		"\u0165\u0167\7\22\2\2\u0166\u0165\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166"+
		"\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016b"+
		"\u016c\7\6\2\2\u016c\u016e\5j\66\2\u016d\u0168\3\2\2\2\u016e\u0171\3\2"+
		"\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170i\3\2\2\2\u0171\u016f"+
		"\3\2\2\2\u0172\u0174\7\22\2\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2"+
		"\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0175"+
		"\3\2\2\2\u0178\u0179\5\22\n\2\u0179k\3\2\2\2\u017a\u017d\5n8\2\u017b\u017d"+
		"\5t;\2\u017c\u017a\3\2\2\2\u017c\u017b\3\2\2\2\u017dm\3\2\2\2\u017e\u0180"+
		"\7\13\2\2\u017f\u0181\5\n\6\2\u0180\u017f\3\2\2\2\u0180\u0181\3\2\2\2"+
		"\u0181\u0182\3\2\2\2\u0182\u0183\7\f\2\2\u0183o\3\2\2\2\u0184\u0186\7"+
		"\37\2\2\u0185\u0187\5r:\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u0188\3\2\2\2\u0188\u0189\7\'\2\2\u0189q\3\2\2\2\u018a\u018f\5\b\5\2"+
		"\u018b\u018c\7\6\2\2\u018c\u018e\5\b\5\2\u018d\u018b\3\2\2\2\u018e\u0191"+
		"\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190s\3\2\2\2\u0191"+
		"\u018f\3\2\2\2\u0192\u0194\7\r\2\2\u0193\u0195\5\n\6\2\u0194\u0193\3\2"+
		"\2\2\u0194\u0195\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\7\16\2\2\u0197"+
		"u\3\2\2\2%y\u0080\u0085\u008b\u008e\u0094\u00a2\u00a7\u00ad\u00b6\u00bc"+
		"\u00c2\u00c9\u00d3\u00da\u00e5\u00ef\u00f6\u0103\u010d\u0117\u0133\u013a"+
		"\u0154\u0158\u015a\u015f\u0168\u016f\u0175\u017c\u0180\u0186\u018f\u0194";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}