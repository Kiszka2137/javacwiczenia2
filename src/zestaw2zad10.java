import java.util.Scanner;

public class zestaw2zad10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();

        System.out.print("Dzielniki liczby " + liczba + ": ");

        // Pętla od 1 do liczby, sprawdzanie reszty z dzielenia
        for (int i = 1; i <= Math.abs(liczba); i++) {
            if (liczba % i == 0) {
                System.out.print(i);
                if (i != Math.abs(liczba)) {
                    System.out.print(", ");
                }
            }
        }

        System.out.println();
        scanner.close();
    }
}