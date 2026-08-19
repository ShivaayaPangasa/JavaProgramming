package Module2.Q03_ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        IntegerList integerList = new IntegerList();

        ArrayList<Integer> numbers = integerList.createList();

        integerList.displayList(numbers);
    }
}