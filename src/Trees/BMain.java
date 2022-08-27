package Trees;

public class BMain {
    public static void main(String[] args) {
        BinaryTree btree = new BinaryTree();
        btree.insert("n1");
        btree.insert("n2");
        btree.insert("n3");
        btree.insert("n4");
        btree.insert("n5");
        btree.insert("n6");
//        btree.leverOrder();
        btree.deleteDeepestNode();
        btree.leverOrder();
    }
}
