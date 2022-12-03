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

public class Show extends GUI implements ActionListener
{    
    private String[] columns = {"Theatre", "Movie"};
    private JLabel instructions;
    
    JButton exit = new JButton("Exit");
    JButton pay = new JButton("Pay");
    
    JPanel headerPanel = new JPanel();
    JPanel panel = new JPanel();
    JPanel endPanel = new JPanel();
        
    JTable table;
    
    GUI gui;
    Movie movies;
    Theatre theatres;
    User user;
    RegisteredUser ruser;
    
    Connection dbConnect;
    Statement stmt;
    ResultSet rs;
    
    public Show()
    {
        gui = new GUI("Show");
    }
    
    public void setupShow(Object[][] data){
        
        instructions = new JLabel("Please select the show");
        table = new JTable(data, columns);
        
        pay.addActionListener(this);
        exit.addActionListener(this);
        
        headerPanel.setLayout(new FlowLayout());
        panel.setLayout(new FlowLayout());
        endPanel.setLayout(new FlowLayout());
        
        headerPanel.add(instructions);
        
        panel.add(theatres);
        
        endPanel.add(pay);
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
        
        if(event.getSource() == pay)
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