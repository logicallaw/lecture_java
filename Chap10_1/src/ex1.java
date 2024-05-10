import java.awt.*;
import javax.swing.*;
public class ex1 extends JFrame{
	public ex1() {
		super("Non-Title");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		JButton btn = new JButton("HI");
		btn.setBackground(Color.red);
		btn.setOpaque(true);
		c.add(btn);
		setSize(300,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ex1();
	}

}
