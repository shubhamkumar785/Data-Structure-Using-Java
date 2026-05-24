
public class powerOfThree {
    public static boolean isPowerThree(int n) {
        int i = 1;
        while (i < n) {
            i = i * 3;
        }
        return (i == n);
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(isPowerThree(n));
    }
}
