package Extra.Q28_QueueStackArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Main {
    public static void main(String[] args){

        Queue<String> queue = new ArrayDeque<>();

        queue.offer("Shivaaya");
        queue.offer("Ajay");
        queue.offer("Sona");

        System.out.println("First in queue: " + queue.peek());
        System.out.println("Served: " + queue.poll());
        System.out.println("Remaining queue: " + queue);

        Deque<String> stack = new ArrayDeque<>();

        stack.push("Book 1");
        stack.push("Book 2");
        stack.push("Book 3");

        System.out.println("Top of stack: " + stack.peek());
        System.out.println("Removed: " + stack.pop());
        System.out.println("Remaining stack: " + stack);

    }

}