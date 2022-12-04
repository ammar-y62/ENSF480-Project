package edu.ucalgary.ensf480;

import java.util.*;

public class Theatre {
    private String theatre_name;
    private Vector<Movie> movies;
    private Vector<ShowRooms> showrooms;
    ArrayList<ArrayList<String>> list;

    public Theatre(String theatre, ArrayList<ArrayList<String>> list) {
        this.theatre_name = theatre;
        this.list = list;
    }

    public void createShowrooms()
    {
        int i = 0;
        while(i < this.list.size())
        {
            if(this.list.get(i).get(1).equals(this.theatre_name))
            {
                ShowRooms showroom = new ShowRooms(Integer.valueOf(this.list.get(i).get(3)));
                if(!showrooms.contains(showroom))
                    showrooms.add(showroom);
            }
            i++;
            
        }
    }
    public void createMovies()
    {
        int i = 0;
        while(i < this.list.size())
        {
            if(this.list.get(i).get(1).equals(this.theatre_name))
            {
                if(!movies.contains(this.list.get(i).get(1)))
                {
                    Movie movie = new Movie(this.list.get(i).get(2), this.list.get(i).get(3));
                    movies.add(movie);
                }
            }
            
        }
    }

    public String getTheatre() {
        return theatre_name;
    }

    public Vector<Movie> getMovies() {
        return movies;
    }

    public Movie selectMovie(Movie movie) {
        int index = movies.indexOf(movie);
        return this.movies.get(index);
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void removeMovie(Movie movie) {
        movies.remove(movie);
    }

    public Vector<ShowRooms> getRooms() {
        return showrooms;
    }

    public ShowRooms selectShowRoom(ShowRooms showroom) {
        int index = showrooms.indexOf(showroom);
        return this.showrooms.get(index);
    }

    public void addShowRoom(ShowRooms room) {
        showrooms.add(room);
    }

    public void removeShowRoom(ShowRooms room) {
        showrooms.remove(room);
    }
}
