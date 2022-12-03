package edu.ucalgary.ensf480;

import java.util.*;

public class Theatre {
    private Vector<String> theater;
    // are the following needed?
    private ShowRooms showrooms;
    private ShowTimes showtimes;
    private Movie movies;

    public String selectTheather(int index) {
        return this.theater.get(index);
    }

    // do we get access of showrooms, showtimes and movies here?
}
