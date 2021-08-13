package week09lec08;
import javax.swing.JFrame;
public class Week09Lec08 //extends JFrame implements ActionListener 
{
    public static void main(String[] args) {
        new Week09Lec08();
    }
    private JFrame x;
    public Week09Lec08(){
        x = new JFrame();
        x.setSize(500,300);
        x.setLocation(500,200);
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.addMouseListener(new MouseSample());
        x.addMouseMotionListener(new MouseMotionSample());
        x.setVisible(true);
    }
}
