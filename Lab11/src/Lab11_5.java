import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class Lab11_5 extends JFrame{
	//Field
	private boolean isLeft;
	private int idx;
	private JRadioButton[] btns;
	private static ImageIcon[] imgs;
	private JLabel centerLabel;
	private JLabel centerMessage;
	
	//Default Constructor
	public Lab11_5() {
		super("image gallery");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		//Fields
		isLeft = true;
		idx = 0;
		btns = new JRadioButton[] {
				new JRadioButton("left"),
				new JRadioButton("right")
		};
		centerLabel = new JLabel(imgs[2]);
		centerMessage = new JLabel("");
		
		//NORTH
		JPanel north = new JPanel();
		ButtonGroup g = new ButtonGroup();
		MyItemListener itemListener = new MyItemListener();
		for(int i = 0; i < btns.length; i++) {
			g.add(btns[i]);
			north.add(btns[i]);
			btns[i].addItemListener(itemListener);
		}
		
		//CENTER
		JPanel center = new JPanel();
		MyMouseListener mouseListener = new MyMouseListener();
		center.addMouseListener(mouseListener);
		
		centerLabel = new JLabel(imgs[0]);
		centerMessage.setSize(200, 300);
		
		center.add(centerLabel);
		center.add(centerMessage);
		
		//ContentPane Object.add() : BorderLayout.NORTH, CENTER
		c.add(north, BorderLayout.NORTH);
		c.add(center, BorderLayout.CENTER);
		
		btns[0].setSelected(true);
		setSize(400, 500);
		setVisible(true);
	}
	
	//Item Listener Class
	private class MyItemListener implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == btns[0]) {
					isLeft = true;
				}
				else if (e.getItem() == btns[1]){
					isLeft = false;
				}
			}
			else {
				return;
			}
		}
	}
	
	//MouseListener Class
	private class MyMouseListener extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			if(isLeft) { //LEFT
				if(idx > 0) {
					centerLabel.setIcon(imgs[--idx]);
					centerMessage.setText("");
				}
				else {
					centerMessage.setText("ERROR: Out Of Range!");
				}
			}
			else { //RIGHT
				if(idx < imgs.length - 1) {
					centerLabel.setIcon(imgs[++idx]);
					centerMessage.setText("");
				}
				else {
					centerMessage.setText("ERROR: Out Of Range!");
				}
			}
		}
	}
	
	//getImages
	public static void getImages() {
		File dir = new File("/Users/jun/Desktop/java_leewook/Lab11/images2");
		File[] subFiles = dir.listFiles();
		imgs = new ImageIcon[subFiles.length];
		
		for (int i = 0 ;i < subFiles.length; i++) {
			File temp = subFiles[i];
			String tempName = "images2/" + temp.getName();
			imgs[i] = new ImageIcon(tempName);
			System.out.println(tempName);
		}
	}
	
	//Main Function
	public static void main(String[] args) {
		getImages();
		new Lab11_5();
	}

}
