import java.util.*;

public class RegisteredUser extends User{

    private String name;
    private String address;
    private String card;

    //Inherit constructor????
    public RegisteredUser(String name, String address, String card, String email){
        super(email, true);
        this.name=name;
        this.address=address;
        this.card=card;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String n){
        name=n;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String a){
        address=a;
    }
    public String getCard(){
        return this.card;
    }
    public void setCard(String c){
        card=c;
    }
    public String getEmail()
    {
        return super.getEmail();
    }
    public static void annualFeePayment() {
        //20$ per year
    }
    public static void earlyBooking(){
        //Calls Ticket
    }
    /*@Override
    public static void cancelTicket(int h) {
        //Calls Ticket (Diff than ordinary user)*/
}

