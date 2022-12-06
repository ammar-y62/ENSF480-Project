import java.util.*;

class Movie{

	private String title;
	private ShowRooms showroom;
	
	
	public Movie(String name){
		this.title = name;
	}
	
	
	public String getMovie(){
		return title;
	}
	public void setShowRoom(ShowRooms showroom)
	{
		this.showroom = showroom;
	}
	
	public ShowRooms getShowroom(){
		return showroom;
	}
	

}