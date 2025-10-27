import java.util.Scanner;

public class zestaw2zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podawaj liczby całkowite (0 kończy wprowadzanie):");

        int liczba;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Wczytywanie liczb
        while (true) {
            liczba = scanner.nextInt();

            if (liczba == 0) {
                break; // zakończenie pętli
            }

            if (liczba < min) {
                min = liczba;
            }

            if (liczba > max) {
                max = liczba;
            }
        }

        if (min == Integer.MAX_VALUE || max == Integer.MIN_VALUE) {
            System.out.println("Nie podano żadnych liczb!");
        } else {
            int suma = min + max;
            double srednia = suma / 2.0;

            System.out.println("Najmniejsza liczba: " + min);
            System.out.println("Największa liczba: " + max);
            System.out.println("Suma min i max: " + suma);
            System.out.println("Średnia arytmetyczna min i max: " + srednia);
        }

        scanner.close();
    }
}