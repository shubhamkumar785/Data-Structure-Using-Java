
import java.util.*;

public class traverseStack {
    public static void stack(Stack<String> st1) {

        Stack<String> st2 = new Stack<>();
        while (!st1.isEmpty()) {
            String top = st1.pop();
            System.out.print(top + " ");
            st2.push(top);

        }
        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }
    }

    public static void main(String[] args) {
        Stack<String> st1 = new Stack<>();
        st1.push("Shubham");
        st1.push("Shivam");
        st1.push("Subhanshu");
        st1.push("Subendhu");
        st1.push("Shri nath");

        stack(st1);

    }
}
