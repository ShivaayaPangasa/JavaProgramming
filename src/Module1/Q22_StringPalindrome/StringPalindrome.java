package Module1.Q22_StringPalindrome;

public class StringPalindrome {
    public static void main(String[] args) {

        String text = "MADAM";

        boolean isPalindrome = true;

        for (int i = 0; i < text.length() / 2; i++) {

            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {

                isPalindrome = false;

                break;

            }

        }

        if (isPalindrome) {

            System.out.println(text + " is a Palindrome.");

        }

        else {

            System.out.println(text + " is Not a Palindrome.");

        }

    }

}