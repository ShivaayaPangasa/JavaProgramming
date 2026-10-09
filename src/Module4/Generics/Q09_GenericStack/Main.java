package Module4.Generics.Q09_GenericStack;

// A user-defined generic stack

import java.util.ArrayList;
import java.util.List;

class Stack<T> {
    private List<T> data = new ArrayList<>();
    void push(T item) { data.add(item); }                 // Add at the top (end).
    T pop() {
        if (data.isEmpty()) throw new IllegalStateException("Stack is empty");
        return data.remove(data.size() - 1);              // Remove and return top.
    }
    T peek() {
        if (data.isEmpty()) throw new IllegalStateException("Stack is empty");
        return data.get(data.size() - 1);                 // Read top without removal.
    }
    boolean isEmpty() { return data.isEmpty(); }
    int size() { return data.size(); }
}

public class Main {
    public static void main(String[] args) {
        Stack<Integer> nums = new Stack<>();
        nums.push(10); nums.push(20);
        System.out.println("Top = " + nums.peek());
        System.out.println("Popped = " + nums.pop());

        Stack<String> words = new Stack<>();
        words.push("Java"); words.push("DSA");
        System.out.println("Top = " + words.peek());
        System.out.println("Popped = " + words.pop());
    }
}