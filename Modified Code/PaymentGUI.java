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
    private JLabel emailAddressLabel;
    private JLabel cardLabel;
    
    private JTextField nameInput;
    private JTextField emailAddressInput;
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
    Ticket ticket;
    
    Connection dbConnect;
    Statement stmt;
    ResultSet rs;
    
    public PaymentGUI(Ticket ticket)
    {
        gui = new GUI("Payment");
        this.ticket = ticket;
        setupPayment();
        setSize(325,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        gui.setVisible(true);
    }
    
    public void setupPayment(){
        
        instructions = new JLabel("Please finalize the ticket");
        nameLabel = new JLabel("Name on the card");
        emailAddressLabel = new JLabel("Email Adress");
        cardLabel = new JLabel("Card Number");
        
        purchase.addActionListener(this);
        exit.addActionListener(this);
        
        headerPanel.setLayout(new FlowLayout());
        panel.setLayout(new FlowLayout());
        endPanel.setLayout(new FlowLayout());
        
        headerPanel.add(instructions);
        
        panel.add(nameLabel);
        panel.add(nameInput);
        panel.add(emailAddressLabel);
        panel.add(emailAddressInput);
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
            if(cardInput.getText().length() == 16)
            {
                if(this.ticket.getRegistration())
                {
                    new Payment(this.ticket.getRegisteredUser(), this.ticket);
                }
                else{
                    new Payment(this.ticket.getUser(), this.ticket);
                }
                
            }
        }
    }
    
}