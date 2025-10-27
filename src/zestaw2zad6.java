import java.util.Random;
import java.util.Scanner;

public class zestaw2zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int wylosowana = random.nextInt(100) + 1; // losuje liczbę 1–100
        int proba;

        System.out.println("Zgadnij liczbę z zakresu 1–100!");

        while (true) {
            System.out.print("Podaj liczbę: ");
            proba = scanner.nextInt();

            if (proba > wylosowana) {
                System.out.println("Podałeś za dużą wartość!");
            } else if (proba < wylosowana) {
                System.out.println("Podałeś za małą wartość!");
            } else {
                System.out.println("🎉 Gratulacje! Trafiłeś!");
                break;
            }
        }

        scanner.close();
    }
}