import java.util.*;

import edu.ucalgary.ensf480.Payment;

public class User {
    private Vector<Theatre> theatre;
    private Payment payment;//Do we need paymet??

    public User(Vector<Theatre> t, Payment p){
        theatre=t;
        payment=p;
    }

    public Vector<Theatre> getTheatre(){
        return theatre;
    }
    
    public Payment getPayment(){
        return payment;
    }
    
    public Theatre selectTheater(Theatre t) {
        //Calls Theatre class
        int index = theatre.indexOf(t);
        return theatre.get(index);
    }

    public void makePayment() {
        //Check Payment class
        PaymentGUI();
    }
    public void cancelTicket()) {
        //Calls ticket class
    }
    public void seeTicket() {
        //Calls ticket class
    }
}

