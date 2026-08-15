package Module1.Q4_OverloadingOverriding;

public class EmailMessage extends Message{
    @Override
    public void send(){
        System.out.println("Sending an email message");
    }
}