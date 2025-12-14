public class BinarySearch {
    public static boolean binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };
        int target = 60;
        System.out.print(binarySearch(arr, target));
    }
}
