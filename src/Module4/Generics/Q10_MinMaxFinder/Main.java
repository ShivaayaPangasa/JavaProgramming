package Module4.Generics.Q10_MinMaxFinder;

// Find min and max using a bounded generic type

import java.util.Arrays;
import java.util.List;

class MinMaxFinder<T extends Comparable<T>> {
    private List<T> values;
    MinMaxFinder(List<T> values) { this.values = values; }

    T findMin() {
        if (values.isEmpty()) throw new IllegalStateException("List is empty");
        T result = values.get(0);
        for (T item : values) if (item.compareTo(result) < 0) result = item;
        return result;
    }
    T findMax() {
        if (values.isEmpty()) throw new IllegalStateException("List is empty");
        T result = values.get(0);
        for (T item : values) if (item.compareTo(result) > 0) result = item;
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        MinMaxFinder<Integer> nums = new MinMaxFinder<>(Arrays.asList(7, 2, 9, 4));
        System.out.println("Min=" + nums.findMin() + ", Max=" + nums.findMax());
        MinMaxFinder<String> words = new MinMaxFinder<>(Arrays.asList("pear", "apple", "mango"));
        System.out.println("Min=" + words.findMin() + ", Max=" + words.findMax());
    }
}