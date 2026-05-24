
public class firstAndlastOccurence {
    public static int[] firstAndLast(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int first = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        low = 0;
        high = arr.length - 1;
        int second = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                second = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return new int[] { first, second };

    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 30, 30, 40, 50, 60 };
        int target = 30;

        int[] result = firstAndLast(arr, target);
        System.out.println("First Occurrence: " + result[0]);
        System.out.println("Last Occurrence: " + result[1]);
    }
}
