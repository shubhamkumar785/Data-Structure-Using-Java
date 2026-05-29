import java.util.*;

public class sortUsingHeap {
    public static void sort(int[] arr) {
        int idx = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int ele : arr) {
            pq.add(ele);
        }

        while (!pq.isEmpty()) {
            arr[idx++] = pq.remove();
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 4, 1, 2, 7, 9, 8 };

        sort(arr);

        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }

}
