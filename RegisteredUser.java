import java.util.*;

public class RegisteredUser extends User{

    private String name;
    private String address;
    private String card;

    //Inherit constructor????
    public RegisteredUser(String n, String a, String c){
        name=n;
        address=a;
        card=c;
    }
    public static void annualFeePayment(void) {
        //20$ per year
    }
    public static void earlyBooking(void){
        //Check if 10%
    }
    @Override
    public static void cancelTicket(void) {
        //if >72 hours prior to the show
    }
}

