public class zestaw5zad10 {public static int strFindAndCount(String gdzie, String co) {
    if (gdzie == null || co == null || co.isEmpty()) return 0;

    int count = 0;
    int n = gdzie.length();
    int m = co.length();

    for (int i = 0; i <= n - m; i++) {
        int j = 0;
        while (j < m && gdzie.charAt(i + j) == co.charAt(j)) {
            j++;
        }
        if (j == m) {
            count++;
            i += m - 1;
        }
    }

    return count;
}
}
