package Module1.Q02_InheritancePolymorphism;

public class InheritancePolymorphism{
    public static void main(String[] args){
        Employee employee = new Developer();
        employee.work(); // runs Developer.work() because the actual object is a Developer and that is runtime polymorphism.
    }

}