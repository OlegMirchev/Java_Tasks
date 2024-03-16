package DataStructures;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TreePostorderTraversal {
    public static Scanner scanner = new Scanner(System.in);
    public static final int n = Integer.parseInt(scanner.nextLine());

    public static void main(String[] args) {

        Node root = null;

        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();

            root = insertRec(root, data);
        }

        preOrderTraversal(root);
    }

    private static class Node {
       private int value;
       private Node left;
       private Node right;

        public Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    private static void preOrderTraversal(Node node) {
        // TODO: Continue Task!
        System.out.print(node.value + " "); // Print the value of the current node

        if (node.left != null) {
            preOrderTraversal(node.left);
        }

        if (node.right != null) {
            preOrderTraversal(node.right);
        }
    }

    private static Node insertRec(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }
}
