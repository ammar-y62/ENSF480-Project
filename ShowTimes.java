package edu.ucalgary.ensf480;

import java.util.*;

public class ShowTimes {
    private Vector<Date> show_times;

    public ShowTimes(Vector<Date> shows) {
        this.show_times = shows;
    }

    public Date selectShowtime(int index) {
        return this.show_times.get(index);
    }

    public void addShowTimes(Date time) {
        this.show_times.add(time);
    }

    public void removeShowTimes(Date time) {
        this.show_times.removeElement(time);
    }
}
