public class selectionSort {
    public static void selection(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            swap(arr, i, smallestIndex);
        }
    }

    public static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void main(String[] args) {
        int[] arr = { 4, 1, 5, 2, 3 };

        selection(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
