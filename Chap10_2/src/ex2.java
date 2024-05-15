import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ex2 extends JFrame{
	private JLabel[] keyMessage;
	public ex2() {
		super("keyListener ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());
		
		keyMessage = new JLabel[] {
				new JLabel(" getKeyCode() "),
				new JLabel(" getKeyChar() "),
				new JLabel(" getKeyText() ")
		};
		
		for(int i = 0; i < keyMessage.length; i++) {
			keyMessage[i].setOpaque(true);
			keyMessage[i].setBackground(Color.YELLOW);
			c.add(keyMessage[i]);
		}
		
		setSize(300,400);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
		
	}
	private class MyKeyListener extends KeyAdapter{
		public void keyReleased(KeyEvent e) {
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			String keyText = e.getKeyText(keyCode);
			
			keyMessage[0].setText("keyCode: " + keyCode);
			keyMessage[0].setBackground(new Color(
					(int)(Math.random() * 256), 
					(int)(Math.random() * 256), 
					(int)(Math.random() * 256)));
			
			keyMessage[1].setText("keyChar: " + keyChar);
			keyMessage[1].setBackground(new Color(
					(int)(Math.random() * 256), 
					(int)(Math.random() * 256), 
					(int)(Math.random() * 256)));
			
			keyMessage[2].setText("keyText: " + keyText);
			keyMessage[2].setBackground(new Color(
					(int)(Math.random() * 256), 
					(int)(Math.random() * 256), 
					(int)(Math.random() * 256)));
			Container refC = (Container)e.getSource();
			refC.setBackground(new Color(
					(int)(Math.random() * 256), 
					(int)(Math.random() * 256), 
					(int)(Math.random() * 256)));
		}
	}
	public static void main(String[] args) {
		new ex2();
	}

}
