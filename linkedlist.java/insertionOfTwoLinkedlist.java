
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class insertionOfTwoLinkedlist {
    public Node getIntersectionNode(Node headA, Node headB) {
        Node tempA = headA;
        Node tempB = headB;

        int lengthA = 0;
        while (tempA != null) {
            lengthA++;
            tempA = tempA.next;
        }

        int lengthB = 0;
        while (tempA != null) {
            lengthB++;
            tempA = tempA.next;
        }

        if (lengthA > lengthB) {
            int step = lengthA - lengthB;
            for (int i = 0; i < step; i++) {
                tempA = tempA.next;
            }
        } else {
            int step = lengthB - lengthA;
            for (int i = 0; i < step; i++) {
                tempB = tempB.next;
            }
        }
        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }

    public static void main(String[] args) {
        insertionOfTwoLinkedlist obj = new insertionOfTwoLinkedlist();

        // common part
        Node c1 = new Node(30);
        Node c2 = new Node(40);
        Node c3 = new Node(50);

        c1.next = c2;
        c2.next = c3;

        Node a1 = new Node(10);
        Node a2 = new Node(20);

        a1.next = a2;
        a2.next = c1;

        Node b1 = new Node(90);
        Node b2 = new Node(80);

        b1.next = b2;
        b2.next = c1;

        Node intersection = obj.getIntersectionNode(a1, b1);

        if (intersection != null) {
            System.out.println("Intersection at node: " + intersection.data);
        } else {
            System.out.println("No Intersection");
        }
    }
}