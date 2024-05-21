import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Lab12_1 extends JFrame{
    private JTextField tf = new JTextField(20);
    private JButton btn = new JButton("계산");
    private JLabel[] la = new JLabel[]{
        new JLabel("만원"),
        new JLabel("천원"),
        new JLabel("500원"),
        new JLabel("100원"),
        new JLabel("50원"),
        new JLabel("10원"),
        new JLabel("1원")
    };
    private int[] nums = new nums[]{
        10000, 1000, 500, 100, 50, 10
    };
    private JTextField[] latf = new JTextField[la.length];
    private JCheckBox[] checkBoxs = new JCheckBox[la.length - 1];
    public Lab12_1(){
        super("Money changer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("금액"));
        c.add(tf);
        tf.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int total = Integer.toString(tf.getText());
                int temp;
                for (int i = 0; i < checkBoxs.length; i++){
                    if(checkBoxs[i].getStateChange() == ItemEvent.SELECTED){
                        if(total / nums[i] != 0){
                            temp = (total / nums[i]);
                            latf[i].setText(static_cast<String>(temp));
                            total %= nums[i];
                        }
                    }
                }
                if(total != 0){
                    latf[latf.length - 1].setText(static_cast<String>(total));
                }
            }
        });
        c.add(btn);

        for(int i = 0; i < la.length; i++){
            latf[i] = new JTextField(10);
            latf[i].setEditable(false);
            checkBoxs[i] = new JCheckBox();
            checkBoxs[i].setSelected(true);
            c.add(la[i]);
            c.add(latf[i]);
            c.add(checkBoxs[i]);
        }

        setSize(300,400);
        setVisible(true);
    }
    public static void main(String[] args){
        new Lab12_1();
    }
}