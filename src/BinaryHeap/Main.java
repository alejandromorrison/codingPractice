package BinaryHeap;

public class Main {
    public static void main(String[] args) {
        BinaryHeap binaryheap = new BinaryHeap(5);
        binaryheap.insert(10, "Min");
        binaryheap.insert(5, "Min");
        binaryheap.insert(15, "Min");
        binaryheap.insert(1, "Min");
        binaryheap.levelOrder();
    }
}
