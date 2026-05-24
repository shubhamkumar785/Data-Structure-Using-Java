import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class removeNodeGromLL {

    public ListNode removeNodes(ListNode head) {

        Stack<ListNode> st = new Stack<>();

        ListNode temp = head;

        while (temp != null) {

            while (!st.isEmpty() && st.peek().val < temp.val) {
                st.pop();
            }

            st.push(temp);
            temp = temp.next;
        }

        temp = null;

        while (!st.isEmpty()) {

            ListNode top = st.pop();

            top.next = temp;

            temp = top;
        }

        return temp;
    }

    public static void main(String[] args) {

    }
}
