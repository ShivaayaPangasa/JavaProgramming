package Module4.SpecializedClasses.Q04_LinkedListQueue;

// Queue interface implemented by LinkedList

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10); queue.offer(20); queue.offer(30);
        System.out.println("Front=" + queue.peek());
        System.out.println("Removed=" + queue.poll());
        System.out.println("Queue=" + queue);
        System.out.println("Empty? " + queue.isEmpty());
    }
}
