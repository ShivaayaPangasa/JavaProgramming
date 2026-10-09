package Module4.List.Q03_ArrayListDemo;

//Store and iterate values in an ArrayList

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple"); fruits.add("Mango"); fruits.add("Banana");
        System.out.println("Whole list: " + fruits);
        for (String fruit : fruits) System.out.println(fruit);
        System.out.println("At index 1: " + fruits.get(1));
        System.out.println("Size: " + fruits.size());
    }
}