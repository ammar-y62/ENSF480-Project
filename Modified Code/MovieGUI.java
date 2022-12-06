import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.FlowLayout;

import java.sql.*;
import java.util.*;

public class MovieGUI extends GUI implements ActionListener
{    
    private JLabel instructions;
    
    JButton exit = new JButton("Exit");
    JButton selectShowRoom = new JButton("Select Show Room");
    
    JPanel headerPanel = new JPanel();
    JPanel panel = new JPanel();
    JPanel endPanel = new JPanel();
        
    JList list;
    
    GUI gui;
    Movie movies;
    Theatre theatre;
    User user;
    Vector<Movie> movieVector;
    RegisteredUser ruser;
    TicketingSystem system;
    Ticket ticket;
    
    Connection dbConnect;
    Statement stmt;
    ResultSet rs;
    
    public MovieGUI(Theatre theatre, Ticket ticket)
    {
        gui = new GUI("Theatre & Movie");
        this.theatre = theatre;
        this.ticket = ticket;
        this.system = new TicketingSystem("jdbc:mysql://localhost/Ticketing_System", "root", "root");
        int i = 0;
        this.movieVector = this.theatre.getMovies();
        String [] movieList = new String[this.movieVector.size()];
        while(i < this.movieVector.size())
        {
            movieList[i] = this.movieVector.get(i).getMovie();
            i++;
        }
        setupMovie(movieList);
        setSize(325,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        gui.setVisible(true);
    }
    
    public void setupMovie(String[] data){
        
        instructions = new JLabel("Please select the theatre & movie");
        list = new JList(data);
        
        selectShowRoom.addActionListener(this);
        exit.addActionListener(this);
        
        headerPanel.setLayout(new FlowLayout());
        
        panel.setLayout(new FlowLayout());
        
        endPanel.setLayout(new FlowLayout());
        
        headerPanel.add(instructions);
        
        panel.add(list);
        
        endPanel.add(selectShowRoom);
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
        
        if(event.getSource() == selectShowRoom)
        {
            int i = list.getSelectedIndex();
            this.movies = movieVector.get(i);
            this.ticket.setMovie(this.movies);
            new ShowRoomGUI(this.theatre, this.movies, this.ticket);
        }
    
    }
}