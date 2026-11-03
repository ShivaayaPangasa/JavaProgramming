package Extra.Q20_CustomException;

class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}

public class Main{
    static void register(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age must be at least 18");
        }
        System.out.println("Registration successful");
    }
    public static void main(String[] args){
        try{
            register(16);
        }
        catch(InvalidAgeException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}