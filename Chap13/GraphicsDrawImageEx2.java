import javax.swing.*;
import java.awt.*;
public class GraphicsDrawImageEx2 extends JFrame{
	private MyPanel panel = new MyPanel();
	public GraphicsDrawImageEx2() {
		setTitle("원본 크기로 원하는 위치에 이미지 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(300, 100);
		setVisible(true);
	}
	private class MyPanel extends JPanel{
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image img = icon.getImage();
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			
		}
	}
	public static void main(String[] args) {
		new GraphicsDrawImageEx2();
	}

}
