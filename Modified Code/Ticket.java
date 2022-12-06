
import java.util.*;

import java.lang.Math;   

class Ticket{

	private int ticketID;
	boolean registration = false;
	private Theatre theatre;
	private Movie movie;
	private ShowRooms showroom;
	private ShowTimes showtime;
	private Seats seat; // you get a ticket for every set you book. Three seats requires three tickets
	private User user;
	private RegisteredUser ruser;
	
	
	//if we need another design pattern, could implement an observer to update whenever a ticket number is produced
	//  and keep track so that there's no duplicates, and if a ticket is cancelled then it makes that ID available again
	public Ticket(int id){
		this.ticketID = id; // max possible value of ticketID is 5000, min is 1
		//this.user = guest;
	}
	
	public void setTheatre(Theatre theatre)
	{
		this.theatre = theatre;
	}

	public Theatre getTheatre()
	{
		return this.theatre;
	}
	
	public Movie getMovie()
	{
		return this.movie;
	}

	public ShowRooms getShowRoom()
	{
		return this.showroom;
	}

	public ShowTimes getShowTime()
	{
		return this.showtime;
	}

	public Seats getSeat()
	{
		return this.seat;
	}
	public User getUser()
	{
		return this.user;
	}
	public RegisteredUser getRegisteredUser()
	{
		return this.ruser;
	}

	public void setMovie(Movie movie)
	{
		this.movie = movie;
	}

	public void setShowRoom(ShowRooms showroom)
	{
		this.showroom = showroom;
	}

	public void setShowTimes(ShowTimes showtime)
	{
		this.showtime = showtime;
	}

	public void setSeat(Seats seat)
	{
		this.seat = seat;
		this.seat.changeSeatAvailability(1);
	}

	public void setUser(User user)
	{
		this.user = user;
	}
	public void setRegisteredUser(RegisteredUser ruser)
	{
		this.ruser = ruser;
		this.registration = true;
	}

	public boolean getRegistration()
	{
		return this.registration;
	}
	
	public int getTicketID(){
		return ticketID;
	}
	
	public int getSeatNumber(){
		return seat.getSeatID();
		
	}
	
	

}