package Extra.Q017_OverloadingOverridingFinal;

class Calculator{
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){ //Method overloading 
        return a+b+c;
    }
}

class Parent {
    void show(){
        System.out.println("Parent show() method");
    }
    final void fixedMessage(){
        System.out.println("This message cannot be overridden");
    }
}

class Child extends Parent{
    @Override 
    void show(){
        System.out.println("Child show() method");
    }
}

final class Utility{
    static final double PI = 3.14159;
}

public class Main{
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2,3));
        System.out.println(calculator.add(2,3,4));

        Parent object = new Child();
        object.show();
        object.fixedMessage();
        System.out.println(Utility.PI);
    }
}