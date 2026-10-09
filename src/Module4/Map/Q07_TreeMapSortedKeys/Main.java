package Module4.Map.Q07_TreeMapSortedKeys;

// Sorted key order in TreeMap

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> prices = new TreeMap<>();
        prices.put("Mango", 80); prices.put("Apple", 120); prices.put("Banana", 50);
        for (String product : prices.keySet())
            System.out.println(product + " = " + prices.get(product));
    }
}