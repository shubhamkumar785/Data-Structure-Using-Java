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


// rotate array
// public class Arrays {
//     public static void reverse(int[] arr, int i, int j) {
//         while (i <= j) {
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//             i++;
//             j--;
//         }
//     }

//     public static void rotate(int[] arr, int d) {
//         int n = arr.length;
//         reverse(arr, 0, d - 1);
//         reverse(arr, d, n - 1);
//         reverse(arr, 0, n - 1);
//     }

//     public static void main(String[] args) {
//         int[] arr = { 10, 20, 30, 40, 50, 60 };
//         int d = 2;

//         rotate(arr, d);

//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }

//missing element

// public class Arrays {
//     public static int missingNumber(int[] arr) {
//         int n = arr.length + 1;
//         int sum = n * (n + 1) / 2;
//         int actualSum = 0;

//         for (int num : arr) {
//             actualSum += num;
//         }
//         int missing = sum - actualSum;
//         return missing;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 3, 5 };
//         System.out.println(missingNumber(arr));
//     }
// }

// segregate 0's and 1's

public class Arrays {
    public static void segregate(int[] arr) {
        int zero = 0;
        int one = 0;
        for (int num : arr) {
            if (num == 0) {
                zero++;
            } else {
                one++;
            }
        }
        for (int i = 0; i < one; i++) {
            arr[i] = 1;
        }
        for (int i = one; i <= arr.length - 1; i++) {
            arr[i] = 0;

        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 0, 1, 0 };
        segregate(arr);
    }
}





// wave array

public class Arrays {
    public static void wave(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            if (i == arr.length - 1) {
                return;
            }
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;

        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 }; // 2, 1, 4, 3, 5
        wave(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}



// Merge Two Array

public class Arrays {
    public static void display(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        merge(c, a, b);

        for (int num : c) {
            System.out.print(num + " ");
        }

    }

    public static void merge(int[] c, int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        if (i == a.length) {
            while (j < b.length) {
                c[k] = b[j];
                k++;
                j++;
            }
        }
        if (j == b.length) {
            while (i < a.length) {
                c[k] = a[i];
                k++;
                i++;
            }
        }

    }

    public static void main(String[] args) {
        int[] a = { 2, 5, 6, 9, 20 };
        int[] b = { 1, 3, 4, 5, 7, 8 };
        display(a, b);
    }
}

