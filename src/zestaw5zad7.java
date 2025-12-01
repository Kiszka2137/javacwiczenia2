public class zestaw5zad7 {public static int strfind(String gdzie, String co) {
    if (gdzie == null || co == null) return -1;

    int n = gdzie.length();
    int m = co.length();


    if (m == 0) return 0;


    if (m > n) return -1;


    for (int i = 0; i <= n - m; i++) {
        int j = 0;
        while (j < m && gdzie.charAt(i + j) == co.charAt(j)) {
            j++;
        }
        if (j == m) {
            return i;
        }
    }

    return -1;
}
}
