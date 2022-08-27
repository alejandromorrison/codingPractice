package SinglyLinkedList;

public class CircularLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createCircularLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertion(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createCircularLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location >= size) {
            tail.next = node;
            tail = node;
            tail.next = head;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location-1) {
                tempNode = tempNode.next;
                ++index;
            }
            node.next = tempNode.next;
        }
    }

    public void traversal() {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; ++i) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        } else {
            System.out.print("\nCircular linked list does not exist.");
        }
    }
}
