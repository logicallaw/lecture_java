package App;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class App extends JFrame{
	private Container container = getContentPane();
	public App() {
		setTitle("App - IdolDiaryApp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		container.setLayout(new BorderLayout());
		
		//NORTH
		JPanel north = new JPanel();
		north.setBackground(new Color(240, 228, 216));
		north.setSize(800, 800);
		//CENTER
		JPanel center = new JPanel();
		center.setBackground(new Color(230, 218, 210));
		center.setSize(800, 300);
		//SOUTH
		JPanel south = new JPanel();
		
		//Add to container:NORTH, CENTER, SOUTH
		container.add(north, BorderLayout.NORTH);
		container.add(center, BorderLayout.CENTER);
		setSize(800,900);
		setVisible(true);
	}
	public static void main(String[] args) {
		new App();
	}

}
