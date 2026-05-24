public class singleNumber {
    public static int single(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result = result ^ num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 4, 3, 4, 5, 5 };
        System.out.println(single(arr));
    }
}
