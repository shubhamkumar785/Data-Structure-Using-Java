class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class findMiddileElement {

    public static int middileElement(Node head) {
        Node temp = head;

        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int mid = size / 2;

        temp = head;
        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }

        return temp.data;
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

        System.out.println("Middle element: " + middileElement(a));
    }
}