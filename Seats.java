
import java.util.*;


class Seats{

	private int seatID;
	private User user;
	private int taken; // is the seat booked or not: 0 = no, 1 = yes
	
	public Seats(User guest){
		this.taken = 0;
		this.user = guest;
	}
	
	public void assignTicket(int ticketNumber){
		this.ticketID = ticketNumber;
	}

	public int getSeatID(){
		return seatNum;
	}
	
	public void setSeatNumber(int value){
		this.seatID = value;
	}
	
	public void changeSeatTaken(){ //update seat availability
		if(taken == 0){
			taken = 1;
			return;
		}
		if(taken == 1){
			taken = 0;
			return;
		}
	}


}