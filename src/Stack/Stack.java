package Stack;

public class Stack {
    // this is the method using Arrays.
    int[] arr;
    int topStack;
    public Stack(int size) {
        this.arr = new int[size];
        this.topStack = -1;
        System.out.println("The stack is created with a size of: " + size);
    }

    public void push(int element) {
        if (isFull())
            System.out.println("Is full");
        else {
            arr[topStack+1] = element;
            ++topStack;
            System.out.println("The value been inserted");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("The Stack is empty");
            return 0;
        } else {
            int stackTop = arr[topStack];
            --topStack;
            return stackTop;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        } else {
            return arr[topStack];
        }
    }

    public void delete() {
        arr = null;
        System.out.println("The stack have been successfully deleted");
    }

    // is empty method
    public boolean isEmpty() {
        if (topStack == -1)
            return true;
        return false;
    }

    public boolean isFull() {
        if (topStack == arr.length-1)
            return true;
        return false;
    }
}
