package Module1.Q12_StringImmutability;

public class StringImmutability {

    public static void main(String[] agrs){

        String text = "Java";

        System.out.println("Original string : " + text);

        text = text + " Programming";

        System.out.println("Modified string : " + text);

    }
    
}

/* 
Why Doesn't Java Change the Original String?

Because Strings are immutable.

Once a String object is created, its contents cannot be changed.

Whenever you appear to modify a String, Java actually creates a new String object and makes the variable point to it.

String vs StringBuilder
String	StringBuilder
Immutable	Mutable
Cannot be changed	Can be changed
Creates new object when modified	Changes the same object
Slower if modified many times	Faster for repeated modifications
        */