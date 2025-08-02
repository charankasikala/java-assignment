class Ticket {
    void bookTicket() {
        System.out.println("Ticket booked.");
    }
}

class BusTicket extends Ticket {
    @Override
    void bookTicket() {
        System.out.println("Bus ticket booked");
    }
}

class TrainTicket extends Ticket {
    @Override
    void bookTicket() {
        System.out.println("Train ticket booked");
    }
}

class FlightTicket extends Ticket {
    @Override
    void bookTicket() {
        System.out.println("Flight ticket booked");
    }
}

public class TicketBookingSystem {
    public static void main(String[] args) {
        Ticket bus = new BusTicket();
        Ticket train = new TrainTicket();
        Ticket flight = new FlightTicket();

        bus.bookTicket();     
        train.bookTicket();   
        flight.bookTicket();  
    }
}
