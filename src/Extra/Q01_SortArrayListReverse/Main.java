package Extra.Q01_SortArrayListReverse;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();

        names.add("Ajay");
        names.add("Sona");
        names.add("Shivaaya");
        names.add("Rasika");
        names.add("Krisha");

        System.out.println("Original list: " + names);
        Collections.sort(names);
        System.out.println("Alphabetical Order: " + names);
        Collections.reverse(names);
        System.out.println("Reverse Order: " + names);
        
    }
}
