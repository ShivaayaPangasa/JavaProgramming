package Module1.Q41_MultilevelInheritance;

public class MultilevelInheritance {
    public static void main(String[] args) {

        Manager manager = new Manager();

        manager.showPerson();

        manager.showEmployee();

        manager.showManager();
    }
}

/* Hierarchy:

Person - Grandparent
  ↓
Employee (extends person) - Parent
  ↓
Manager (extends Employee) - Child

Manager gets: Person methods + Employee methods + Manager methods

That's multilevel inheritance. */