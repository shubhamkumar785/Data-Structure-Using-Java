class Node {
    int data;
    Node next;
    Node random;

    Node(int data) {
        this.data = data;
    }
}

public class copyWithRandomPointer {
    public static Node copyAndRandomPointer(Node head) {

        if (head == null) {
            return null;
        }

        Node oldTemp = head;
        Node newHead = new Node(head.data);
        Node newTemp = oldTemp;
        oldTemp = oldTemp.next;

        while (oldTemp != null) {
            Node copyNode = new Node(oldTemp.data);
            newTemp.next = copyNode;
            newTemp = newTemp.next;
            oldTemp = oldTemp.next;
        }
        oldTemp = head;
        newTemp = newHead;

        while (oldTemp != null) {
            if (oldTemp.random != null) {
                Node temp1 = head;
                Node temp2 = newHead;

                while (temp1 != oldTemp.random) {
                    temp1 = temp1.next;
                    temp2 = temp2.next;
                }
                newTemp.random = temp2;
            }
            oldTemp = oldTemp.next;
            newTemp = newTemp.next;
        }
        return newHead;
    }

    public static void main(String[] args) {

    }
}