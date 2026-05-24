
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class removeNthNodeFromLast {
    public static Node NthNode(Node head, int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        if (n == size) {
            return head.next;
        }
        int m = size - n + 1;
        temp = head;
        for (int i = 1; i < m; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        Node q = NthNode(a, 3);
        Node temp = q;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}
