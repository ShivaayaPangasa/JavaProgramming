package Module5.Annotations.Q01_BuiltInAnnotations;

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

/* Annotations in Java provide metadata, which means additional information about a class, method, variable, 
constructor or other program element. 
They start with the @ symbol. Annotations can help the compiler detect errors, suppress warnings and allow
frameworks to configure or process program 
elements. Annotations do not automatically change program behaviour; tools, the compiler or frameworks process
them to perform specific actions. */