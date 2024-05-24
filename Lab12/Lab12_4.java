import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class Lab12_4 extends JFrame{
	private MyPanel panel = new MyPanel();
	public Lab12_4() {
		setTitle("dlwlrma.jpg");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(500, 550);
		setVisible(true);
		panel.setFocusable(true);
		panel.requestFocus();
	}
	private class MyPanel extends JPanel{
		private ImageIcon icon = new ImageIcon("dlwlrma.jpg");
		private int x = 10;
		private int y = 10;
		private double width = icon.getIconWidth();
		private double height = icon.getIconHeight();
		public MyPanel() {
			addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode() == '=') { //shift + =
						width *= 1.1;
						height *= 1.1;
					}
					else if (e.getKeyCode() == '-') { //shift + -
						width *= 0.9;
						height *= 0.9;
					}
				}
			});
			
			MyMouseListener ml = new MyMouseListener();
			addMouseListener(ml);
			addMouseMotionListener(ml);
		}
		private class MyMouseListener extends MouseAdapter{
			private Point startP = null;
			private boolean isIn = false;
			@Override
			public void mousePressed(MouseEvent e) {
				startP = e.getPoint();
				if(startP.x >= x && startP.x <= x + icon.getIconWidth() && startP.y >= y && startP.y <= y + icon.getIconHeight()) {
					isIn = true;
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				isIn = false;
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				if(!isIn) {
					return;
				}
				else {
					Point endP = e.getPoint();
					x = x + endP.x - startP.x;
					y = y + endP.y - startP.y;
					startP = endP;
					repaint();
				}
			}
			
		};
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(icon.getImage(), x, y, (int)width, (int)height, this);
			repaint();
		}
	}
	public static void main(String[] args) {
		new Lab12_4();
	}

}
