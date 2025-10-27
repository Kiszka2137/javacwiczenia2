import java.util.Scanner;

public class zestaw2zad4{
     static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int liczba;

        System.out.println("Podawaj kolejne liczby (0 kończy wprowadzanie):");

        do {
            liczba = scanner.nextInt();
            suma += liczba;
        } while (liczba != 0);

        System.out.println("Suma podanych liczb: " + suma);

        scanner.close();
    }
}