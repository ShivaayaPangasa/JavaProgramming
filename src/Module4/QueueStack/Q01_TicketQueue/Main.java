package Module4.QueueStack.Q01_TicketQueue;

//  Ticket booking modeled as a FIFO queue

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> customers = new LinkedList<>();
        customers.offer("Asha"); customers.offer("Ravi"); customers.offer("Mina");
        System.out.println("Waiting: " + customers);
        while (!customers.isEmpty()) {
            String next = customers.poll();      // Remove person at the front.
            System.out.println("Booking ticket for " + next);
        }
        System.out.println("Remaining: " + customers);
    }
}