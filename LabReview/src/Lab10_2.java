import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Lab10_2 extends JFrame{
	private JTextField fieldNorth = new JTextField(10);
	JTextField fieldSouth = new JTextField(10);
	private MyActionListener enterListener = new MyActionListener();
	private MyMouseListener listener = new MyMouseListener();
	private void calculateFt(String userInput) {
		char c;
		char[] toChars = userInput.toCharArray();
		for(int i = 0; i < toChars.length; i++) {
			if((c = toChars[i]) == '+' || c == '-' || c == '*' || c == '/') {
				int preNum = Integer.parseInt(userInput.substring(0, i));
				int postNum = Integer.parseInt(userInput.substring(i + 1, userInput.length()));
				switch(c) {
				case '+':
					fieldSouth.setText(Integer.toString(preNum + postNum));
					break;
				case '-':
					fieldSouth.setText(Integer.toString(preNum - postNum));
					break;
				case '*':
					fieldSouth.setText(Integer.toString(preNum * postNum));
					break;
				case '/':
					if(postNum == 0) {
						fieldNorth.setText("");
						fieldSouth.setText("");
						JOptionPane.showMessageDialog(null, "0으로 나눌 수 없습니다.", "경고", JOptionPane.ERROR_MESSAGE);
					}
					else {
						fieldSouth.setText(Integer.toString(preNum / postNum));
					}
				}
			}

		}
	}
	
	public Lab10_2() {
		super("Calculator Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		//NORTH
		JPanel north = new JPanel();
		north.setBackground(Color.LIGHT_GRAY);
		JLabel textNorth = new JLabel("Enter formula");
		fieldNorth.addActionListener(enterListener);
		north.add(textNorth);
		north.add(fieldNorth);
		
		//CENTER
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(4, 4, 10, 10));
		JButton[] btnNums = new JButton[10];
		
		for(int i = 0; i < btnNums.length; i++) {
			btnNums[i] = new JButton(Integer.toString(i));
			btnNums[i].addMouseListener(listener);
			center.add(btnNums[i]);
		}
		
		JButton[] btnCals = new JButton[] { new JButton("CE"), new JButton("RUN") };
		for(int i = 0; i < btnCals.length; i++) {
			btnCals[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					JButton btn = (JButton)e.getSource();
					String temp = btn.getText();
					if(temp.equals("RUN")) {
						System.out.println("start");
						calculateFt(fieldNorth.getText());
					}
					else if (temp.equals("CE")) {
						fieldNorth.setText("");
						fieldSouth.setText("");
					}
					
				}
			});
			center.add(btnCals[i]);
		}
		
		JButton[] btnOps = new JButton[] { new JButton("+"), new JButton("-"), new JButton("*"), new JButton("/") };
		for(int i = 0; i < btnOps.length; i++) {
			btnOps[i].setBackground(Color.CYAN);
			btnOps[i].setOpaque(true);
			btnOps[i].setBorderPainted(false);
			btnOps[i].addMouseListener(listener);
			center.add(btnOps[i]);
		}		
		//SOUTH
		JPanel south = new JPanel();
		south.setBackground(Color.YELLOW);
		JLabel textSouth = new JLabel("Result");
		
		south.add(textSouth);
		south.add(fieldSouth);
		
		//add NORTH, CENTER, SOUTH
		c.add(north, BorderLayout.NORTH);
		c.add(center, BorderLayout.CENTER);
		c.add(south, BorderLayout.SOUTH);
		
		setSize(300, 400);
		setVisible(true);
		fieldNorth.setFocusable(true);
		fieldNorth.requestFocus();
	}

	private class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JTextField fid = (JTextField)e.getSource();
			calculateFt(fid.getText());
		}
		
	}
	private class MyMouseListener extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			JButton btn = (JButton)e.getSource();
			fieldNorth.setText(fieldNorth.getText() + btn.getText());
		}
	}
	public static void main(String[] args) {
		new Lab10_2();
	}

}
