
import java.awt.BorderLayout;

import javax.swing.*;

public class TreeExample extends JFrame {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JTree levelNodeTree;
private Object sp;

public TreeExample()
	{
		LevelNode ln = new LevelNode();
		ln.add(new LevelNode());
		ln.add(new LevelNode());

		LevelNode ln0 = ((LevelNode)ln.getChildAt(0));
		ln0.add(new LevelNode());
		ln0.add(new LevelNode());
		ln0.add(new LevelNode());

		LevelNode ln1 = ((LevelNode)ln.getChildAt(1));
		ln1.add(new LevelNode());
		ln1.add(new LevelNode());

		levelNodeTree = new JTree(ln);
		
		JScrollPane sp = new JScrollPane(levelNodeTree);

                add(sp,BorderLayout.CENTER);

		setSize(150,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		TreeExample te = new TreeExample();
	}
}
