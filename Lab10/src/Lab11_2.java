import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Lab11_2 extends JFrame{
	private JLabel la = new JLabel("Love Java");
	private final int FLYING_UNIT = 5;
	public Lab11_2() {
		super("Wheel your mouse");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addMouseWheelListener(new MyMouseListener());
		c.addKeyListener(new MyKeyListener());
		la.setFont(new Font("Arial", Font.PLAIN, 15));
		c.add(la);
		
		setSize(300,400);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	private class MyMouseListener implements MouseWheelListener{
		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			int n = e.getWheelRotation();
			if(n < 0) {
				la.setFont(new Font("Times New Roman", Font.BOLD|Font.ITALIC,la.getFont().getSize() + FLYING_UNIT));
			}
			else if (n > 0) {
				int fontSize = la.getFont().getSize();
				if(fontSize - 5 < 5) {
					fontSize = 5;
				}
				else {
					fontSize -= 5;
				}
				la.setFont(new Font("Arial", Font.PLAIN, fontSize));
			}
		}
	}
	private class MyKeyListener extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			char keyChar = e.getKeyChar();
			int fontSize = la.getFont().getSize();
			
			if(fontSize - 5 < 5) {
				fontSize = 5;
			}
			else if (fontSize - 5 >= 5){
				fontSize -= 5;
			}
			
			if(keyChar == '+') {
				la.setFont(new Font("Times New Roman", Font.BOLD|Font.ITALIC,la.getFont().getSize() + FLYING_UNIT));
			}
			else if (keyChar == '_') {
				la.setFont(new Font("Arial", Font.PLAIN, fontSize));
			}
		}
	}
	public static void main(String[] args) {
		new Lab11_2();
	}
}
