package Module4.Set.Q08_LinkedHashSet;

// LinkedHashSet iteration order

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> items = new LinkedHashSet<>();
        items.add("pen"); items.add("book"); items.add("bag"); items.add("pen");
        for (String item : items) System.out.println(item);
    }
}
