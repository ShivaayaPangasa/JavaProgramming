package Module4.CollectionsUtilities.Q02_CollectionsShuffleSort;

// Shuffle and sort an ArrayList

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Collections.addAll(nums, 5, 1, 4, 2, 3);
        System.out.println("Original=" + nums);
        Collections.shuffle(nums);
        System.out.println("Shuffled=" + nums);
        Collections.sort(nums);
        System.out.println("Sorted=" + nums);
    }
}