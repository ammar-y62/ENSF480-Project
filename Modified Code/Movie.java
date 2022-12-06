import java.util.*;

class Movie{

	private String title;
	private Vector<ShowRooms> showroom;
	
	
	public Movie(String name){
		this.title = name;
	}
	
	
	public String getMovie(){
		return title;
	}
	public void setShowRoom(ShowRooms showroom)
	{
		this.showroom.add(showroom);
	}
	
	public Vector<ShowRooms> getShowroom(){
		return showroom;
	}
	

}