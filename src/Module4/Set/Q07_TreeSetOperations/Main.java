package Module4.Set.Q07_TreeSetOperations;

// Add, minimum/maximum, and remove from TreeSet

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(40); numbers.add(10); numbers.add(30); numbers.add(20);
        System.out.println("Set=" + numbers);
        System.out.println("Smallest=" + numbers.first());
        System.out.println("Largest=" + numbers.last());
        numbers.remove(30);
        System.out.println("After removing 30=" + numbers);
    }
}
