
public class removeCyclicBegins {
    public static Node removeCyclic(Node head) {
        Node slow = head;
        Node fast = head;

        boolean hasCycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }
        if (!hasCycle) {
            return head;
        }
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        Node temp = fast;
        while (temp.next != slow) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static void main(String[] args) {

    }
}
