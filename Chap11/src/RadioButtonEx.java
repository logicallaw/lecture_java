import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class RadioButtonEx extends JFrame{
	private String[] names = new String[] {"사과", "배", "체리"};
	private ImageIcon[] cherrys = new ImageIcon[] {
			new ImageIcon("images/cherry.jpg"),
			new ImageIcon("images/selectedCherry.jpg")
	};
	private JRadioButton[] buttons = new JRadioButton[] {
			new JRadioButton(names[0]),
			new JRadioButton(names[1]),
			new JRadioButton(names[2], cherrys[0])
	};
	public RadioButtonEx() {
		super("RadioButton 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ButtonGroup g = new ButtonGroup();
		buttons[2].setBorderPainted(true);
		buttons[2].setSelectedIcon(cherrys[1]);
		
		for(int i = 0; i < buttons.length; i++) {
			g.add(buttons[i]);
			c.add(buttons[i]);
		}
		
		setSize(250,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new RadioButtonEx();
	}

}
