package Module4.PracticalUseCases.Q04_StudentGrades;

// Student grade book using TreeMap

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, String> grades = new TreeMap<>();
        grades.put("Asha", "A"); grades.put("Ravi", "B+");
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("1 Add/update | 2 Remove | 3 Query | 4 Display | 0 Exit");
            int option = in.nextInt(); in.nextLine();
            if (option == 0) break;
            if (option == 1) {
                System.out.print("Student name: "); String name = in.nextLine();
                System.out.print("Grade: "); String grade = in.nextLine(); grades.put(name, grade);
            } else if (option == 2) {
                System.out.print("Name to remove: "); grades.remove(in.nextLine());
            } else if (option == 3) {
                System.out.print("Name to query: "); String name = in.nextLine();
                System.out.println(grades.containsKey(name) ? grades.get(name) : "Student not found");
            } else if (option == 4) {
                for (Map.Entry<String, String> e : grades.entrySet())
                    System.out.println(e.getKey() + " -> " + e.getValue());
            }
        }
        in.close();
    }
}