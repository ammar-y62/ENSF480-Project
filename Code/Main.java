package edu.ucalgary.ensf480;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.FlowLayout;

import java.sql.*;
import java.util.*;

public class MainGUI extends GUI implements ActionListener
{    
    JButton exit = new JButton("Exit");
    JButton cancelTicket = new JButton("Cancel Ticket");
    JButton accountInfo = new JButton("Account Information");
    JButton selectTheatreMovie = new JButton("Select Theathre & Movie");
    JButton ticketList = new JButton("Ticket List");
    
    JPanel panel = new JPanel();
    JPanel endPanel = new JPanel();
        
        
    
    GUI gui;
    Movie movies;
    Theatre theatres;
    User user;
    RegisteredUser ruser;
    
    Connection dbConnect;
    Statement stmt;
    ResultSet rs;
    
    public MainGUI()
    {
        gui = new GUI("Main");
    }
    
    public void setupLogin(){
        
        selectTheatreMovie.addActionListener(this);
        cancelTicket.addActionListener(this);
        exit.addActionListener(this);
        ticketList.addActionListener(this);
        
        panel.setLayout(new FlowLayout());
        endPanel.setLayout(new FlowLayout());
        
        
        panel.add(selectTheatreMovie);
        panel.add(cancelTicket);
        
        if(registered){
            accountInfo.addActionListener(this);
            panel.add(accountInfo);
        }
        panel.add(ticketList);
        endPanel.add(exit);
        
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
        
        if(event.getSource() == selectTheatreMovie)
        {
            
        }
        
        if(event.getSource() == accountInfo)
        {
            
        }
        
        if(event.getSource() == cancelTicket)
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