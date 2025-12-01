public class zestaw5zad15 {public static int[] HTMLColor2RGB(String color) {
    if (color == null || !color.matches("#[0-9a-fA-F]{6}")) {
        throw new IllegalArgumentException("Niepoprawny format koloru. Oczekiwano #RRGGBB");
    }

    int r = Integer.parseInt(color.substring(1, 3), 16);
    int g = Integer.parseInt(color.substring(3, 5), 16);
    int b = Integer.parseInt(color.substring(5, 7), 16);

    return new int[] { r, g, b };
}
}
