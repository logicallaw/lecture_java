import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RadioButtonItemEventEx extends JFrame{
	private String[] names = new String[] {"사과", "배", "체리"};
	private JRadioButton[] btns = new JRadioButton[] {
			new JRadioButton(names[0]),
			new JRadioButton(names[1]),
			new JRadioButton(names[2])
	};
	private ImageIcon[] imgs = new ImageIcon[] {
			new ImageIcon("images/apple.jpg"),
			new ImageIcon("images/pear.jpg"),
			new ImageIcon("images/cherry.jpg")
	};
	private JLabel centerLabel = new JLabel();
	
	public RadioButtonItemEventEx() {
		super("RadioButtonItemEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		//header
		JPanel header = new JPanel();
		header.setLayout(new FlowLayout());
		
		ButtonGroup g = new ButtonGroup();
		MyItemListener listener = new MyItemListener();
		for(int i = 0 ; i < btns.length; i++) {
			g.add(btns[i]);
			btns[i].addItemListener(listener);
			btns[i].setBorderPainted(true);
			header.add(btns[i]);
		}
		btns[0].setSelected(true);
		//main
		JPanel main = new JPanel();
		main.add(centerLabel);
		
		//ContentPane Object.add(header, main)
		c.add(header, BorderLayout.NORTH);
		c.add(main,BorderLayout.CENTER);
		
		setSize(250,300);
		setVisible(true);
	}
	private class MyItemListener implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == btns[0]) {
					centerLabel.setIcon(imgs[0]);
				}
				else if (e.getItem() == btns[1]) {
					centerLabel.setIcon(imgs[1]);
				}
				else {
					centerLabel.setIcon(imgs[2]);
				}
			}
		}
	}
	public static void main(String[] args) {
		new RadioButtonItemEventEx();
	}

}
