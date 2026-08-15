package Module1.Q39_StaticNonStatic;

public class College {

    public static void showCollegeName() { //static means method belongs to the class itself so we can call dircetly no object required 

        System.out.println("ABC College");
    }

    public void showStudentName() { //non static means method belongs to an object hence we need to create object using new keyword 

        System.out.println("Student: Shivaaya");
    }
}

/* 

STATIC
   ↓
belongs to class
   ↓
ClassName.method()


NON-STATIC
   ↓
belongs to object
   ↓
object.method()

*/