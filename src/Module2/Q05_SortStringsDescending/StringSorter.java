package Module2.Q05_SortStringsDescending;

import java.util.List;

public class StringSorter {

    public void sortDescending(List<String> names) {
        names.sort((first, second) ->
                second.compareTo(first));
    }

    public void displayList(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
}