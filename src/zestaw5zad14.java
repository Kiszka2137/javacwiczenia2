import java.util.Arrays;

public class zestaw5zad14 {

    public static boolean czyAnagram(String t1, String t2) {
        if (t1 == null || t2 == null) return false;


        String s1 = t1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String s2 = t2.replaceAll("[^a-zA-Z]", "").toLowerCase();


        if (s1.length() != s2.length()) return false;


        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
