class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class Stack1 {

    Node head;
    int length;

    int peek() {

        if (length == 0) {
            System.out.println("Stack is Empty!");
            return -1;
        }

        return head.data;
    }

    void pop() {

        if (length == 0) {
            System.out.println("Stack is Empty!");
            return;
        }

        head = head.next;
        length--;
    }

    void push(int data) {

        Node temp = new Node(data);

        if (length == 0) {
            head = temp;
        } else {
            temp.next = head;
            head = temp;
        }

        length++;
    }

    int size() {
        return length;
    }

    void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class StackImplUsingLL {

    public static void main(String[] args) {

        Stack1 st = new Stack1();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        st.display();

        System.out.println("Top Element : " + st.peek());

        st.pop();

        System.out.println("Size : " + st.size());

        st.display();
    }
}