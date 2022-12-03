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

public class AccountAccess extends GUI implements ActionListener
{    
    private JLabel instructions;
    private JLabel nameLabel;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JLabel addressLabel;
    private JLabel emailLabel;
    private JLabel cardNumberLabel;
    private JLabel cardNameLabel;
    private JLabel cardAddressLabel;
    
    private JLabel name;
    private JLabel username;
    private JLabel password;
    private JLabel address;
    private JLabel email;
    private JLabel cardNumber;
    private JLabel cardName;
    private JLabel cardAddress;
    
    JButton exit = new JButton("Exit");
    JButton main = new JButton("Main Menu");
    
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
    
    public AccountAccess()
    {
        gui = new GUI("Account");
    }
    
    public void setupAccountAccess(){
        
        instructions = new JLabel("Please finalize the ticket");
        
        nameLabel = new JLabel("Name: ");
        usernameLabel = new JLabel("Username: ");
        passwordLabel = new JLabel("Password: ");
        addressLabel = new JLabel("Address: ");
        emailLabel = new JLabel("Email Address: ");
        cardNumberLabel = new JLabel("Credit Card Number: ");
        cardNameLabel = new JLabel("Name on the Credit Card: ");
        cardAddressLabel = new JLabel("Billing Address: ");
        
        name = new JLabel();
        username = new JLabel();
        password = new JLabel();
        address = new JLabel();
        email = new JLabel();
        cardNumber = new JLabel();
        cardName = new JLabel();
        cardAddress = new JLabel();
        
        main.addActionListener(this);
        exit.addActionListener(this);
        
        headerPanel.setLayout(new FlowLayout());
        panel.setLayout(new FlowLayout());
        endPanel.setLayout(new FlowLayout());
        
        headerPanel.add(instructions);
        
        panel.add(nameLabel);
        panel.add(name);
        panel.add(usernameLabel);
        panel.add(username);
        panel.add(addressLabel);
        panel.add(address);
        panel.add(emailLabel);
        panel.add(email);
        panel.add(cardNumberLabel);
        panel.add(cardNumber);
        panel.add(cardNameLabel);
        panel.add(cardName);
        panel.add(cardAddressLabel);
        panel.add(cardAddress);
        
        endPanel.add(main);
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
        
        if(event.getSource() == main)
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