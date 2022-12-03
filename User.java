import java.util.*;

public class User {
    private Theatre theatre;
    private Payment payment;
    private Vector<Seats> seat = new Vector<>();

    public User(Theatre t, Payment p,Vector<Seats> s){
        theatre=t;
        payment=p;
        seat=s;
    }

    public Theatre getTheatre(){
        return theatre;
    }
    public void setTheatre(Theatre t){
        theatre=t;
    }
    public Payment getPayment(){
        return payment;
    }
    public void setPayment(Payment p){
        payment=p;
    }
    public Vector<Seats> getSeat(){
        return seat;
    }
    public void setSeat(Seat s){
        seat=s;
    }

    public void selectMovie() {
        //Calls Movie class
    }
    public String selectTheater(int x) {
        //Calls Theatre class
        String th= theatre.selectTheather(x);
        return th;
    }
    public static void selectSeats() {
        //Calls Seat class
    }
    public static void makePayment() {
        //Check Payment class
    }
    public static void cancelTicket(int h) {
        //Calls ticket class
    }
}

