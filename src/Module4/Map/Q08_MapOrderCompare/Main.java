package Module4.Map.Q08_MapOrderCompare;

// Compare HashMap and LinkedHashMap iteration

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> hash = new HashMap<>();
        Map<Integer, String> linked = new LinkedHashMap<>();
        int[] keys = {3, 1, 2};
        for (int key : keys) { hash.put(key, "Value" + key); linked.put(key, "Value" + key); }
        System.out.println("HashMap (order not guaranteed): " + hash);
        System.out.println("LinkedHashMap (insertion order): " + linked);
    }
}
