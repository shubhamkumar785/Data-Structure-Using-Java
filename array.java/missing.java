public class missing {
    public static int missingElement(int[] arr) {
        int n = arr.length + 1;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        int totalSum = n * (n + 1) / 2;

        int missing = totalSum - actualSum;
        return missing;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 7 };
        System.out.println(missingElement(arr));
    }
}
