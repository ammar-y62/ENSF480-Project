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
