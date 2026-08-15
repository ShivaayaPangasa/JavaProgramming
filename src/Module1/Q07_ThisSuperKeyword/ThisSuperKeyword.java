package Module1.Q07_ThisSuperKeyword;

// When an object talks about its own variables or methods, it uses this. this refers to the current object of the current class.

// super refers to the immediate parent class.

class Person {

    String name = "Shivaaya";

}

class Student extends Person {

    String name;

    Student(String name) {

        this.name = name; // When the class variable and constructor parameter have the same name, this.name refers to the class variable, while name refers to the parameter.

    }

    void display() {

        System.out.println("Current Class Name : " + this.name);

        System.out.println("Parent Class Name : " + super.name);

    }

}

public class ThisSuperKeyword {

    public static void main(String[] args) {

        Student s1 = new Student("Vaaya");

        s1.display();

    }

}