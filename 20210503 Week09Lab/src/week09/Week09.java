package week09;
import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
public class Week09 implements ItemListener{
    public void itemStateChanged(ItemEvent e){
        int red=0, green=0, blue=0;
        if(r.getState()){
            red=255;
        }
        if(g.getState()){
            green=255;
        }
        if(b.getState()){
            blue=255;
        }
        c.setBackground(new Color(red,green,blue));
    }
    public static void main(String[] args) {
        new Week09();
    }
    private JFrame a;
    private Panel c,s;
    private Checkbox r,g,b;
    public Week09(){
        a = new JFrame();
        a.setSize(300,200);
        a.setLocation(500,300);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        c = new Panel();
        c.setBackground(Color.black);
        a.add(c,BorderLayout.CENTER);
        r = new Checkbox("RED");
        r.addItemListener(this);
        g = new Checkbox("GREEN");
        g.addItemListener(this);
        b = new Checkbox("BLUE");
        b.addItemListener(this);
        s = new Panel();
        s.add(r);
        s.add(g);
        s.add(b);
        a.add(s,BorderLayout.SOUTH);
        a.setVisible(true);
    }
}
