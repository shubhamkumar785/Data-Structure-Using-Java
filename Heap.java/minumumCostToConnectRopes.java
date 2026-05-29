
import java.util.*;

public class minumumCostToConnectRopes {
    public static int minimumCost(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int ele : arr) {
            pq.add(ele);
        }
        int totalCost = 0;
        while (pq.size() > 1) {
            int firstTop = pq.remove();
            int secondTop = pq.remove();
            int sum = firstTop + secondTop;
            totalCost += sum;
            pq.add(sum);
        }
        return totalCost;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 7, 6, 9 };

        System.out.println(minimumCost(arr));

    }

}
