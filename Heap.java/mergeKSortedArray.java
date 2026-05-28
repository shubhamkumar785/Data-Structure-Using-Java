
import java.util.*;

public class mergeKSortedArray {
    // Brute force approach
    public static void merge(int[] arr1, int m, int[] arr2, int n) {
        for (int i = 0; i < n; i++) {
            arr1[m + i] = arr2[i];
        }
        Arrays.sort(arr1);
    }

    // used Heap
    public static void merge1(int[] arr1, int m, int[] arr2, int n) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < m; i++) {
            heap.add(arr1[i]);
        }
        for (int i = 0; i < n; i++) {
            heap.add(arr2[i]);
        }

        int idx = 0;
        while (!heap.isEmpty()) {
            arr1[idx++] = heap.poll();
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 0, 0, 0 };
        int[] arr2 = { 2, 5, 6 };
        int m = 3;
        int n = 3;

        merge(arr1, m, arr2, m);

        for (int num : arr1) {
            System.out.print(num + " ");
        }
    }
}
