// Fig. 12.9: TextFieldFrame.java
// JTextFields and JPasswordFields. 3 import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame
{
private final JTextField textField1; // text field with set size
private final JTextField textField2; // text field with text
private final JTextField textField3; // text field with text and size
private final JPasswordField passwordField; // password field with text

 // TextFieldFrame constructor adds JTextFields to JFrame
 public TextFieldFrame()
 {
 super("Testing JTextField and JPasswordField");
 setLayout(new FlowLayout());


// construct text field with 10 columns

textField1 = new JTextField(10);
   add(textField1); // add textField1 to JFrame 27


// construct text field with default text
  textField2 = new JTextField("Enter text here");
    add(textField2); // add textField2 to JFrame 31



// construct text field with default text and 21 columns
  textField3 = new JTextField("Uneditable text field", 21);
   textField3.setEditable(false); // disable editing

 add(textField3); // add textField3 to JFrame

/**
Fig. 12.9 | JTextFields and JPasswordFields. (Part 1 of 2.)
12.6 Text Fields and an Introduction to Event Handling with Nested Classes 487
36
37 // construct password field with default text 38
45
46
**/
}

 {
passwordField = new JPasswordField("Hidden text");
    add(passwordField); // add passwordField to JFrame


 // register event handlers 42


TextFieldHandler handler = new TextFieldHandler();
   textField1.addActionListener(handler);
  textField2.addActionListener(handler);
   textField3.addActionListener(handler);
   passwordField.addActionListener(handler);


 // private inner class for event handling
private class TextFieldHandler implements ActionListener
{
  // process text field events
 @Override


public void actionPerformed(ActionEvent event)
{
 String string = "";

 // user pressed Enter in JTextField textField1 59if( )

 if(event.getSource() == textField1)
 string = String.format("textField1: %s",
 event.getActionCommand());
/**
 else if (
event.getActionCommand()
event.getActionCommand()

74 else if (     ) 75 string = String.format("passwordField: %s",
);
  62
63 // user pressed Enter in JTextField textField2
64 else if (
event.getSource() == textField2
)
   65 string = String.format("textField2: %s",

event.getActionCommand()
66     ); 67
 68 // user pressed Enter in JTextField textField3
event.getSource() == textField3
)
   70 string = String.format("textField3: %s", 71 );


73 // user pressed Enter in JTextField passwordField
event.getSource() == passwordField
 76
event.getActionCommand()
);
  77
78 // display JTextField content
*/
JOptionPane.showMessageDialog(null, string);}

 }
 } // end private inner class TextFieldHandler 82 } // end class TextFieldFrame
