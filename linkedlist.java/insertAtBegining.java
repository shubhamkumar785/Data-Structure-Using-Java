
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

    public void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
            tail = temp;

        } else {
            head = temp.next;
            head = temp;
        }

    }
}

public class insertAtBegining {

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtHead(10);
        ll.insertAtHead(20);
        ll.insertAtHead(30);
        ll.insertAtHead(40);

        ll.display();
    }
}
