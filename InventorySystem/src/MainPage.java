/**
 * @author Daniel Hill
//jobs:Add a button then use the lambda to call a method in a different class
 */
//imports
import java.awt.Button;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URL;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Mainpage with a extending JPanel
//variables for the compenents used ref in folder
public class MainPage extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel p;
	private JButton b1;
	private JTextField field;
	private JTextField field2;
	private int med = 2;
	Dimension d;

//create a constructor with a call to my GUI method 
	public MainPage(){
        createAndShowGUI();
        
    }
	
//A method containing JFrame and other 
//need to add deafult on close method	
	private void createAndShowGUI(){
			
		   JFrame f = new JFrame("Medical Inventory System");
		   f.setSize(600,500);	
		   JLabel L = new JLabel("Medical Inventory System"); 
		  L.setHorizontalAlignment(JLabel.CENTER);
		   f.getContentPane().add( L );
		   f.setVisible(true);
		JButton b1 = new JButton("Medication Checker");
		//Colour ??
		b1.setBackground(Color.BLACK);
	    b1.setForeground(Color.BLUE);
		
		b1.setSize(200,100);
		b1.setHorizontalAlignment(JButton.CENTER);
		b1.addActionListener(evt -> MainMeth.popName1());
		f.add(b1);
		
		JButton button = new JButton("Click Me!");

		  // f.setBackground(Color.BLUE);
	
		b1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent evt) {
		        System.out.println("Handled by anonymous class listener");
		        
		        if (med >= 0){
		        	JOptionPane.showMessageDialog(f,
			        	    "The medication you selected is " + med,
			        	    "Stock needed",
			        	    JOptionPane.ERROR_MESSAGE);
		        med -= 1;
		        }else{
		        	med = 0;
		        	JOptionPane.showMessageDialog(f,
		        	    "The medication you selected is out of stock. " + med,
		        	    "Stock needed",
		        	    JOptionPane.ERROR_MESSAGE);
		        	
		        }
		    }
		});
		
	}

	
//main method which creates a new Main page instance
public static void main(String[] args){
	new MainPage();                  
}


}


