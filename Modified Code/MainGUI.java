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
    JButton selectTheatre = new JButton("Select Theathre");
    JButton ticketList = new JButton("Ticket List");
    
    JPanel panel = new JPanel();
    JPanel endPanel = new JPanel();
        
    boolean registration = false;  
    
    GUI gui;
    Movie movies;
    Theatre theatres;
    User user;
    RegisteredUser ruser;
    
    Connection dbConnect;
    Statement stmt;
    ResultSet rs;
    
    public MainGUI(User user)
    {
        gui = new GUI("Main");
        this.user = user;
        setupMain();
        setSize(325,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        gui.setVisible(true);
    }

    public MainGUI(RegisteredUser ruser)
    {
        this.ruser = ruser;
        if(ruser.getRegistration())
        {
            registration = true;
        }
        gui = new GUI("Main");
        setupMain();
        setSize(325,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        gui.setVisible(true);
    }
    
    public void setupMain(){
        
        selectTheatre.addActionListener(this);
        cancelTicket.addActionListener(this);
        exit.addActionListener(this);
        ticketList.addActionListener(this);
        
        panel.setLayout(new FlowLayout());
        endPanel.setLayout(new FlowLayout());
        
        
        panel.add(selectTheatre);
        panel.add(cancelTicket);
        
        if(registration){
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
        
        if(event.getSource() == selectTheatre)
        {
            new TheatreGUI();
        }
        
        if(event.getSource() == accountInfo)
        {
            new AccountAccessGUI(this.ruser);
        }
        
        if(event.getSource() == cancelTicket)
        {
            if(registration)
            {
                new CancelTicketGUI(ruser);
            }
            else{
                new CancelTicketGUI();
            }
        }
    }
    
}