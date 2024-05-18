import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab11_4 extends JFrame{
	private JLabel[] northLabels = new JLabel[3];
	private ImageIcon[] imgs;
	private int me;
	private int com;
	private JLabel resultMe;
	private JLabel resultCom;
	private JLabel result;
	
	public Lab11_4() {
		//Default
		super("GBB game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		//Fields
		imgs = new ImageIcon[] {
				new ImageIcon("images/gawi.jpg"),
				new ImageIcon("images/bawi.jpg"),
				new ImageIcon("images/bo.jpg")
		};
		
		for(int i = 0; i < imgs.length; i++) {
			northLabels[i] = new JLabel(imgs[i]);
		}
		
		resultMe = new JLabel("me");
		resultCom = new JLabel("com");
		result = new JLabel("Winner");
		
		//NORTH Panel
		JPanel north = new JPanel();
		north.setBackground(Color.LIGHT_GRAY);
		north.setOpaque(true);
		
		MyMouseListener listener = new MyMouseListener();
		for(int i = 0; i < northLabels.length; i++) {
			northLabels[i].addMouseListener(listener);
			north.add(northLabels[i]);
		}
		
		//CENTER Panel
		JPanel center = new JPanel();
		center.setLayout(new FlowLayout());
		center.setBackground(Color.yellow);
		center.setOpaque(true);
		
		center.add(resultMe);
		center.add(resultCom);
		center.add(result);
		
		//Add:NORTH, CENTER
		c.add(north, BorderLayout.NORTH);
		c.add(center, BorderLayout.CENTER);
		
		setSize(300,400);
		setVisible(true);
	}
	
	//Mouse Listener Class
	private class MyMouseListener extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			JLabel temp = (JLabel)e.getSource();
			//comChoice
			com = (int)(Math.random() * 3);
			//meChoice
			if(temp == northLabels[0]) {
				me = 0;
			}
			else if (temp == northLabels[1]) {
				me = 1;
			}
			else if (temp == northLabels[2]) {
				me = 2;
			}
			
			if (com == me) result.setText("Same!!!");
			else {
				if ((com == 0 && me == 1) || (com == 1 && me == 2) || (com == 2 && me == 0)) result.setText("Me!!!");
				else result.setText("Computer!!!");
			}
			
			resultMe.setIcon(imgs[me]);
			resultCom.setIcon(imgs[com]);
		}
	}
	
	//Main Function
	public static void main(String[] args) {
		new Lab11_4();
	}

}
