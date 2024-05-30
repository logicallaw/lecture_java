import javax.swing.*;
import java.awt.*;

public class TabbedPaneEx extends JFrame{
	public TabbedPaneEx() {
		setTitle("탭팬 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		JTabbedPane pane = createTabbedPane();
		c.add(pane, BorderLayout.CENTER);
		setSize(250, 250);
		setVisible(true);
	}
	private JTabbedPane createTabbedPane() {
		JTabbedPane pane = new JTabbedPane(JTabbedPane.LEFT);
		pane.addTab("tab1", new JLabel(new ImageIcon("images/img1.jpg")));
		pane.addTab("tab2", new JLabel(new ImageIcon("images/img2.jpg")));
		pane.addTab("tab3", new MyPanel());
		return pane;
	}
	class MyPanel extends JPanel{
		public MyPanel() {
			this.setBackground(Color.yellow);
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillRect(10, 10, 50, 50);
			g.setColor(Color.BLUE);

			g.drawString("tab 3에 들어가는 JPanel 입니다.", 30 ,50);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TabbedPaneEx();
	}

}
