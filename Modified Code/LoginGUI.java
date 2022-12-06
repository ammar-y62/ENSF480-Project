import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.FlowLayout;

import java.sql.*;
import java.util.*;

public class LoginGUI extends GUI implements ActionListener
{
    private boolean registered = false;
    private JLabel instructions;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    
    private JTextField usernameInput;
    private JTextField passwordInput;
    
    JButton exit = new JButton("Exit");
    JButton login = new JButton("Login");
    JButton guest = new JButton("Guest");
    JButton signup = new JButton("Sign Up");
    
    JPanel headerPanel = new JPanel();
    JPanel loginPanel = new JPanel();
    JPanel guestPanel = new JPanel();
    
    GUI gui;
    User user;
    RegisteredUser ruser;
    
    Connection dbConnect;
    Statement stmt;
    ResultSet rs;
    String dbPassword;
    String dbName;
    String dbAddress;
    String dbCardNumber;
    String dbEmail;
    
    public LoginGUI()
    {
        gui = new GUI("Login");
    }
    
    public void setupLogin(){
        
        instructions = new JLabel("Please enter credentials for regeistered user or continue as a guest");
        usernameLabel = new JLabel("Username: ");
        passwordLabel = new JLabel("Password: ");
        
        usernameInput = new JTextField(30);
        passwordInput = new JTextField(30);
        
        login.addActionListener(this);
        guest.addActionListener(this);
        signup.addActionListener(this);
        exit.addActionListener(this);
        
        headerPanel.setLayout(new FlowLayout());
        
        loginPanel.setLayout(new FlowLayout());
        
        guestPanel.setLayout(new FlowLayout());
        
        headerPanel.add(instructions);
        
        loginPanel.add(usernameLabel);
        loginPanel.add(usernameInput);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordInput);
        loginPanel.add(login);
        
        guestPanel.add(guest);
        guestPanel.add(signup);
        guestPanel.add(exit);
        
        gui.add(headerPanel, BorderLayout.NORTH);
        gui.add(loginPanel, BorderLayout.CENTER);
        gui.add(guestPanel, BorderLayout.PAGE_END);    
    }
    
    @Override
    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource() == exit)
        {
            System.exit(0);
        }
        
        if(event.getSource() == login)
        {
            dbConnect("jdbc:mysql://localhost/Ticketing_System", "root", "root");
            if(dbPassword==""){
                JOptionPane.showMessageDialog(null, "Account does not exist");
            }
            else if(passwordInput.equals(dbPassword))
            {
                RegisteredUser ruser = new RegisteredUser(dbName, dbAddress, dbCardNumber, dbEmail);
            }
            else
            {
               JOptionPane.showMessageDialog(null, "Invalid Username or Password");
               usernameInput.setText("");
               passwordInput.setText("");
            }
        }
        
        if(event.getSource() == guest)
        {
            User user = new User(false);
        }
    }
    
    public void dbConnect(String dburl, String username, String password){
        try {
            dbConnect = DriverManager.getConnection(dburl, username, password);
            stmt=dbConnect.createStatement();

            rs=stmt.executeQuery("select * from accounts where username='"+ username +"';");
            while(rs.next()){
                dbPassword=rs.getString("password");
                dbName=rs.getString("Name");
                dbAddress=rs.getString("Address");
                dbCardNumber=rs.getString("Card");
                dbEmail=rs.getString("Email");
            }
            rs.close();
            stmt.close();
            dbConnect.close();

        } catch(Exception e){ JOptionPane.showMessageDialog(null," Error in connectivity");
        }
    }
    
}