package Module1.Q47_StringFrequency;

public class StringFrequency {
    public static void main(String[] args) {

        String text = "APPLE";

        boolean[] visited = new boolean[text.length()];

        for (int i = 0; i < text.length(); i++) {

            if (visited[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < text.length(); j++) {

                if (text.charAt(i) == text.charAt(j)) {

                    count++;

                    visited[j] = true;

                }

            }

            System.out.println(text.charAt(i) + " : " + count);

        }

    }

}