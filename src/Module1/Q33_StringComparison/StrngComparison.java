package Module1.Q33_StringComparison;

public class StrngComparison {
    public static void main(String[] args){

        String str1 = new String("Java");

        String str2 = new String("Java");

        String a = "Hello";
        String b = "Hello";

        System.out.println("Using == : " + (str1 == str2)); //Are str1 and str2 pointing to the same object? - same memory location

        System.out.println("Using equals() : " + str1.equals(str2)); //Do these Strings contain the same text?

        System.out.println("Using == : " + (a == b)); //True because Java stores string literals efficiently in a special memory area called the String Pool.

        System.out.println("Using equals() : " + a.equals(b)); 

        // == → compares memory (object/reference).
        // equals() → compares content (characters/text).

    }
    
}