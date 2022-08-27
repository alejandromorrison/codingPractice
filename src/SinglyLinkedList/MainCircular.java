package SinglyLinkedList;

public class MainCircular {
    public static void main(String[] args) {
        CircularLinkedList csll = new CircularLinkedList();
        csll.createCircularLinkedList(5);
        csll.insertion(4, 0);
        csll.insertion(4, 1);
        csll.insertion(4, 8);
        csll.traversal();
    }
}
