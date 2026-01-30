
// count the number of vowels in a string

// public class stringpractice {
//     public static int countVowels(String str) {
//         int count = 0;
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                 count++;
//             }
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         String str = "shubhamkumar";
//         System.out.print(countVowels(str));

//     }
// }

// palindrome string used two pointer approach

public class stringpractice {
    public static boolean palindrome(String str) {
        int low = 0, high = str.length() - 1;
        while (low <= high) {
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
        System.out.println(palindrome(str));
    }
}
