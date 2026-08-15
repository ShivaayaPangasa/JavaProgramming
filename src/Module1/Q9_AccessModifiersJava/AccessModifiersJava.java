package Module1.Q9_AccessModifiersJava;

// An access modifier tells Java who is allowed to access a variable, method or class.

class Student {

    // Private variable
    private String name;

    // Public method to set the name
    public void setName(String n) {
        name = n;
    }

    // Public method to get the name
    public String getName() {
        return name;
    }

}

public class AccessModifiersJava {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Shivaaya");

        System.out.println("Name : " + s1.getName());

    }

}