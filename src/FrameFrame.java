import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameFrame extends JFrame 
{
	private static final int HEIGHT = 400;
	private static final int WIDTH = 400;

	public FrameFrame()
	{
		super("Boring Frame");
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//FlowLayout fl = new FlowLayout();
		//GridLayout fl = new GridLayout(2, 2);
		//BorderLayout fl = new BorderLayout();
		GridBagLayout fl = new GridBagLayout();
		
		setLayout(fl);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		
		JButton b1 = new JButton("One");
		JButton b2 = new JButton("Two");
		JButton b3= new JButton("Three");
		JButton b4 = new JButton("Four");
		
		add(b1, gbc);
		add(b2, gbc);
		add(b3, gbc);
		add(b4, gbc);
		
		
		/*
		add(b1, BorderLayout.WEST);
		add(b2, BorderLayout.EAST);
		add(b3, BorderLayout.NORTH);
		add(b4, BorderLayout.SOUTH);
		*/
		
		/*
		 add(b1);
		 add(b2);
		 add(b3);
		 add(b4);
		 */
		pack();
	}
}
