package Module1.Q50_StringSplit;

public class StringSplit {

    public static void main(String[] args) {

        String text = "I Love Java";

        String word = "";

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == ' ') {

                System.out.println(word);

                word = "";

            }

            else {

                word = word + text.charAt(i);

            }

        }

        System.out.println(word);

    }

}