import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Lab13_1 extends JFrame{
	private Container contentPane;
	public Lab13_1() {
		setTitle("Only numbers");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		createToolBar();
		setSize(300, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Lab13_1();
	}
	private void createToolBar() {
		JToolBar toolBar = new JToolBar("Student ID");
		toolBar.add(new JLabel("Student ID:"));
		
		JTextField tf = new JTextField(15);
		toolBar.add(tf);
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				boolean isNum = false;
				int[] nums = {KeyEvent.VK_0, KeyEvent.VK_1, KeyEvent.VK_2, KeyEvent.VK_3, KeyEvent.VK_4, KeyEvent.VK_5, KeyEvent.VK_6, KeyEvent.VK_7, KeyEvent.VK_8, KeyEvent.VK_9};
				
				for(int i = 0; i < nums.length; i++) {
					if(nums[i] == keyCode) {
						isNum = true;
						break;
					}
				}
				if (!isNum) {
					String errMessage = e.getKeyText(keyCode) + " is not a number.\nInput Only numbers.";
					JOptionPane.showMessageDialog(null, errMessage, "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		contentPane.add(toolBar, BorderLayout.SOUTH);
	}

}
