import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.FlowLayout;

import java.sql.*;
import java.util.*;

public class TheatreGUI extends GUI implements ActionListener
{    
    private String[] columns = {"Theatre", "Movie"};
    private JLabel instructions;
    
    JButton exit = new JButton("Exit");
    JButton selectMovie = new JButton("Select Movie");
    
    JPanel headerPanel = new JPanel();
    JPanel panel = new JPanel();
    JPanel endPanel = new JPanel();
        
    JList list;
    
    GUI gui;
    Movie movies;
    Theatre theatres;
    User user;
    Vector<Theatre> theatresVector;
    RegisteredUser ruser;
    TicketingSystem system;
    
    Connection dbConnect;
    Statement stmt;
    ResultSet rs;
    
    public TheatreGUI()
    {
        gui = new GUI("Theatre & Movie");
        this.system = new TicketingSystem("jdbc:mysql://localhost/Ticketing_System", "root", "root");
        int i = 0;
        this.theatresVector = this.system.getTheatres();
        String [] theatreList = new String[this.theatresVector.size()];
        while(i < this.theatresVector.size())
        {
            theatreList[i] = this.theatresVector.get(i).getTheatre();
        }
    }
    
    public void setupTheatre(String[] data){
        
        instructions = new JLabel("Please select the theatre & movie");
        list = new JList(data);
        
        selectMovie.addActionListener(this);
        exit.addActionListener(this);
        
        headerPanel.setLayout(new FlowLayout());
        
        panel.setLayout(new FlowLayout());
        
        endPanel.setLayout(new FlowLayout());
        
        headerPanel.add(instructions);
        
        panel.add(list);
        
        endPanel.add(selectMovie);
        endPanel.add(exit);
        
        gui.add(headerPanel, BorderLayout.NORTH);
        gui.add(panel, BorderLayout.CENTER);
        gui.add(endPanel, BorderLayout.PAGE_END);    
    }
    
    @Override
    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource() == exit)
        {
            System.exit(0);
        }
        
        if(event.getSource() == selectMovie)
        {
            
        }
    }
    
    public void dbConnect(String dburl, String username, String password){
        try {
            dbConnect = DriverManager.getConnection(dburl, username, password);
            stmt=dbConnect.createStatement();

            rs=stmt.executeQuery("select * from accounts where username='"+ username +"';");
            while(rs.next()){
                
            }
            rs.close();
            stmt.close();
            dbConnect.close();

        } catch(Exception e){ JOptionPane.showMessageDialog(null," Error in connectivity");
        }
    }
    
}