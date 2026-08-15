package Module1.Q46_StringReverse;

public class StringReverse {
    public static void main(String[] args) {

        String text = "JAVA";

        System.out.println("Original String: " + text);

        System.out.print("Reversed String: ");

        for (int i = text.length() - 1; i >= 0; i--) {

            System.out.print(text.charAt(i)); // charAt(index) always returns one character from the string.

        }

    }

}