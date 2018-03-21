package flyweight;

import java.util.Random;

public class TrainTicket implements Ticket {
    private String from;
    private String to;
    public int price;

    public TrainTicket(String from, String to){
        this.from = from;
        this.to = to;
    }

    @Override
    public void showTicketInfo() {
        this.price = new Random().nextInt(100);
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "TrainTicket{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", price=" + price +
                '}';
    }
}
