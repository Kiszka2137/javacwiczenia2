import java.util.Scanner;

public class zestaw2zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj znak wypełnienia prostokąta: ");
        char znak = scanner.next().charAt(0);

        System.out.print("Podaj współrzędną x (kolumna lewego górnego rogu): ");
        int x = scanner.nextInt();

        System.out.print("Podaj współrzędną y (wiersz lewego górnego rogu): ");
        int y = scanner.nextInt();

        System.out.print("Podaj wysokość prostokąta (a): ");
        int a = scanner.nextInt();

        System.out.print("Podaj szerokość prostokąta (b): ");
        int b = scanner.nextInt();

        System.out.println();


        for (int i = 1; i < y; i++) {
            System.out.println();
        }


        for (int i = 0; i < a; i++) {

            for (int j = 1; j < x; j++) {
                System.out.print(" ");
            }


            for (int j = 0; j < b; j++) {
                System.out.print(znak);
            }

            System.out.println();
        }

        scanner.close();
    }
}