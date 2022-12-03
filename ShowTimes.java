package edu.ucalgary.ensf480;

import java.util.*;

public class ShowTimes {
    private Vector<Date> show_times;

    public Date selectShowtime(int index) {
        return this.show_times.get(index);
    }
}
