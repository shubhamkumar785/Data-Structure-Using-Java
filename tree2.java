
--------------------------------------------------------------------------------------------------------------------
                                         full binary tree check
--------------------------------------------------------------------------------------------------------------------
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class tree2 {
    public static boolean isFullBinaryTree(Node root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        if (root.left != null && root.right != null) {
            return isFullBinaryTree(root.left) && isFullBinaryTree(root.right);
        }
        return false;

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
        b.right = e;

        System.out.println(isFullBinaryTree(a));
    }

}






/*
--------------------------------------------------------------------------------------------------------------------
                                         balanced binary tree check
--------------------------------------------------------------------------------------------------------------------
*/

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class tree2 {
    public static boolean balancedBinaryTree(Node root) {
        if (root == null) {
            return true;
        }
        int leftLevel = level(root.left);
        int rightLevel = level(root.right);
        if (Math.abs(leftLevel - rightLevel) > 1) {
            return balancedBinaryTree(root.left) && balancedBinaryTree(root.right);
        }
        return false;

    }



    public static int level(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(level(root.left), level(root.right));
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
        b.right = e;

        System.out.println(balancedBinaryTree(a));
    }
}
