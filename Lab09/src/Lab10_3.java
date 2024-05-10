import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
public class Lab10_3 extends JFrame {
	private JLabel la = new JLabel("c");
	public Lab10_3() {
		setTitle("Click \"C\"");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		c.setLayout(null);
		
		la.setSize(20,20);
		la.setLocation(100,100);
		
		c.add(la);
		
		setSize(300,400);
		setVisible(true);
	}
	private class MyMouseListener implements MouseListener{
		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
//			if(getWidth() < x + 20) x = getWidth() - 20;
//			if(getHeight() < y + 20) y = getHeight() - 20;
			Random rnd = new Random();
			x = rnd.nextInt(getWidth() - 20);
			y = rnd.nextInt(getHeight() - 20);
			la.setLocation(x,y);
		}
		@Override
		public void mouseReleased(MouseEvent e) {}
		@Override
		public void mouseClicked(MouseEvent e) {}
		@Override
		public void mouseEntered(MouseEvent e) {}
		@Override
		public void mouseExited(MouseEvent e) {}
	}
	public static void main(String[] args) {
		new Lab10_3();
	}

}
