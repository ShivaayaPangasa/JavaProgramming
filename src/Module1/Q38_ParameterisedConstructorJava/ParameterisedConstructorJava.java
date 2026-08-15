package Module1.Q38_ParameterisedConstructorJava;

class Student { // student class

    String name;
    int age;

    Student(String n, int a){ //Student parameterized constructor.
        name = n;
        age = a;
    }

    void display(){ //Display method
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ParameterisedConstructorJava{ // main class
    public static void main(String[] args){ //To make the class executable

        Student s1 = new Student("Shivaaya", 19); //creating s1 object and calling parameterised constructor

        s1.display(); // printing s1 object

    }
}