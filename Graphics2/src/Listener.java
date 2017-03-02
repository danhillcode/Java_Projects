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

public class Listener implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GuiOuter gui;

	
	public Listener (GuiOuter gui) {
		this.gui = gui;

	}
 
public static void listener(){
		
	}

 	@Override
 	public void actionPerformed(ActionEvent event){

 		String s = gui.getField().getText();
 		String readString;
 		try {
 			URL url = new URL(s);
 			BufferedReader in =
 					new BufferedReader(new
 							InputStreamReader(url.openStream()));

 			System.out.print(s);
 			BufferedWriter out =
 					new BufferedWriter(new FileWriter(gui.getField2().getText()+".html"));

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
