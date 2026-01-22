// Give a arrayy print only negative number

// public class arraydemo {
//     public static void negative(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] < 0) {
//                 System.out.print(arr[i] + " ");
//             }
//         }

//     }

//     public static void main(String[] args) {
//         int[] arr = { 10, -20, 30, -40, 50, -60 };
//         negative(arr);
//     }
// }

// Print sum of the element of the array

// public class arraydemo {
//     public static int sumArr(int[] arr) {
//         int sum = 0;
//         for (int num : arr) {
//             sum += num;
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 10, 20, 30, 40, 50 };
//         System.out.println(sumArr(arr));
//     }
// }

// print the maximum & Minimum element of the array

// public class arraydemo {
//     public static int maxArr(int[] arr) {
//         int max = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             if (max < arr[i]) {
//                 max = arr[i];
//             }
//         }
//         return max;
//     }

//     public static int minArr(int[] arr) {
//         int min = Integer.MAX_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             if (min > arr[i]) {
//                 min = arr[i];
//             }
//         }
//         return min;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 10, 20, 30, 40, 50 };
//         System.out.println(maxArr(arr));
//         System.out.println(minArr(arr));

//     }
// }

// sorts an array

// import java.util.*;

// public class arraydemo {
//     public static void sortArr(int[] arr){
//         Arrays.sort(arr);
//     }
//     public static void main(String[] args) {
//         int[] arr = {40, 50, 20, 10, 30};
//         sortArr(arr);

//         for(int num : arr){
//             System.out.print(num + " ");
//         }
//     }
// }

// multiply odd indexed element by 2 and add 10 to even indexed element

// public class arraydemo {
//     public static void multiplyOddEven(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             if (i % 2 == 0) {
//                 arr[i] += 10;
//             } else {
//                 arr[i] *= 2;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = { 10, 20, 30, 40, 50, 60 };
//         multiplyOddEven(arr);
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }

//Two Sum 

// public class arraydemo {
//     public static int[] twoSum(int[] arr, int target) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] + arr[j] == target) {
//                     return new int[] { i, j };
//                 }
//             }
//         }
//         return new int[] { -1, -1 };

//     }

//     public static void main(String[] args) {
//         int[] arr = { 10, 20, 30, 40, 50 };
//         int target = 50;
//         int[] result = twoSum(arr, target);
//         System.out.println("Indexes: " + result[0] + ", " + result[1]);

//     }
// }



// // Print the second maximum element


public class arraydemo {
    
}