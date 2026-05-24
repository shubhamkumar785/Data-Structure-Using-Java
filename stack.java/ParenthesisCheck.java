import java.util.*;

public class ParenthesisCheck {
    public static boolean isParenthesis(String str) {
        int n = str.length();
        if (n % 2 == 1)
            return false;
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.size() == 0)
                    return false;
                char top = st.peek();
                if (isSame(top, ch)) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static boolean isSame(char top, char ch) {
        if (top == '(' && ch == ')')
            return true;
        if (top == '{' && ch == '}')
            return true;
        if (top == '[' && ch == ']')
            return true;
        return false;
    }

    public static void main(String[] args) {

        String str = "{([])}()";
        System.out.println(isParenthesis(str));
    }
}