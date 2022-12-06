import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.FlowLayout;

import java.sql.*;
import java.util.*;

public class PaymentGUI extends GUI implements ActionListener
{    
    private JLabel instructions;
    private JLabel nameLabel;
    private JLabel addressLabel;
    private JLabel cardLabel;
    
    private JTextField nameInput;
    private JTextField addressInput;
    private JTextField cardInput;
    
    JButton exit = new JButton("Exit");
    JButton purchase = new JButton("Purchase");
    
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
    
    public PaymentGUI()
    {
        gui = new GUI("Payment");
    }
    
    public void setupPayment(){
        
        instructions = new JLabel("Please finalize the ticket");
        nameLabel = new JLabel("Name on the card");
        addressLabel = new JLabel("Billing Adress");
        cardLabel = new JLabel("Card Number");
        
        purchase.addActionListener(this);
        exit.addActionListener(this);
        
        headerPanel.setLayout(new FlowLayout());
        panel.setLayout(new FlowLayout());
        endPanel.setLayout(new FlowLayout());
        
        headerPanel.add(instructions);
        
        panel.add(nameLabel);
        panel.add(nameInput);
        panel.add(addressLabel);
        panel.add(addressLabel);
        panel.add(cardLabel);
        panel.add(cardInput);
        
        endPanel.add(purchase);
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
        
        if(event.getSource() == purchase)
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