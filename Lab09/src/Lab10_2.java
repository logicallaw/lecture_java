import java.awt.*;
import javax.swing.*;
public class Lab10_2 extends JFrame{
	public Lab10_2() {
//		setTitle("Calculator Frame");
		super("Calculator Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//.
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout());
		//header
		JPanel header = new JPanel(new FlowLayout(FlowLayout.CENTER));
		header.setBackground(Color.gray);
		
		header.add(new JLabel("Enter formula"));
		JTextField text1 = new JTextField(15);
		header.add(text1);
		
		//main
		JPanel main = new JPanel(new GridLayout(4,4, 10, 10));
		main.setBackground(Color.LIGHT_GRAY);
		for(int i = 0; i < 10; i++) {
			JButton btn = new JButton(Integer.toString(i));
			main.add(btn);
		}
		main.add(new JButton("CE"));
		main.add(new JButton("RUN"));
//		JButton btn10 = new JButton("CE");
//		JButton btn11 = new JButton("RUN");
//		JButton btn12 = new JButton("+");
//		btn12.setOpaque(true);
//		btn12.setBorderPainted(false);
//		btn12.setBackground(Color.cyan);
//		JButton btn13 = new JButton("-");
//		btn13.setOpaque(true);
//		btn13.setBorderPainted(false);
//		btn13.setBackground(Color.cyan);
//		JButton btn14 = new JButton("x");
//		btn14.setOpaque(true);
//		btn14.setBorderPainted(false);
//		btn14.setBackground(Color.cyan);
//		JButton btn15 = new JButton("/");
//		btn15.setOpaque(true);
//		btn15.setBorderPainted(false);
//		btn15.setBackground(Color.cyan);
//		
//		main.add(btn10); main.add(btn11); main.add(btn12); main.add(btn13); main.add(btn14); main.add(btn15);
		JButton[] btns = {new JButton("+"), new JButton("-"), new JButton("x"), new JButton("/")};
		for (int i = 0; i < 4; i++) {
			btns[i].setOpaque(true);
			btns[i].setBorderPainted(false);
			btns[i].setBackground(Color.CYAN);
			main.add(btns[i]);
		}
		
		//footer
		JPanel footer = new JPanel(new FlowLayout(FlowLayout.CENTER));
		footer.setBackground(Color.yellow);
		
		footer.add(new JLabel("Result"));
		JTextField text2 = new JTextField(15);
		footer.add(text2);
		
		//add header, main, footer JPanel
		c.add(header, BorderLayout.NORTH);
		c.add(footer, BorderLayout.SOUTH);
		c.add(main, BorderLayout.CENTER);
		setSize(400,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Lab10_2();
	}

}
