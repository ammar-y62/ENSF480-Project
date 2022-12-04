

import java.util.*;



class Movie{

	private String title;

	private ShowRooms showroom;
	
	
	public Movie(String name, ShowRooms room){
		this.title = name;
		this.showroom = room;
	}
	
	
	public String getMovieName(){
		return title;
	}
	
	public ShowRooms getShowroom(){
		return showroom;
	}
	

}