

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StarTrees extends JPanel{

	private static final long serialVersionUID = 1L;
	private int[] xTrees;
	private int[] yTrees;
	private int[] scaleTrees;
	private static final int[] xt = new int[] {2,8,14};
	private static final int[] yt = new int[] {12,0,12};
	private static final int[] xb = new int[] {7,9,9,7};
	private static final int[] yb = new int[] {12,12,16,16};
	private static final int[] xt1 = new int[xt.length];
	private static final int[] yt1 = new int[yt.length];
	private static final int[] xb1 = new int[xb.length];
	private static final int[] yb1 = new int[yb.length];

	public StarTrees(int[] xTrees, int[] yTrees, int[] scaleTrees) {
		this.xTrees = xTrees;
		this.yTrees = yTrees;
		this.scaleTrees = scaleTrees;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int a = 0; a < xTrees.length; a++) {
			for (int b = 0; b < xt.length; b++) {
				xt1[b] = ((xTrees[a] + xt[b]) * scaleTrees[a]);
				yt1[b] = ((yTrees[a] + yt[b]) * scaleTrees[a]);
			}
			Color t = new Color(13,84,17);
			g.setColor(t);
			g.fillPolygon(xt1,yt1,xt.length);
		}
		for (int a = 0; a < yTrees.length; a++) {
			for (int b = 0; b < xb.length; b++) {
				xb1[b] = ((xTrees[a] + xb[b]) * scaleTrees[a]);
				yb1[b] = ((yTrees[a] + yb[b]) * scaleTrees[a]);
			}
			Color b = new Color(102,51,0);
			g.setColor(b);
			g.fillPolygon(xb1,yb1,xb.length);
		}
	}

	public static void main(String[] args) {
		int[] xTrees = {0,25,50,45,10};
		int[] yTrees = {5,18,0,23,2};
		int[] scaleTrees = {1,2,4,8,16};
		StarTrees panel = new StarTrees(xTrees,yTrees,scaleTrees);
		JFrame frame = new JFrame();
		final int FRAME_WIDTH = 1600;
		final int FRAME_HEIGHT = 900;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
		frame.add(panel);
		frame.setVisible(true);
	}
}
