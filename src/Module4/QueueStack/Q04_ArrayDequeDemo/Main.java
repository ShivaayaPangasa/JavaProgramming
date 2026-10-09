package Module4.QueueStack.Q04_ArrayDequeDemo;

// Deque additions/removals at both ends
 
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("B"); deque.addLast("C"); deque.addFirst("A");
        System.out.println(deque);
        System.out.println("First=" + deque.peekFirst());
        System.out.println("Last=" + deque.peekLast());
        System.out.println("Removed first=" + deque.removeFirst());
        System.out.println("Removed last=" + deque.removeLast());
        System.out.println("Remaining=" + deque);
    }
}
