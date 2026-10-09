package Module4.Generics.Q04_Wildcards;

// Use extends to read and super to add

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    // extends Number lets us READ any Number subtype as a Number.
    static double sum(List<? extends Number> values) {
        double total = 0;
        for (Number value : values) total += value.doubleValue();
        return total;
    }

    // super Integer lets us ADD Integer values to Integer, Number, or Object lists.
    static void addIntegers(List<? super Integer> destination) {
        destination.add(10);
        destination.add(20);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println("Sum=" + sum(numbers));

        List<Number> numberDestination = new ArrayList<>();
        List<Object> objectDestination = new ArrayList<>();
        addIntegers(numbers);             // List<Integer> is allowed.
        addIntegers(numberDestination);   // List<Number> is allowed.
        addIntegers(objectDestination);   // List<Object> is allowed.
        System.out.println("Integers=" + numbers);
        System.out.println("Numbers=" + numberDestination);
        System.out.println("Objects=" + objectDestination);
    }
}