import java.util.*;

public class User {
    private Theatre theatre;
    private Payment payment;
    private Vector<Seats> seat = new Vector<>();

    //Do we need setters and getters for theatre and payment??
    public User(Theater t, Payment p,Vector<Seats> s){
        theatre=t; //Don't we need to check if it's available first
        payment=p;
        seat=s;
    }

    public static void selectMovie(void) {
        //Calls Movie class
    }
    public static void selectTheater(Theatre t) {
        //Calls Theatre class
    }
    public static void selectSeats(void) {
        //Calls Seat class
    }
    public static void makePayment(void) {
        //Check Payment class
    }
    public static void cancelTicket(int h) {
        //Calls ticket class
    }
}

