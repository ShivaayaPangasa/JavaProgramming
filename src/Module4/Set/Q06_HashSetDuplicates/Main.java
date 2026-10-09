package Module4.Set.Q06_HashSetDuplicates;

// HashSet uniqueness demonstration

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();
        System.out.println(cities.add("Delhi"));  // true: new element.
        System.out.println(cities.add("Pune"));
        System.out.println(cities.add("Delhi"));  // false: already present.
        System.out.println("Set=" + cities);      // Order is not guaranteed.
        System.out.println("Size=" + cities.size());
    }
}
