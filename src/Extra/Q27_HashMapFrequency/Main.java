package Extra.Q27_HashMapFrequency;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        int[] numbers = {2,3,4,5,3,3,3,2,3,4};

        Map<Integer, Integer> frequency = new HashMap<>();

        for(int number : numbers){
            frequency.put(number, frequency.getOrDefault(number,0) + 1);
        }
        System.out.println(frequency);
    }
}