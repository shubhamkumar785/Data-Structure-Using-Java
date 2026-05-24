
public class peakIndexMountainArray {
    public static int peakElement(int[] arr) {
        int low = 1, high = arr.length - 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 2, 1 };
        System.out.println(peakElement(arr));

    }
}
