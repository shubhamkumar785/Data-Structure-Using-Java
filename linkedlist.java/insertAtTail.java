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

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class insertAtTail {
    public static void main(String[] args) {
        linkedList list = new linkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.insert(60);
        list.display();
    }
}