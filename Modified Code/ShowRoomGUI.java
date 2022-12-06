import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.FlowLayout;

import java.sql.*;
import java.util.*;

public class ShowRoomGUI extends GUI implements ActionListener
{    
    private JLabel instructions;
    
    JButton exit = new JButton("Exit");
    JButton selectShowTime = new JButton("Select Show Time");
    
    JPanel headerPanel = new JPanel();
    JPanel panel = new JPanel();
    JPanel endPanel = new JPanel();
        
    JList list;
    
    GUI gui;
    Movie movie;
    Theatre theatre;
    User user;
    RegisteredUser ruser;
    Vector<ShowRooms> showRoomVector;
    Ticket ticket;
    
    Connection dbConnect;
    Statement stmt;
    ResultSet rs;
    
    public ShowRoomGUI(Theatre theatre, Movie movie, Ticket ticket)
    {
        gui = new GUI("Show Room");
        this.theatre = theatre;
        this.movie = movie;
        this.ticket = ticket;
        int i = 0;
        this.showRoomVector = this.movie.getShowroom();
        String [] showRoomList = new String[this.showRoomVector.size()];
        while(i < this.showRoomVector.size())
        {
            showRoomList[i] = Integer.toString(this.showRoomVector.get(i).getRoom());
            i++;
        }
        setupShowRoom(showRoomList);
        setSize(325,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        gui.setVisible(true);
    }
    
    public void setupShowRoom(String[] data){
        
        instructions = new JLabel("Please select the show");
        list = new JList(data);
        
        selectShowTime.addActionListener(this);
        exit.addActionListener(this);
        
        headerPanel.setLayout(new FlowLayout());
        panel.setLayout(new FlowLayout());
        endPanel.setLayout(new FlowLayout());
        
        headerPanel.add(instructions);
        
        panel.add(list);
        
        endPanel.add(selectShowTime);
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
        
        if(event.getSource() == selectShowTime)
        {
            int i = list.getSelectedIndex();
            this.ticket.setShowRoom(showRoomVector.get(i));
            new ShowTimesGUI(showRoomVector.get(i), this.ticket);
        }
    }
    
}