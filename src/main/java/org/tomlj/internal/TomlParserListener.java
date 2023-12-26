// Generated from org\tomlj\internal\TomlParser.g4 by ANTLR 4.9.1

package org.tomlj.internal;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TomlParser}.
 */
public interface TomlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TomlParser#toml}.
	 * @param ctx the parse tree
	 */
	void enterToml(TomlParser.TomlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#toml}.
	 * @param ctx the parse tree
	 */
	void exitToml(TomlParser.TomlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TomlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TomlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#tomlKey}.
	 * @param ctx the parse tree
	 */
	void enterTomlKey(TomlParser.TomlKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#tomlKey}.
	 * @param ctx the parse tree
	 */
	void exitTomlKey(TomlParser.TomlKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#keyval}.
	 * @param ctx the parse tree
	 */
	void enterKeyval(TomlParser.KeyvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#keyval}.
	 * @param ctx the parse tree
	 */
	void exitKeyval(TomlParser.KeyvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(TomlParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(TomlParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#simpleKey}.
	 * @param ctx the parse tree
	 */
	void enterSimpleKey(TomlParser.SimpleKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#simpleKey}.
	 * @param ctx the parse tree
	 */
	void exitSimpleKey(TomlParser.SimpleKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#unquotedKey}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedKey(TomlParser.UnquotedKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#unquotedKey}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedKey(TomlParser.UnquotedKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#quotedKey}.
	 * @param ctx the parse tree
	 */
	void enterQuotedKey(TomlParser.QuotedKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#quotedKey}.
	 * @param ctx the parse tree
	 */
	void exitQuotedKey(TomlParser.QuotedKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(TomlParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(TomlParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(TomlParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(TomlParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#basicString}.
	 * @param ctx the parse tree
	 */
	void enterBasicString(TomlParser.BasicStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#basicString}.
	 * @param ctx the parse tree
	 */
	void exitBasicString(TomlParser.BasicStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#basicChar}.
	 * @param ctx the parse tree
	 */
	void enterBasicChar(TomlParser.BasicCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#basicChar}.
	 * @param ctx the parse tree
	 */
	void exitBasicChar(TomlParser.BasicCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#basicUnescaped}.
	 * @param ctx the parse tree
	 */
	void enterBasicUnescaped(TomlParser.BasicUnescapedContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#basicUnescaped}.
	 * @param ctx the parse tree
	 */
	void exitBasicUnescaped(TomlParser.BasicUnescapedContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#escaped}.
	 * @param ctx the parse tree
	 */
	void enterEscaped(TomlParser.EscapedContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#escaped}.
	 * @param ctx the parse tree
	 */
	void exitEscaped(TomlParser.EscapedContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#mlBasicString}.
	 * @param ctx the parse tree
	 */
	void enterMlBasicString(TomlParser.MlBasicStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#mlBasicString}.
	 * @param ctx the parse tree
	 */
	void exitMlBasicString(TomlParser.MlBasicStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#mlBasicChar}.
	 * @param ctx the parse tree
	 */
	void enterMlBasicChar(TomlParser.MlBasicCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#mlBasicChar}.
	 * @param ctx the parse tree
	 */
	void exitMlBasicChar(TomlParser.MlBasicCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#mlBasicUnescaped}.
	 * @param ctx the parse tree
	 */
	void enterMlBasicUnescaped(TomlParser.MlBasicUnescapedContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#mlBasicUnescaped}.
	 * @param ctx the parse tree
	 */
	void exitMlBasicUnescaped(TomlParser.MlBasicUnescapedContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#literalString}.
	 * @param ctx the parse tree
	 */
	void enterLiteralString(TomlParser.LiteralStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#literalString}.
	 * @param ctx the parse tree
	 */
	void exitLiteralString(TomlParser.LiteralStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#literalBody}.
	 * @param ctx the parse tree
	 */
	void enterLiteralBody(TomlParser.LiteralBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#literalBody}.
	 * @param ctx the parse tree
	 */
	void exitLiteralBody(TomlParser.LiteralBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#mlLiteralString}.
	 * @param ctx the parse tree
	 */
	void enterMlLiteralString(TomlParser.MlLiteralStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#mlLiteralString}.
	 * @param ctx the parse tree
	 */
	void exitMlLiteralString(TomlParser.MlLiteralStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#mlLiteralBody}.
	 * @param ctx the parse tree
	 */
	void enterMlLiteralBody(TomlParser.MlLiteralBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#mlLiteralBody}.
	 * @param ctx the parse tree
	 */
	void exitMlLiteralBody(TomlParser.MlLiteralBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(TomlParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(TomlParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#decInt}.
	 * @param ctx the parse tree
	 */
	void enterDecInt(TomlParser.DecIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#decInt}.
	 * @param ctx the parse tree
	 */
	void exitDecInt(TomlParser.DecIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#hexInt}.
	 * @param ctx the parse tree
	 */
	void enterHexInt(TomlParser.HexIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#hexInt}.
	 * @param ctx the parse tree
	 */
	void exitHexInt(TomlParser.HexIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#octInt}.
	 * @param ctx the parse tree
	 */
	void enterOctInt(TomlParser.OctIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#octInt}.
	 * @param ctx the parse tree
	 */
	void exitOctInt(TomlParser.OctIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#binInt}.
	 * @param ctx the parse tree
	 */
	void enterBinInt(TomlParser.BinIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#binInt}.
	 * @param ctx the parse tree
	 */
	void exitBinInt(TomlParser.BinIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#floatValue}.
	 * @param ctx the parse tree
	 */
	void enterFloatValue(TomlParser.FloatValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#floatValue}.
	 * @param ctx the parse tree
	 */
	void exitFloatValue(TomlParser.FloatValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#regularFloat}.
	 * @param ctx the parse tree
	 */
	void enterRegularFloat(TomlParser.RegularFloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#regularFloat}.
	 * @param ctx the parse tree
	 */
	void exitRegularFloat(TomlParser.RegularFloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#regularFloatInf}.
	 * @param ctx the parse tree
	 */
	void enterRegularFloatInf(TomlParser.RegularFloatInfContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#regularFloatInf}.
	 * @param ctx the parse tree
	 */
	void exitRegularFloatInf(TomlParser.RegularFloatInfContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#regularFloatNaN}.
	 * @param ctx the parse tree
	 */
	void enterRegularFloatNaN(TomlParser.RegularFloatNaNContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#regularFloatNaN}.
	 * @param ctx the parse tree
	 */
	void exitRegularFloatNaN(TomlParser.RegularFloatNaNContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(TomlParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(TomlParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#trueBool}.
	 * @param ctx the parse tree
	 */
	void enterTrueBool(TomlParser.TrueBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#trueBool}.
	 * @param ctx the parse tree
	 */
	void exitTrueBool(TomlParser.TrueBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#falseBool}.
	 * @param ctx the parse tree
	 */
	void enterFalseBool(TomlParser.FalseBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#falseBool}.
	 * @param ctx the parse tree
	 */
	void exitFalseBool(TomlParser.FalseBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#dateTime}.
	 * @param ctx the parse tree
	 */
	void enterDateTime(TomlParser.DateTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#dateTime}.
	 * @param ctx the parse tree
	 */
	void exitDateTime(TomlParser.DateTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#offsetDateTime}.
	 * @param ctx the parse tree
	 */
	void enterOffsetDateTime(TomlParser.OffsetDateTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#offsetDateTime}.
	 * @param ctx the parse tree
	 */
	void exitOffsetDateTime(TomlParser.OffsetDateTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#localDateTime}.
	 * @param ctx the parse tree
	 */
	void enterLocalDateTime(TomlParser.LocalDateTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#localDateTime}.
	 * @param ctx the parse tree
	 */
	void exitLocalDateTime(TomlParser.LocalDateTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#localDate}.
	 * @param ctx the parse tree
	 */
	void enterLocalDate(TomlParser.LocalDateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#localDate}.
	 * @param ctx the parse tree
	 */
	void exitLocalDate(TomlParser.LocalDateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#localTime}.
	 * @param ctx the parse tree
	 */
	void enterLocalTime(TomlParser.LocalTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#localTime}.
	 * @param ctx the parse tree
	 */
	void exitLocalTime(TomlParser.LocalTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(TomlParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(TomlParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(TomlParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(TomlParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#timeOffset}.
	 * @param ctx the parse tree
	 */
	void enterTimeOffset(TomlParser.TimeOffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#timeOffset}.
	 * @param ctx the parse tree
	 */
	void exitTimeOffset(TomlParser.TimeOffsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#hourOffset}.
	 * @param ctx the parse tree
	 */
	void enterHourOffset(TomlParser.HourOffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#hourOffset}.
	 * @param ctx the parse tree
	 */
	void exitHourOffset(TomlParser.HourOffsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#minuteOffset}.
	 * @param ctx the parse tree
	 */
	void enterMinuteOffset(TomlParser.MinuteOffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#minuteOffset}.
	 * @param ctx the parse tree
	 */
	void exitMinuteOffset(TomlParser.MinuteOffsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#secondFraction}.
	 * @param ctx the parse tree
	 */
	void enterSecondFraction(TomlParser.SecondFractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#secondFraction}.
	 * @param ctx the parse tree
	 */
	void exitSecondFraction(TomlParser.SecondFractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#year}.
	 * @param ctx the parse tree
	 */
	void enterYear(TomlParser.YearContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#year}.
	 * @param ctx the parse tree
	 */
	void exitYear(TomlParser.YearContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#month}.
	 * @param ctx the parse tree
	 */
	void enterMonth(TomlParser.MonthContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#month}.
	 * @param ctx the parse tree
	 */
	void exitMonth(TomlParser.MonthContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#day}.
	 * @param ctx the parse tree
	 */
	void enterDay(TomlParser.DayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#day}.
	 * @param ctx the parse tree
	 */
	void exitDay(TomlParser.DayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#hour}.
	 * @param ctx the parse tree
	 */
	void enterHour(TomlParser.HourContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#hour}.
	 * @param ctx the parse tree
	 */
	void exitHour(TomlParser.HourContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#minute}.
	 * @param ctx the parse tree
	 */
	void enterMinute(TomlParser.MinuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#minute}.
	 * @param ctx the parse tree
	 */
	void exitMinute(TomlParser.MinuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#second}.
	 * @param ctx the parse tree
	 */
	void enterSecond(TomlParser.SecondContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#second}.
	 * @param ctx the parse tree
	 */
	void exitSecond(TomlParser.SecondContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(TomlParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(TomlParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#arrayValues}.
	 * @param ctx the parse tree
	 */
	void enterArrayValues(TomlParser.ArrayValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#arrayValues}.
	 * @param ctx the parse tree
	 */
	void exitArrayValues(TomlParser.ArrayValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#arrayValue}.
	 * @param ctx the parse tree
	 */
	void enterArrayValue(TomlParser.ArrayValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#arrayValue}.
	 * @param ctx the parse tree
	 */
	void exitArrayValue(TomlParser.ArrayValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(TomlParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(TomlParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#standardTable}.
	 * @param ctx the parse tree
	 */
	void enterStandardTable(TomlParser.StandardTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#standardTable}.
	 * @param ctx the parse tree
	 */
	void exitStandardTable(TomlParser.StandardTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void enterInlineTable(TomlParser.InlineTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void exitInlineTable(TomlParser.InlineTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#inlineTableValues}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableValues(TomlParser.InlineTableValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#inlineTableValues}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableValues(TomlParser.InlineTableValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TomlParser#arrayTable}.
	 * @param ctx the parse tree
	 */
	void enterArrayTable(TomlParser.ArrayTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TomlParser#arrayTable}.
	 * @param ctx the parse tree
	 */
	void exitArrayTable(TomlParser.ArrayTableContext ctx);
}