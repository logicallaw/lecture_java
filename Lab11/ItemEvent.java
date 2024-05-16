package w;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ItemEvent extends JFrame {
	private JCheckBox[] fruits = new JCheckBox[3];
	private String[] names = {"사과"}
	public ItemEvent() {
		super("체크박스와 ItemEvet 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));
		
		MyItemListener listener = new MyItemListener();
		for(int i = 0; i < )
		
		setSize(250, 200);
		setVisible(true);
	}
	class MyItemListener implements ItemListener{
		private int sum = 0;
		@Override
		public void itemStateChanged(java.awt.event.ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == fruits[0]) {
					sum += 100;
				}
				else if (e.getItem() == fruits[1]) {
					sum += 500;
				}
				else {
					sum += 20000;
				}
			}
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
