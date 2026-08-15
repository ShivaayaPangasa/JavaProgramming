package Module1.Q06_MultipleInheritance;

public class SmartPhone implements Camera, GPS{
    
    //One class implements two interfaces.

    @Override
    public void takePhoto(){
        System.out.println("Photo captured");
    }
    
    @Override
    public void showLocation(){
        System.out.println("Current location displayed");
    }
}