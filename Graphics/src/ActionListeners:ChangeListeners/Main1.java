/**
 * @author Daniel Hill
 */

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
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

/**This is the public class which extends the JPanel
 * The class has variables which are private serialVersionUID,
 * JPanel p, JButton b1, JTextField field, JTextField field2
*/

public class Main1 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel p;
	private JButton b1;
	private JTextField field;
	private JTextField field2;

/**
 * This is the constructor in which the gui method is initialized
 */

	public Main1(){
		gui();
	}

	/**
	 * This is the method gui within this method the grid layout is set along with adding the variables which are components added to the JFrame.
	 * The action listener is added here to the button therefore on click the action listener will be called.
	 */

	public void gui(){


		GridLayout g1 = new GridLayout(3,1);
		b1 = new JButton("Download");
		field = new JTextField(10);
		field2 = new JTextField(10);

		add(field);
		add(field2);
		add(b1);

		//thehandler handler = new thehandler();
		//b1.addActionListener(handler);
		setLayout(g1);


	}


/**
 * This is the main method in which the JFrame and Class are initialised along with setting the default frame values to add the compenents, set to visible, set size and
 * set default to close this is done to close the window upon exit.
 * @param args
 */

	public static void main(String[] args ){
		Main1 gui = new Main1();
		JFrame f = new JFrame("Read HTML file");
		f.add(gui);
		f.setVisible(true);
		f.setSize(600, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
