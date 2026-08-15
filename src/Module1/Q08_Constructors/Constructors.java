package Module1.Q08_Constructors;

class Student { //Student class 

    String name;
    int age;

    Student() { //Student constructor , both constructor and class names are same 

        name = "Shivaaya";
        age = 19;

    }

    void display() { // normal method to print the values

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);

    }

}

public class Constructors { // main class and Java starts execution here.
    public static void main(String[] args) {

        Student s1 = new Student(); // Student class name ; s1 Object name ; new creates a new object ; Student() calls the constructor.

        s1.display(); // Calling the display() Method

    }

}

/* Constructor vs Method

           Constructor	                                  Method
Same name as the class	                         Any valid name
No return type	                                 Has a return type or void
Runs automatically when an object is created	 Called manually using the object
Initializes object data	                         Performs a specific task

*/

