package Module4.JavaUtil.Q11_ListIteration;

// Iterate through a list with three loop styles

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10); numbers.add(20); numbers.add(30);

        System.out.println("1) Traditional for loop:");
        for (int i = 0; i < numbers.size(); i++) System.out.println(numbers.get(i));

        System.out.println("2) Enhanced for loop:");
        for (Integer number : numbers) System.out.println(number);

        System.out.println("3) while loop with Iterator:");
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) System.out.println(it.next());
    }
}