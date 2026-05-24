
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class nthNodeFromLast {
    public static Node NthNode(Node head, int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int m = size - n + 1;
        temp = head;
        for (int i = 0; i < m - 1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node q = NthNode(a, 3);
        System.out.println(q.data);

    }
}
