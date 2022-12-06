import java.sql.*;
import java.util.*;

public class Payment 
{
    boolean paid = false;
    Connection dbConnect;
    Ticket ticket;
    User user;
    Statement stmt;
    Payment(User user, Ticket ticket)
    {
        dbConnect("jdbc:mysql://localhost/Ticketing_System", "root", "root");
    }
    Payment(RegisteredUser ruser, Ticket ticket)
    {
        dbConnect("jdbc:mysql://localhost/Ticketing_System", "root", "root");
    }
    public void dbConnect(String dburl, String username, String password){
        try {
            dbConnect = DriverManager.getConnection(dburl, username, password);
            stmt=dbConnect.createStatement();

            stmt.executeUpdate("insert into TICKETS(TicketID,Email,Theatre,Movie,ShowRoom, ShowTime, SeatNumber) VALUES('"+this.ticket.getTicketID()+"','"+this.user.getEmail()+"',"
            + "'"+this.ticket.getTheatre().getTheatre()+"','"+this.ticket.getMovie().getMovie()+"','"+this.ticket.getShowRoom().getRoom()+"','"+this.ticket.getShowTime().getShowTime()+"',"
            +"'"+this.ticket.getSeat().getSeatID()+"');");

            stmt.close();
            dbConnect.close();

        } catch(Exception e){};
    }
}
