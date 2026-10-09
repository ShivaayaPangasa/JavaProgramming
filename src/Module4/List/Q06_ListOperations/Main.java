package Module4.List.Q06_ListOperations;

// Add, remove by value/index, and replace list entries
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Asha"); names.add("Ravi"); names.add("Mina");
        System.out.println("After add: " + names);

        names.remove("Ravi");                  // Removes by matching value.
        System.out.println("After remove value: " + names);
        names.remove(0);                        // Removes the element at index 0.
        System.out.println("After remove index: " + names);

        names.add("Kiran"); names.add("Neha");
        names.set(1, "Tara");                  // Replace, do not insert.
        System.out.println("After set: " + names);
    }
}