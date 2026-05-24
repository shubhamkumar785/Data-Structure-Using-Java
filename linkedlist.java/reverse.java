
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class reverse {

    public static Node reverseNode(Node head) {
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

    public static void display(Node head) {
        // Node temp = head;
        // while (temp != null) {
        // System.out.print(temp.data + " ");
        // temp = temp.next;
        // }
        // System.out.println();

        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        display(head.next);
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

        System.out.println("Original:");
        display(a);

        a = reverseNode(a);

        System.out.println("\nReversed:");
        display(a);
    }
}