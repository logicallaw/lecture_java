import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class KeyListenerEx extends JFrame{
	private JLabel[] keyMessage;
	public KeyListenerEx() {
		super("keyListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.addKeyListener(new MyKeyListener());
		keyMessage = new JLabel[] {
				new JLabel(" getKeyCode() "),
				new JLabel(" getKeyChar() "),
				new JLabel(" getKeyText() ")};
		
		for (int i = 0; i < keyMessage.length; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true);
			keyMessage[i].setBackground(Color.YELLOW);
		}
		setSize(300,400);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	private class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			keyMessage[0].setText(Integer.toString(keyCode));
			keyMessage[1].setText(Character.toString(keyChar));
			keyMessage[2].setText(e.getKeyText(keyCode));
		}
	}
	public static void main(String[] args) {
		new KeyListenerEx();
	}

}
