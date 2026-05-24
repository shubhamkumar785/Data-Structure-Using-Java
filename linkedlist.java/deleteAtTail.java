class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class linkedList {
    Node head = null;
    Node tail = null;

    public void insert(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    public void display(Node head) {
        if (head == null)
            return;
        System.out.print(head.data + " ");
        display(head.next);
    }

    public void delete() {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }
}

public class deleteAtTail {

    public static void main(String[] args) {

        linkedList ll = new linkedList();

        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);

        ll.delete();

        ll.display(ll.head);
    }
}