import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.BadLocationException;
public class Lab12_2 extends JFrame{
    private JTextArea ta = new JTextArea(10, 20);
    private JSlider js = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
    public Lab12_2(){
        super("TextArea with JSlider");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        js.setPaintLabels(true);
        js.setPaintTicks(true);
        js.setPaintTrack(true);
        js.setMajorTickSpacing(50);
        js.setMinorTickSpacing(10);

        c.add(ta);
        c.add(js);

        setSize(200, 300);
        setVisible(true);
    }
    private class MyChangeListener implements ChangeListener{
        @Override
        public void stateChanged(ChangeEvent e){
            int taIndex = ta.getText().length();
            int jsIndex = js.getValue();
            String taText = ta.getText();
            String temp = "";
            if(jsIndex > taIndex){
                js.setValue(taIndex);
            }
            else if (jsIndex <= taIndex){
            	try {
					taText = ta.getText(0, jsIndex);
				} catch (BadLocationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
//                 for(int i = 0; i < jsIndex; i++){
//                     temp = temp.concat(taText[i]);
//                 }
            	
//                taText.setText(taText.getText(0, jsIndex - 1));
            }
        }
    }
    public static void main(String[] args){
        new Lab12_2();
    }
}