package Module4.CollectionsUtilities.Q06_Frequency;

// Count occurrences with Collections.frequency
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> votes = new ArrayList<>();
        Collections.addAll(votes, "Yes", "No", "Yes", "Yes", "No");
        System.out.println("Yes count=" + Collections.frequency(votes, "Yes"));
        System.out.println("No count=" + Collections.frequency(votes, "No"));
    }
}