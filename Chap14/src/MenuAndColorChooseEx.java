import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class MenuAndColorChooseEx extends JFrame{
	private JLabel label = new JLabel("Hellow");
	public MenuAndColorChooseEx() {
		setTitle("JColorChooser 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Ravie", Font.ITALIC, 30));
		c.add(label);
		createMenu();
		setSize(250, 200);
		setVisible(true);
	}
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("Text");
		JMenuItem colorMenuItem = new JMenuItem("Color");
		colorMenuItem.addActionListener(new MenuActionListener());
		fileMenu.add(colorMenuItem);
		mb.add(fileMenu);
		this.setJMenuBar(mb);
	}
	private class MenuActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if(cmd.equals("Color")) {
				Color selectedColor = JColorChooser.showDialog(null, "Color", Color.YELLOW);
				if(selectedColor != null) {
					label.setForeground(selectedColor);
				}
			}
			
		}
	}
	public static void main(String[] args) {
		new MenuAndColorChooseEx(); 
	}

}
