package BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree newBst = new BinarySearchTree();
        newBst.insert(70);
        newBst.insert(50);
        newBst.insert(90);
        newBst.insert(30);
        newBst.insert(60);
        newBst.insert(80);
        newBst.insert(100);
        newBst.insert(20);
        newBst.insert(40);

//        newBst.search(newBst.root, 70);
        newBst.deleteNode(newBst.root, 50);
        newBst.LevelOrder();
        newBst.deleteNode(newBst.root, 100);
        System.out.println();
        newBst.LevelOrder();
    }
}
