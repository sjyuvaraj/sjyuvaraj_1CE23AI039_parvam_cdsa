public class AVLTree {

    static class Node {
        int value, height;
        Node left, right;
        Node(int value) {
            this.value = value;
            this.height = 1;
        }
    }

    private Node root;

    // Insert a node
    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) return new Node(value);

        if (value < root.value) root.left = insertRec(root.left, value);
        else if (value > root.value) root.right = insertRec(root.right, value);
        else return root;

        root.height = 1 + Math.max(getHeight(root.left), getHeight(root.right));

        int balance = getBalance(root);

        // Perform rotations
        if (balance > 1 && value < root.left.value) return rightRotate(root);
        if (balance < -1 && value > root.right.value) return leftRotate(root);
        if (balance > 1 && value > root.left.value) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        if (balance < -1 && value < root.right.value) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    private Node leftRotate(Node z) {
        Node y = z.right;
        Node T2 = y.left;

        y.left = z;
        z.right = T2;

        z.height = Math.max(getHeight(z.left), getHeight(z.right)) + 1;
        y.height = Math.max(getHeight(y.left), getHeight(y.right)) + 1;

        return y;
    }

    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(getHeight(y.left), getHeight(y.right)) + 1;
        x.height = Math.max(getHeight(x.left), getHeight(x.right)) + 1;

        return x;
    }

    private int getHeight(Node root) {
        if (root == null) return 0;
        return root.height;
    }

    private int getBalance(Node root) {
        if (root == null) return 0;
        return getHeight(root.left) - getHeight(root.right);
    }

    // In-order traversal to print the tree
    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(10);
        tree.insert(5);
        tree.insert(3);

        System.out.print("In-order traversal: ");
        tree.inorder();  // Output should be balanced and sorted: 3 5 10 20 30 40
    }
}
