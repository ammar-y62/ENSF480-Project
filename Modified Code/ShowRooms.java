import java.util.*;

public class ShowRooms {
    private int room;
    private Vector<ShowTimes> showtimes;
    private Vector<Seats> seats;
    private ArrayList<ArrayList<String>> list;

    public ShowRooms(int room, ArrayList<ArrayList<String>> list) {
        this.room = room;
        int i = 0;
        while(i < list.size())
        {
            if(Integer.parseInt(list.get(i).get(3)) == this.room)
            {
                this.list.add(list.get(i));
            }
        }
    }

    public void createShowTimes()
    {
        int i = 0;
        while(i < this.list.size())
        {
            ShowTimes showtime = new ShowTimes(this.list.get(i).get(4));
            if(!showtimes.contains(showtime))
                showtimes.add(showtime);
            i++;
            
        }
    }

    public void createSeats()
    {
        int i = 0;
        int seatNumber = 0;
        while(i < this.list.size())
        {
            //Seats seat = new Seats(seatNumber, Integer.parseInt(this.list.get(i).get(5).charAt(seatNumber)));
            Seats seat = new Seats(seatNumber, 0);
            if(!seats.contains(seat))
            {
                seats.add(seat);
                
            }
            seatNumber++;
            i++;
            
        }
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
        int index = seats.indexOf(seat);
        return this.seats.get(index);
    }

    public void addSeat(Seats seat) {
        this.seats.add(seat);
    }

    public void removeSeat(Seats seat) {
        this.seats.remove(seat);
    }
}
