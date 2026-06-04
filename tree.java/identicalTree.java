
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }

}

public class identicalTree {
    public static boolean isSame(Node root1, Node root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;
        if (root1.data != root2.data)
            return false;
        return isSame(root1.left, root2.left) && isSame(root1.right, root2.right);
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.left = b;
        a.right = c;
        b.left = d;
        c.right = e;

        Node a1 = new Node(10);
        Node b2 = new Node(20);
        Node c3 = new Node(30);
        Node d4 = new Node(40);
        Node e5 = new Node(50);

        a1.left = b2;
        a1.right = c3;
        b2.left = d4;
        c3.right = e5;

        System.out.println(isSame(a, a1));

    }
}