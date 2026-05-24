import java.util.*;

public class anagram {
    public static boolean isAnagram(String str, String gtr) {
        int n1 = str.length();
        int n2 = gtr.length();

        if (n1 != n2) {
            return false;
        }

        char[] ch1 = str.toCharArray();
        char[] ch2 = gtr.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "silent";
        String gtr = "listen";

        System.out.println(isAnagram(str, gtr));
    }
}
