package Module4.Advanced.Q04_BookCatalog;

// Book catalog with HashMap

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> catalog = new HashMap<>();
        catalog.put("Wings of Fire", "A. P. J. Abdul Kalam");
        catalog.put("The Alchemist", "Paulo Coelho");
        catalog.put("The Hobbit", "J. R. R. Tolkien");
        String title = "The Alchemist";
        if (catalog.containsKey(title)) System.out.println(title + " by " + catalog.get(title));
        else System.out.println("Book not found");
    }
}