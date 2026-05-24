
import java.util.*;

public class PushAtBottom {
    public static void PushAtBottom(Stack<Integer> st, int ele) {
        if (st.isEmpty()) {
            st.push(ele);
            return;
        }
        int top = st.pop();
        PushAtBottom(st, ele);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        int ele = 50;

        PushAtBottom(st, ele);
        System.out.println(st);
    }
}
