class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class mergeTwoSortedList {

    // without extra space
    // public static Node mergeList(Node head1, Node head2){

    // Node temp1 = head1;
    // Node temp2 = head2;

    // Node head = new Node(-1);
    // Node temp = head;

    // while(temp1 != null && temp2 != null){
    // if(temp1.data < temp2.data){
    // Node a = new Node(temp1.data);
    // temp.next = a;
    // temp = a;
    // temp1 = temp1.next;
    // }
    // else{
    // Node a = new Node(temp2.data);
    // temp.next = a;
    // temp = a;
    // temp2 = temp2.next;
    // }
    // }

    // if(temp1 != null){
    // temp.next = temp1;
    // } else {
    // temp.next = temp2;
    // }

    // return head.next;
    // }

    // with extra space
    public static Node mergeList(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;

        Node head = new Node(-1);
        Node temp = head;

        while (temp1 != null && temp2 != null) {
            if (temp1.data < temp2.data) {
                temp.next = temp1;
                temp1 = temp1.next;

            } else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        if (temp1 == null) {
            temp.next = temp2;
        } else {
            temp.next = temp1;
        }
        return head.next;
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node a1 = new Node(1);
        Node b1 = new Node(3);
        Node c1 = new Node(5);

        a1.next = b1;
        b1.next = c1;

        Node a2 = new Node(2);
        Node b2 = new Node(4);
        Node c2 = new Node(6);

        a2.next = b2;
        b2.next = c2;

        Node result = mergeList(a1, a2);

        display(result);
    }
}