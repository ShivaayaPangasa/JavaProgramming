package Module1.Q39_StaticNonStatic;

public class StaticNonStatic {
    public static void main(String[] args) {

        College.showCollegeName(); //staic means method belongs to the class itself so we can call dircetly no object required 

        College student = new College(); //non static means method belongs to an object hence we need to create object using new keyword

        student.showStudentName(); //then after creating object this calls the instance method.
    }
}