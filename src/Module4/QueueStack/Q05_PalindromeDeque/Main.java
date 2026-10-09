package Module4.QueueStack.Q05_PalindromeDeque;

// Check a palindrome with Deque

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    static boolean isPalindrome(String text) {
        String cleaned = text.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        Deque<Character> chars = new ArrayDeque<>();
        for (char ch : cleaned.toCharArray()) chars.addLast(ch);
        while (chars.size() > 1) {
            if (!chars.removeFirst().equals(chars.removeLast())) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam"));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("Java"));
    }
}
