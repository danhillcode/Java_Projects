import javax.swing.*;
import java.awt.*;
class JPanelExample extends JFrame
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JPanel p1,p2;
Dimension d;

    public JPanelExample()
    {
        createAndShowGUI();
    }
    
    private void createAndShowGUI()
    {
        setTitle("JPanel Example in Java");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        // An empty panel with FlowLayout
        p1=new JPanel();
        
        // Panel with custom layout
        p2=new JPanel(new GridBagLayout());
        
        // Set some preferred size
        d=new Dimension(200,200);

        p1.setPreferredSize(d);
        p2.setPreferredSize(d);
        
        // Set some background
        p1.setBackground(Color.GRAY);
        p2.setBackground(Color.DARK_GRAY);

        // Set some border
        // Here a line border of 5 thickness, dark gray color and rounded
        // edges
        p1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,5,true));
        
        // Set some tooltip text
        p1.setToolTipText("Panel 1");
        p2.setToolTipText("Panel 2");
        
        // Add panels
        add(p1);
        add(p2);
        
        setSize(400,400);
        setVisible(true);
        
        // Pack the frame so that no/very little extra
        // space is visible
        pack();
        
        // Print get methods
        System.out.println("Preferred size of p1 is "+p1.getPreferredSize());
        System.out.println("Background for p2 is "+p2.getBackground());
        System.out.println("Border for p1 is "+p1.getBorder());
        System.out.println("Tooltip text for p2 is "+p2.getToolTipText());
        System.out.println("Is p1 opaque? "+p1.isOpaque());
        System.out.println("Is p2 visible? "+p2.isVisible());
        System.out.println("Insets of p1 "+p1.getInsets());
        
    }
    
    public static void main(String args[])
    {
        new JPanelExample();
    }
}

