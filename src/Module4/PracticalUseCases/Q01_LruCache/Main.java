package Module4.PracticalUseCases.Q01_LruCache;

// LRU cache with LinkedHashMap

import java.util.LinkedHashMap;
import java.util.Map;

class LruCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;
    LruCache(int capacity) {
        super(capacity, 0.75f, true); // true = access order, not insertion order.
        if (capacity <= 0) throw new IllegalArgumentException("capacity must be positive");
        this.capacity = capacity;
    }
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity; // Automatically evict least-recently-used entry.
    }
}

public class Main {
    public static void main(String[] args) {
        LruCache<Integer, String> cache = new LruCache<>(3);
        cache.put(1, "One"); cache.put(2, "Two"); cache.put(3, "Three");
        cache.get(1);                 // Key 1 becomes recently used.
        cache.put(4, "Four");       // Least recently used key 2 is removed.
        System.out.println(cache);
    }
}