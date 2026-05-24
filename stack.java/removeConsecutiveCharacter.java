import javav.util.Stack;

public class removeConsecutiveCharacter {
    public static void remove(String s) {
        int n = s.length();
        Stack<Character> st1 = new Stack<>();
        stack<Character> st2 = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (st1.peek() != ch) {
                st1.push(ch);
            }
        }
        while (!st1.isEmpty()) {
            st2.push(st1);
        }
        while (!st2.isEmpty()) {
            System.out.print(st2.pop() + " ");
        }
    }

    public static void main(String[] args) {
        String s = "aaaaabbcccdaa";
        remove(s);
    }
}
