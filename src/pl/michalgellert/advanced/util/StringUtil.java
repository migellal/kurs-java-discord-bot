package pl.michalgellert.advanced.util;

public class StringUtil {
    private StringUtil() {}

    public static String concatenateChars(char[] chars) {
        StringBuilder builder = new StringBuilder();
        for(char c : chars) {
            builder.append(c);
        }
        return builder.toString();
    }
}
