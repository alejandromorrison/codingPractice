package Stacks;

public class StackImplementing {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(9);
        stack.push(20);
        System.out.print(stack.peek());
    }
}
