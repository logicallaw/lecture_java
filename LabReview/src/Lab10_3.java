import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Lab10_3 extends JFrame{
	private JLabel la = new JLabel("C");
	public Lab10_3() {
		setTitle("Click \"C\"");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		
		la.setLocation(100, 100);
		la.setSize(20, 20);
		la.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				int rndX = (int)(Math.random() * (Lab10_3.this.getWidth() - la.getWidth()));
				int rndY = (int)(Math.random() * (getHeight() - la.getHeight()));
				la.setLocation(rndX, rndY);
			}
		});
		c.add(la);
		setSize(300, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Lab10_3();
	}

}
