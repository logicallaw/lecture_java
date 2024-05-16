package w;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JComponentEx extends JFrame {
	private JButton[] b;
	public JComponentEx() {
		super("JComponent의 공통 메서드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		b = new JButton[] {
				new JButton("Magenta/Yellow Button"),
				new JButton(" Disabled Button "),
				new JButton("getX(), getY()")
		};
		b[0].setBackground(Color.YELLOW);
		b[0].setForeground(Color.MAGENTA);
		b[0].setFont(new Font("Aria", Font.ITALIC,20));
		b[1].setEnabled(false);
		b[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton temp = (JButton)e.getSource();
				setTitle(temp.getX() + "," + temp.getY());
			}
		});
		for(int i = 0; i < b.length; i++) {
			c.add(b[i]);
		}
		setSize(260, 200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JComponentEx();
	}

}
