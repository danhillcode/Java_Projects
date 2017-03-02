import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ViewForm;
//import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Slider;

public class TestGui extends Composite {
	private Table table;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public TestGui(Composite parent, int style) {
		super(parent, style);
		
		Button btnRadioButton = new Button(this, SWT.RADIO);
		btnRadioButton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		btnRadioButton.setBounds(10, 112, 90, 18);
		btnRadioButton.setText("Radio Button");
		
		ViewForm viewForm = new ViewForm(this, SWT.NONE);
		viewForm.setBounds(167, 69, 0, 0);
		
		table = new Table(this, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(205, 111, 68, 62);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		ProgressBar progressBar = new ProgressBar(this, SWT.NONE);
		progressBar.setBounds(159, 260, 140, 14);
		
		Menu menu = new Menu(this);
		setMenu(menu);
		
		Slider slider = new Slider(this, SWT.NONE);
		slider.setBounds(107, 28, 150, 35);

	}
	
	public static void main(String[] args) {
        Display display = new Display();

        Shell shell = new Shell(display);

        // the layout manager handle the layout
        // of the widgets in the container
        shell.setLayout(new FillLayout());

        //TODO add some widgets to the Shell
        
        Button button =  new Button(shell, SWT.PUSH);

      //register listener for the selection event
      button.addSelectionListener(new SelectionAdapter() {
          @Override
          public void widgetSelected(SelectionEvent e) {
              System.out.println("Called!");
          }
      });
        
      Button button2 =  new Button(shell, SWT.PUSH);
      
     
        
     // Shell can be used as container
        Label label = new Label(shell, SWT.BORDER);
        label.setText("This is a label:");
        label.setToolTipText("This is the tooltip of this label");

        Text text = new Text(shell, SWT.NONE);
        text.setText("This is the text in the text widget");
        text.setBackground(display.getSystemColor(SWT.COLOR_BLACK));
        text.setForeground(display.getSystemColor(SWT.COLOR_WHITE));
        
        
        
     

        // set widgets size to their preferred size
        text.pack();
        label.pack();
        
        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch())
                display.sleep();
        }
        display.dispose();
        
     
        
    }

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
