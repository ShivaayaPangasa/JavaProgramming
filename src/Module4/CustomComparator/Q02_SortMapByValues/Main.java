package Module4.CustomComparator.Q02_SortMapByValues;

// Sort map entries by values

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Asha", 88); scores.put("Ajay", 75); scores.put("Shivaaya", 94);
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(scores.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                return Integer.compare(a.getValue(), b.getValue());
            }
        });
        for (Map.Entry<String, Integer> entry : entries)
            System.out.println(entry.getKey() + " = " + entry.getValue());
    }
}