package Module2.Q03_ArrayList;

import java.util.ArrayList;

public class IntegerList {

    public ArrayList<Integer> createList() {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        return numbers;
    }

    public void displayList(ArrayList<Integer> numbers) {
        System.out.println("List of integers:");

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}