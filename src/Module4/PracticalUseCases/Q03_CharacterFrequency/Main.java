package Module4.PracticalUseCases.Q03_CharacterFrequency;

// Character frequency with HashMap

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "banana";
        Map<Character, Integer> frequency = new HashMap<>();
        for (char ch : text.toCharArray()) {
            Integer oldCount = frequency.get(ch);
            frequency.put(ch, oldCount == null ? 1 : oldCount + 1);
        }
        System.out.println(frequency);
    }
}