import  java.util.Scanner;

public class zestaw3zad9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę (> 0): ");
        int n = sc.nextInt();

        boolean[][] a = new boolean[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = nwd(i + 1, j + 1) == 1; // true jeśli względnie pierwsze
            }
        }


        System.out.print("   ");
        for (int j = 1; j <= n; j++) {
            System.out.printf("%2d ", j);
        }
        System.out.println();


        for (int i = 0; i < n; i++) {
            System.out.printf("%2d ", i + 1);
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] ? " + " : " . ");
            }
            System.out.println();
        }

        sc.close();
    }


    static int nwd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}