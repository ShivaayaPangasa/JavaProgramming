package Extra.Q16_EmployeeRuntimePolymorphism;

abstract class Employee{
    String name;

    Employee(String name){
        this.name = name;
    }

    abstract double calculateBonus();
}

class Manager extends Employee{
    Manager(String name){
        super(name);
    }

    @Override 
    double calculateBonus(){
        return 10000;
    }
}

class Developer extends Employee{
    Developer(String name){
        super(name);
    }

    @Override 
    double calculateBonus(){
        return 7000;
    }
}

class Intern extends Employee{
    Intern(String name){
        super(name);
    }

    @Override 
    double calculateBonus(){
        return 3000;
    }
}

public class Main{
    public static void main(String[] args){
        Employee[] employees = {
            new Manager("Shivaaya"),
            new Developer("Rasika"),
            new Intern("Ajay")
        };

        for(Employee employee : employees){
            System.out.println(employee.name + " bonus: " + employee.calculateBonus());
        }
    }
}