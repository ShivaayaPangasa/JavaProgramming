package PracticalFile.Q07_GenericLRUCache;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);

        cache.put(1, "One");
        cache.printState("put(1, One)");

        cache.put(2, "Two");
        cache.printState("put(2, Two)");

        cache.put(3, "Three");
        cache.printState("put(3, Three)");

        System.out.println("get(1) -> " + cache.get(1));
        cache.printState("get(1)");

        // The cache is full; key 2 is least recently used.
        cache.put(4, "Four");
        cache.printState("put(4, Four)");

        System.out.println("get(2) -> " + cache.get(2));
        cache.printState("get(2)");
    }
}

class LRUCache<K, V> {
    private final int capacity;
    private final LinkedHashMap<K, V> map;

    public LRUCache(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException(
                "Capacity must be greater than zero"
            );
        }

        this.capacity = capacity;

        // true means access order, not insertion order.
        this.map = new LinkedHashMap<K, V>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(
                    Map.Entry<K, V> eldest) {

                boolean shouldRemove =
                    size() > LRUCache.this.capacity;

                if (shouldRemove) {
                    System.out.println(
                        "Evicting least-recently used key: "
                        + eldest.getKey()
                    );
                }

                return shouldRemove;
            }
        };
    }

    public V get(K key) {
        return map.get(key);
    }

    public void put(K key, V value) {
        map.put(key, value);
    }

    public void printState(String operation) {
        System.out.println(
            operation + " -> LRU to MRU: " + map
        );
    }
}