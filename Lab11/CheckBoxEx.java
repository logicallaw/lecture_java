package w;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CheckBoxEx extends JFrame {
	private ImageIcon[] images;
	private JCheckBox[] boxs;
	public CheckBoxEx() {
		super("체크박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		images = new ImageIcon[] {
				new ImageIcon("images/cherry.jpg"),
				new ImageIcon("images/selectedCherry.jpg")
		};
		
		boxs = new JCheckBox[] {
				new JCheckBox("사과"),
				new JCheckBox("배", true),
				new JCheckBox("체리", images[0])
		};
		boxs[2].setBorderPainted(true);
		boxs[2].setSelectedIcon(images[1]);
		
		for(int i = 0; i < boxs.length; i++) {
			c.add(boxs[i]);
		}
		setSize(250, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxEx();
	}

}
