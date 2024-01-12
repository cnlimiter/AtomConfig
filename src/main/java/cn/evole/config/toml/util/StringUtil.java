package cn.evole.config.toml.util;

import java.util.Arrays;

/**
 * Name: Toml / StringUtil
 * Author: cnlimiter
 * CreateTime: 2023/11/9 0:33
 * Description:
 */

public class StringUtil {

    public static final String EMPTY = "";
    private static final int PAD_LIMIT = 8192;

    public static String repeat(final String str, final int repeat) {

        if (str == null) {
            return null;
        }
        if (repeat <= 0) {
            return EMPTY;
        }
        final int inputLength = str.length();
        if (repeat == 1 || inputLength == 0) {
            return str;
        }
        if (inputLength == 1 && repeat <= PAD_LIMIT) {
            return repeat(String.valueOf(str.charAt(0)), repeat);
        }

        final int outputLength = inputLength * repeat;
        switch (inputLength) {
            case 1 :
                return repeat(String.valueOf(str.charAt(0)), repeat);
            case 2 :
                final char ch0 = str.charAt(0);
                final char ch1 = str.charAt(1);
                final char[] output2 = new char[outputLength];
                for (int i = repeat * 2 - 2; i >= 0; i--, i--) {
                    output2[i] = ch0;
                    output2[i + 1] = ch1;
                }
                return new String(output2);
            default :
                final StringBuilder buf = new StringBuilder(outputLength);
                for (int i = 0; i < repeat; i++) {
                    buf.append(str);
                }
                return buf.toString();
        }
    }

    public static boolean isBlank(final CharSequence cs) {
        int strLen;
        if (cs == null || (strLen = cs.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(cs.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static String translateEscapes(String base) {
        if (base.isEmpty()) {
            return "";
        }
        char[] chars = base.toCharArray();
        int length = chars.length;
        int from = 0;
        int to = 0;
        while (from < length) {
            char ch = chars[from++];
            if (ch == '\\') {
                ch = from < length ? chars[from++] : '\0';
                switch (ch) {
                    case 'b':
                        ch = '\b';
                        break;
                    case 'f':
                        ch = '\f';
                        break;
                    case 'n':
                        ch = '\n';
                        break;
                    case 'r':
                        ch = '\r';
                        break;
                    case 's':
                        ch = ' ';
                        break;
                    case 't':
                        ch = '\t';
                        break;
                    case '\'':
                    case '\"':
                    case '\\':
                        // as is
                        break;
                    case '0': case '1': case '2': case '3':
                    case '4': case '5': case '6': case '7':
                        int limit = Integer.min(from + (ch <= '3' ? 2 : 1), length);
                        int code = ch - '0';
                        while (from < limit) {
                            ch = chars[from];
                            if (ch < '0' || '7' < ch) {
                                break;
                            }
                            from++;
                            code = (code << 3) | (ch - '0');
                        }
                        ch = (char)code;
                        break;
                    case '\n':
                        continue;
                    case '\r':
                        if (from < length && chars[from] == '\n') {
                            from++;
                        }
                        continue;
                    default: {
                        String msg = String.format(
                                "Invalid escape sequence: \\%c \\\\u%04X",
                                ch, (int)ch);
                        throw new IllegalArgumentException(msg);
                    }
                }
            }

            chars[to++] = ch;
        }

        return new String(chars, 0, to);
    }
}
