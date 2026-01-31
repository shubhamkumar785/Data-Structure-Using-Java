//     public static boolean binarySearch(int[] arr, int target) {
//         int left = 0, right = arr.length - 1;
//         while (left <= right) {
//             int mid = (left + right) / 2;
//             if (arr[mid] == target) {
//                 return true;
//             } else if (arr[mid] > target) {
//                 right = mid - 1;
//             } else {
//                 left = mid + 1;
//             }

//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };
//         int target = 60;
//         System.out.print(binarySearch(arr, target));
//     }
// }

// binary search(If multiple occurrences are there, please return the smallest index.)

// public class BinarySearch {
//     public static int binarySearch(int[] arr, int target) {
//         int left = 0, right = arr.length - 1, idx = -1;
//         while (left <= right) {
//             int mid = (left + right) / 2;
//             if (arr[mid] == target) {
//                 idx = mid;
//                 right = mid - 1;
//             } else if (arr[mid] > target) {
//                 right = mid - 1;
//             } else {
//                 left = mid + 1;
//             }

//         }
//         return idx;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 10, 20, 30, 40, 50,60, 60, 60, 70, 80 };
//         int target = 60;
//         System.out.print(binarySearch(arr, target));
//     }
// }

// first and last occurence of sorted array

// public class BinarySearch {
//     public static ArrayList<Integer> firstAndLast(int[] arr, int target) {
//         ArrayList<Integer> ans = new ArrayList<>();
//         int first = -1, last = -1;
//         int left = 0, right = arr.length - 1;
//         while (left <= right) {
//             int mid = (left + right) / 2;
//             if (arr[mid] == target) {
//                 first = mid;
//                 right = mid - 1;
//             } else if (arr[mid] > target) {
//                 right = mid - 1;
//             } else {
//                 left = mid + 1;
//             }

//         }
//         left = 0;
//         right = arr.length - 1;
//         while (left <= right) {
//             int mid = (left + right) / 2;
//             if (arr[mid] == target) {
//                 last = mid;
//                 left = mid + 1;
//             } else if (arr[mid] > target) {
//                 right = mid - 1;
//             } else {
//                 left = mid + 1;
//             }
//         }
//         ans.add(first);
//         ans.add(last);
//         return ans;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 3, 5, 5, 5, 67, 122 };
//         int target = 5;
//         System.out.println(firstAndLast(arr, target));
//     }
// }

// // search a peak element

// public class BinarySearch {
//     public static int peakElement(int[] arr) {
//         int left = 0, right = arr.length - 1;
//         while (left < right) {
//             int mid = (left + right) / 2;
//             if (arr[mid] < arr[mid + 1]) {
//                 left = mid + 1;
//             } else {
//                 right = mid;
//             }

//         }
//         return left;
//     }

//     public static void main(String[] args) {
//         int[] arr = { -1, 0, 2, 4, 6, 8, 5, 3 };
//         System.out.print(peakElement(arr));
//     }
// }

// search a element in sorted array in descending order

// public class BinarySearch {
// public static int search(int[] arr, int target) {
// int left = 0, right = arr.length - 1, idx = -1;
// while (left <= right) {
// int mid = (left + right) / 2;
// if (arr[mid] == target) {
// idx = mid;
// right = mid - 1;
// } else if (arr[mid] > target) {
// left = mid + 1;
// } else {
// right = mid - 1;
// }

// }
// return idx;

// }

// public static void main(String[] args) {
// int[] arr = { 100, 91, 86, 77, 65, 52, 47, 38, 24, 16, 5 };
// int target = 24;
// System.out.print(search(arr, target));
// }
// }

// first and last occurence

// import java.util.*;

// public class BinarySearch {
//     public static ArrayList<Integer> firstAndLast(int[] arr, int target){
//         ArrayList<Integer> ans = new ArrayList<>();

//         int left = 0, right = arr.length-1;
//         int first = -1,  last =-1;
//         // first occurence
//         while(left <= right){
//             int mid = left + (right - left)/2;
//             if(arr[mid] == target){
//                 first = mid;
//                 right = mid - 1;
//             }
//             else if(arr[mid] > target){
//                 right = mid - 1;
//             }
//             else{
//                 left = mid + 1;
//             }
//         }
//         ans.add(first);

//         // second occurence
//         left = 0;
//         right = arr.length-1;
//         while(left <= right){
//             int mid = left + (right - left)/2;
//             if(arr[mid] == target){
//                 last = mid;
//                 left = mid + 1;
//             }
//             else if(arr[mid] > target){
//                 right = mid - 1;
//             }
//             else{
//                 left = mid + 1;
//             }
//         }
//         ans.add(last);
//         return ans;

