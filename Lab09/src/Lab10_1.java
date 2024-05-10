import javax.swing.*;
import java.awt.*;
public class Lab10_1 extends JFrame{
	public Lab10_1() {
//		setTitle("Ten Color Buttons Frame");
		super("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int numBtns = 10;
		GridLayout grid = new GridLayout(1,numBtns,5,0);
		grid.setVgap(2);
		
		Container c = getContentPane();
		c.setLayout(grid);
		c.setBackground(Color.gray);
		
		for(int i = 0; i < numBtns; i++) {
			JButton btn = new JButton(Integer.toString(i));
			int r = (int)(Math.random() * 256);
			int g = (int)(Math.random() * 256);
			int b = (int)(Math.random() * 256);
			btn.setBackground(new Color(r,g,b));
			btn.setOpaque(true);
			btn.setBorderPainted(false);
			c.add(btn);
		}
	
		setSize(600,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Lab10_1();
	}

}
