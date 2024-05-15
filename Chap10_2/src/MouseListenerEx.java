import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseListenerEx extends JFrame{
	private JLabel la = new JLabel("No Mouse Event");
	public MouseListenerEx() {
		super("MouseListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		c.add(la);
		
		setSize(300,400);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	private class MyMouseListener implements MouseListener, MouseMotionListener{
		@Override
		public void mousePressed(MouseEvent e) {
			la.setText("MousePressed(" + e.getX() + "," + e.getY() + ")");
			getContentPane().setBackground(Color.CYAN);
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			la.setText("MouseReleased(" + e.getX() + "," + e.getY() + ")");
		}
		@Override
		public void mouseClicked(MouseEvent e) {}
		@Override
		public void mouseEntered(MouseEvent e) {
			getContentPane().setBackground(Color.YELLOW);
		}
		@Override
		public void mouseExited(MouseEvent e) {}
		@Override
		public void mouseDragged(MouseEvent e) {
			la.setText("MouseDragged(" + e.getX() + "," + e.getY() + ")");
		}
		@Override
		public void mouseMoved(MouseEvent e) {
			la.setText("MouseMoved(" + e.getX() + "," + e.getY() + ")");
		}
		
	}
	public static void main(String[] args) {
		new MouseListenerEx();
	}

}
