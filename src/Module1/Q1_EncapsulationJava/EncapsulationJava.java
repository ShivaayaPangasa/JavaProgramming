package Module1.Q1_EncapsulationJava;

// Wrapping data (variables) and methods together into one class and protecting the data from direct access.

class Student {

    // Private variables
    private String name;
    private int age;

    // Setter method
    public void setName(String n) {
        name = n;
    }

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setAge(int a) {
        age = a;
    }

    // Getter method
    public int getAge() {
        return age;
    }
}

public class EncapsulationJava {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Shivaaya");
        s1.setAge(19);

        System.out.println("Name : " + s1.getName());
        System.out.println("Age : " + s1.getAge());

    }

}