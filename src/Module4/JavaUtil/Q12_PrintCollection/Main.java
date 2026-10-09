package Module4.JavaUtil.Q12_PrintCollection;

// Generic method to print any Collection

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    // Collection<?> means a collection of some unknown element type.
    static void printAll(Collection<?> items) {
        for (Object item : items) System.out.println(item);
    }
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Asha"); names.add("Ravi");
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(2); numbers.add(4);
        LinkedList<String> queue = new LinkedList<>();
        queue.add("First"); queue.add("Second");

        printAll(names); printAll(numbers); printAll(queue);
    }
}