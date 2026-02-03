// ------------------------------------------------------------------------------------------------------
//                                      infinte loop
// ------------------------------------------------------------------------------------------------------

public class recursion {
    public static void ajay() {
        System.out.println("Priya");
        ajay();
    }

    public static void main(String[] args) {
        ajay(); // call ajay print infinite priya
    }
}

// ------------------------------------------------------------------------------------------------------
//                                      print 10 to 1
// ------------------------------------------------------------------------------------------------------

public class recursion {
    public static void print(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        print(n - 1);
    }

    public static void main(String[] args) {
        print(10);
    }
}


// ------------------------------------------------------------------------------------------------------
//                                      print 1 to n
// ------------------------------------------------------------------------------------------------------

public class recursion1 {
    public static void print(int x, int n) {
        if (x > n) {
            return;
        }
        System.out.println(x);
        print(x + 1, n);
    }

    public static void main(String[] args) {
        print(1, 10);

    }
}




// ------------------------------------------------------------------------------------------------------
//                                    print decreasing and increasing
// ------------------------------------------------------------------------------------------------------

public class recursion1 {
    public static void func(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        func(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        func(5);
    }
}


// ------------------------------------------------------------------------------------------------------
//                                    factorial number
// ------------------------------------------------------------------------------------------------------

public class recursion1 {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
}

// ------------------------------------------------------------------------------------------------------
//                                    'a' raised to the power 'b'
// ------------------------------------------------------------------------------------------------------

public class recursion1 {
    public static int power(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * power(a, b - 1);
        }
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        System.out.println(power(a, b));

    }
}




// ------------------------------------------------------------------------------------------------------
//                            sum of n natural number
// ------------------------------------------------------------------------------------------------------

public class recursion1 {
    public static int sumNumber(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumNumber(n - 1);

    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println(sumNumber(n));
    }
}



// ------------------------------------------------------------------------------------------------------
//                               Power of number
// ------------------------------------------------------------------------------------------------------

public class recursion1 {
    public static int power(int n, int k) {
        if (k == 0) {
            return 1;
        }
        return n * power(n, k - 1);
    }

    public static void main(String[] args) {
        int n = 2;
        int k = 4;
        System.out.println(power(n, k));
    }
}




// ------------------------------------------------------------------------------------------------------
//                         another way Greatest Common Divisor of 2 number
// ------------------------------------------------------------------------------------------------------

// public class recursion1 {
//     public static int gcd(int a, int b) {
//         if (a == 0) {
//             return b;
//         }
//         return gcd(b % a, a);
//     }

//     public static void main(String[] args) {
//         int a = 29;
//         int b = 41;
//         System.out.println(gcd(a, b));
//     }
// }

// ------------------------------------------------------------------------------------------------------
//                                     nth fibinacci number
// ------------------------------------------------------------------------------------------------------

// public class recursion1 {
//     public static int nthFibonacci(int n) {
//         if (n == 0) {
//             return 0;
//         } else if (n == 1) {
//             return 1;
//         } else {
//             return nthFibonacci(n - 1) + nthFibonacci(n - 2);
//         }
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         System.out.print(nthFibonacci(n));
//     }
// }




// ------------------------------------------------------------------------------------------------------
//                               way to reach the nth stair    
// ------------------------------------------------------------------------------------------------------

public class recursion1 {
    public static int nthStair(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return nthStair(n - 1) + nthStair(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(nthStair(n));
    }
}



// ------------------------------------------------------------------------------------------------------
//                                              print array using recursion 
// ------------------------------------------------------------------------------------------------------

public class recursion1 {
    public static void printRecur(int[] arr, int i) {
        if (i == arr.length)
            return;
        System.out.print(arr[i] + " ");
        printRecur(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        printRecur(arr, 0);
    }
}



// ------------------------------------------------------------------------------------------------------
//                                     print reverse array using recursion 
// ------------------------------------------------------------------------------------------------------

public class recursion1 {
    public static void printReverse(int[] arr, int i) {
        if (i == arr.length)
            return;
        printReverse(arr, i + 1);
        System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        printReverse(arr, 0);
    }
}





// ------------------------------------------------------------------------------------------------------
//                                print trur if number exist in array
// ------------------------------------------------------------------------------------------------------

public class recursion1 {
    public static boolean exist(int[] arr, int ele, int idx) {
        if (idx == arr.length) {
            return false;
        }
        if (arr[idx] == ele) {
            return true;
        }
        return exist(arr, ele, idx + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int ele = 30;
        System.out.println(exist(arr, ele, 0));
    }
}



// ------------------------------------------------------------------------------------------------------
//                               binary search using recursion
// ------------------------------------------------------------------------------------------------------

public class recursion1 {
    public static int helper(int[] arr, int tar, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == tar) {
            return mid;
        } else if (arr[mid] > tar) {
            return helper(arr, tar, low, mid - 1);
        } else {
            return helper(arr, tar, mid + 1, high);
        }
    }

    public static int binary(int[] arr, int tar) {
        int n = arr.length;
        return helper(arr, tar, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int tar = 40;
        System.out.println(binary(arr, tar));
    }
}
