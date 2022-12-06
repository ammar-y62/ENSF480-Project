import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.FlowLayout;
import javax.swing.*;

import java.sql.*;
import java.util.*;

public class SeatsGUI extends GUI implements ActionListener
{    
    private JLabel instructions;
    private String[] columns = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    JButton exit = new JButton("Exit");
    JButton selectSeat = new JButton("Select Seat");
    
    int row = 10, column = 10;
    JPanel headerPanel = new JPanel();
    JPanel panel;
    JPanel endPanel = new JPanel();

    JLabel seatNumberInstructions;
    JTextField seatID;
    
    JTable table;
    
    GUI gui;
    Movie movies;
    Theatre theatre;
    User user;
    ShowRooms showroom;
    Seats seat;
    Vector<Seats>seatVector;
    RegisteredUser ruser;
    TicketingSystem system;
    String ticketID;
    
    Connection dbConnect;
    Statement stmt;
    ResultSet rs;
    
    public SeatsGUI(Seats seat)
    {
        gui = new GUI("Seats");
        this.seat = seat;
        this.seatVector = this.showroom.getSeats();
        int i = 0;
        int j = 0;
        String [][] seatList = new String[this.seatVector.size()][2];
        while(i < this.seatVector.size())
        {
            if(j == 10)
            {
                j = 0;
                i++;
            }
            seatList[i][j] = Integer.toString(this.seatVector.get(i).getSeatAvailability());
            j++;
        }
        setupSeatsMap(seatList);
        setSize(325,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        gui.setVisible(true);
    }
    
    public void setupSeatsMap(String[][] data){
        instructions = new JLabel("Please select the theatre & movie");
        table = new JTable(data, columns);
        seatNumberInstructions = new JLabel("Please enter the seat ID");
        
        selectSeat.addActionListener(this);
        exit.addActionListener(this);
        
        headerPanel.setLayout(new FlowLayout());
        
        panel.setLayout(new FlowLayout());
        
        endPanel.setLayout(new FlowLayout());
        
        headerPanel.add(instructions);
        
        panel.add(table);
        panel.add(seatNumberInstructions);
        panel.add(seatID);
        
        endPanel.add(selectSeat);
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
        
        if(event.getSource() == selectSeat)
        {
            if(this.seat.getSeatAvailability() == 1) {
                this.ticketID = seatID.getText();
                this.seat.changeSeatAvailability(0);
            } else {
                // how do we do nothing?
            }
        }
    }
    
}