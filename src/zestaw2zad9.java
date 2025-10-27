import java.util.Scanner;

public class zestaw2zad9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();
        int n = Math.abs(liczba); // obsługa liczb ujemnych

        int suma = 0;
        int sumaParzyste = 0, iloscParzyste = 0;
        int sumaNieparzyste = 0, iloscNieparzyste = 0;

        while (n > 0) {
            int cyfra = n % 10;
            suma += cyfra;

            if (cyfra % 2 == 0) {
                sumaParzyste += cyfra;
                iloscParzyste++;
            } else {
                sumaNieparzyste += cyfra;
                iloscNieparzyste++;
            }

            n /= 10;
        }

        System.out.println("Suma cyfr: " + suma);

        if (iloscParzyste == 0 || iloscNieparzyste == 0) {
            System.out.println("Nie można obliczyć stosunku średnich (brak cyfr parzystych lub nieparzystych).");
        } else {
            double sredniaParzyste = sumaParzyste * 1.0 / iloscParzyste;
            double sredniaNieparzyste = sumaNieparzyste * 1.0 / iloscNieparzyste;
            double stosunek = sredniaParzyste / sredniaNieparzyste;

            System.out.println("Średnia cyfr parzystych: " + sredniaParzyste);
            System.out.println("Średnia cyfr nieparzystych: " + sredniaNieparzyste);
            System.out.println("Stosunek średniej cyfr parzystych do średniej cyfr nieparzystych: " + stosunek);
        }

        scanner.close();
    }
}