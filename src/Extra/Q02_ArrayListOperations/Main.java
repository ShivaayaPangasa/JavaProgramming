package Extra.Q02_ArrayListOperations;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        
        ArrayList<String> fruits = new ArrayList<>();

        //Adding elements 
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Strawberry");
        fruits.add("Pineapple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Original list: " + fruits);
        
        //Removing elements by value
        fruits.remove("Apple");

        System.out.println("After removing Apple: " + fruits);

        //Removing elements by index
        fruits.remove(4);

        System.out.println("After removing index 4: " + fruits);
        
        //Replacing element at index
        fruits.set(3, "Grapes");
        System.out.println("After replacing insex 3: " + fruits);

    }
    
}
