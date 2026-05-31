
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class maxAndMinTree {

    public static int max(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;

        return Math.max(root.data, Math.max(max(root.left), max(root.right)));
    }

    public static int min(Node root) {
        if (root == null)
            return Integer.MAX_VALUE;

        return Math.min(root.data, Math.min(min(root.left), min(root.right)));
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

        System.out.println(max(a));
        System.out.println(min(a));

    }
}