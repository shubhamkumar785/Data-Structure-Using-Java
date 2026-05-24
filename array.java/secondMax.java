public class secondMax {
    public static int secondMaximum(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] != first && arr[i] > first) {
                second = arr[i];
            }
        }
        return second;

    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        System.out.println(secondMaximum(arr));

    }
}
