
// ------------------------------------------------------------------------------------------
//                                Display Binary Treee
// ------------------------------------------------------------------------------------------

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class tree {
    public static void display(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + " -> ");
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(1);
        Node e = new Node(2);
        Node f = new Node(4);
        Node g = new Node(7);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        display(a);

    }
}





// ------------------------------------------------------------------------------------------
//                                PreOrder traversal Binary Treee
// ------------------------------------------------------------------------------------------

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class tree {
    public static void preOrderDisplay(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrderDisplay(root.left);
        preOrderDisplay(root.right);
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

        preOrderDisplay(a);

    }
}





// ------------------------------------------------------------------------------------------
//                                Inorder traversal Binary Treee
// ------------------------------------------------------------------------------------------


class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class tree {
    public static void inOrderDisplay(Node root) {
        if(root == null){
            return;
        }
        inOrderDisplay(root.left);
        System.out.print(root.data + " ");
        inOrderDisplay(root.right);
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

        inOrderDisplay(a);

    }
}





// ------------------------------------------------------------------------------------------
//                                postorder traversal Binary Treee
// ------------------------------------------------------------------------------------------

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class tree {
    public static void postOrderDisplay(Node root) {
        if (root == null) {
            return;
        }
        postOrderDisplay(root.left);
        postOrderDisplay(root.right);
        System.out.print(root.data + " ");
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

        postOrderDisplay(a);

    }
}


