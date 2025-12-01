public class zestaw5zad8 {public static int wordCount(String text) {
    if (text == null || text.isEmpty()) return 0;

    int count = 0;
    boolean insideWord = false;

    for (int i = 0; i < text.length(); i++) {
        char c = text.charAt(i);

        if (Character.isWhitespace(c)) {
            insideWord = false;
        } else {
            if (!insideWord) {
                count++;
                insideWord = true;
            }
        }
    }

    return count;
}
}
