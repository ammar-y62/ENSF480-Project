package edu.ucalgary.ensf480;

import java.util.*;

public class Theatre {
    private String theatre_name;
    private Vector<Movie> movies;
    private Vector<ShowRooms> showrooms;

    public Theatre(String theatre) {
        this.theatre_name = theatre;
    }

    public String getTheatre() {
        return theatre_name;
    }

    public Vector<Movie> getMovies() {
        return movies;
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

    public void addShowRoom(ShowRooms room) {
        showrooms.add(room);
    }

    public void removeShowRoom(ShowRooms room) {
        showrooms.remove(room);
    }
}
