
import java.util.*;

import java.lang.Math;   

class Ticket{

	private int ticketID;
	private Seats seat; // you get a ticket for every set you book. Three seats requires three tickets
	private User user;
	
	
	//if we need another design pattern, could implement an observer to update whenever a ticket number is produced
	//  and keep track so that there's no duplicates, and if a ticket is cancelled then it makes that ID available again
	public Ticket(User guest){
		this.ticketID = Math.random()*(5000)+1); // max possible value of ticketID is 5000, min is 1
		this.user = guest;
	}
	
	public int getTicketID(){
		return ticketID;
	}
	
	public void setSeat(Seats newSeat){
		seat = newSeat;
	}
	
	public int getSeatNumber(){
		return seat.getSeatID();
		
	}
	
	

}