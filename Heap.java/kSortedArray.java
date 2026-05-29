
import java.util.*;

public class kSortedArray {
    public static void kthSorted(int[] arr, int k) {
        int idx = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int ele : arr) {
            pq.add(ele);
            if (pq.size() > k) {
                int top = pq.remove();
                arr[idx++] = top;
            }
        }
        while (!pq.isEmpty()) {
            arr[idx++] = pq.remove();
        }

    }

    public static void main(String[] args) {
        int[] arr = { 6, 5, 3, 2, 8, 10, 9 };
        int k = 3;
        kthSorted(arr, k);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
