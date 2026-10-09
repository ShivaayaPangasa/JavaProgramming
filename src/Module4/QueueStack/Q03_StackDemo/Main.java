package Module4.QueueStack.Q03_StackDemo;

// Use java.util.Stack operations

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Book"); stack.push("Pen"); stack.push("Notebook");
        System.out.println("Stack=" + stack);
        System.out.println("Peek=" + stack.peek());
        System.out.println("Pop=" + stack.pop());
        System.out.println("Empty? " + stack.empty());
        System.out.println("Now=" + stack);
    }
}