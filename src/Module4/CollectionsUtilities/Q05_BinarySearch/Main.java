package Module4.CollectionsUtilities.Q05_BinarySearch;

// Binary search using Collections.binarySearch

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int index = Collections.binarySearch(nums, 30); // List must be sorted first.
        System.out.println("30 found at index " + index);
        int missing = Collections.binarySearch(nums, 35);
        System.out.println("35 search result=" + missing + " (negative means not found)");
    }
}