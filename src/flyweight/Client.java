package flyweight;

public class Client {
    public static void main(String[] args){
        Ticket ticket = TicketFactory.getTicket("sichuan", "shenzhen");
        ticket.showTicketInfo();

        Ticket ticket1 = TicketFactory.getTicket("sichuan", "shenzhen");
        ticket1.showTicketInfo();

        Ticket ticket2 = TicketFactory.getTicket("sichuan", "shenzhen");
        ticket2.showTicketInfo();
    }
}
