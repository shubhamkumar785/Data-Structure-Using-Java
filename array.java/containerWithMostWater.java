public class containerWithMostWater {
    public static int container(int[] arr) {
        int leftPointer = 0, rightPointer = arr.length - 1;
        int maxWater = 0;
        while (leftPointer < rightPointer) {
            int wide = rightPointer - leftPointer;
            int ht = Math.min(arr[leftPointer], arr[rightPointer]);
            int area = ht * wide;
            maxWater = Math.max(maxWater, area);

            if (leftPointer < rightPointer) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(container(arr));
    }
}
