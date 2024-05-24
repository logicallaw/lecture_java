import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Vector;

public class Lab12_3 extends JFrame{
	private MyPanel panel = new MyPanel();
	public Lab12_3() {
		setTitle("Draw Polygon");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(300, 400);
		setVisible(true);
	}
	private class MyPanel extends JPanel{
		private final int ARRAY_SIZE = 50;
		private int[] xPoint = new int[ARRAY_SIZE];
		private int[] yPoint = new int[ARRAY_SIZE];
		private int idx = 0;
		public MyPanel() {
			for(int i = 0; i < ARRAY_SIZE; i++) {
				xPoint[i] = 0;
				yPoint[i] = 0;
			}
			addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					xPoint[idx] = e.getX();
					yPoint[idx] = e.getY();
					idx++;
					repaint();
				}
			});
		}
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.MAGENTA);
			g.drawPolygon(xPoint, yPoint, idx);
		}
	}
	public static void main(String[] args) {
		new Lab12_3();
	}

}
