import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Lab13_2 extends JFrame{
	Container c;
	JButton calBtn;
	JLabel la;
	MyDialog dialog;
	
	public Lab13_2() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Field
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		dialog = new MyDialog(this, "Calculation Dialog");
		
		calBtn = new JButton("calculate");
		calBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}
		});
		
		la = new JLabel("Result");
		la.setOpaque(true);
		la.setBackground(Color.GREEN);
		
		//add ContentPane
		c.add(calBtn);
		c.add(la);
		
		setSize(250, 200);
		setVisible(true);
	}
	private class MyDialog extends JDialog{
		private JLabel dialogLabel = new JLabel("Input two integers.");
		private JTextField[] dialogFields = new JTextField[] { new JTextField(10), new JTextField(10)
		};
		private JButton dialogBtn = new JButton("Add");
		public MyDialog(JFrame frame, String title) {
			super(frame, title, true);
			setLayout(new FlowLayout(FlowLayout.CENTER));
			setSize(200, 200);
			
			//add
			add(dialogLabel);
			add(dialogFields[0]);
			add(dialogFields[1]);
			add(dialogBtn);
			
			dialogBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String c1 = dialogFields[0].getText();
					String c2 = dialogFields[1].getText();
					try {
						int i1 = Integer.parseInt(c1);
						int i2 = Integer.parseInt(c2);
						int result = i1 + i2;
						la.setText(Integer.toString(result));
						setVisible(false);
					} catch(NumberFormatException err) {
						JOptionPane.showMessageDialog(null, "Input only Numbers", "Error", JOptionPane.ERROR_MESSAGE);
					}
					
				}
			});
		}
	}
	public static void main(String[] args) {
		new Lab13_2();
	}

}

