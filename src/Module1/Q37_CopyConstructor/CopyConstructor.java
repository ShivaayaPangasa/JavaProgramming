package Module1.Q37_CopyConstructor;

// In Java, a copy constructor is simply a constructor that takes another object of the same class as a parameter and copies its values.
// A copy constructor creates a new object by copying the values of another object.

class Student {

    String name;
    int age;

    // Parameterized Constructor
    Student(String n, int a) {

        name = n;
        age = a;

    }

    // Copy Constructor
    Student(Student s) { //Receive another Student object

        name = s.name;
        age = s.age;

    }

    void display() {

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);

    }

}

public class CopyConstructor {

    public static void main(String[] args) {

        Student s1 = new Student("Shivaaya", 19);

        Student s2 = new Student(s1);

        System.out.println("First Object");

        s1.display();

        System.out.println();

        System.out.println("Copied Object");

        s2.display();

    }

}

/* 
Parameterized Constructor vs Copy Constructor
Parameterized Constructor	                  Copy Constructor
Receives individual values	             Receives another object
Example: Student("Rahul", 20)	         Example: Student(s1)
Initializes fields with given values	 Copies fields from an existing object */