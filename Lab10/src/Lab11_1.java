import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Lab11_1 extends JFrame{
	private JLabel[] nameMessage;
	private final int FLYING_UNIT = 10;
	public Lab11_1() {
		super("Move clicked name");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		nameMessage = new JLabel[] {
				new JLabel("dlwlrma"),
				new JLabel("pby"),
				new JLabel("wook")
		};
		
		for(int i = 0; i < nameMessage.length; i++) { 
			nameMessage[i].setLocation(i * 50, i * 50);
			nameMessage[i].setSize(50, 20);
			nameMessage[i].addMouseListener(new MyMouseListener());
			nameMessage[i].addKeyListener(new MyKeyListener());
			c.add(nameMessage[i]);
		}
		
		
		setSize(300,400);
		setVisible(true);
		nameMessage[1].setFocusable(true);
		nameMessage[1].requestFocus();
		
	}
	private class MyMouseListener extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			Component com = (Component)e.getSource();
			com.setFocusable(true);
			com.requestFocus();
		}
	}
	private class MyKeyListener extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			JLabel refName = (JLabel)e.getSource();
			switch(keyCode) {
			case KeyEvent.VK_UP:
				refName.setLocation(refName.getX(), refName.getY() - FLYING_UNIT);
				break;
			case KeyEvent.VK_DOWN:
				refName.setLocation(refName.getX(), refName.getY() + FLYING_UNIT);
				break;
			case KeyEvent.VK_LEFT:
				refName.setLocation(refName.getX() - FLYING_UNIT, refName.getY());
				break;
			case KeyEvent.VK_RIGHT:
				refName.setLocation(refName.getX() + FLYING_UNIT, refName.getY());
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		new Lab11_1();
	}

}
