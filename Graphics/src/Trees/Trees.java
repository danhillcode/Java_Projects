
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFrame;



public class Trees extends JPanel{


	private JFrame f;
	private JPanel p;
	private JButton b1;
	private JTextField field;
	private JTextField field2;

	private Polygon poly;
	private int[] xTrees;
	private int[] yTrees;
	private int scaleTrees;
	private final int WIDTH = 800;
	private final int HEIGHT = 600;


	public Trees(int[] xTrees,int[] yTrees,int scaleTrees){

		this.xTrees = xTrees;
		this.yTrees = flipYtree(yTrees);
		this.scaleTrees = scaleTrees;

	}

	//takes in co-ordinates of y
	public int[] flipYtree(int[] yTree){
		int [] yTree1 = new int[yTree.length];
		for (int i = 0; i < yTree.length; i++ ){
			yTree1[i] = this.HEIGHT - yTree[i];
		}
		return yTree1;
	}


	//This calculates the trunk co-ordinates for x1 value
	//IS THE SCALE TRESS CORRECT HERE?????
	private static int[] trunkCoordinatesX(int[] xTrees, int scaleTrees) {
		int[] xPoint = new int[4];

		xPoint[0] = xTrees[0] + 5 * scaleTrees;
		xPoint[1] = xTrees[0] + 5 * scaleTrees;
		xPoint[2] = xTrees[0] + 7 * scaleTrees;
		xPoint[3] = xTrees[0] + 7 * scaleTrees;
		//need to create four points for the x values of the trunk but these will be two pairs
		//with just numbers so two are the same

		return xPoint;
	}



	private static int[] trunkCoordinatesY(int[] yTrees, int scaleTrees) {
		int[] yPoint = new int[4];

		//need to create four points for the y values of the trunk but these will be two pairs
				//with just numbers so two are the same
		yPoint[0] = yTrees[0] * scaleTrees;
		yPoint[1] = yTrees[0] - 4 * scaleTrees;
		yPoint[2] = yTrees[0] - 4 * scaleTrees;
		yPoint[3] = yTrees[0] * scaleTrees;


		return yPoint;
	}


	private static int[] treeCoordinatesX(int[] xTrees, int scaleTrees) {
		int[] xTree = new int[3];

		xTree[0] = xTrees[0];
		xTree[1] = xTrees[0] + 6 * scaleTrees;
		xTree[2] = xTrees[0] + 12 * scaleTrees;


		return xTree;
	}



	private static int[] treeCoordinatesY(int[] yTrees, int scaleTrees) {
		int[] yTree = new int[3];

		yTree[0] = yTrees[0] - 4 * scaleTrees;
		yTree[1] = yTrees[0] - 16 * scaleTrees;
		yTree[2] = yTrees[0] - 4 * scaleTrees;


		return yTree;
	}


	//scale of ten
	 public final void paint(Graphics g) {


		 	//initial arrays calling methods to generate trunk x and y
		 	int npoints = 4;


		    //cretae two array lists to store values for the five trees X and Y values
		    ArrayList<int []> fiveTreeTrunkX = new ArrayList<int[]>();
		    ArrayList<int []> fiveTreeTrunkY = new ArrayList<int[]>();

		    ArrayList<int []> fiveTreeBodyX = new ArrayList<int[]>();
		    ArrayList<int []> fiveTreeBodyY = new ArrayList<int[]>();
		  //use a for loop to iterate over the two array lists and create multiple trunksX and trunkY

		    int counter = 0;



		    for (int i = 0; i < 5; i++){

		 		fiveTreeTrunkX.add(trunkCoordinatesX(this.xTrees, this.scaleTrees * counter));
		 		fiveTreeTrunkY.add(trunkCoordinatesY(this.yTrees, this.scaleTrees * counter));

		 		fiveTreeBodyX.add(treeCoordinatesX(this.xTrees, this.scaleTrees * counter));
		 		fiveTreeBodyY.add(treeCoordinatesY(this.yTrees, this.scaleTrees * counter));

		 		counter += 1;
		 	}


		    //use a for loop to iterate over the two array lists and print multiple trunks
		 	for (int i = 0; i < 5; i++){

		 		//System.out.println(Arrays.toString(fiveTreeBodyX.get(i)));

		 		g.setColor(new Color(101, 67, 33));
			    g.fillPolygon(fiveTreeTrunkX.get(i),fiveTreeTrunkY.get(i),npoints);

			    g.setColor(Color.GREEN);
				g.fillPolygon(fiveTreeBodyX.get(i),fiveTreeBodyY.get(i),3);



		 	}



		}

		public int getWIDTH() {
			return WIDTH;
		}

		public int getHEIGHT() {
			return HEIGHT;
		}




		  public static void main(String[] args) {
		    JFrame frame = new JFrame();

		    int[] xTrees1 = {10,10,10,14,18};
			int[] yTrees1 = {0,15,20,24,28};
			int scaleTrees1 = 10;


		    Trees t = new Trees(xTrees1, yTrees1, scaleTrees1);

		    frame.add(t);


		  //  frame.getContentPane().add(new Trees(xpoints, ypoints, npoints));

		    frame.setSize(t.getWIDTH(),t.getHEIGHT());
		    frame.setVisible(true);
		    frame.setLocationRelativeTo(null);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  }


		}


//questions
//how do you get the co-ordinates into the paint method with parameters
//how do you calculate the scale in the methods
