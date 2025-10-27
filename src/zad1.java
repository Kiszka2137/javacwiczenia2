void main() {
    Scanner scanner = new Scanner(System.in);

    IO.print("Podaj liczbę całkowitą dodatnią: ");
    int n = scanner.nextInt();

    if (n <= 0) {
        IO.println("Podana liczba nie jest dodatnia!");
    } else {
        IO.println("Liczby nieparzyste nie większe od " + n + ":");
        for (int i = 1; i <= n; i += 2) {
            IO.print(i);
            if (i + 2 <= n) IO.print(", ");
        }
    }

    scanner.close();
}