package Module5.Annotations.Q02_BuiltInJavaAnnotations;

class Parent {
    void display() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child class");
    }

    @Deprecated
    void oldMethod() {
        System.out.println("Old method");
    }

    @SuppressWarnings("unused")
    void example() {
        int number = 10;
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}

/* Three commonly used built-in Java annotations are:

1. @Override — Indicates that a method overrides a method declared in a superclass or implemented interface.
2. @Deprecated — Marks a class, method or other program element as outdated and indicates that it should generally 
not be used in new code.
3. @SuppressWarnings — Tells the compiler to suppress specified warnings in a particular scope. */