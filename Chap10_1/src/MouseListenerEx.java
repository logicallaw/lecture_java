import javax.swing.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;
import java.awt.*;

public class MouseListenerEx extends JFrame {
	private JLabel la = new JLabel("Hello");
	private int w = 250, h = 250;
	public MouseListenerEx() {
		super("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		
		c.setLayout(null);
		la.setSize(50,20);
		la.setLocation(30,30);
		c.add(la);
		
		setSize(w,h);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			if (w < x + 50) x = w - 50;
			if (h < y + 20) y = w - 20;
			la.setLocation(x,y);
		}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseListenerEx();
	}

}
