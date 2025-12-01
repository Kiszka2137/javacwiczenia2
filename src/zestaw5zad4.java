public class zestaw5zad4 {public static String flipCase(String text) {
    if (text == null) return null;

    StringBuilder result = new StringBuilder();

    for (int i = 0; i < text.length(); i++) {
        char c = text.charAt(i);

        if (Character.isLowerCase(c)) {
            result.append(Character.toUpperCase(c));
        } else if (Character.isUpperCase(c)) {
            result.append(Character.toLowerCase(c));
        } else {
            result.append(c);
        }
    }

    return result.toString();
}
}
