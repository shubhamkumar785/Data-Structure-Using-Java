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
