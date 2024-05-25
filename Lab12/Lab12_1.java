import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Lab12_1 extends JFrame{
	private JLabel la = new JLabel("금액");
    private JTextField userInput = new JTextField(10);
    private JButton calBtn = new JButton("계산");
    private JLabel[] texts = new JLabel[]{
        new JLabel("만원"),
        new JLabel("천원"),
        new JLabel("500원"),
        new JLabel("100원"),
        new JLabel("50원"),
        new JLabel("10원"),
        new JLabel("1원")
    };
    private int[] nums = new int[]{
        10000, 1000, 500, 100, 50, 10
    };
    private JTextField[] textFields = new JTextField[texts.length];
    private JCheckBox[] checkBoxs = new JCheckBox[texts.length - 1];
    public Lab12_1(){
        super("Money changer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);

        la.setLocation(60, 20);
        la.setSize(30, 20);
        c.add(la);
        userInput.setLocation(100, 20);
        userInput.setSize(100, 20);
        c.add(userInput);
        //If you enter userInput...
        calBtn.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		int userInputInt = Integer.parseInt(userInput.getText());
        		for(int i = 0; i < checkBoxs.length; i++) {
        			if(checkBoxs[i].isSelected()) {
        				if(userInputInt / nums[i] != 0) {
        					textFields[i].setText(Integer.toString(userInputInt / nums[i]));
        					userInputInt %= nums[i];
        				}
        				else {
        					textFields[i].setText("0");
        				}
        			}
        			else {
        				textFields[i].setText("0");
        			}
        		}
        		if(userInputInt != 0) {
        			textFields[textFields.length - 1].setText(Integer.toString(userInputInt));
        		}
        		
        	}
        });
        calBtn.setLocation(210, 20);
        calBtn.setSize(70, 20);
        c.add(calBtn);
        for(int i = 0; i < checkBoxs.length; i++) {
        	texts[i].setLocation(50, 50 + i * 20);
        	texts[i].setSize(50, 20);
        	c.add(texts[i]);
        	textFields[i] = new JTextField(5);
        	textFields[i].setEditable(false);
        	textFields[i].setSize(70, 20);
        	textFields[i].setLocation(120, 50 + i * 20);
        	c.add(textFields[i]);
        	checkBoxs[i] = new JCheckBox();
        	checkBoxs[i].setSelected(true);
        	checkBoxs[i].setSize(30, 20);
        	checkBoxs[i].setLocation(200, 50 + i * 20);
        	c.add(checkBoxs[i]);
        }
        texts[texts.length - 1].setSize(50, 20);
        texts[texts.length - 1].setLocation(50, 50 + (texts.length - 1) * 20);
        c.add(texts[texts.length - 1]);
        
        textFields[textFields.length - 1] = new JTextField(5);
        textFields[textFields.length - 1].setEditable(false);
        textFields[textFields.length - 1].setSize(70, 20);
        textFields[textFields.length - 1].setLocation(120, 50 + (textFields.length - 1) * 20);
        c.add(textFields[textFields.length - 1]);
        

        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args){
        new Lab12_1();
    }
}