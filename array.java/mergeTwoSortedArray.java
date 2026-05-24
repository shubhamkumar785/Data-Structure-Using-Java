
import java.util.*;

public class mergeTwoSortedArray {
    public static void merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] result = new int[n1 + n2];

        int idx = 0;
        for (int num : arr1) {
            result[idx++] = num;
        }
        for (int num : arr2) {
            result[idx++] = num;
        }

        Arrays.sort(result);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 30, 40, 50 };
        int[] arr2 = { 25, 35, 30, 45, 55 };
        merge(arr1, arr2);
    }
}
