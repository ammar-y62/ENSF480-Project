package edu.ucalgary.ensf480;

import java.util.*;

public class ShowRooms {
    private Vector<Integer> rooms = new Vector<>();

    public ShowRooms(Vector<Integer> room) {
        this.rooms = room;
    }

    public int selectRoom(int index) {
        return this.rooms.get(index);
    }

    public void addRoom(int room) {
        this.rooms.add(room);
    }

    public void removeRoom(int room) {
        this.rooms.removeElement(room);
    }
}
