import javax.swing.JFrame;


public class mainClass {
	
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setSize(640, 480);
		window.setTitle("This is a frame of J, otherwise known as a JFrame");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		drawingComponent DC = new drawingComponent();
		window.add(DC);
	}
	
}
