package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    BinaryNode root;

    public BinaryTree() {
        this.root = null;
    }

    // preorder traversal method
    void preOrder(BinaryNode node) {
        if (node == null)
            return;

        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // inOrder method traversal for the binary tree
    void inOrder(BinaryNode node) {
        if (node == null)
            return;

        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    // here im gonna try to implement the postOrder traversal method
    void postOrder(BinaryNode node) {
        if (node == null)
            return;

        postOrder(node.right);
        postOrder(node.left);
        System.out.print(node.value + " ");
    }

    // Level order
    void leverOrder() {
        // We are going to implement a queue
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if (presentNode.left != null)
                queue.add(presentNode.left);
            if (presentNode.right != null)
                queue.add(presentNode.right);
        }
    }

    // Search method
    public void search(String value) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value) {
                System.out.println("The value " + value + " is found in tree");
                return;
            } else {
                if (presentNode.left != null)
                    queue.add(presentNode.left);
                if (presentNode.right != null)
                    queue.add(presentNode.right);
            }
        }
        System.out.println("The value is not found");
    }

    //insert
    void insert(String value) {
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;
        if (root == null) {
            root = newNode;
            System.out.println("Inserted new node at root");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.left == null) {
                presentNode.left = newNode;
                System.out.println("Inserted");
                break;
            }  else if (presentNode.right == null) {
                presentNode.right = newNode;
                System.out.println("Inserted");
                break;
            } else {
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }

    public BinaryNode deepest() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode = null;
        while (!queue.isEmpty()) {
            presentNode = queue.remove();
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
        return presentNode;
    }

    public void deleteDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode previousNode, presentNode = null;
        while(!queue.isEmpty()) {
            previousNode = presentNode;
            presentNode = queue.remove();
            if (presentNode.left == null) {
                previousNode.right = null;
                return;
            } else if (presentNode.right == null) {
                previousNode.left = null;
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);

        }
    }

    // delete binary tree
    void deleteBT() {
        root = null;
        System.out.println("the binary tree has been deleted");
    }
}
