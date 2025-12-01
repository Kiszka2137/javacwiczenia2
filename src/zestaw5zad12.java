public class zestaw5zad12 {public class TablicaAnaliza {


    public static int strToInt(String str) {
        if (str == null || str.isEmpty()) return 0;

        int i = 0, n = str.length(), sign = 1;
        if (str.charAt(i) == '+') i++;
        else if (str.charAt(i) == '-') { sign = -1; i++; }

        long value = 0;

        while (i < n && Character.isDigit(str.charAt(i))) {
            value = value * 10 + (str.charAt(i) - '0');
            i++;
        }

        if (i < n && (str.charAt(i) == 'e' || str.charAt(i) == 'E')) {
            i++;
            if (i < n && str.charAt(i) == '-') return (int)(sign * value);

            int exp = 0;
            while (i < n && Character.isDigit(str.charAt(i))) {
                exp = exp * 10 + (str.charAt(i) - '0');
                i++;
            }
            while (exp-- > 0) value *= 10;
        }

        return (int)(sign * value);
    }


    public static int strFindAndCount(String gdzie, String co) {
        if (gdzie == null || co == null || co.isEmpty()) return 0;

        int count = 0;
        int n = gdzie.length();
        int m = co.length();

        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && gdzie.charAt(i + j) == co.charAt(j)) {
                j++;
            }
            if (j == m) {
                count++;
                i += m - 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String[] zadania = {
                "mamla", " mama ", "+12", "0001", "991-234-3",
                "-12e5", "-12e-5", "+zonmakm", "ax2", "amakotma"
        };

        String fraza = "ma";

        int sumaLiczb = 0;
        StringBuilder nieliczbowe = new StringBuilder();
        int liczbaFrazyWKomorkach = 0;

        for (String komorka : zadania) {
            int liczba = strToInt(komorka);

            String poczatek = komorka.trim();
            boolean isNumber = !poczatek.isEmpty() &&
                    (Character.isDigit(poczatek.charAt(0)) || poczatek.charAt(0) == '+' || poczatek.charAt(0) == '-');

            if (isNumber) {
                sumaLiczb += liczba;
            } else {
                nieliczbowe.append(komorka);
                liczbaFrazyWKomorkach += strFindAndCount(komorka, fraza);
            }
        }

        String wynikNieliczbowe = nieliczbowe.toString();
        int liczbaFrazyWLancuchu = strFindAndCount(wynikNieliczbowe, fraza);

        double stosunek = liczbaFrazyWLancuchu == 0 ? 0.0 :
                (double) liczbaFrazyWKomorkach / liczbaFrazyWLancuchu;


        System.out.println("Pkt. 1: " + sumaLiczb);
        System.out.println("Pkt. 2: " + wynikNieliczbowe);
        System.out.println("Pkt. 3: " + liczbaFrazyWKomorkach);
        System.out.println("Pkt. 4: " + liczbaFrazyWLancuchu);
        System.out.printf("Pkt. 5: %.6f\n", stosunek);
    }
}
}
