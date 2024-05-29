import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class Lab11_1 extends JFrame{
	private JLabel[] texts = new JLabel[] {
			new JLabel("dlwlrma"),
			new JLabel("pby"),
			new JLabel("wook")
	};
	
	public Lab11_1() {
		setTitle("Move clicked name");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		setSize(300, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Lab11_1();
	}
}
