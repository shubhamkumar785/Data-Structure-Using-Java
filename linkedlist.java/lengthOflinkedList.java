
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class lengthOflinkedList {

    public static int length(Node head) {
        int count = 0;
        if (head == null) {
            return 1;
        }
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;

    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        a.next = b;
        b.next = c;
        c.next = d;

        System.out.println(length(a));
    }
}
