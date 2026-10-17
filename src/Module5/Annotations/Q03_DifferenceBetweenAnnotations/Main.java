package Module5.Annotations.Q03_DifferenceBetweenAnnotations;

public class Main {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.printMessage();
    }
}

class Parent {
    void printMessage() { 
        System.out.println("Parent message"); 
    }
}

class Demo extends Parent {
    @Override
    void printMessage() { 
        System.out.println("@Override confirms this method overrides Parent.printMessage()"); 
    }

    @Deprecated
    void oldMethod() { 
        System.out.println("This is a legacy method"); }
}


/* @Override indicates that a method is intended to override a method inherited from a superclass or implemented 
from an interface. The compiler checks this and reports an error if the override is invalid.

@Deprecated indicates that a program element is outdated or should no longer be preferred. The compiler or IDE 
can warn the programmer when it is used.

Main difference: @Override checks the correctness of method overriding, whereas 
@Deprecated warns programmers against using outdated code. */ 