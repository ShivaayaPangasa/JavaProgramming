package Extra.Q15_ConstructorChaining;

class Person{
    Person(){
        System.out.println("Person constructor");
    }
}

class Employee extends Person{
    Employee(){
        super();
        System.out.println("Employee constructor");
    }
}

class Manager extends Employee{
    Manager(){
        super();
        System.out.println("Manager constructor");
    }
}

public class Main{
    public static void main(String[] args){
        Manager manager = new Manager();
    }
}