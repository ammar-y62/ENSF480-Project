import java.util.*;
import java.lang.*;

public class Theatre {
    private String theater_name;
    private ShowRooms show_rooms;
    private ShowTimes show_times;
    
    public Theatre(String name) {
        this.theater_name = name;
    }

    public String getTheather() {
        return theater_name;
    }
}
