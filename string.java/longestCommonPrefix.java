public class longestCommonPrefix {
    public static void longestCommon(String str1, String str2) {
        int n = Math.min(str1.length(), str2.length());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                sb.append(str1.charAt(i));
            } else {
                break;
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String str1 = "flower";
        String str2 = "flow";
        longestCommon(str1, str2);

    }
}
