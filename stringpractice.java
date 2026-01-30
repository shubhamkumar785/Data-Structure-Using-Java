
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
//                                   compare two string
// ------------------------------------------------------------------------------------

public class stringpractice {
    public static boolean equal(String str, String gtr) {
        if (str.length() != gtr.length()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != gtr.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "shubham";
        String gtr = "shubham";
        System.out.println(equal(str, gtr));
    }
}