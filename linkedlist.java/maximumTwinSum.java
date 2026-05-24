
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class maximumTwinSum {
    public static Node reverse(Node head) {
        Node curr = head;
        Node prev = null;
        Node agla = null;

        while (curr != null) {
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }
        return prev;
    }

    public static int pairSum(Node head) {
        int max = Integer.MIN_VALUE;
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
            int sum = p1.data + p2.data;
            if (sum > max) {
                max = sum;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return max;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(10);
        Node c = new Node(13);
        Node d = new Node(11);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(2);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        System.out.println(pairSum(a));
    }
}
