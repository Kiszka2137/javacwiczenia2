public class zestaw5zad2 {
    public static long fibIter(int n) {
        if (n < 0) throw new IllegalArgumentException("n nie może być ujemne");
        if (n == 0) return 1;
        if (n == 1) return 2;

        long prev2 = 1; // F0
        long prev1 = 2; // F1
        long current = 0;

        for (int i = 2; i <= n; i++) {
            current = prev2 + prev1;
            prev2 = prev1;
            prev1 = current;
        }

        return current;
    }
}
