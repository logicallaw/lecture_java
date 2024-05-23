import javax.swing.*;
import java.awt.*;
public class paintJPanelEx extends JFrame {
	private MyPanel panel = new MyPanel();
	public paintJPanelEx() {
		super("JPanel의 paintComponent() 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(250, 220);
		setVisible(true);
	}
	private class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawRect(10,  10,  50,  50);
			g.drawRect(50,  50, 50, 50);
			g.setColor(Color.magenta);
			g.drawRect(90, 90 , 50, 50);
		}
	}
	public static void main(String[] args) {
		new paintJPanelEx();
	}

}
