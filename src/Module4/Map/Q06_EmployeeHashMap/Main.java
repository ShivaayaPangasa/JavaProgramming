package Module4.Map.Q06_EmployeeHashMap;

// Employee map using keySet and entrySet

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> employees = new HashMap<>();
        employees.put(1001, "Asha"); employees.put(1002, "Ravi");
        employees.put(1003, "Mina");
        System.out.println("Has 1002? " + employees.containsKey(1002));
        employees.put(1004, "Dev");

        System.out.println("Using keySet:");
        for (Integer id : employees.keySet())
            System.out.println(id + " -> " + employees.get(id));

        System.out.println("Using entrySet:");
        for (Map.Entry<Integer, String> entry : employees.entrySet())
            System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
}
