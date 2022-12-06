import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.FlowLayout;

import java.sql.*;
import java.util.*;

public class ShowTimesGUI extends GUI implements ActionListener
{    
    private JLabel instructions;
    private String[] columns = {"Date", "Time"};
    JButton exit = new JButton("Exit");
    JButton selectShowRoom = new JButton("Select Show Time");
    
    JPanel headerPanel = new JPanel();
    JPanel panel = new JPanel();
    JPanel endPanel = new JPanel();
        
    JTable table;
    
    GUI gui;
    Movie movies;
    Theatre theatre;
    User user;
    ShowRooms showroom;
    Vector<ShowTimes> showTimeVector;
    RegisteredUser ruser;
    TicketingSystem system;
    
    Connection dbConnect;
    Statement stmt;
    ResultSet rs;
    
    public ShowTimesGUI(ShowRooms showroom)
    {
        gui = new GUI("Show Times");
        this.showroom = showroom;
        this.showTimeVector = this.showroom.getShowTimes();
        int i = 0;
        String [][] showTimeList = new String[this.showTimeVector.size()][2];
        while(i < this.showTimeVector.size())
        {
            showTimeList[i][0] = this.showTimeVector.get(i).getDate();
            showTimeList[i][1] = this.showTimeVector.get(i).getTime();
        }
    }
    
    public void setupTheatre(String[][] data){
        
        instructions = new JLabel("Please select the theatre & movie");
        table = new JTable(data, columns);
        
        selectShowRoom.addActionListener(this);
        exit.addActionListener(this);
        
        headerPanel.setLayout(new FlowLayout());
        
        panel.setLayout(new FlowLayout());
        
        endPanel.setLayout(new FlowLayout());
        
        headerPanel.add(instructions);
        
        panel.add(table);
        
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