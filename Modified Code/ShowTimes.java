import java.util.*;

public class ShowTimes {
    private String showtime;
    private int year, month, day, hour, minute;

    public ShowTimes(String show) {
        this.showtime = show;
        this.year = Integer.parseInt(show.substring(0, 3));
        this.month = Integer.parseInt(show.substring(4, 5));
        this.day = Integer.parseInt(show.substring(6, 7));
        this.hour = Integer.parseInt(show.substring(8, 9));
        this.minute = Integer.parseInt(show.substring(10, 11));
        //"202003201930" 2001-03-20 20:30
    }

    public String getShowTime() {
        return this.showtime;
    }

    public String getDate() {
        String date = Integer.toString(this.year) + "-" + Integer.toString(this.month) + "-" + Integer.toString(this.day);
        return date;
    }

    public String getTime() {
        String time = Integer.toString(this.hour) + ":" + Integer.toString(this.minute);
        return time;
    }
}
