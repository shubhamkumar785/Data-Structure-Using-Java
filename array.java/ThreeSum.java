
import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> sum(int[] arr) {
        int n = arr.length;

        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> list = Arrays.asList(arr[i], arr[j], arr[k]);

                        Collections.sort(list);
                        set.add(list);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {

        int[] arr = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> result = sum(arr);

        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}
