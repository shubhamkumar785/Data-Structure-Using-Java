
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class symmtericTree {
    public static boolean isSymmetric(Node root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);

    }

    public static boolean isMirror(Node left, Node right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.data != right.data) {
            return false;
        }
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }

    public static void main(String[] args) {

    }
}