//     }
//     public static void main(String[] args) {
//         int [] arr = {10, 20, 30, 40, 40, 40, 50, 60};
//         int target = 40;

//         ArrayList<Integer> ans = firstAndLast(arr, target);
//         System.out.println(ans);
//     }
// }

// peak element

// public class BinarySearch {
//     public static int peakElement(int[] arr) {
//         int left = 0, right = arr.length - 1;
//         while (left < right) {
//             int mid = left + (right - left) / 2;
//             if (arr[mid] < arr[mid + 1]) {
//                 left = mid + 1;
//             } else {
//                 right = mid;
//             }
//         }
//         return left;
//     }

//     public static void main(String[] args) {
//         int[] arr = { -1, 0, 2, 4, 6, 8, 5, 3 };
//         System.out.println(peakElement(arr));
//     }
// }

// another way to solve

// public class BinarySearch {
//     public static int peakElement(int[] arr) {
//         int left = 1, right = arr.length - 2;
//         while (left <= right) {
//             int mid = left + (right - left) / 2;
//             if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
//                 return mid;
//             } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }

//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] arr = { -1, 0, 2, 4, 6, 8, 5, 3 };
//         System.out.println(peakElement(arr));
//     }
// }

// descending order

// public class BinarySearch {
// public static boolean search(int[] arr, int target) {
// int left = 0, right = arr.length - 1;
// while (left <= right) {
// int mid = left + (right - left) / 2;
// if (arr[mid] == target) {
// return true;
// } else if (arr[mid] > target) {
// left = mid + 1;
// } else {
// right = mid - 1;
// }

// }
// return false;
// }

// public static void main(String[] args) {
// int[] arr = { 100, 91, 86, 77, 65, 52, 47, 38, 24, 16, 5 };
// int target = 47;
// System.out.println(search(arr, target));
// }
// }

// // floor in a sorted aaray 

// public class BinarySearch {
//     public static int floor(int[] arr, int x) {
//         int left = 0, right = arr.length - 1;
//         int idx = -1;
//         while (left <= right) {
//             int mid = left + (right - left) / 2;
//             if (arr[mid] > x) {
//                 right = mid - 1;
//             } else if (arr[mid] <= x) {
//                 idx = mid;
//                 left = mid + 1;
//             }
//         }
//         return idx;

//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 4, 10, 10, 12, 19 };
//         int x = 5;
//         System.out.println(floor(arr, x));
//     }
// }

//  Maximum count of positive integer and negative integer

// public class BinarySearch {
//     public static int maxPositiveNegative(int[] arr){
//         int left =0, right = arr.length-1;
//         int negative = 0, positive = 0;
//         while(left <= right){
//             int mid = left + (right - left) / 2;

//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {-3, -2, -1, 0, 0, 1, 2};
//     }
// }

// // floor of square root

// public class BinarySearch {
//     public static int squareRoot(int n) {
//         int root = 0;
//         for (int i = 0; i <= n; i++) {
//             if (i * i >= n) {
//                 break;
//             }
//             root = i;
//         }
//         return root;
//     }

//     public static void main(String[] args) {
//         int n = 11;
//         System.out.println(squareRoot(n));
//     }
// }

// public class BinarySearch {
//     public static int floorSqrt(int n) {
//         int low = 0, high = n;
//         while (low <= n) {
//             int mid = (low + high) / 2;
//             if (mid * mid == n) {
//                 return mid;
//             } else if (mid * mid > n) {
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }
//         return high;
//     }

//     public static void main(String[] args) {
//         int n = 20;
//         System.out.println(floorSqrt(n));
//     }
// }

// find first occurence

// public class BinarySearch {
//     public static int firstOccurence(int[] arr, int target) {
//         int left = 0, right = arr.length - 1;
//         int ans = -1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;
//             if (arr[mid] == target) {
//                 ans = mid;
//                 right = mid - 1;

//             } else if (arr[mid] > target) {
//                 right = mid - 1;
//             } else {
//                 left = mid + 1;
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6 };
//         int target = 3;
//         System.out.println(firstOccurence(arr, target));
//     }
// }

// first and last occurence

// import java.util.*;

// public class BinarySearch {
//     public static ArrayList<Integer> firstAndLast(int[] arr, int target) {
//         ArrayList<Integer> ans = new ArrayList<>();

