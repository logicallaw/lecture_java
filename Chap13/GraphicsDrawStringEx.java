import javax.swing.*;
import java.awt.*;
public class GraphicsDrawStringEx extends JFrame {
	private MyPanel panel = new MyPanel();
	public GraphicsDrawStringEx() {
		super("drawString 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(250, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicsDrawStringEx();
	}
	private class MyPanel extends JPanel{
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("자바는 재밌다.~~", 30, 30);
			g.drawString("얼마나? 하늘만큼 땅만큼 !!!", 60, 60);
		}
	}
}
