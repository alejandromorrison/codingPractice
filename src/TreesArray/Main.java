package TreesArray;

public class Main {
    public static void main(String[] args) {
        BinaryTree newBinaryTree = new BinaryTree(9);
        newBinaryTree.insert("n1");
        newBinaryTree.insert("n2");
        newBinaryTree.insert("n3");
        newBinaryTree.insert("n4");
        newBinaryTree.insert("n5");
        newBinaryTree.insert("n6");
        newBinaryTree.insert("n7");
        newBinaryTree.insert("n8");
        newBinaryTree.insert("n9");

//        newBinaryTree.preOrder(1);

//        newBinaryTree.inOrder(1);

//        newBinaryTree.postOrder(1);

//        newBinaryTree.levelOrder();
//        newBinaryTree.search("n1");

        newBinaryTree.deleteTree();

    }

}
