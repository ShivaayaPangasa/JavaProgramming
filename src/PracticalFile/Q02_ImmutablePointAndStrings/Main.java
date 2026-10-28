package PracticalFile.Q02_ImmutablePointAndStrings;

public class Main {
    public static void main(String[] args) {
        ImmutablePoint original = new ImmutablePoint(10, 20);
        ImmutablePoint moved = original.translate(5, -3);

        System.out.println("Original point: " + original);
        System.out.println("Translated point: " + moved);
        System.out.println("Original is unchanged: " + original);

        String first = "hello";
        String second = "hello";
        String third = new String("hello");

        System.out.println("\n--- String comparison ---");

        System.out.println("first == second: " + (first == second));
        System.out.println("first == third: " + (first == third));
        System.out.println("first.equals(third): " + first.equals(third));

        String changed = first.concat(" world");

        System.out.println("first after concat: " + first);
        System.out.println("New String after concat: " + changed);
    }
}

// final prevents this class from being subclassed.
final class ImmutablePoint {
    private final int x;
    private final int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Returns a NEW object instead of modifying the original.
    public ImmutablePoint translate(int dx, int dy) {
        return new ImmutablePoint(x + dx, y + dy);
    }

    @Override
    public String toString() {
        return "ImmutablePoint(" + x + ", " + y + ")";
    }
}