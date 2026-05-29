import java.util.*;

public class kthLargestElement {
    public static int kthLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int ele : arr) {
            pq.add(ele);
            if (pq.size() > k) {
                pq.remove();
            }
        }
        return pq.peek();

    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 1, 4, 9 };
        int k = 3;

        System.out.println(kthLargest(arr, k));
    }
}
