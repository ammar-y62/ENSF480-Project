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
        return this.room;
    }

    public Vector<ShowTimes> getShowTimes() {
        return this.showtimes;
    }

    public ShowTimes selectShowTime(ShowTimes showtime) {
        int index = showtimes.indexOf(showtime);
        return this.showtimes.get(index);
    }

    public void addShowTime(ShowTimes showtime) {
        this.showtimes.add(showtime);
    }

    public void removeShowTime(ShowTimes showtime) {
        this.showtimes.remove(showtime);
    }

    public Vector<Seats> getSeats() {
        return this.seats;
    }

    public Seats selectSeat(Seats seat) {
        int index = showtimes.indexOf(seat);
        return this.showtimes.get(index);
    }

    public void addSeat(Seats seat) {
        this.seats.add(seat);
    }

    public void removeSeat(Seats seat) {
        this.seats.remove(seat);
    }
}
