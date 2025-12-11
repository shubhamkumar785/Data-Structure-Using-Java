// public class Arrays {
//     public static void main(String[] args) {
//         int[] x = { 10, 20, 30, 40, 50 };
//         // Array are mutable/update
//         x[3] = 100;
//         System.out.println(x[3]);

//         // display a array
//         // using for loop
//         for (int i = 0; i < x.length; i++) {
//             System.out.print(x[i] + " ");
//         }
//         System.out.println();
//         // using for each loop
//         for (int num : x) {
//             System.out.print(num + " ");
//         }
//         System.out.println();

//         // using while loop
//         int i = 0;
//         while (i < x.length) {
//             System.out.print(x[i] + " ");
//             i++;
//         }
//         System.out.println();

//         // using do while loop
//         int j = 0;
//         do {
//             System.out.print(x[j] + " ");
//             j++;
//         } while (j < x.length);
//         System.out.println();

//     }
// }

// import java.util.*;

// public class Arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[7];

//         // Taking a input from the user
//         for (int i = 0; i < 7; i++) {
//             int x = sc.nextInt();
//             arr[i] = x;
//         }

//         // Print Array Element
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//         // print just double of array
//         for (int num : arr) {
//             System.out.print(2 * num + " ");
//         }
//     }
// }

// Give a arrayy print only negative number

// public class Arrays {
//     public static void printNegativeNumber(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] < 0) {
//                 System.out.print(arr[i] + " ");
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, -2, 3, -4, 5, -6, 7, -8 };
//         printNegativeNumber(arr);
//     }
// }

// Print sum of the element of the array

// public class Arrays {
//     public static int sumOfElement(int[] arr) {
//         int sum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             sum += arr[i];
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 10, 20, 30, 40, 50 };
//         System.out.println("" + sumOfElement(arr));

//     }
// }

// print the maximum element of the array

// public class Arrays {
//     public static int findMax(int[] arr) {
//         int max = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         return max;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 20, 40, 10, 50, 30 };
//         System.out.println(" " + findMax(arr));
//     }
// }

// print the minimum element

// public class Arrays {
//     public static int findMin(int[] arr) {
//         int min = Integer.MAX_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] < min) {
//                 min = arr[i];
//             }
//         }
//         return min;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 30, 20, 60, 10, 50 };
//         System.out.println(" " + findMin(arr));
//     }
// }

// sorts an array

// import java.util.*;

// public class Arrays {
//     public static void sortArray(int[] arr){
//         Arrays.sort(arr);
//     }
//     public static void main(String[] args){
//         int[] arr = {19, -9, 7, -3, 56};
//         sortArray(arr);

//         for(int x : arr){
//             System.out.print(x + " ");
//         }
//     }
// }

// multiply odd indexed element by 2 and add 10 to even indexed element

// public class Arrays {
//     public static void oddEven(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             if (i % 2 == 0) {
//                 arr[i] = arr[i] + 10;
//             } else {
//                 arr[i] = arr[i] * 2;
//             }
//         }
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 3, 4, 5, 6 };
//         oddEven(arr);
//     }
// }

// search an element
// using linear search
public class Arrays {
    public static boolean search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr = { 60, 80, 30, 90, 50, 40 };
        int target = 50;
        boolean result = search(arr, target);
        System.out.println(result);
    }
}