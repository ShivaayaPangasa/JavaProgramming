package Extra.Q10_TicketBookingMultipleThreads;

class TicketBooking {
    private int availableTickets = 10;
    synchronized void bookTicket(int numberOfTickets){
        if (numberOfTickets <= availableTickets){
            System.out.println(Thread.currentThread().getName() + " is booking " + numberOfTickets + " tickets.");
            availableTickets -= numberOfTickets;
            System.out.println("Remaining tickets: "+ availableTickets);
        }
        else{
            System.out.println(Thread.currentThread().getName() + " cannot book " + numberOfTickets + "ticket(s).");
            System.out.println("Only " + availableTickets + " tickets are available.");
        }
    }
}

class BookingThread extends Thread {
    private TicketBooking booking;
    private int numberOfTickets;

    BookingThread(TicketBooking booking, int numberOfTickets){
        this.booking = booking;
        this.numberOfTickets = numberOfTickets;
    }
    public void run() {
        booking.bookTicket(numberOfTickets);
    }
}

public class Main {
    public static void main(String[] args){
        TicketBooking booking = new TicketBooking();
        BookingThread t1 = new BookingThread(booking, 4);
        BookingThread t2 = new BookingThread(booking, 12);
        BookingThread t3 = new BookingThread(booking,3);
        t1.start();
        t2.start();
        t3.start();
    }
}