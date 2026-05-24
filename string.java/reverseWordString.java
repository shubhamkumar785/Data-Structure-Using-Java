
public class reverseWordString {
    public static void reverse(String str) {
        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {
            String rev = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                rev += word.charAt(i);
            }
            result += rev + " ";
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        String str = "shubham is a good boy";
        reverse(str);
    }
}
