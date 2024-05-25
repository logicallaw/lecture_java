import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.BadLocationException;
public class Lab12_2 extends JFrame{
    private JTextArea userInput = new JTextArea(10, 20);
    private JSlider userSlider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
    
    public Lab12_2(){
        super("TextArea with JSlider");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        
        userSlider.setPaintLabels(true);
        userSlider.setPaintTicks(true);
        userSlider.setPaintTrack(true);
        userSlider.setMajorTickSpacing(50);
        userSlider.setMinorTickSpacing(10);

        c.add(userInput);
        c.add(userSlider);
        
        MyChangeListener listener = new MyChangeListener();
        userSlider.addChangeListener(listener);
        

        setSize(200, 300);
        setVisible(true);
    }
    private class MyChangeListener implements ChangeListener{
        @Override
        public void stateChanged(ChangeEvent e){
            int strLength = userInput.getText().length();
            int sliderValue = userSlider.getValue();
            if(sliderValue >= strLength) {
            	userSlider.setValue(100);
            }
            
            repaint();
            revaliated();
        }

		private void revaliated() {
			// TODO Auto-generated method stub
			
		}
        
    }
    public static void main(String[] args){
        new Lab12_2();
    }
}