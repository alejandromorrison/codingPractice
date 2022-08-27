package Queue;

public class QueueArray {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public QueueArray(int size) {
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("the queue is successfully created with a size of: " + size);
    }

    public boolean isFull() {
        if (topOfQueue == arr.length-1)
            return true;
        return false;
    }

    public boolean isEmpty() {
        if (topOfQueue == -1)
            return true;
        return false;
    }

    public void enqueue(int value) {
        if (isFull())
            System.out.println("The queue is full");
        else {
            topOfQueue = 0;
            ++ topOfQueue;
            arr[topOfQueue] = value;
        }
    }

    public int dequeue(int value) {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return -1;
        }
        else {
            int result  = arr[beginningOfQueue];
            if (beginningOfQueue > topOfQueue)
                beginningOfQueue = topOfQueue - 1;
            return result;
        }
    }

    public int peek() {
        if (!isEmpty())
            return arr[beginningOfQueue];
        else
            return -1;
    }

    public void deleteQueue() {
        arr = null;
        System.out.println("The array is deleted");
    }
}
