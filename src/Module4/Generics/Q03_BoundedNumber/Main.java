package Module4.Generics.Q03_BoundedNumber;

// A bounded generic type that accepts Number subclasses
 
class NumberBox<T extends Number> {
    private T value;                         // T must be Number or a subclass.
    NumberBox(T value) { this.value = value; }
    double asDouble() { return value.doubleValue(); }
    T getValue() { return value; }
}

public class Main {
    public static void main(String[] args) {
        NumberBox<Integer> a = new NumberBox<>(25);
        NumberBox<Double> b = new NumberBox<>(4.5);
        System.out.println(a.getValue() + " -> " + a.asDouble());
        System.out.println(b.getValue() + " -> " + b.asDouble());
        // NumberBox<String> c = new NumberBox<>("hello"); // Compile-time error.
    }
}