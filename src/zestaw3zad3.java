import java.util.Random;

public class zestaw3zad3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] macierz = new int[5][5];
        int[] minKolumny = new int[5];
        int[] maxKolumny = new int[5];


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                macierz[i][j] = random.nextInt(11) - 5;
            }
        }


        for (int j = 0; j < 5; j++) {
            int min = macierz[0][j];
            int max = macierz[0][j];

            for (int i = 1; i < 5; i++) {
                if (macierz[i][j] < min) min = macierz[i][j];
                if (macierz[i][j] > max) max = macierz[i][j];
            }

            minKolumny[j] = min;
            maxKolumny[j] = max;
        }


        System.out.println("Macierz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%4d", macierz[i][j]);
            }
            System.out.println();
        }


        System.out.println("\nMinima w kolumnach:");
        for (int j = 0; j < 5; j++) {
            System.out.printf("%4d", minKolumny[j]);
        }


        System.out.println("\nMaksima w kolumnach:");
        for (int j = 0; j < 5; j++) {
            System.out.printf("%4d", maxKolumny[j]);
        }

        System.out.println();
    }
}