//         int low = 0, high = arr.length - 1;
//         int first = -1, last = -1;
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (arr[mid] == target) {
//                 first = mid;
//                 high = mid - 1;
//             } else if (arr[mid] < target) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         ans.add(first);
//         low = 0;
//         high = arr.length - 1;
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (arr[mid] == target) {
//                 last = mid;
//                 low = mid + 1;
//             } else if (arr[mid] < target) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         ans.add(last);
//         return ans;

//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 1, 2, 2, 3, 3, 3, 3, 4, 5, 5, 6, 6 };
//         int target = 3;
//         ArrayList<Integer> ans = firstAndLast(arr, target);
//         System.out.println(ans);
//     }
// }

// public class BinarySearch {
//     public static int search(int[] arr, int k) {
//         int low = 0, high = arr.length - 1;
//         int idx = -1;
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (arr[mid] == k) {
//                 idx = mid;
//                 low = mid + 1;
//             } else if (arr[mid] > k) {
//                 low = mid + 1;

//             } else {
//                 high = mid - 1;
//             }
//         }
//         return idx;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 100, 91, 87, 76, 66, 52, 43, 35, 29, 13, 5 };
//         int k = 13;
//         System.out.println(search(arr, k));

//     }
// }

// find peak element in an mountain array

// public class BinarySearch {
//     public static int findPeakElement(int[] arr) {
//         int low = 1, high = arr.length - 2;
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
//                 return mid;
//             } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] arr = {-1, 0, 1, 2, 5, 6, 7, 8, 3, 2, 1, 0, -1};
//         System.out.println(findPeakElement(arr));
//     }
// }

//  Floor in a sorted array

// public class BinarySearch {
//     public static int floorSorted(int[] arr, int x) {
//         int idx = -1;
//         int low = 0, high = arr.length - 1;
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (arr[mid] <= x) {
//                 idx = mid;
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }

//         }
//         return idx;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 4, 10, 10, 12, 19 };
//         int x = 5;
//         System.out.println(floorSorted(arr, x));

//     }
// }

// maximum count of negative & positive integer

// public class BinarySearch {
//     public static int maxCount(int[] arr){
//         int negative = -1;
//         int positive = -1;

//         int low = 0, high = arr.length-1;
//         while(low <= high){
//             int mid = low  + (high - low) / 2;
//             if(){

//             }
//             else if(){

//             }
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {};
//     }
// }

// square root

// public class BinarySearch {
//     public static int floorsqrt(int n) {
//         int low = 1, high = n;
//         int ans = 0;
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (mid * mid <= n) {
//                 ans = mid;
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(floorsqrt(n));
//     }
// }

// square root

// public class BinarySearch {
//     public static int floorsqrt(int n) {
//         int ans = 0;
//         for (int i = 1; i <= n; i++) {
//             if (i * i > n) {
//                 break;
//             }
//             ans = i;

//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int n = 11;
//         System.out.println(floorsqrt(n));
//     }
// }

// floor squatre root

// public class BinarySearch {
//     public static int floorSquareRoot(int n) {
//         int root = 0;
//         for (int i = 0; i <= n; i++) {
//             if (i * i > n) {
//                 break;
//             }
//             root = i;
//         }
//         return root;
//     }

//     public static void main(String[] args) {
//         int n = 11;
//         System.out.println(floorSquareRoot(n));
//     }
// }

// another way

// public class BinarySearch {
//     public static int floorSqrt(int n) {
//         int low = 1, high = n;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (mid * mid == n) {
//                 return mid;
//             } else if (mid * mid > n) {
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }
//         return high;
//     }

//     public static void main(String[] args) {
//         int n = 11;
//         System.out.println(floorSqrt(n));
//     }
// }

// single amoung double sorted array

// public class BinarySearch {
//     public static int findOnce(int[] arr) {
//         int n = arr.length;
//         if (n == 1)
//             return arr[0];
//         if (arr[0] != arr[1])
//             return arr[0];
//         if (arr[n - 1] != arr[n - 2])
//             return arr[n - 1];

//         int low = 0, high = n - 1;
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
//                 return arr[mid];
//             }
//             int first = mid, second = mid;
//             if (arr[mid - 1] == arr[mid]) {
//                 first = mid - 1;
//             } else {
//                 second = mid + 1;
//             }
//             int leftCount = first - low;
//             int rightCount = high - second;

//             if (leftCount % 2 == 0) {
//                 low = second + 1;
//             } else {
//                 high = first - 1;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65 };
//         System.out.println(findOnce(arr));
//     }
// }

// practice

// public class BinarySearch {
//     public static int findOnce(int[] arr) {
//         int n = arr.length;
//         if (n == 1)
//             return arr[0];
//         if (arr[0] != arr[1])
//             return arr[0];
//         if (arr[n - 1] != arr[n - 2])
//             return arr[n - 1];

//         int left = 0, right = n - 1;
//         while (left <= right) {
//             int mid = left + (right - left) / 2;
//             if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
//                 return arr[mid];
//             }
//             int first = mid, second = mid;
//             if (arr[mid - 1] == arr[mid]) {
//                 first = arr[mid - 1];
//             } else {
//                 second = arr[mid + 1];
//             }
//             int firstCount = first - left;
//             int secondCount = right - second;

//             if (firstCount % 2 == 0) {
//                 left = second + 1;
//             } else {
//                 right = first - 1;
//             }

//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65 };
//         System.out.println(findOnce(arr));
//     }
// }

// first occurence

// public class BinarySearch {
//     public static int firstOcccurence(int[] arr, int target) {
//         int low = 0, high = arr.length - 1;
//         int first = -1;
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (arr[mid] == target) {
//                 first = mid;
//                 high = mid - 1;
//             } else if (arr[mid] > target) {
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }

//         }
//         return first;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 23, 4, 5, 67, 67, 67, 89, 90 };
//         int target = 67;
//         System.out.println(firstOcccurence(arr, target));
//     }
// }

// first and last occurence
// import java.util.*;

// public class BinarySearch {
//     public static void firstAndLast(int[] arr, int target) {
//         ArrayList<Integer> ans = new ArrayList<>();
//         int low = 0, high = arr.length - 1;
//         int first = -1;
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (arr[mid] == target) {
//                 first = mid;
//                 high = mid - 1;
//             } else if (arr[mid] > target) {
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }
//         ans.add(first);

//         low = 0;
//         high = arr.length - 1;
//         int second = -1;
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (arr[mid] == target) {
//                 second = mid;
//                 low = mid + 1;
//             } else if (arr[mid] > target) {
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }
//         ans.add(second);

//         for (int num : ans) {
//             System.out.print(num + " ");
//         }

//     }

//     public static void main(String[] args) {
//         int[] arr = { 23, 4, 5, 67, 67, 67, 89, 90 };
//         int target = 67;
//         firstAndLast(arr, target);
//     }
// }

// search in descending array

// public class BinarySearch {
//     public static int search(int[] arr, int target) {
//         int low = 0, high = arr.length - 1;
//         int first = -1;
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (arr[mid] == target) {
//                 first = mid;
//                 high = mid - 1;
//             } else if (arr[mid] > target) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         return first;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 90, 80, 70, 60, 60, 50, 40, 30, 10 };
//         int target = 60;
//         System.out.println(search(arr, target));
//     }
// }

// find peak in a sorted array

// public class BinarySearch {
//     public static int peakElement(int[] arr) {
//         int low = 1, high = arr.length - 2;
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
//                 return arr[mid];
//             } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] arr = { -1, 0, 1, 2, 5, 6, 7, 8, 3, 2, 1, 0, -1 };
//         System.out.println(peakElement(arr));
//     }
// }

// floor in a sorted array

// public class BinarySearch {
//     public static int floor(int[] arr, int x) {
//         int low = 0, high = arr.length - 1;
//         int idx = -1;
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (arr[mid] <= x) {
//                 idx = arr[mid];
//                 low = mid + 1;
//             } else if (arr[mid] > x) {
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }
//         return idx;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 4, 10, 10, 12, 19 };
//         int x = 5;
//         System.out.println(floor(arr, x));
//     }
// }

// square root

// public class BinarySearch {
//     public static int square(int n) {
//         int low = 1, high = n;
//         int ans = 0;
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (mid * mid <= n) {
//                 ans = mid;
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;            }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int n = 20;
//         System.out.println(square(n));
//     }
// }

// arrange coin

// public class BinarySearch {
//     public static int sqrt(int n) {
//         int low = 0, high = n;
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (mid * mid == n) {
//                 return mid;
//             } else if (mid * mid > n) {
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }
//         return -1;
//     }

//     public static int arrangeCoin(int n) {
//         return (sqrt(8 * n - 1) + 1) / 2;
//     }

//     public static void main(String[] args) {
//         int n = 13;
//         System.out.println(arrangeCoin(n));
//     }
// }

// search and element in sorted and rotated array

// public class BinarySearch {
//     public static int search(int[] arr, int target) {
//         int low = 0, high = arr.length - 1;
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (arr[mid] == target) {
//                 return mid;
//             } else if (arr[low] <= arr[mid]) {
//                 if (arr[low] <= target && target < arr[mid]) {
//                     high = mid - 1;
//                 } else {
//                     low = mid + 1;
//                 }
//             } else {
//                 if (arr[mid] < target && target <= arr[high]) {
//                     low = mid + 1;
//                 } else {
//                     high = mid - 1;
//                 }
//             }
//         }
//         return -1;

//     }

//     public static void main(String[] args) {
//         int[] arr = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
//         int target = 10;
//         System.out.println(search(arr, target));
//     }
// }






// kth missing positive number in a sorted array



public class BinarySearch {
    public static void main(stringpractice[] args) {
        int[] arr = {};
    }
}