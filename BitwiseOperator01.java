// power of 2
public class BitwiseOperator01 {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n = n / 2;
        }
        return (n == 1);
    }

    public static void main(String[] args) {
        int n = 4;
        if (isPowerOfTwo(n)) {
            System.out.println(n + " is a power of 2");
        } else {
            System.out.println(n + "is not a power of 2");
        }
    }
}

// power of 3


public class BitwiseOperator01 {
    public static boolean isPowerOFThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        return (n == 1);
    }

    public static void main(String[] args) {
        int n = 27;
        if (isPowerOFThree(n)) {
            System.out.println(n + " is power of 3");
        } else {
            System.out.println(n + " is not power of 3");
        }
    }
}


