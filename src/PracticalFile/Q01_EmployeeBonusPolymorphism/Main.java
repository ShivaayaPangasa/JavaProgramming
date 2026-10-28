package PracticalFile.Q01_EmployeeBonusPolymorphism;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
            new Manager("Shivaaya", 8, 5, 90000),
            new Developer("Rasika", 4, 4, 70000),
            new Intern("Ajay", 1, 5, 20000)
        };

        System.out.println("\n--- Employee Bonuses ---");

        for (Employee employee : employees) {
            System.out.printf(
                "%s (%s): bonus = Rs. %.2f%n",
                employee.getName(),
                employee.getClass().getSimpleName(),
                employee.calculateBonus()
            );
        }
    }
}

// First level of inheritance.
class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
        System.out.println("Person constructor: " + name);
    }

    public String getName() {
        return name;
    }
}

// Second level of inheritance.
abstract class Employee extends Person {
    protected final int experienceYears;
    protected final int performanceRating;
    protected final double baseSalary;

    public Employee(
        String name,
        int experienceYears,
        int performanceRating,
        double baseSalary
    ) {
        super(name); // Calls the Person constructor.

        this.experienceYears = experienceYears;
        this.performanceRating = performanceRating;
        this.baseSalary = baseSalary;

        System.out.println("Employee constructor: " + name);
    }

    public abstract double calculateBonus();

    protected double ratingFactor() {
        return performanceRating / 5.0;
    }

    protected double experienceFactor() {
        return 1 + (experienceYears * 0.03);
    }
}

// Third level: Person -> Employee -> Manager.
class Manager extends Employee {
    public Manager(String name, int years, int rating, double salary) {
        super(name, years, rating, salary);
        System.out.println("Manager constructor: " + name);
    }

    @Override
    public double calculateBonus() {
        return baseSalary * 0.20
                * experienceFactor() * ratingFactor();
    }
}

class Developer extends Employee {
    public Developer(String name, int years, int rating, double salary) {
        super(name, years, rating, salary);
    }

    @Override
    public double calculateBonus() {
        return baseSalary * 0.12
                * experienceFactor() * ratingFactor();
    }
}

class Intern extends Employee {
    public Intern(String name, int years, int rating, double stipend) {
        super(name, years, rating, stipend);
    }

    @Override
    public double calculateBonus() {
        return baseSalary * 0.05
                * experienceFactor() * ratingFactor();
    }
}