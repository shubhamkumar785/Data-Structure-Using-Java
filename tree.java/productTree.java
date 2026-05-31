
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class productTree {

    public static int product(Node root) {
        if (root == null) {
            return 1;
        }
        return root.data * product(root.left) * product(root.right);
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.left = b;
        a.right = c;
        b.right = d;
        c.left = e;

        System.out.println(product(a));

    }
}