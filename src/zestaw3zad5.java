import java.util.Scanner;

public class zestaw3zad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = sc.nextInt();

        int[] bity = new int[32];
        int znak = 0;

        if (liczba < 0) {
            znak = 1;
            liczba = -liczba;
        }


        int i = 0;
        while (liczba > 0) {
            bity[i] = liczba % 2;
            liczba /= 2;
            i++;
        }


        System.out.print("Kod ZM: " + znak + ".");
        for (int j = i - 1; j >= 0; j--) System.out.print(bity[j]);
        System.out.println();


        System.out.print("Kod ZU1: " + znak + ".");
        if (znak == 0) {
            for (int j = i - 1; j >= 0; j--) System.out.print(bity[j]);
        } else {
            for (int j = i - 1; j >= 0; j--) System.out.print(bity[j] == 0 ? 1 : 0);
        }
        System.out.println();


        System.out.print("Kod ZU2: " + znak + ".");
        if (znak == 0) {
            for (int j = i - 1; j >= 0; j--) System.out.print(bity[j]);
        } else {
            int[] zu1 = new int[i];
            for (int j = 0; j < i; j++) zu1[j] = (bity[j] == 0 ? 1 : 0);
            int carry = 1;
            for (int j = 0; j < i; j++) {
                int suma = zu1[j] + carry;
                zu1[j] = suma % 2;
                carry = suma / 2;
            }
            for (int j = i - 1; j >= 0; j--) System.out.print(zu1[j]);
        }
        System.out.println();

        sc.close();
    }
}