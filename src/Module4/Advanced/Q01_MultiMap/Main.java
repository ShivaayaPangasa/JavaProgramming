package Module4.Advanced.Q01_MultiMap;

//Generic MultiMap<K,V> backed by HashMap<K,List<V>>

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MultiMap<K, V> {
    private Map<K, List<V>> data = new HashMap<>();
    void put(K key, V value) {
        data.computeIfAbsent(key, k -> new ArrayList<V>()).add(value);
    }
    List<V> get(K key) {
        List<V> values = data.get(key);
        return values == null ? new ArrayList<V>() : new ArrayList<V>(values);
    }
    boolean remove(K key, V value) {
        List<V> values = data.get(key);
        if (values == null) return false;
        boolean removed = values.remove(value);
        if (values.isEmpty()) data.remove(key);
        return removed;
    }
    public String toString() { return data.toString(); }
}

public class Main {
    public static void main(String[] args) {
        MultiMap<String, String> subjects = new MultiMap<>();
        subjects.put("Shivaaya", "Java"); subjects.put("Shivaaya", "DSA");
        subjects.put("Ajay", "AI");
        System.out.println(subjects);
        System.out.println("Shivaaya studies " + subjects.get("Shivaaya"));
        subjects.remove("Shivaaya", "Java");
        System.out.println(subjects);
    }
}