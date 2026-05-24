import java.util.*;

public class nextGreatestElement {

    public static ArrayList<Integer> nextGreatest(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        nge[n - 1] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(arr[n - 2]);
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] > st.peek()) {
                st.pop();
            }
            if (st.size() == 0) {
                nge[-1] = -1;
            } else {
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            ans.add(nge[i]);
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 4 };
    }
}
