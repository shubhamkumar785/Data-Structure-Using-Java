
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class diameterTree {

    public static int diameter(Node root) {
        if (root == null)
            return 0;
        int leftDia = diameter(root.left);
        int rightDia = diameter(root.right);
        int currDia = height(root.left) + height(root.right);

        return Math.max(currDia, Math.max(leftDia, rightDia));

    }

    public static int height(Node root) {
        if (root == null)
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
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

        System.out.println(diameter(a));

    }
}