public class zestaw5zad1 {public static long factorialIter(int n) {
    if (n < 0) return -1;
    long result = 1;
    for (int i = 1; i <= n; i++) {
        result *= i;
    }
    return result;
}


    public static long factorialRec(int n) {
        if (n < 0) return -1;
        if (n == 0 || n == 1) return 1;
        return n * factorialRec(n - 1);
    }

    // Przykład użycia
    public static void main(String[] args) {
        System.out.println(factorialIter(5)); // 120
        System.out.println(factorialRec(5));  // 120
    }
}
