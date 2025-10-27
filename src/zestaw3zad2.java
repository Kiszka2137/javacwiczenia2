import java.util.Random;

public class zestaw3zad2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] tablica = new int[20];
        int[] wystapienia = new int[11];


        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = random.nextInt(10) + 1;
            wystapienia[tablica[i]]++;
        }


        System.out.print("Wylosowane liczby: ");
        for (int liczba : tablica) {
            System.out.print(liczba + " ");
        }
        System.out.println();


        System.out.println("Wystąpienia:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " - " + wystapienia[i]);
        }
    }
}