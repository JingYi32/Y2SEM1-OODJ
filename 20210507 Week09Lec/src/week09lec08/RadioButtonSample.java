package week09lec08;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
public class RadioButtonSample implements ActionListener {
    public static void main(String[] args) {
        new RadioButtonSample();
    }    
    private JFrame x;
    private JRadioButton male, female;
    private ButtonGroup bg;
    private Label gender;
    public RadioButtonSample(){
        x = new JFrame();
        x.setSize(200,100);
        x.setLocation(800,200);
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.setLayout(new FlowLayout());
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        male.addActionListener(this);
        female.addActionListener(this);
        bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        gender = new Label("What is your gender?",Label.CENTER);
        x.add(gender);
        x.add(male);
        x.add(female);
        x.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==male){
            System.out.println("I am a male!");
            gender.setText("I am a male!");
        } else if(e.getSource()==female){
            System.out.println("You are a female!");
            gender.setText("You are a female!");
        }
    }
}
