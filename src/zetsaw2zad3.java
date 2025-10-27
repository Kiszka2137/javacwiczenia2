void main() {
    Scanner scanner = new Scanner(System.in);

    IO.print("Podaj liczbę całkowitą dodatnią: ");
    int n = scanner.nextInt();

    if (n <= 0) {
        IO.println("Podana liczba musi być dodatnia!");
    } else {
        int potega = 1;

        IO.println("Potęgi liczby 2 nie większe niż " + n + ":");
        while (potega <= n) {
            IO.println(potega);
            potega *= 2; // następna potęga 2
        }
    }

    scanner.close();
}