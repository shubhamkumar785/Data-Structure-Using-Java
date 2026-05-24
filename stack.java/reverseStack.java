import java.util.*;

public class reverseStack {
    public static void reverse(Stack<Integer> st1) {
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();
        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        while (!st2.isEmpty()) {
            st3.push(st2.pop());
        }
        while (!st3.isEmpty()) {
            st1.push(st3.pop());
        }
    }

    // another way

    // public static void reverse(Stack<Integer> st1) {
    // Stack<Integer> st2 = new Stack<>();

    // while (!st1.isEmpty()) {
    // st2.push(st1.pop());
    // }
    // while (!st2.isEmpty()) {
    // st1.addAll(st2);
    // }
    // }

    // reverse using recursion

    // public static void reverseRecur(Stack<Integer> st){
    // if(st.size() <= 1){
    // return;
    // }
    // int top = st.pop();
    // reverseRecur(st);
    // pushAtBottom(st, top);
    // }
    // public static void pushAtBottom(Stack<Integer> st, int ele){
    // if(st.isEmpty()){
    // st.push(ele);
    // return;
    // }
    // int top = st.pop();
    // pushAtBottom(st, top);
    // st.push(top);
    // }

    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.add(10);
        st1.add(20);
        st1.add(30);
        st1.add(40);

        System.out.println("Original Stack: " + st1);

        reverse(st1);

        System.out.println("Reverse Stack: " + st1);

        reverseRecur(st);
    }

}
