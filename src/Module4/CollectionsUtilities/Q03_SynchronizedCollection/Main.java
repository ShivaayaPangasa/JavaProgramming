package Module4.CollectionsUtilities.Q03_SynchronizedCollection;

//  Wrap a collection for synchronized method calls

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> shared = Collections.synchronizedList(new ArrayList<String>());
        shared.add("A"); shared.add("B");
        // Iteration over a synchronized wrapper must be externally synchronized.
        synchronized (shared) {
            for (String item : shared) System.out.println(item);
        }
    }
}