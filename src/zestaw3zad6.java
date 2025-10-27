import java.util.Scanner;

public class zestaw3zad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        int a = sc.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int b = sc.nextInt();

        int suma = a + b;
        int roznica = a - b;

        System.out.println("\nWyniki dziesiętnie:");
        System.out.println("Suma = " + suma);
        System.out.println("Różnica = " + roznica);

        System.out.println("\n--- Kod ZM ---");
        System.out.println("a = " + kodZM(a));
        System.out.println("b = " + kodZM(b));
        System.out.println("a + b = " + kodZM(suma));
        System.out.println("a - b = " + kodZM(roznica));

        System.out.println("\n--- Kod ZU1 ---");
        System.out.println("a = " + kodZU1(a));
        System.out.println("b = " + kodZU1(b));
        System.out.println("a + b = " + kodZU1(suma));
        System.out.println("a - b = " + kodZU1(roznica));

        System.out.println("\n--- Kod ZU2 ---");
        System.out.println("a = " + kodZU2(a));
        System.out.println("b = " + kodZU2(b));
        System.out.println("a + b = " + kodZU2(suma));
        System.out.println("a - b = " + kodZU2(roznica));

        sc.close();
    }


    static String kodZM(int n) {
        String bin = Integer.toBinaryString(Math.abs(n));
        return (n < 0 ? "1." : "0.") + bin;
    }

    static String kodZU1(int n) {
        if (n >= 0) return "0." + Integer.toBinaryString(n);
        int val = ~(-n); // negacja bitów wartości bez znaku
        return "1." + Integer.toBinaryString(val & 0xFF);
    }

    static String kodZU2(int n) {
        if (n >= 0) return "0." + Integer.toBinaryString(n);
        int val = (~(-n) + 1); // negacja + dodanie 1
        return "1." + Integer.toBinaryString(val & 0xFF);
    }
}