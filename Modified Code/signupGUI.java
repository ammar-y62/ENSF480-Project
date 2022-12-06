import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.FlowLayout;

import java.sql.*;
import java.util.*;

public class signupGUI extends GUI implements ActionListener{

    private JLabel instructions;
    private JLabel usernameLabel;
    private JLabel nameLabel;
    private JLabel addressLabel;
    private JLabel cardLabel;
    private JLabel passwordLabel;
    private JLabel emailLabel;
    
    private JTextField usernameInput;
    private JTextField passwordInput;
    private JTextField nameInput;
    private JTextField addressInput;
    private JTextField cardInput;
    private JTextField emailInput;
    
    JButton exit = new JButton("Exit");
    JButton signup = new JButton("Sign Up");
    
    JPanel headerPanel = new JPanel();
    JPanel signupPanel = new JPanel();
    JPanel guestPanel = new JPanel();

    GUI gui;
    User user;
    RegisteredUser ruser;
    
    Connection dbConnect;
    Statement stmt;
    ResultSet rs;
    
    public signupGUI()
    {
        gui = new GUI("Login");
        setupGUI();
        setSize(325,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        gui.setVisible(true);
    }

    public void setupGUI()
    {
        instructions = new JLabel("Please enter information for signup");
        usernameLabel = new JLabel("Username: ");
        passwordLabel = new JLabel("Password: ");
        nameLabel = new JLabel("Name: ");
        addressLabel = new JLabel("Address: ");
        cardLabel = new JLabel("Card Number: ");
        emailLabel = new JLabel("Email Address: ");
        
        usernameInput = new JTextField(30);
        passwordInput = new JTextField(30);
        nameInput = new JTextField(30);
        addressInput = new JTextField(30);
        cardInput = new JTextField(30);
        emailInput = new JTextField(30);
        
        signup.addActionListener(this);
        exit.addActionListener(this);
        
        headerPanel.setLayout(new FlowLayout());
        
        signupPanel.setLayout(new FlowLayout());
        
        guestPanel.setLayout(new FlowLayout());
        
        headerPanel.add(instructions);
        
        signupPanel.add(usernameLabel);
        signupPanel.add(usernameInput);
        signupPanel.add(passwordLabel);
        signupPanel.add(passwordInput);
        signupPanel.add(nameLabel);
        signupPanel.add(nameInput);
        signupPanel.add(addressLabel);
        signupPanel.add(addressInput);
        signupPanel.add(cardLabel);
        signupPanel.add(cardInput);
        signupPanel.add(emailLabel);
        signupPanel.add(emailInput);

        guestPanel.add(signup);
        guestPanel.add(exit);
        
        gui.add(headerPanel, BorderLayout.NORTH);
        gui.add(signupPanel, BorderLayout.CENTER);
        gui.add(guestPanel, BorderLayout.PAGE_END);
    }

    @Override
    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource() == exit)
        {
            System.exit(0);
        }
        
        if(event.getSource() == signup)
        {
            dbConnect("jdbc:mysql://localhost/TICKETING_SYSTEM", "root", "root");
        }
    }

    public void dbConnect(String dburl, String username, String password){
        try {
            dbConnect = DriverManager.getConnection(dburl, username, password);
            stmt=dbConnect.createStatement();

            stmt.executeUpdate("insert into ACCOUNTS(username,password,name,address,cardnumber, email) VALUES('"+usernameInput.getText()+"','"+passwordInput.getText()+"',"
            + "'"+nameInput.getText()+"','"+addressInput.getText()+"','"+cardInput.getText()+"','"+emailInput.getText()+"');");
            stmt.close();
            dbConnect.close();

        } catch(Exception e){ JOptionPane.showMessageDialog(null," Error in connectivity");
        }
    }
}
