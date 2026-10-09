package Module4.SpecializedClasses.Q05_WeakHashMapDemo;

// Simple WeakHashMap illustration

import java.util.Map;
import java.util.WeakHashMap;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Map<Object, String> map = new WeakHashMap<>();
        Object temporaryKey = new Object();
        Object permanentKey = new Object();
        map.put(temporaryKey, "May disappear after key is unreferenced");
        map.put(permanentKey, "Remains while key is strongly referenced");
        System.out.println("Before: " + map.size());
        temporaryKey = null; // No strong reference remains to the first key.
        System.gc();          // A request only; the JVM may ignore it.
        Thread.sleep(200);
        System.out.println("After GC request: " + map.size());
        System.out.println("The exact timing is nondeterministic.");
    }
}
