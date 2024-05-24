import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class PaintComponentEx extends JFrame {
	public PaintComponentEx() {
		super("PaintComponentEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyButton b = new MyButton("New Button");
		b.setOpaque(true);
		b.setBackground(Color.CYAN);
		c.add(b);
		
		setSize(250, 200);
		setVisible(true);
	}
	
	private class MyButton extends JButton{
		public MyButton(String s) {
			super(s);
		}
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawRect(0, 0, this.getWidth() - 1, this.getHeight() - 1);
			
		}
	}
	public static void main(String[] args) {
		new PaintComponentEx();
	}

}
