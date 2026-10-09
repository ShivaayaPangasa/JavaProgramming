package Module4.Generics.Q06_Pair;

//A generic Pair<K,V> class

class Pair<K, V> {
    private K key;                         // First value may use one type.
    private V value;                       // Second value may use another type.
    Pair(K key, V value) { this.key = key; this.value = value; }
    K getKey() { return key; }
    V getValue() { return value; }
    void setKey(K key) { this.key = key; }
    void setValue(V value) { this.value = value; }
}

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> employee = new Pair<>(101, "Asha");
        System.out.println(employee.getKey() + " : " + employee.getValue());
        employee.setValue("Asha Sharma");
        System.out.println(employee.getKey() + " : " + employee.getValue());
    }
}
