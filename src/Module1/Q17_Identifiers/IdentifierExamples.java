package Module1.Q17_Identifiers;

public class IdentifierExamples {

    public void showIdentifiers() {

        int age = 20;
        int studentMarks = 90;
        int _score = 100;
        int $value = 500;

        System.out.println("Valid identifier: age = " + age);
        System.out.println("Valid identifier: studentMarks = " + studentMarks);
        System.out.println("Valid identifier: _score = " + _score);
        System.out.println("Valid identifier: $value = " + $value);

        System.out.println("Invalid identifier: 2marks");
        System.out.println("Invalid identifier: student-name");
        System.out.println("Invalid identifier: class");
        System.out.println("Invalid identifier: student name");
    }
}

/* In Java, valid identifiers are names given to variables, methods, classes, packages and interfaces that follow strict syntax rules. 
Invalid identifiers violate these rules and will immediately trigger a compile-time error.

Core Rules for Naming Identifiers:

Allowed Characters: Only letters (A-Z, a-z), digits (0-9), underscores (_) and dollar signs ($).
Starting Character: Must begin with a letter, an underscore or a dollar sign. It cannot begin with a digit.
No Reserved Words: Cannot be a Java keyword (like int, class, public) or literals (like true, false, null).
No Whitespace: Cannot contain spaces, tabs or any other blank spaces.
Case Sensitivity: Java is strictly case-sensitive (myVar and myvar are distinct identifiers).
Length: There is no technical limit on the length of an identifier. */