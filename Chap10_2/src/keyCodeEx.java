import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class keyCodeEx extends JFrame{
	private JLabel la = new JLabel("JLabel");
	public keyCodeEx() {
		super("Key Code 예제");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container c = getContentPane();
	    c.setLayout(new FlowLayout());
	    
	    c.addKeyListener(new MyKeyListener());
	    
	    setSize(300,400);
	    setVisible(true);
	    c.setFocusable(true);
	    c.requestFocus();
	}
	private class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			la.setText(KeyEvent.getKeyText(e.getKeyCode()));
			
			if(e.getKeyChar() == '%') {
				getContentPane().setBackground(Color.CYAN);
			}
			else if (e.getKeyChar() == KeyEvent.VK_F1) {
				getContentPane().setBackground(Color.GREEN);
			}
		}
	}
	public static void main(String[] args) {
		new keyCodeEx();
	}

}
