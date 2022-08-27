package Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack newStack = new Stack(4);
        System.out.println(newStack.isEmpty());
        System.out.println(newStack.isFull());
        newStack.push(5);
        newStack.push(9);
        newStack.push(2);
        newStack.push(1);
        System.out.println(newStack.peek());
        newStack.pop();
        System.out.println(newStack.peek());
        newStack.pop();
        System.out.println(newStack.peek());
        newStack.pop();
        System.out.println(newStack.peek());
        newStack.pop();
        System.out.println(newStack.peek());
    }
}
