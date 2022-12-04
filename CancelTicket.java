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

public class CancelTicketGUI extends GUI implements ActionListener
{    
    private JLabel instructions;
    private JLabel emailLabel;
    private JLabel ticketIDLabel;
    
    private JTextField emailInput;
    private JTextField ticketIDInput;
    
    JButton exit = new JButton("Exit");
    JButton cancelTicket = new JButton("Cancel the Ticket");
    
    JPanel headerPanel = new JPanel();
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
    
    public CancelTicketGUI()
    {
        gui = new GUI("Ticket Cancellation");
    }
    
    public void setupCancelTicket(){
        
        instructions = new JLabel("Please finalize the ticket");
        emailLabel = new JLabel("Email Address");
        ticketIDLabel = new JLabel("Ticket Number");
        
        cancelTicket.addActionListener(this);
        exit.addActionListener(this);
        
        headerPanel.setLayout(new FlowLayout());
        panel.setLayout(new FlowLayout());
        endPanel.setLayout(new FlowLayout());
        
        headerPanel.add(instructions);
        
        panel.add(emailLabel);
        panel.add(emailInput);
        panel.add(ticketIDLabel);
        panel.add(ticketIDInput);
        
        endPanel.add(cancelTicket);
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