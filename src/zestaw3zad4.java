import java.util.Scanner;

public class zestaw3zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();

        int[] bity = new int[32];
        int znak = 0;
        if (liczba < 0) {
            znak = 1;
            liczba = Math.abs(liczba);
        }


        int i = 0;
        while (liczba > 0 && i < 31) {
            bity[i] = liczba % 2;
            liczba /= 2;
            i++;
        }


        System.out.print("Liczba w kodzie ZM binarnie: " + znak + ".");


        boolean leading = true;
        for (int j = i - 1; j >= 0; j--) {

            if (bity[j] == 1) leading = false;
            if (!leading || j == 0) System.out.print(bity[j]);
        }

        System.out.println();
        scanner.close();
    }
}