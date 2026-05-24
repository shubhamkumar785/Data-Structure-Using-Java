
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class palindromeLinkedlist {
    public static Node reverse(Node head) {
        Node prev = null;
        Node agla = null;
        Node curr = head;

        while (curr != null) {
            agla = curr.next;
            curr.next = prev;
            curr = agla;
        }
        return prev;
    }

    public static boolean isPalindrome(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node temp = reverse(slow.next);
        slow.next = temp;

        Node p1 = head;
        Node p2 = slow.next;

        while (p2 != null) {
            if (p1.data != p2.data) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        System.out.println(isPalindrome(head));
    }
}
