package Module4.Map.Q04_TreeMapDemo;

// TreeMap sorts entries by key

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> students = new TreeMap<>();
        students.put(103, "Mina"); students.put(101, "Asha"); students.put(102, "Ravi");
        System.out.println(students);              // Keys 101, 102, 103.
        System.out.println("Name for 102=" + students.get(102));
    }
}
