package Module5.MavenExamples.Q42_TransitiveDependency;

import org.apache.commons.text.StringEscapeUtils;

public class Main {

    public static void main(String[] args) {

        // Original text containing HTML characters
        String input = "<h1>Hello & Java</h1>";

        // Use a class from the direct dependency:
        // Apache Commons Text
        String result = StringEscapeUtils.escapeHtml4(input);

        System.out.println("Original text: " + input);
        System.out.println("Escaped text: " + result);
        System.out.println();
        System.out.println(
            "Maven automatically resolves the required libraries."
        );
    }
}