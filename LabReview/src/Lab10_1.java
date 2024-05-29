import javax.swing.*;
import java.awt.*;
public class Lab10_1 extends JFrame{
	private JButton[] btns = new JButton[10];
	public Lab10_1() {
		super("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10));
		//Field
		for(int i = 0; i < btns.length; i++) {
			btns[i] = new JButton(Integer.toString(i));
			
			int r = (int)(Math.random() * 256);
			int g = (int)(Math.random() * 256);
			int b = (int)(Math.random() * 256);
			btns[i].setBackground(new Color(r, g, b));
			btns[i].setOpaque(true);
			btns[i].setBorderPainted(false);
			c.add(btns[i]);
		}
		
		setSize(900, 500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Lab10_1();
	}

}
