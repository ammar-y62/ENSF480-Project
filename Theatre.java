package edu.ucalgary.ensf480;

import java.util.*;

public class Theatre {
    private Vector<String> theatres;

    public Theatre(Vector<String> theatre) {
        this.theatres = theatre;
    }

    public String selectTheather(int index) {
        return this.theatres.get(index);
    }

    public void addTheatre(String theatre) {
        this.theatres.add(theatre);
    }

    public void removeTheatre(String name) {
        this.theatres.removeElement(name);
    }
}
