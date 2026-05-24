public class rotate {
    public static void rotateArray(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        i++;
        j--;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 8, 1, 2, 4, 9, 0 };
        int d = 3;
        rotateArray(arr, d);
    }
}
