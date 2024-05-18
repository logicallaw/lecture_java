
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ButtonEx extends JFrame{
	private ImageIcon[] icons;
	public ButtonEx() {
		super("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		icons = new ImageIcon[] {
			new ImageIcon("images/normalIcon.gif"),
			new ImageIcon("images/rolloverIcon.gif"),
			new ImageIcon("images/pressedIcon.gif")
		};
		
		JButton btn = new JButton("call~~", icons[0]);
		btn.setPressedIcon(icons[2]);
		btn.setRolloverIcon(icons[1]);
		
		c.add(btn);
		setSize(250, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonEx();
	}

}
