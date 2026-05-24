
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class linkedlist {
    Node head = null;
    Node tail = null;

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void size() {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
    }

    public void insertAtEnd(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    public void insertAtIndex(int val, int idx) {
        Node temp = new Node(val);
        Node t = head;

        for (int i = 0; i < idx - 1; i++) {
            t = t.next;
        }
        temp.next = t.next;
        t.next = temp;
    }

}

public class insertAtIndex {

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);

        ll.insertAtIndex(50, 1);
        ll.display();
    }
}
