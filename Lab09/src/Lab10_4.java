import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Lab10_4 extends JFrame {
	private JLabel la = new JLabel("c");
	public Lab10_4() {
		setTitle("Click \"C\"");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				if(getWidth() < x + 20) x = getWidth() - 20;
				if(getHeight() < y + 20) y = getHeight() - 20;
				la.setLocation(x,y);
			}
		});
		//Q.호출되기 전까지 위 코드는 실행이 안되는건가?
		c.setLayout(null);
		
		la.setSize(20,20);
		la.setLocation(100,100);
		
		c.add(la);
		
		setSize(300,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Lab10_4();
	}

}
