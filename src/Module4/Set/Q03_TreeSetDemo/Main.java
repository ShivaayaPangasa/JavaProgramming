package Module4.Set.Q03_TreeSetDemo;

// TreeSet stores unique values in sorted order

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("Mango"); fruits.add("Apple"); fruits.add("Banana");
        fruits.add("Apple"); // Duplicate is ignored.
        System.out.println(fruits);               // Natural sorted order.
        System.out.println("First=" + fruits.first());
        System.out.println("Last=" + fruits.last());
    }
}
