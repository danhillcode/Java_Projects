
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.tree.TreeNode;

public class LevelNode implements TreeNode {

	int index = 0;
	int level = 0;
	LevelNode parent = null;
	Vector<LevelNode> children = new Vector<LevelNode>();

	public void setIndex(int index)
		{
			this.index = index;
		}

        public void setLevel(int level)
		{
			this.level = level;
		}

	public void setParent(LevelNode ln)
		{
			parent = ln;
		}

	public void add(LevelNode ln)
		{
			ln.setLevel(level+1);
			ln.setParent(this);
			children.add(ln);
			ln.setIndex(children.indexOf(ln));
		}

	public TreeNode getChildAt(int index) {
		return (TreeNode)children.get(index);
	}

	public int getChildCount() {
		return children.size();
	}

	public TreeNode getParent() {
		return parent;
	}

	public int getIndex(TreeNode tn) {
		return children.indexOf(tn);
	}

	public boolean getAllowsChildren() {
		return true;
	}

	public boolean isLeaf() {
		return false;
	}

	public Enumeration children() {
		return children.elements();
	}

	public String toString()
		{
			return "" + level + ":" + index;
		}

}