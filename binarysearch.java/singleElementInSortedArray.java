
public class singleElementInSortedArray {
    public static int singleElement(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid - 1] != arr[mid] && arr[mid] != arr[mid + 1]) {
                return mid;
            }
            if (mid % 2 == 0) {
                if (arr[mid - 1] == arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (arr[mid - 1] == arr[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 6 };
        System.out.println(singleElement(arr));
    }
}
