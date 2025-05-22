abstract public class Ticket {

    private int ticketId;
    private int customerId;

    public Ticket(int ticketId, int customerId) {
        this.ticketId = ticketId;
        this.customerId = customerId;
    }

    public int getTicketId() {
        return ticketId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public abstract double getPrice();

    @Override
    public abstract String toString();
}
