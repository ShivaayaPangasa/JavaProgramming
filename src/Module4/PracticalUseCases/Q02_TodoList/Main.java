package Module4.PracticalUseCases.Q02_TodoList;

// Simple to-do list using ArrayList

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1 Add | 2 Remove by number | 3 Display | 0 Exit");
            int choice = input.nextInt(); input.nextLine();
            if (choice == 0) break;
            if (choice == 1) {
                System.out.print("Task: "); tasks.add(input.nextLine());
            } else if (choice == 2) {
                for (int i = 0; i < tasks.size(); i++) System.out.println((i + 1) + ". " + tasks.get(i));
                System.out.print("Number to remove: "); int number = input.nextInt(); input.nextLine();
                if (number >= 1 && number <= tasks.size()) tasks.remove(number - 1);
                else System.out.println("Invalid task number.");
            } else if (choice == 3) {
                for (int i = 0; i < tasks.size(); i++) System.out.println((i + 1) + ". " + tasks.get(i));
            } else System.out.println("Unknown option.");
        }
        input.close();
    }
}
