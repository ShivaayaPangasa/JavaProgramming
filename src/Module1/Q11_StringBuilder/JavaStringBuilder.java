package Module1.Q11_StringBuilder;

public class JavaStringBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        System.out.println("Original: " + sb);

        sb.append(" Programming");
        System.out.println("After append: " + sb);

        sb.insert(5, "Language ");
        System.out.println("After insert: " + sb);

        sb.delete(5, 14);
        System.out.println("After delete: " + sb);

    }

}