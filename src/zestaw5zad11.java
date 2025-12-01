public class zestaw5zad11 {public static String strcut(String str, int start, int ile) {
    if (str == null || str.isEmpty() || ile <= 0) return str;

    int n = str.length();


    if (start < 0) start = 0;
    if (start >= n) return str;
    if (start + ile > n) ile = n - start;

    StringBuilder sb = new StringBuilder();
    sb.append(str.substring(0, start));
    sb.append(str.substring(start + ile));

    return sb.toString();
}
}
