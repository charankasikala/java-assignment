package travel.user;
import travel.booking.Ticket;

public class User{
    private int userID;
    private String userName;

    public User(int userID, String userName){
        this.userID = userID;
        this.userName = userName;
    }

    public int getUserID(){
        return userID;
    }
    public String getUserName(){
        return userName;
    }

    public void bookTicket(int ticketID, String destination, double fare){
        System.out.println("User: " + getUserName() + " is booking a ticket.");
        Ticket ticket = new Ticket(ticketID, destination, fare);
        System.out.println("Ticket Booked Successfully !\n");
        ticket.displayTicketDetails();
    }
}