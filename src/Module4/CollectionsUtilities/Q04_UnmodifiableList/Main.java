package Module4.CollectionsUtilities.Q04_UnmodifiableList;

// Create an unmodifiable list
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> base = new ArrayList<>();
        base.add("Java"); base.add("DSA");
        List<String> readOnly = Collections.unmodifiableList(base);
        System.out.println(readOnly);
        try {
            readOnly.add("Python");
        } catch (UnsupportedOperationException ex) {
            System.out.println("Cannot modify through wrapper: " + ex.getClass().getSimpleName());
        }
        base.add("AI"); // The wrapper is a view; changes through base can still be seen.
        System.out.println("View after base changed=" + readOnly);
    }
}