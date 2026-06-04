
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class symmtericTree {

    public static boolean isSymmetric(Node left, Node right) {
        if (left == null && right == null)
            return true;
        if (left == null || right == null)
            return false;
        if (left.data != right.data)
            return false;
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
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

        System.out.println(isSymmetric(a.left, a.right));

    }
}