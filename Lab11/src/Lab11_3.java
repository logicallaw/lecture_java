import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Lab11_3 extends JFrame{
	//Field
	private JLabel[] nums = new JLabel[10];
	private final int DEFAULT_WIDTH = 300;
	private final int DEFAULT_HEIGHT = 300;
	private int nextPressed = 0;
	private MyMouseListener listener = new MyMouseListener();
	
	//Default Constructor
	public Lab11_3() {
		//Default
		super("Click 0 to 9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		c.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		//Fields
		c.setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		configure();
			
		setSize(300,400);
		setVisible(true);
		
	}
	
	//MouseListener Class
	private class MyMouseListener extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			JLabel temp = (JLabel)e.getSource();
			int t = Integer.parseInt(temp.getText());
			if (t == nextPressed) {
				if (nextPressed != nums.length - 1) {
					temp.setVisible(false);
					nextPressed++;
				}
				else {
					temp.setVisible(false);
					configure();
					Container c = getContentPane();
					c.revalidate(); c.repaint();
					nextPressed = 0;
				}
			}
		}
	}
	
	private void configure() {
		Container c = getContentPane();
		for(int i = 0; i < nums.length; i++) {
			nums[i] = new JLabel(Integer.toString(i));
			nums[i].setSize(15, 15);
			int xBound = c.getWidth() - nums[i].getWidth();
			int yBound = c.getHeight() - nums[i].getHeight();
			int x = (int)(Math.random() * xBound);
			int y = (int)(Math.random() * yBound);
			
			nums[i].setForeground(Color.RED);
			nums[i].setLocation(x, y);
			
			nums[i].addMouseListener(listener);
			nums[i].setVisible(true);
			c.add(nums[i]);
		}
	}
	
	//Main Function
	public static void main(String[] args) {
		new Lab11_3();
	}

}
