import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class thehandler extends Main1 implements ActionListener{

	private Main1 gui;

	private JTextField field;
	private JTextField field2;

	public thehandler(Main1 gui) {
		this.gui = gui;
		this.field = field;
		this.field2 = field2;
	}


 	@Override
 	public void actionPerformed(ActionEvent event){

 		String s = field.getText();
 		String readString;
 		try {
 			URL url = new URL(s);
 			BufferedReader in =
 					new BufferedReader(new
 							InputStreamReader(url.openStream()));


 			BufferedWriter out =
 					new BufferedWriter(new FileWriter(field2.getText()+".html"));

 			while ((readString = in.readLine()) != null) {
 				out.write(readString);
 				//appends the string to the file

 			}
 			System.out.println("Done");
 			out.close();
 			in.close();

 		}
 		catch (IOException e) {
 			System.out.println("no access to URL: " + s);
 		}

 	}
 }
