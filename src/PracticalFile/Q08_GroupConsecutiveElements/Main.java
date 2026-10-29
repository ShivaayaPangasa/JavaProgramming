package PracticalFile.Q08_GroupConsecutiveElements;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 1, 2, 3, 3, 3);

        List<List<Integer>> groups = groupConsecutive(numbers);

        System.out.println("Input: " + numbers);
        System.out.println(
            "Groups sorted by size descending: " + groups
        );
    }

    public static <T extends Comparable<T>>
            List<List<T>> groupConsecutive(List<T> sortedList) {

        // TreeMap keeps elements in their natural sorted order.
        TreeMap<T, Integer> frequency = new TreeMap<>();

        for (T value : sortedList) {
            frequency.put(
                value,
                frequency.getOrDefault(value, 0) + 1
            );
        }

        List<List<T>> groups = new ArrayList<>();

        // Build one group for each distinct value.
        for (Map.Entry<T, Integer> entry : frequency.entrySet()) {
            List<T> group = new ArrayList<>();

            for (int i = 0; i < entry.getValue(); i++) {
                group.add(entry.getKey());
            }

            groups.add(group);
        }

        // Largest group first; ties are sorted by the group's first value.
        groups.sort(new Comparator<List<T>>() {
            @Override
            public int compare(List<T> first, List<T> second) {
                int sizeOrder = Integer.compare(
                    second.size(), first.size()
                );

                if (sizeOrder != 0) {
                    return sizeOrder;
                }

                return first.get(0).compareTo(second.get(0));
            }
        });

        return groups;
    }
}