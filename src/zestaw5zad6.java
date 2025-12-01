public class zestaw5zad6 {public static int strToInt(String str) {
    if (str == null || str.isEmpty()) return 0;

    int i = 0;
    int n = str.length();
    int sign = 1;


    if (str.charAt(i) == '+') {
        i++;
    } else if (str.charAt(i) == '-') {
        sign = -1;
        i++;
    }

    long value = 0;


    while (i < n && Character.isDigit(str.charAt(i))) {
        value = value * 10 + (str.charAt(i) - '0');
        i++;
    }


    if (i < n && (str.charAt(i) == 'e' || str.charAt(i) == 'E')) {
        i++;


        if (i < n && str.charAt(i) == '-') {
            return (int)(sign * value);
        }


        int exp = 0;
        while (i < n && Character.isDigit(str.charAt(i))) {
            exp = exp * 10 + (str.charAt(i) - '0');
            i++;
        }


        while (exp-- > 0) {
            value *= 10;
        }
    }

    return (int)(sign * value);
}
}
