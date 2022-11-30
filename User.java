import java.util.*;

public class User {
    private Theatre theatre;
    private Payment payment;

    public User(Theater t){
        theatre=t;
        payment=p;
    }
    public static boolean searchForMovie(void) {
        //Checks if movie available
    }
    public static void selectTheater(void) {
        //Checks if theater available
    }
    public static void viewAvailableMovie(void) {
        //Displays the list of movies from database
        //Then call availabeShowtimes
    }
    public static void viewAvailableShowtimes(void) {
        //Checks available time from database
    }
    public static void viewAvailableSeats(void) {
        //Checks available seats from database
    }
    public static void selectSeats(void) {
        //Selects the seat from availabe Seats
    }
    public static void makePayment(void) {
        //Check payment class??
    }
    public static void cancelTicket(int h) {
        //if <72 hours prior to the show, can't cancel ticket
        if(h<72){
            System.out.println("Can't Cancel ticket./n " +
                    "You can only cancel tickets only up " +
                    "to 72 hours prio to show");
            break;
        }
        //receive a credit with %15 administration fee for future
        // purchase up maximum of one-year expiration date??
    }
}

