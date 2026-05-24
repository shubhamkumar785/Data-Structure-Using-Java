
public class palindrome {

    public static boolean isPalindrome(String str) {

        str = str.toLowerCase().replaceAll("[^a-zA-Z]", "");

        int low = 0, high = str.length() - 1;

        while (low < high) {
            if (str.charAt(low) != str.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrome(str));
    }
}
