// Generated from org\tomlj\internal\TomlParser.g4 by ANTLR 4.9.1

package org.tomlj.internal;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TomlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TomlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TomlParser#toml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToml(TomlParser.TomlContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TomlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#tomlKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTomlKey(TomlParser.TomlKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#keyval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyval(TomlParser.KeyvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(TomlParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#simpleKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleKey(TomlParser.SimpleKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#unquotedKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedKey(TomlParser.UnquotedKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#quotedKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedKey(TomlParser.QuotedKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(TomlParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(TomlParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#basicString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicString(TomlParser.BasicStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#basicChar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicChar(TomlParser.BasicCharContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#basicUnescaped}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicUnescaped(TomlParser.BasicUnescapedContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#escaped}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscaped(TomlParser.EscapedContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#mlBasicString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMlBasicString(TomlParser.MlBasicStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#mlBasicChar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMlBasicChar(TomlParser.MlBasicCharContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#mlBasicUnescaped}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMlBasicUnescaped(TomlParser.MlBasicUnescapedContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#literalString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralString(TomlParser.LiteralStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#literalBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralBody(TomlParser.LiteralBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#mlLiteralString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMlLiteralString(TomlParser.MlLiteralStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#mlLiteralBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMlLiteralBody(TomlParser.MlLiteralBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(TomlParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#decInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecInt(TomlParser.DecIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#hexInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexInt(TomlParser.HexIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#octInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctInt(TomlParser.OctIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#binInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinInt(TomlParser.BinIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#floatValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatValue(TomlParser.FloatValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#regularFloat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFloat(TomlParser.RegularFloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#regularFloatInf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFloatInf(TomlParser.RegularFloatInfContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#regularFloatNaN}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFloatNaN(TomlParser.RegularFloatNaNContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(TomlParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#trueBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueBool(TomlParser.TrueBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#falseBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseBool(TomlParser.FalseBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#dateTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateTime(TomlParser.DateTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#offsetDateTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffsetDateTime(TomlParser.OffsetDateTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#localDateTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalDateTime(TomlParser.LocalDateTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#localDate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalDate(TomlParser.LocalDateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#localTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalTime(TomlParser.LocalTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(TomlParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(TomlParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#timeOffset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeOffset(TomlParser.TimeOffsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#hourOffset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHourOffset(TomlParser.HourOffsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#minuteOffset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinuteOffset(TomlParser.MinuteOffsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#secondFraction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondFraction(TomlParser.SecondFractionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#year}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYear(TomlParser.YearContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#month}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonth(TomlParser.MonthContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay(TomlParser.DayContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#hour}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHour(TomlParser.HourContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#minute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinute(TomlParser.MinuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#second}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecond(TomlParser.SecondContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(TomlParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#arrayValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValues(TomlParser.ArrayValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#arrayValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValue(TomlParser.ArrayValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(TomlParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#standardTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardTable(TomlParser.StandardTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#inlineTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTable(TomlParser.InlineTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#inlineTableValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTableValues(TomlParser.InlineTableValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TomlParser#arrayTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayTable(TomlParser.ArrayTableContext ctx);
}