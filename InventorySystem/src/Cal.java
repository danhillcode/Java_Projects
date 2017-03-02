
	import java.awt.Color;
	import java.awt.Container;
	import java.awt.Font;
	import java.awt.GridBagConstraints;
	import java.awt.GridBagLayout;

	import javax.script.ScriptException;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.JTextArea;

	public class Cal extends JPanel{

		private static final long serialVersionUID = 1L;
		protected static JTextArea mainDisplay;
		protected static JTextArea subDisplay;
		protected static JButton zero;
		protected static JButton one;
		protected static JButton two;
		protected static JButton three;
		protected static JButton four;
		protected static JButton five;
		protected static JButton six;
		protected static JButton seven;
		protected static JButton eight;
		protected static JButton nine;
		protected static JButton decimal;
		protected static JButton delete;
		protected static JButton percentage;
		protected static JButton sqr;
		protected static JButton sqrRoot;
		protected static JButton addition;
		protected static JButton subtraction;
		protected static JButton multiply;
		protected static JButton divide;
		protected static JButton equals;
		
		private static void setUp(Container pane) {

			pane.setLayout(new GridBagLayout());
			GridBagConstraints g = new GridBagConstraints();

			subDisplay = new JTextArea();
			g.fill = GridBagConstraints.BOTH;
			g.ipady = 10;
			g.ipadx = 20;
			g.gridwidth = 4;
			g.weightx = 1.0;
			g.weighty = 1.0;
			g.gridx = 0;
			g.gridy = 0;
			pane.add(subDisplay,g);
			subDisplay.setBackground(Color.BLACK);
			subDisplay.setForeground(Color.DARK_GRAY);
			subDisplay.setFont(new Font("",Font.PLAIN,15));
			subDisplay.setEditable(false);
			subDisplay.setEnabled(false);

			mainDisplay = new JTextArea();
			g.fill = GridBagConstraints.BOTH;
			g.ipady = 50;
			g.ipadx = 20;
			g.gridwidth = 4;
			g.weightx = 1.0;
			g.weighty = 1.0;
			g.gridx = 0;
			g.gridy = 1;
			pane.add(mainDisplay,g);
			mainDisplay.setBackground(Color.BLACK);
			mainDisplay.setForeground(Color.WHITE);
			mainDisplay.setFont(new Font("",Font.TRUETYPE_FONT,30));
			mainDisplay.setEditable(false);
			mainDisplay.setEnabled(false);

			percentage = new JButton("%");
			g.fill = GridBagConstraints.BOTH;
			g.ipady = 30;
			g.gridwidth = 1;
			g.weightx = 1.0;
			g.weighty = 1.0;
			g.gridx = 0;
			g.gridy = 2;
			pane.add(percentage,g);
			percentage.setBackground(Color.DARK_GRAY);
			percentage.setForeground(Color.WHITE);
			percentage.setFont(new Font("",Font.TRUETYPE_FONT,15));
			percentage.addActionListener(evt -> CalMeth.percentage());

			sqrRoot = new JButton("\u221A");
			g.fill = GridBagConstraints.BOTH;
			g.ipady = 30;
			g.gridwidth = 1;
			g.weightx = 1.0;
			g.weighty = 1.0;
			g.gridx = 1;
			g.gridy = 2;
			pane.add(sqrRoot,g);
			sqrRoot.setBackground(Color.DARK_GRAY);
			sqrRoot.setForeground(Color.WHITE);
			sqrRoot.setFont(new Font("",Font.TRUETYPE_FONT,15));
			sqrRoot.addActionListener(evt -> CalMeth.sqrRoot());

			sqr = new JButton("x\u00B2");
			g.fill = GridBagConstraints.BOTH;
			g.ipady = 30;
			g.gridwidth = 1;
			g.weightx = 1.0;
			g.weighty = 1.0;
			g.gridx = 2;
			g.gridy = 2;
			pane.add(sqr,g);
			sqr.setBackground(Color.DARK_GRAY);
			sqr.setForeground(Color.WHITE);
			sqr.setFont(new Font("",Font.TRUETYPE_FONT,15));
			sqr.addActionListener(evt -> CalMeth.sqr());

			delete = new JButton("DEL");
			g.fill = GridBagConstraints.BOTH;
			g.ipady = 30;
			g.gridwidth = 1;
			g.weightx = 1.0;
			g.weighty = 1.0;
			g.gridx = 3;
			g.gridy = 2;
			pane.add(delete,g);
			delete.setBackground(Color.DARK_GRAY);
			delete.setForeground(Color.WHITE);
			delete.setFont(new Font("",Font.TRUETYPE_FONT,15));
			delete.addActionListener(evt -> CalMeth.delete());

			seven = new JButton("7");
			g.fill = GridBagConstraints.BOTH;
			g.ipady = 30;
			g.gridwidth = 1;
			g.weightx = 1.0;
			g.weighty = 1.0;
			g.gridx = 0;
			g.gridy = 3;
			pane.add(seven,g);
			seven.setBackground(Color.GRAY);
			seven.setForeground(Color.WHITE);
			seven.setFont(new Font("",Font.BOLD,15));
			seven.addActionListener(evt -> CalMeth.seven());

			eight = new JButton("8");
			g.fill = GridBagConstraints.BOTH;
			g.ipady = 30;
			g.gridwidth = 1;
			g.weightx = 1.0;
			g.weighty = 1.0;
			g.gridx = 1;
			g.gridy = 3;
			pane.add(eight,g);
			eight.setBackground(Color.GRAY);
			eight.setForeground(Color.WHITE);
			eight.setFont(new Font("",Font.BOLD,15));
			eight.addActionListener(evt -> CalMeth.eight());

			nine = new JButton("9");
			g.fill = GridBagConstraints.BOTH;
			g.ipady = 30;
			g.gridwidth = 1;
			g.weightx = 1.0;
			g.weighty = 1.0;
			g.gridx = 2;
			g.gridy = 3;
			pane.add(nine,g);
			nine.setBackground(Color.GRAY);
			nine.setForeground(Color.WHITE);
			nine.setFont(new Font("",Font.BOLD,15));
			nine.addActionListener(evt -> CalMeth.nine());

			divide = new JButton("\u00F7");
			g.fill = GridBagConstraints.BOTH;
			g.ipady = 30;
			g.gridwidth = 1;
			g.weightx = 1.0;
			g.weighty = 1.0;
			g.gridx = 3;
			g.gridy = 3;
			pane.add(divide,g);
			divide.setBackground(Color.DARK_GRAY);
			divide.setForeground(Color.WHITE);
			divide.setFont(new Font("",Font.TRUETYPE_FONT,15));
			divide.addActionListener(evt -> CalMeth.divide());

			four = new JButton("4");
			g.fill = GridBagConstraints.BOTH;
			g.ipady = 30;
			g.gridwidth = 1;
			g.weightx = 1.0;
			g.weighty = 1.0;
			g.gridx = 0;
			g.gridy = 4;
			pane.add(four,g);
			four.setBackground(Color.GRAY);
			four.setForeground(Color.WHITE);
			four.setFont(new Font("",Font.BOLD,15));
			four.addActionListener(evt -> CalMeth.four());

			five = new JButton("5");
			g.fill = GridBagConstraints.BOTH;
			g.ipady = 30;
			g.gridwidth = 1;
			g.weightx = 1.0;
			g.weighty = 1.0;
			g.gridx = 1;
			g.gridy = 4;
			pane.add(five,g);
			five.setBackground(Color.GRAY);
			five.setForeground(Color.WHITE);
			five.setFont(new Font("",Font.BOLD,15));
			five.addActionListener(evt -> CalMeth.five());

			six = new JButton("6");
			g.fill = GridBagConstraints.BOTH;
			g.ipady = 30;
			g.gridwidth = 1;
			g.weightx = 1.0;
			g.weighty = 1.0;
			g.gridx = 2;
			g.gridy = 4;
			pane.add(six,g);
			six.setBackground(Color.GRAY);
			six.setForeground(Color.WHITE);
			six.setFont(new Font("",Font.BOLD,15));
			six.addActionListener(evt -> CalMeth.six());

			multiply = new JButton("x");
			g.fill = GridBagConstraints.BOTH;
			g.ipadx = 10;
			g.ipady = 30;
			g.gridwidth = 1;
			g.weightx = 1.0;
			g.weighty = 1.0;
			g.gridx = 3;
			g.gridy = 4;
			pane.add(multiply,g);
			multiply.setBackground(Color.DARK_GRAY);
			multiply.setForeground(Color.WHITE);
			multiply.setFont(new Font("",Font.TRUETYPE_FONT,15));
			multiply.addActionListener(evt -> CalMeth.multiply());

			one = new JButton("1");
			g.fill = GridBagConstraints.BOTH;
			g.ipady = 30;
			g.gridwidth = 1;
			g.weightx = 1.0;
			g.weighty = 1.0;
			g.gridx = 0;
			g.gridy = 5;
			pane.add(one,g);
			one.setBackground(Color.GRAY);
			one.setForeground(Color.WHITE);
			one.setFont(new Font("",Font.BOLD,15));
			one.addActionListener(evt -> CalMeth.one());

			two = new JButton("2");
			g.fill = GridBagConstraints.BOTH;
			g.ipady = 30;
			g.gridwidth = 1;
			g.weightx = 1.0;
			g.weighty = 1.0;
			g.gridx = 1;
			g.gridy = 5;
			pane.add(two,g);
			two.setBackground(Color.GRAY);
			two.setForeground(Color.WHITE);
			two.setFont(new Font("",Font.BOLD,15));
			two.addActionListener(evt -> CalMeth.two());

			three = new JButton("3");
			g.fill = GridBagConstraints.BOTH;
			g.ipady = 30;
			g.gridwidth = 1;
			g.weightx = 1.0;
			g.weighty = 1.0;
			g.gridx = 2;
			g.gridy = 5;
			pane.add(three,g);
			three.setBackground(Color.GRAY);
			three.setForeground(Color.WHITE);
			three.setFont(new Font("",Font.BOLD,15));
			three.addActionListener(evt -> CalMeth.three());

			subtraction = new JButton("-");
			g.fill = GridBagConstraints.BOTH;
			g.ipady = 30;
			g.gridwidth = 1;
			g.weightx = 1.0;
			g.weighty = 1.0;
			g.gridx = 3;
			g.gridy = 5;
			pane.add(subtraction,g);
			subtraction.setBackground(Color.DARK_GRAY);
			subtraction.setForeground(Color.WHITE);
			subtraction.setFont(new Font("",Font.TRUETYPE_FONT,15));
			subtraction.addActionListener(evt -> CalMeth.subtraction());

			decimal = new JButton(".");
			g.fill = GridBagConstraints.BOTH;
			g.ipady = 30;
			g.gridwidth = 1;
			g.weightx = 1.0;
			g.weighty = 1.0;
			g.gridx = 0;
			g.gridy = 6;
			pane.add(decimal,g);
			decimal.setBackground(Color.GRAY);
			decimal.setForeground(Color.WHITE);
			decimal.setFont(new Font("",Font.BOLD,15));
			decimal.addActionListener(evt -> CalMeth.decimal());

			zero = new JButton("0");
			g.fill = GridBagConstraints.BOTH;
			g.ipady = 30;
			g.gridwidth = 1;
			g.weightx = 1.0;
			g.weighty = 1.0;
			g.gridx = 1;
			g.gridy = 6;
			pane.add(zero,g);
			zero.setBackground(Color.GRAY);
			zero.setForeground(Color.WHITE);
			zero.setFont(new Font("",Font.BOLD,15));
			zero.addActionListener(evt -> CalMeth.zero());

			equals = new JButton("=");
			g.fill = GridBagConstraints.BOTH;
			g.ipady = 30;
			g.gridwidth = 1;
			g.weightx = 1.0;
			g.weighty = 1.0;
			g.gridx = 2;
			g.gridy = 6;
			pane.add(equals,g);
			equals.setBackground(Color.GRAY);
			equals.setForeground(Color.WHITE);
			equals.setFont(new Font("",Font.BOLD,15));
			equals.addActionListener(evt -> {
				try {
					CalMeth.equals();
				} catch (ScriptException e) {
					mainDisplay.setText("ERROR!");
				}
			});

			addition = new JButton("+");
			g.fill = GridBagConstraints.BOTH;
			g.ipady = 30;
			g.gridwidth = 1;
			g.weightx = 1.0;
			g.weighty = 1.0;
			g.gridx = 3;
			g.gridy = 6;
			pane.add(addition,g);
			addition.setBackground(Color.DARK_GRAY);
			addition.setForeground(Color.WHITE);
			addition.setFont(new Font("",Font.TRUETYPE_FONT,15));
			addition.addActionListener(evt -> CalMeth.addition());
		}

		private static void createAndShowGUI() {
			JFrame f = new JFrame("Calculator");
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setUp(f.getContentPane());
			f.pack();
			f.setVisible(true);
			f.setFocusable(true);
			f.requestFocusInWindow();
		}

		public static void main(String[] args) {
			javax.swing.SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					createAndShowGUI();
				}
			});
		}
	}