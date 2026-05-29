import java.util.*;

class Pair implements Comparable<Pair> {
    int ele;
    int freq;

    Pair(int ele, int freq) {
        this.ele = ele;
        this.freq = freq;
    }

    @Override
    public int compareTo(Pair p) {
        if (this.freq == p.freq) {
            return this.ele - p.ele;
        }
        return this.freq - p.freq;
    }
}

public class topKthFrequentElement {
    public static ArrayList<Integer> topKthElement(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int ele : map.keySet()) {
            int freq = map.get(ele);

            pq.add(new Pair(ele, freq));

            if (pq.size() > k) {
                pq.remove();
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (!pq.isEmpty()) {
            Pair top = pq.remove();
            list.add(top.ele);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9 };
        int k = 4;

        ArrayList<Integer> ans = topKthElement(arr, k);
        System.out.println(ans);
    }
}