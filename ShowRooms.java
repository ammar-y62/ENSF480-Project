import java.util.*;

public class ShowRooms {
    private Vector<Integer> rooms = new Vector<>();

    public ShowRooms(int n) {
        this.rooms.add(n);
    }

    public int getRoom(int index) {
        return this.rooms.elementAt(index);
    }
}
