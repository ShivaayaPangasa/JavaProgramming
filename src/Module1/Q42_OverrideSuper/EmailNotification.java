package Module1.Q42_OverrideSuper;

public class EmailNotification extends Notification {

    @Override
    public void send() {
        super.send(); //Call my parent's send() method. - i.e. call Notification class send() method 
        System.out.println("Sending notification by email");
    }
}