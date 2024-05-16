package w;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LabelEx extends JFrame{
	public LabelEx() {
		super("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("사랑합니다.");
		ImageIcon beauty = new ImageIcon("images/beauty.jpg");
		JLabel imageLabel = new JLabel(beauty);
		
		ImageIcon normallcon = new ImageIcon("images/normalIcon.gif");
		JLabel label = new JLabel("보고싶으면 전화하세요", normallcon, SwingConstants.CENTER);
		
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		setSize(400,600);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LabelEx();
	}

}
