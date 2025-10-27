import java.util.Scanner;

public class zestaw2zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę A: ");
        int A = scanner.nextInt();

        System.out.print("Podaj liczbę B (większą od A): ");
        int B = scanner.nextInt();

        if (A >= B) {
            System.out.println("B musi być większe od A!");
            return;
        }


        int sumaWhile = 0;
        int i = A;
        while (i <= B) {
            sumaWhile += i;
            i++;
        }
        System.out.println(sumaWhile);


        int sumaDoWhile = 0;
        int j = A;
        do {
            sumaDoWhile += j;
            j++;
        } while (j <= B);
        System.out.println(sumaDoWhile);


        int sumaFor = 0;
        for (int k = A; k <= B; k++) {
            sumaFor += k;
        }
        System.out.println(sumaFor);

        scanner.close();
    }
}