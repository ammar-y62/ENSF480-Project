
import java.util.*;


class Seats{

	private int seatID;
	private User user;
	private int taken; // is the seat booked or not: 0 = no, 1 = yes
	
	public Seats(int id, int taken){
		this.taken = taken;
		this.seatID = id;
	}
	
	/*public void assignTicket(int ticketNumber){
		this.ticketID = ticketNumber;
	}*/

	public int getSeatID(){
		return seatID;
	}
	
	public void setSeatNumber(int value){
		this.seatID = value;
	}
	
	public void changeSeatAvailability(int availability){ //update seat availability
		this.taken = availability;
	}

	public int getSeatAvailability()
	{
		return this.taken;
	}


}