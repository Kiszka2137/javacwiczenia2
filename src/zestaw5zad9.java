import java.util.ArrayList;

public class zestaw5zad9 {

    public static String[] podzielNaSlowa(String tekst) {
        if (tekst == null || tekst.isEmpty()) return new String[0];

        ArrayList<String> slowa = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < tekst.length(); i++) {
            char c = tekst.charAt(i);
            if (Character.isWhitespace(c)) {
                if (sb.length() > 0) {
                    slowa.add(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.append(c);
            }
        }


        if (sb.length() > 0) {
            slowa.add(sb.toString());
        }

        return slowa.toArray(new String[0]);
    }
}
