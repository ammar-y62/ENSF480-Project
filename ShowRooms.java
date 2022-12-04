package edu.ucalgary.ensf480;

import java.util.*;

public class ShowRooms {
    private int room;
    private Vector<ShowTimes> showtimes;
    private Vector<Seats> seats;

    public ShowRooms(int room) {
        this.room = room;
    }

    public int getRoom() {
        return room;
    }

    public Vector<ShowTimes> getShowTimes() {
        return showtimes;
    }

    public ShowTimes selectShowTime(ShowTimes showtime) {
        return showtimes.get(showtime); // change this to get element of that showtime
    }

    public void addShowTime(ShowTimes showtime) {
        showtimes.add(showtime);
    }

    public void removeShowTime(ShowTimes showtime) {
        showtimes.remove(showtime);
    }

    public Vector<Seats> getSeats() {
        return seats;
    }

    public void addShowTime(Seats seat) {
        seats.add(seat);
    }

    public void removeShowTime(Seats seat) {
        seats.remove(seat);
    }
}
