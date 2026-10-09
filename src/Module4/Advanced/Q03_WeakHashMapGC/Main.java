package Module4.Advanced.Q03_WeakHashMapGC;

//WeakHashMap garbage-collection demonstration

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WeakHashMap<Object, String> map = new WeakHashMap<>();
        Object key = new Object();
        WeakReference<Object> observeKey = new WeakReference<>(key);
        map.put(key, "temporary entry");
        System.out.println("Initially: entries=" + map.size() + ", key alive=" + (observeKey.get() != null));
        key = null; // Remove the strong reference held by this local variable.
        for (int i = 0; i < 10 && observeKey.get() != null; i++) {
            System.gc(); Thread.sleep(100);
        }
        System.out.println("Later: entries=" + map.size() + ", key alive=" + (observeKey.get() != null));
        System.out.println("GC is nondeterministic; the key may not disappear immediately.");
    }
}