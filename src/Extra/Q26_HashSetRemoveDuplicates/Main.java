package Extra.Q26_HashSetRemoveDuplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Shivaaya");
        names.add("Ajay");
        names.add("Rasika");
        names.add("Shivaaya");
        names.add("Asha");
        names.add("Sona");
        names.add("Krisha");
        names.add("Shivaaya");

        Set<String> uniqueNames = new HashSet<>(names);

        System.out.println("Original: " + names);
        System.out.println("Without duplication: " + uniqueNames);
    }
}