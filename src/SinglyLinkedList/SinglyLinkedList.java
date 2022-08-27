package SinglyLinkedList;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertNode(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        ++size;
    }

    public void traversalLL() {
        Node tempNode = head;
        for (int i=0; i< size; ++i) {
            System.out.print(tempNode.value + "\n");
            if (i != size-1)
                System.out.print(" -> ");
        }
    }
}
