package Module4.Generics.Q07_Box;

// A generic Box<T> storing one item

class Box<T> {
    private T item;
    void addItem(T item) { this.item = item; }
    T getItem() { return item; }
}

public class Main {
    public static void main(String[] args) {
        Box<String> wordBox = new Box<>();
        wordBox.addItem("Notebook");
        System.out.println(wordBox.getItem());

        Box<Integer> numberBox = new Box<>();
        numberBox.addItem(42);
        System.out.println(numberBox.getItem());
    }
}