
public class addTwoNumber {
    public static Node addTwoNumber(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        Node dummy = new Node(-1);
        Node temp3 = dummy;
        int carry = 0;

        while (temp1 != null || temp2 != null) {
            int sum = carry;
            if (temp1 != null) {
                sum += temp1.data;
            }
            if (temp2 != null) {
                sum += temp2.data;
            }
            Node newNode = new Node(sum % 10);
            carry = sum / 10;

            temp3.next = newNode;
            temp3 = temp3.next;
        }
        if (carry > 0) {
            Node a = new Node(carry);
            temp3.next = a;
        }
        return dummy.next;
    }

    public static void main(String[] args) {

    }
}
