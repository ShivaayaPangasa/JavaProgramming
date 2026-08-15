package Module1.Q4_OverloadingOverriding;

public class OverloadingOverriding{
    public static void main(String[] args){
        
        Calculator calculator = new Calculator();
        
        // Method Overloading = same class + same method name + different parameters

        System.out.println(calculator.add(10,20));

        System.out.println(calculator.add(10,20,30));

        Message message = new EmailMessage();

        //Method Overriding = (parent + child) + same method signature + child changes implementation

        message.send();

    }

}