package DSA.LinkedList;
import java.util.LinkedList;
import java.util.Queue;

// Abstract Ticket class (Abstraction)
abstract class Ticket {
    private static int idCounter = 1;
    private final int ticketId;
    private final String customerName;
    private final String issueDescription;

    public Ticket(String customerName, String issueDescription) {
        this.ticketId = idCounter++;
        this.customerName = customerName;
        this.issueDescription = issueDescription;
    }

    public int getTicketId() {
        return ticketId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    // Polymorphic method
    public abstract String getTicketType();

    @Override
    public String toString() {
        return "[" + getTicketType() + " Ticket #" + ticketId + "] " +
                customerName + ": " + issueDescription;
    }
}

// Concrete Ticket types (Polymorphism)
class ChatTicket extends Ticket {
    public ChatTicket(String customerName, String issueDescription) {
        super(customerName, issueDescription);
    }

    @Override
    public String getTicketType() {
        return "Chat";
    }
}

class CallTicket extends Ticket {
    public CallTicket(String customerName, String issueDescription) {
        super(customerName, issueDescription);
    }

    @Override
    public String getTicketType() {
        return "Call";
    }
}

class EmailTicket extends Ticket {
    public EmailTicket(String customerName, String issueDescription) {
        super(customerName, issueDescription);
    }

    @Override
    public String getTicketType() {
        return "Email";
    }
}

// TicketQueue class (Encapsulation)
class TicketQueue {
    private final Queue<Ticket> queue = new LinkedList<>();

    public void addTicket(Ticket ticket) {
        queue.offer(ticket);
        System.out.println("Added: " + ticket);
    }

    public Ticket processNextTicket() {
        Ticket ticket = queue.poll();
        if (ticket != null) {
            System.out.println("Processing: " + ticket);
        } else {
            System.out.println("No tickets to process.");
        }
        return ticket;
    }

    public boolean hasTickets() {
        return !queue.isEmpty();
    }
}

// Main Application
public class CallCenterApp {
    public static void main(String[] args) {
        TicketQueue ticketQueue = new TicketQueue();

        // Add tickets (Abstraction)
        ticketQueue.addTicket(new ChatTicket("Alice", "Cannot login to account"));
        ticketQueue.addTicket(new CallTicket("Bob", "Payment not processed"));
        ticketQueue.addTicket(new EmailTicket("Charlie", "Feature request"));

        // Process tickets in FIFO order
        while (ticketQueue.hasTickets()) {
            ticketQueue.processNextTicket();
        }
    }
}
