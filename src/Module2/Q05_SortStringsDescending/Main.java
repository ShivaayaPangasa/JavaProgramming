package Module2.Q05_SortStringsDescending;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Mango");
        names.add("Apple");
        names.add("Orange");
        names.add("Banana");

        StringSorter sorter = new StringSorter();

        System.out.println("Original list:");
        sorter.displayList(names);

        sorter.sortDescending(names);

        System.out.println("\nDescending order:");
        sorter.displayList(names);
    }
}