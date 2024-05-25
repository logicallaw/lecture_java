import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.lang.NumberFormatException;
public class Lab12_5 extends JFrame{
	private JLabel[] fruits = new JLabel[] {
			new JLabel("apple"),
			new JLabel("cherry"),
			new JLabel("strawberry"),
			new JLabel("prune")
	};
	private JTextField[] tf = new JTextField[fruits.length];
	private int[] nums = new int[] {0, 0, 0, 0};
	private int totalNum = 0;
	public Lab12_5() {
		setTitle("Pie chart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		//NORTH
		JPanel north = new JPanel();
		MyActionListener actionListener = new MyActionListener();
		for(int i = 0; i < fruits.length; i++) {
			tf[i] = new JTextField(5);
			tf[i].addActionListener(actionListener);
			north.add(fruits[i]);
			north.add(tf[i]);
		}
		north.setBackground(Color.LIGHT_GRAY);
		north.setOpaque(true);
		
		//CENTER
		MyMainPanel panel = new MyMainPanel();
		
		//set NORTH, CENTER
		c.add(north, BorderLayout.NORTH);
		c.add(panel, BorderLayout.CENTER);
		
		setSize(600, 400);
		setVisible(true);
	}
	//Event of JLabel
	private class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JTextField temp = (JTextField)e.getSource();
			String userInput = temp.getText();
			totalNum = 0;
			try {
				int number = Integer.parseInt(userInput);
				if(temp == tf[0]) {
					nums[0] = number;
				}
				else if (temp == tf[1]) {
					nums[1] = number;
				}
				else if (temp == tf[2]) {
					nums[2] = number;
				} else {
					nums[3] = number;
				}
			} catch(NumberFormatException err) {
				System.out.println("Error : NumberFormatException");
			} finally {
				temp.setText("");
				for(int element : nums) {
					totalNum += element;
				}
				repaint();
			}
		}
	}
	private class MyMainPanel extends JPanel{
		private final int ARC_X = 200;
		private final int ARC_Y = 60;
		private final int ARC_SIZE = 200;
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawString("apple " + ((nums[0] / totalNum) * 100)+ "%", 100, 30);
			g.setColor(Color.BLUE);
			g.drawString("cherry " + ((nums[1] / totalNum) * 100) + "%", 200, 30);
			g.setColor(Color.MAGENTA);
			g.drawString("strawberry " + ((nums[2] / totalNum) * 100) + "%", 300, 30);
			g.setColor(Color.ORANGE);
			g.drawString("prune " + ((nums[3] / totalNum) * 100) + "%", 450, 30);
			
			//apple
			g.setColor(Color.RED);
			g.fillArc(ARC_X, ARC_Y, ARC_SIZE, ARC_SIZE, 0, 90);
			
			//cherry
			g.setColor(Color.BLUE);
			g.fillArc(ARC_X, ARC_Y, ARC_SIZE, ARC_SIZE, 90, 90);
			
			//strawberry
			g.setColor(Color.MAGENTA);
			g.fillArc(ARC_X, ARC_Y, ARC_SIZE, ARC_SIZE, 180, 90);
			
			//prune
			g.setColor(Color.ORANGE);
			g.fillArc(ARC_X, ARC_Y, ARC_SIZE, ARC_SIZE, 270, 90);
			
		}
	}
	public static void main(String[] args) {
		new Lab12_5();
	}

}
