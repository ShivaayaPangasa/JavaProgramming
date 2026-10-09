package Module4.List.Q08_SortStrings;

// Sort strings alphabetically and reverse alphabetically

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Zara"); names.add("Aman"); names.add("Riya"); names.add("Dev");
        Collections.sort(names);                 // Natural String order.
        System.out.println("A-Z: " + names);
        Collections.sort(names, Collections.reverseOrder());
        System.out.println("Z-A: " + names);
    }
}
