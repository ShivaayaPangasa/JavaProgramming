package Module1.Q04_OverloadingOverriding;

public class EmailMessage extends Message{
    @Override
    public void send(){
        System.out.println("Sending an email message");
    }
}