package Queue;

public class MainQueue {
    public static void main(String[] args) {
        QueueArray queue = new QueueArray(5);
        boolean result = queue.isFull();
        System.out.println(result);
        boolean empty = queue.isEmpty();
        System.out.println(empty);

    }
}
