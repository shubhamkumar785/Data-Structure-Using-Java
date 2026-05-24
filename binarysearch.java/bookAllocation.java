public class bookAllocation {

    public static int minAllocation(int[] arr, int n, int m) {
        if (m > n) {
            return -1;
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int low = 0, high = sum;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isValid(arr, n, m, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static boolean isValid(int[] arr, int n, int m, int maxAllowedPage) {

        int stud = 1;
        int pages = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] > maxAllowedPage) {
                return false;
            }

            if (pages + arr[i] <= maxAllowedPage) {
                pages += arr[i];
            } else {
                stud++;
                pages = arr[i];
            }
        }

        return stud <= m;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 1, 3, 4 };
        int n = 4;
        int m = 2;

        System.out.println(minAllocation(arr, n, m));
    }
}