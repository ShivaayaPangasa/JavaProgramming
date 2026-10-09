package Module4.Advanced.Q05_ProductTreeMap;

// Products and prices sorted by product name
 
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> products = new TreeMap<>();
        products.put("Keyboard", 899.0); products.put("Monitor", 7999.0);
        products.put("Mouse", 499.0); products.put("Webcam", 1499.0);
        for (Map.Entry<String, Double> item : products.entrySet())
            System.out.println(item.getKey() + " : Rs. " + item.getValue());
    }
}