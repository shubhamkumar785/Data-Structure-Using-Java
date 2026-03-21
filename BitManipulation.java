
/* 

question - swap two number


public class BitManipulation {
    public static int[] swapTwoNumber(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        return new int[]{a, b};
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 8;

        int[] result = swapTwoNumber(a, b);
        a = result[0];
        b = result[1];

        System.out.println("a : " + a + " b : " + b);
    }
}



question - swap two number



public class BitManipulation {
    public static void main(String[] args) {
        int n = 5;

        //1's complement
        System.out.println(~n);

        // 2's complement
        System.out.println(~n + 1);
    }
}


question - power of 2


public class BitManipulation {
    public static void main(String[] args) {
        int n = 6;

        System.out.println(1 << n);
    }
}



question - single number
*/

// Unmerged paths:
//   (use "git restore --staged <file>..." to unstage)
//   (use "git add <file>..." to mark resolution)
//         both added:      recursion.java

public class BitManipulation {
    public static int singleNumber(int[] arr) {
        int xor = 0;
        for (int ele : arr) {
            xor = xor ^ ele;
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 3, 1 };
        System.out.println(singleNumber(arr));
    }
}