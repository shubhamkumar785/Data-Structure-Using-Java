public class bubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 30, 60, 40, 80, 10, 20, 70 };
        bubbleSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
