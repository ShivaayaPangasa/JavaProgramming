package Extra.Q13_StringOperations;

public class Main {
    public static void main(String[] args){
        String first = new String("Java");
        String second = new String("Java");

        System.out.println("Length: " + first.length());
        System.out.println("Uppercase: " + first.toUpperCase());
        System.out.println("Contains v: " + first.contains("v"));
        System.out.println("Using == : " + (first == second)); // Using == : false (== compares object references here)
        System.out.println("Using equals() : " + first.equals(second)); // Using equals() : true (equals() compares String contents)
        System.out.println("original: " + first);
    }
}