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
// public class Arrays {
//     public static boolean search(int[] arr, int target) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 return true;
//             }
//         }
//         return false;

//     }

//     public static void main(String[] args) {
//         int[] arr = { 60, 80, 30, 90, 50, 40 };
//         int target = 50;
//         boolean result = search(arr, target);
//         System.out.println(result);
//     }
// }




// product of array

// public class Arrays {
//     public static long productArray(int[] arr) {
//         long product = 1;
//         for (int i = 0; i < arr.length; i++) {
//             product *= arr[i];
//         }
//         return product;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 3, 4, 5, 6 };
//         System.out.print(productArray(arr));
//     }
// }

//Two Sum 

// public class Arrays {
//     public static int[] TwoSum(int[] arr, int target) {
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
//         int[] arr = { 1, 5, 8, -3 };
//         int target = 3;
//         int[] result = TwoSum(arr, target);
//         System.out.println("Indexes: " + result[0] + ", " + result[1]);
//     }
// }




// // Print the second maximum element

// public class Arrays {
//     public static int secondMax(int[] arr) {
//         int first = Integer.MIN_VALUE;
//         int second = Integer.MIN_VALUE;

//         for (int i = 0; i < arr.length; i++) {
//             if (first < arr[i]) {
//                 second = first;
//                 first = arr[i];
//             } else if (arr[i] > second && arr[i] != first) {
//                 second = arr[i];
//             }
//         }
//         return second;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 10, 20, 30, 40, 50 };
//         System.out.println(secondMax(arr));
//     }
// }



// second approach using double loop(Two-Pass Method)
// public class Arrays {

//     public static int findSecondMax(int[] arr) {
//         int fMax = Integer.MIN_VALUE;
//         int sMax = Integer.MIN_VALUE;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > fMax) {
//                 fMax = arr[i];
//             }
//         }

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > sMax && arr[i] != fMax) {
//                 sMax = arr[i];
//             }
//         }

//         return sMax;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 20, 20, 8, 9, 10, 15 };
//         System.out.println(findSecondMax(arr));
//     }
// }




// Reverse an array 

// public class Arrays {
//     public static void reverse(int[] arr) {
//         int n = arr.length - 1;
//         int left = 0;
//         int right = n;

//         while (left <= right) {
//             int temp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = temp;

//             left++;
//             right--;
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = { 10, 20, 30, 40, 50, 80, 70 };
//         reverse(arr);

//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }

// reverse only specific parts outcome - 10, 20, 30, 60, 50, 40, 70;

// public class Arrays {
//     public static void reverse(int[] arr) {
//         int i = 3;
//         int j = 5;

//         while (i <= j) {
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//             i++;
//             j--;
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
//         reverse(arr);

//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }

