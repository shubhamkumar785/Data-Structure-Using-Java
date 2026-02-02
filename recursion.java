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
