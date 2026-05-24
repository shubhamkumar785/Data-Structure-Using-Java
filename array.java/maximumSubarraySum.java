
public class maximumSubarraySum {
    // brute force approach
    // public static int sum(int[] arr){
    // int maxSum =0;
    // for(int i=0; i<arr.length; i++){
    // int currentSum = 0;
    // for(int j=i; j<arr.length; j++){
    // currentSum += arr[j];
    // maxSum = Math.max(currentSum, maxSum);

    // }
    // }
    // return maxSum;
    // }

    // kadane's algorithm
    public static int sum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            maxSum = Math.max(maxSum, currSum);

            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(sum(arr));
    }
}
