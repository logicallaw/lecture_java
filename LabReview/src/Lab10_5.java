import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class Lab10_5 extends JFrame{
	MyMouseListener listener = new MyMouseListener();
	public Lab10_5() {
		setTitle("Click \"C\"");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		c.addMouseListener(listener);
		
		setSize(300, 400);
		setVisible(true);
	}
	private class MyMouseListener extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			int stateX = e.getX();
			int stateY = e.getY();
			JLabel temp = new JLabel();
			temp.setLocation(stateX, stateY);
			temp.setSize(5, 5);
			temp.setOpaque(true);
			temp.setBackground(new Color((int)(Math.random() * 256), (int)(Math.random() * 256),(int)(Math.random() * 256)));
			getContentPane().add(temp);
			repaint();
			getContentPane().revalidate();
				
		}
	}
	public static void main(String[] args) {
		new Lab10_5();
	}

}
