package stock.recommender.util;

public class TextUtil {
    public static boolean isNullEmptyOrWhitespace(CharSequence str) {
        return str == null ? true : isEmptyOrWhitespace(str);
    }

    public static boolean isEmptyOrWhitespace(CharSequence str) {
        int end = str.length();

        for(int i = 0; i < end; ++i) {
            char c;
            if ((c = str.charAt(i)) > ' ' && !Character.isWhitespace(c)) {
                return false;
            }
        }

        return true;
    }
}
