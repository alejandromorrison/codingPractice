package AVL;

import java.util.LinkedList;
import java.util.Queue;

public class AVL {
    BinaryNode root;

    AVL() {
        root = null;
    }

    public void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.value + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(BinaryNode node) {
        if (node == null)
            return;

        inOrder(root.left);
        System.out.print(node.value + " ");
        inOrder(root.right);
    }

    public void PostOrder(BinaryNode node) {
        if (node == null)
            return;

        System.out.print(node.value);
        PostOrder(root.right);
        PostOrder(root.left);
    }

    public void Traversal() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.println(presentNode.value + " ");
            if (presentNode.left != null)
                queue.add(presentNode.left);
            if (presentNode.right != null)
                queue.add(presentNode);
        }
    }

    BinaryNode search(BinaryNode node, int value) {
        if (node == null) {
            return null;
        } else if (node.value == value) {
            return node;
        } else if (value < node.value) {
            return search(node.left, value);
        } else if (value > node.value) {
            return search(node.right, value);
        } else {
            return search(node.right, value);
        }
    }

    void rotateRight(BinaryNode node) {
//        node
    }


}
