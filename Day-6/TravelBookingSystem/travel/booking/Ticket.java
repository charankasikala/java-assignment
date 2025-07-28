package travel.booking;
import travel.user.User;

public class Ticket{
    private int ticketID;
    private String destination;
    private double fare;

    public Ticket(int ticketID, String destination, double fare){
        this.ticketID = ticketID;
        this.destination = destination;
        this.fare = fare;
    }

    public int getTicketID(){
        return ticketID;
    }
    public String getDestination(){
        return destination;
    }
    public double getFare(){
        return fare;
    }

    public void displayTicketDetails(){
        System.out.println("Ticket Information");
        System.out.println("Ticket ID: " + getTicketID());
        System.out.println("Destination: " +getDestination());
        System.out.println("Fare: " + "RS. " + getFare());
    }
}

/*
 * Design a travel booking system using two packages:`travel.booking – 
 * includes a class`Ticket with ticket ID, destination, and fare.`travel.user
 *  – includes a class`User with user details and a method to book a ticket.
Illustrate accessing ticket data from within the user class.
 */