
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

    public static int size(Node root) {
        if (root == null)
            return 0;
        return 1 + size(root.left) + size(root.right);
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;

        System.out.println(size(a));
    }
}





// ------------------------------------------------------------------------------------------
//                                sum of all node Binary Treee
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

    public static int sum(Node root) {
        if (root == null)
            return 0;
        return root.data + sum(root.left) + sum(root.right);
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;

        System.out.println(sum(a));
    }
}




// ------------------------------------------------------------------------------------------
//                                product value of a binary tree
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
    public static int product(Node root) {
        if (root == null)
            return 1;
        return root.data * product(root.left) * product(root.right);
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;

        System.out.println(product(a));
    }
}





// ------------------------------------------------------------------------------------------
//                                maximum value in a binary tree
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

    public static int maximum(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;
        return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;

        System.out.println(maximum(a));
    }
}




// ------------------------------------------------------------------------------------------
//                                level of a binary tree
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
        Node f = new Node(60);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;

        System.out.println(level(a));
    }
}




// ------------------------------------------------------------------------------------------
//                                invert of a binary tree
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

    public static void display(Node root) {
        if (root == null)
            return;

        display(root.left);
        System.out.print(root.data + " ");
        display(root.right);
    }

    public static void invert(Node root) {
        if (root == null)
            return;

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        invert(root.left);
        invert(root.right);
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
        c.left = e;

        System.out.println("Original Tree:");
        display(a);

        invert(a);

        System.out.println("\nInverted Tree:");
        display(a);
    }
}
