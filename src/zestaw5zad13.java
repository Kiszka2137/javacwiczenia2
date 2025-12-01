public class zestaw5zad13 {public static String poprzestawiaj(String tekst, int[] kolejnosc) {
    if (tekst == null || kolejnosc == null || tekst.length() != kolejnosc.length) {
        throw new IllegalArgumentException("Tekst i tablica kolejnosc muszą mieć tę samą długość");
    }

    char[] wynik = new char[tekst.length()];

    for (int i = 0; i < tekst.length(); i++) {
        int poz = kolejnosc[i];
        if (poz < 0 || poz >= tekst.length()) {
            throw new IllegalArgumentException("Wartości w kolejnosc muszą być w zakresie 0..length-1");
        }
        wynik[poz] = tekst.charAt(i);
    }

    return new String(wynik);
}
}
