import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FlyingTextEx extends JFrame{
	private JLabel la = new JLabel("Hello");
	public FlyingTextEx() {
		super("FlyingText 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		c.addKeyListener(new MyKeyListener());
		
		la.setSize(100,30);
		la.setLocation(50,50);
		
		c.add(la);
		setSize(300,400);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	private class MyKeyListener extends KeyAdapter{
		public void keyReleased(KeyEvent e) {
			int keyCode = e.getKeyCode();
			switch(keyCode) {
			case KeyEvent.VK_UP:
				la.setLocation(la.getX(), la.getY() - 10);
				break;
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(), la.getY() + 10);
				break;
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX() - 10, la.getY());
				break;
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX() + 10, la.getY());
				break;
			}
		}
	}
	public static void main(String[] args) {
		new FlyingTextEx();
	}

}
