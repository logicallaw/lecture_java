import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
public class Lab10_5 extends JFrame{
	public Lab10_5() {
		super("Click \"C\"");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		c.setLayout(null);
		
		setSize(300,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Lab10_5();
	}
}
class MyMouseListener extends MouseAdapter{
	@Override
	public void mouseReleased(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		JLabel temp = new JLabel();
		
		temp.setSize(5,5);
		temp.setLocation(x,y);
		Random rnd = new Random();
		temp.setBackground(new Color(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256)));
		temp.setOpaque(true);
		Container refC = (Container)e.getSource();
		refC.add(temp);
		refC.revalidate();
		refC.repaint();
	}
}
