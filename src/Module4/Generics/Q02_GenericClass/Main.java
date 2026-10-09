package Module4.Generics.Q02_GenericClass;

// A simple user-defined generic class

class Printer<T> {
    private T value;                 // T means the type will be supplied later.
    Printer(T value) { this.value = value; }
    T getValue() { return value; }
    void setValue(T value) { this.value = value; }
}

public class Main {
    public static void main(String[] args) {
        Printer<String> text = new Printer<>("Hello"); // T becomes String.
        Printer<Integer> number = new Printer<>(100);  // T becomes Integer.
        System.out.println(text.getValue());
        System.out.println(number.getValue());
        text.setValue("Java Generics");
        System.out.println(text.getValue());
    }
}