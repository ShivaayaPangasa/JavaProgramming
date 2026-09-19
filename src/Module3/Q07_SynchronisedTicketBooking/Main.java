package Module3.Q07_SynchronisedTicketBooking;

class TicketCounter {
    private int availableTickets = 5;
    //Only one threat may exceute this method on this object at a time
    public synchronized void bookTicket(String user,  int requestedTickets){
        if(availableTickets >= requestedTickets){
            availableTickets -= requestedTickets;
            System.out.println(user + " booked " + requestedTickets + " tickets. Remaining tickets: " + availableTickets);
        }
        else{
            System.out.println(user + " could not book " + requestedTickets + " tickets. Avaiable tickets are: " + availableTickets);
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException{
        //All users must share the same counter object
        TicketCounter counter = new TicketCounter();

        Thread user1 = new Thread(() -> counter.bookTicket("user 1", 2));
        Thread user2 = new Thread(() -> counter.bookTicket("user 2", 6));
        user1.start();
        user2.start();

        user1.join();
        user2.join();
    }
}