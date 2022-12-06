import java.util.*;
import java.sql.*;

public class TicketingSystem
{
    private Vector<Theatre> theatres;
    private ArrayList<ArrayList<String>> list;

    TicketingSystem(String dburl, String username, String password)
    {
        DBConnect(dburl, username, password);
        createTheatres();
    }

    public Vector<Theatre> getTheatres()
    {
        return this.theatres;
    }

    public void DBConnect(String dburl, String username, String password)
    {
        Connection dbConnect;
        Statement stmt;
        ResultSet rs;
        try {
            dbConnect = DriverManager.getConnection(dburl, username, password);
            stmt=dbConnect.createStatement();

            rs=stmt.executeQuery("select * from movie;");
            while(rs.next())
            {
                ArrayList<String> element = new ArrayList<String>();
                element.add(rs.getString("MovieID"));
                element.add(rs.getString("Theatre"));
                element.add(rs.getString("MovieName"));
                element.add(rs.getString("ShowRoom"));
                //element.add(rs.getString("ShowDate"));
                element.add(rs.getString("ShowTime"));
                element.add(rs.getString("Seat"));
                this.list.add(element);
            }
            rs.close();
            stmt.close();
            dbConnect.close();

        } catch(Exception e){ 
        }
    }

    public void createTheatres()
    {
        int i = 0;
        while(i < this.list.size())
        {
            if(!theatres.contains(this.list.get(i).get(1)))
            {
                Theatre theatre = new Theatre(this.list.get(i).get(1), list);
                theatres.add(theatre);
            }
        }
        i++;
    }

    public static void main(String[] args)
    {
        /*if(args.length != 0)
            System.out.println("Invalid number of arguments");*/
        return;
    }
}

