
public class addTwoInteger {
    public static int Add(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        System.out.print(Add(a, b));
    }
}