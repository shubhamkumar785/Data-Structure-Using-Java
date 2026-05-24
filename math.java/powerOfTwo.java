
public class powerOfTwo {
    public static boolean isPowerTwo(int n) {
        int i = 1;
        while (i < n) {
            i = i * 2;
        }
        return (i == n);
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(isPowerTwo(n));
    }

}
