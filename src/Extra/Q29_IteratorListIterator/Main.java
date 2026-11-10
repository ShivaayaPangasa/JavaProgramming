package Extra.Q29_IteratorListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args){

        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5));
        Iterator<Integer> iterator = numbers.iterator();

        while(iterator.hasNext()){
            int number = iterator.next();
            if(number % 2 == 0){
                iterator.remove();
            }
        }

        System.out.println("After removing even numbers: " + numbers);

        ListIterator<Integer> listIterator = numbers.listIterator(numbers.size());

        System.out.println("Reverse order: ");

        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous() + " ");
        }
    }   
}