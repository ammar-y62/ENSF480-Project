import java.util.*;

public class RegisteredUser extends User{

    private String name;
    private String address;
    private String card;

    //Inherit constructor????
    public RegisteredUser(Theatre t, Payment p,Vector<Seats> s, String n, String a, String c){
        super(t, p,s);
        name=n;
        address=a;
        card=c;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String a){
        address=a;
    }
    public String getCard(){
        return card;
    }
    public void setCard(String c){
        card=c;
    }
    public static void annualFeePayment() {
        //20$ per year
    }
    public static void earlyBooking(){
        //Calls Ticket
    }
    @Override
    public static void cancelTicket(int h) {
        //Calls Ticket (Diff than ordinary user)
}

