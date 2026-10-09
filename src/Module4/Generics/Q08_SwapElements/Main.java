package Module4.Generics.Q08_SwapElements;

// Generic method to swap two array elements

import java.util.Arrays;

public class Main {
    // A generic method declares <T> before its return type.
    static <T> void swapElements(T[] values, int i, int j) {
        T temporary = values[i];       // Save the first value.
        values[i] = values[j];         // Move the second value into its place.
        values[j] = temporary;         // Put the saved value in the second place.
    }

    public static void main(String[] args) {
        String[] names = {"Shivaaya", "Ajay", "Rasika"};
        swapElements(names, 0, 2);
        System.out.println(Arrays.toString(names));

        Integer[] numbers = {10, 20, 30};
        swapElements(numbers, 0, 1);
        System.out.println(Arrays.toString(numbers));
    }
}