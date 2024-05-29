import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class Lab13_3 extends JFrame {
	private MyPanel panel = new MyPanel();;
	public Lab13_3() {
		setTitle("Menu & event");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(panel);
		
		setSize(300, 400);
		setVisible(true);
	}
	class MyPanel extends JPanel{
		private ImageIcon icon = new ImageIcon("images/dlwlrma1.jpg");
		private boolean isLoad = false;
		public MyPanel() {
			JMenuBar mb = new JMenuBar();
			JMenu screenMenu = new JMenu("Screen");
			
			JMenuItem[] menuItem = new JMenuItem[4];
			String[] itemTitle = new String[] {"Load", "Hide", "ReShow", "Exit"};
			
			MenuActionListener listener = new MenuActionListener();
			for(int i = 0; i < menuItem.length; i++) {
				menuItem[i] = new JMenuItem(itemTitle[i]);
				menuItem[i].addActionListener(listener);
				screenMenu.add(menuItem[i]);
			}
			mb.add(screenMenu);
			setJMenuBar(mb);
		}
		private class MenuActionListener implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				switch(cmd) {
				case "Load":
					isLoad = true;
					repaint();
					break;
				case "Exit":
					int result = JOptionPane.showConfirmDialog(null, "Exit?", "Confirm", JOptionPane.YES_NO_OPTION);
					if(result == JOptionPane.YES_OPTION) 
						System.exit(EXIT_ON_CLOSE);
				}
			}
		}
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			if(isLoad) {
				g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), this);
			}
		}
	}
	
	
	public static void main(String[] args) {
		new Lab13_3();
	}

}
