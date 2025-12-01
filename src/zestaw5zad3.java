public class zestaw5zad3 {public static int strpos(String text, char z) {
    if (text == null) return -1;

    for (int i = 0; i < text.length(); i++) {
        if (text.charAt(i) == z) {
            return i;
        }
    }

    return -1;
}
}
