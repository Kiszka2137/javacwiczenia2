public class zestaw5zad5 {public static boolean startsWith(String str1, String str2) {
    if (str1 == null || str2 == null) return false;


    if (str2.length() > str1.length()) return false;

    for (int i = 0; i < str2.length(); i++) {
        if (str1.charAt(i) != str2.charAt(i)) {
            return false;
        }
    }

    return true;
}
}
