
import java.util.Arrays;

// ------------------------------------------------------------------------------------
//                  count the number of vowels in a string
// ------------------------------------------------------------------------------------
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

// ------------------------------------------------------------------------------------
//                  palindrome string used two pointer approach
// ------------------------------------------------------------------------------------
// public class stringpractice {
//     public static boolean palindrome(String str) {
//         int low = 0, high = str.length() - 1;
//         while (low <= high) {
//             if (str.charAt(low) != str.charAt(high)) {
//                 return false;
//             }
//             low++;
//             high--;
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         String str = "madam";
//         System.out.println(palindrome(str));
//     }
// }

// ------------------------------------------------------------------------------------
//                   the first letter is lower hance all string is lowercase
// ------------------------------------------------------------------------------------
// public class stringpractice {
//     public static String modify(String str) {
//         if (Character.isLowerCase(str.charAt(0))) {
//             return str.toLowerCase();

//         } else {
//             return str.toUpperCase();
//         }
//     }

//     public static void main(String[] args) {
//         String str = "shUBHAM";
//         System.out.println(modify(str));
//     }
// }

// ------------------------------------------------------------------------------------
//                                   convert integer to string
// ------------------------------------------------------------------------------------
// public class stringpractice {
//     public static void main(String[] args) {
//         int n = 6777;
//         String str = Integer.toString(n);
//         System.out.println(str);
//     }
// }

// ------------------------------------------------------------------------------------
//                                        string to integer
// ------------------------------------------------------------------------------------
// public class stringpractice {
//     public static void main(String[] args) {
//         String str = "78996423";
//         int n = Integer.parseInt(str);
//         System.out.println(n);
//     }
// }
// ------------------------------------------------------------------------------------
//                                    string to character array
// ------------------------------------------------------------------------------------
// public class stringpractice {
//     public static void main(String[] args) {
//         String str = "shubham";
//         char[] ch = str.toCharArray();
//         for (char ele : ch) {
//             System.out.print(ele + " ");
//         }
//     }
// }

// ------------------------------------------------------------------------------------
//                                    substring
// ------------------------------------------------------------------------------------

// public class stringpractice {
//     public static void subString(String str) {
//         for (int i = 0; i < str.length(); i++) {
//             for (int j = i + 1; j <= str.length(); j++) {
//                 System.out.print(str.substring(i, j) + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         String str = "shubham";
//         subString(str);
//     }
// }

// ------------------------------------------------------------------------------------
//                                   sum of all substring
// ------------------------------------------------------------------------------------

// public class stringpractice {
//     public static int sumAllSubstring(String str) {
//         int sum = 0;
//         for (int i = 0; i < str.length(); i++) {
//             for (int j = i + 1; j <= str.length(); j++) {
//                 int num = Integer.parseInt(str.substring(i, j));
//                 sum += num;
//             }
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         String str = "4567";
//         System.out.println(sumAllSubstring(str));
//     }
// }

// ------------------------------------------------------------------------------------
//                           compare two string(not used builtin method)
// ------------------------------------------------------------------------------------

// public class stringpractice {
//     public static boolean equal(String str, String gtr) {
//         if (str.length() != gtr.length()) {
//             return false;
//         }
//         for (int i = 0; i < str.length(); i++) {
//             if (str.charAt(i) != gtr.charAt(i)) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         String str = "shubham";
//         String gtr = "shubham";
//         System.out.println(equal(str, gtr));
//     }
// }

// ------------------------------------------------------------------------------------
//                                 String Builder      
// ------------------------------------------------------------------------------------

// capacity

// public class stringpractice {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder(10);
//         System.out.println(sb.length() + " " + sb.capacity());
//         sb.append("shubham");
//         System.out.println(sb.length() + " " + sb.capacity());
//     }
// }

// ------------------------------------------------------------------------------------
//                                 String Builder to string     
// ------------------------------------------------------------------------------------

// public class stringpractice {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("shubham");
//         String str = sb.toString();
//         System.out.println(str);
//     }
// }

// ------------------------------------------------------------------------------------
//                                 reverse     
// ------------------------------------------------------------------------------------

// public class stringpractice {
//     public static void reverseString(StringBuilder sb) {
//         sb.reverse();
//         System.out.println(sb);

//     }

//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("shubham");
//         reverseString(sb);
//     }
// }

// ------------------------------------------------------------------------------------
//                                 another way reverse two pointer     
// ------------------------------------------------------------------------------------
// Two Pointer Approach: Uses two pointers (i and j) starting from both ends of the
// StringBuilder. Swaps characters at positions i and j, then moves pointers towards
// the center until they meet. This reverses the StringBuilder in-place with O(n) time
// complexity and O(1) space complexity.

// public class stringpractice {
//     public static void twoPointer(StringBuilder str) {
//         int i = 0, j = str.length() - 1;
//         while (i <= j) {
//             char temp1 = str.charAt(i);
//             char temp2 = str.charAt(j);
//             str.setCharAt(i, temp2);
//             str.setCharAt(j, temp1);
//             i++;
//             j--;
//         }

//     }

//     public static void main(String[] args) {
//         StringBuilder str = new StringBuilder("shubham");
//         twoPointer(str);
//         System.out.println(str);
//     }
// }

// ------------------------------------------------------------------------------------
//                                   anagram     
// ------------------------------------------------------------------------------------

public class stringpractice {
    public static boolean anagram(String str, String gtr) {
        int n1 = str.length();
        int n2 = gtr.length();

        if (n1 != n2) {
            return false;
        }
        char[] c1 = str.toCharArray();
        char[] c2 = gtr.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }

    public static void main(String[] args) {
        String str = "anagram";
        String gtr = "nagaram";
        System.out.println(anagram(str, gtr));
    }
}