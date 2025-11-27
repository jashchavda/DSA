// Simple Java program for Preorder Traversal of Binary Tree
class BinaryTree {

    // Node class to represent each node in the tree
    static class Node {
        int data;
        Node left, right;

        // Constructor to create a new node
        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    // Root of the tree
    Node root;

    // Function for preorder traversal
    void preorder(Node node) {
        if (node == null)
            return;

        // Step 1: Print the data of node
        System.out.print(node.data + " ");

        // Step 2: Recur on left subtree
        preorder(node.left);

        // Step 3: Recur on right subtree
        preorder(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Creating the binary tree manually
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree:");
        tree.preorder(tree.root);
    }
}
