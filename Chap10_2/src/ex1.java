import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ex1 extends JFrame{
	private JLabel la = new JLabel("Hello Swing!");
	public ex1() {
		super("KeyCode Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		
		setSize(300,400);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	class MyKeyListener extends KeyAdapter{
		public void keyReleased(KeyEvent e) {
			Container refC = (Container)e.getSource();
			la.setText("눌러진 키: " + KeyEvent.getKeyText(e.getKeyCode()));
			if(e.getKeyChar() == '%') {
				refC.setBackground(Color.cyan);
			}
			else if (e.getKeyChar() == '$') {
				refC.setBackground(Color.yellow);
			}
		}
	}
	public static void main(String[] args) {
		new ex1();
	}

}
