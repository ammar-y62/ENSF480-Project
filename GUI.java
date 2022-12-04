package edu.ucalgary.ensf480;
        
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.FlowLayout;
public class GUI extends JFrame
{
    public GUI(){
        super("Movie Ticketing");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public GUI(String name){
        super(name);
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        
    }
}