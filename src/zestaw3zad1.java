import java.util.Random;

public class zestaw3zad1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] tablica = new int[10];


        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = random.nextInt(21) - 10;
        }


        System.out.print("Tablica: ");
        for (int liczba : tablica) {
            System.out.print(liczba + " ");
        }
        System.out.println();


        int min = tablica[0];
        int max = tablica[0];
        int suma = 0;

        for (int liczba : tablica) {
            if (liczba < min) min = liczba;
            if (liczba > max) max = liczba;
            suma += liczba;
        }

        double srednia = suma * 1.0 / tablica.length;


        int mniejszych = 0;
        int wiekszych = 0;

        for (int liczba : tablica) {
            if (liczba < srednia) mniejszych++;
            else if (liczba > srednia) wiekszych++;
        }

        System.out.println("Najmniejszy element: " + min);
        System.out.println("Największy element: " + max);
        System.out.println("Średnia arytmetyczna: " + srednia);
        System.out.println("Liczba elementów mniejszych od średniej: " + mniejszych);
        System.out.println("Liczba elementów większych od średniej: " + wiekszych);


        System.out.print("Tablica od końca: ");
        for (int i = tablica.length - 1; i >= 0; i--) {
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
    }
}
