package edu.ucalgary.ensf480;

import java.util.*;

public class ShowRooms {
    private Vector<Integer> rooms = new Vector<>();

    public ShowRooms(int n) {
        this.rooms.add(n);
    }

    public int selectRoom(int index) {
        return this.rooms.get(index);
    }
}
