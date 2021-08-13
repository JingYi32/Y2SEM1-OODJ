package New;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class NewMain implements ActionListener {
    private static ArrayList<User> u;
    private JFrame x;
    private Panel y1, y1c, y1s, yn, yp, y2;
    private Button a,e,d,q;
    private Label name, pin;
    private TextField n, p;
    private DefaultTableModel z;
    private JTable z1;
    public NewMain(){
        x = new JFrame();
        x.setSize(500, 300);
        x.setLocation(300, 100);
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.setLayout(new GridLayout(2,1));
        y1 = new Panel();
        y1.setLayout(new BorderLayout());
        y1c = new Panel();
        y1c.setLayout(new GridLayout(2,2));
        name = new Label("Name", Label.CENTER);
        pin = new Label("Pin", Label.CENTER);
        n = new TextField(20);
        p = new TextField(20);
        yn = new Panel();
        yp = new Panel();
        y1c.add(name);
        y1c.add(pin);
        yn.add(n);
        y1c.add(yn);
        yp.add(p);
        y1c.add(yp);
        y1.add(y1c, BorderLayout.CENTER);
        y1s = new Panel();
        a = new Button("Add");
        e = new Button("Edit");
        d = new Button("Delete");
        q = new Button("Quit");
        a.addActionListener(this);
        e.addActionListener(this);
        d.addActionListener(this);
        q.addActionListener(this);
        y1s.add(a);
        y1s.add(e);
        y1s.add(d);
        y1s.add(q);
        y1.add(y1s,BorderLayout.SOUTH);
        x.add(y1);
        y2 = new Panel();
        int size = u.size();
        String[][] data = new String[size][2];
        for(int i=0; i<size; i++){
            User a = u.get(i);
            data[i][0] = a.getName();
            data[i][1] = ""+a.getPin();
        }
        String[] columnNames = { "Name", "Pin" };
        z = new DefaultTableModel(data, columnNames);
        z1 = new JTable(z);
        JScrollPane sp = new JScrollPane(z1);
        y2.add(sp);
        x.add(y2);
        x.setVisible(true);
    }
    public static void main(String[] args) {
        try{
            Scanner su = new Scanner(new File("user.txt"));
            u = new ArrayList<User>();
            while(su.hasNext()){
                String a = su.nextLine();
                int b = Integer.parseInt(su.nextLine());
                su.nextLine();
                User x = new User(a,b);
                u.add(x);
            }
        } catch(Exception e){
            u = new ArrayList<User>();
        }        
        new NewMain();
    }    

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==q){
            try{
                PrintWriter p1 = new PrintWriter("user.txt");
                for(int i=0; i<u.size(); i++){
                    User a = u.get(i);
                    p1.println(a.getName());
                    p1.println(a.getPin()+"\n");
                }
                p1.close();
                System.exit(0);
            } catch(Exception ex){
                
            }            
        } else if(ae.getSource()==a){
            String name = n.getText();
            boolean found = false;
            for(int i=0; i<u.size(); i++){
                User a = u.get(i);
                if(name.equals(a.getName())){
                    found = true;
                    break;
                }
            }
            if(!found){
                String pin = p.getText();
                User a = new User(name,Integer.parseInt(pin));
                u.add(a);
                DefaultTableModel model = (DefaultTableModel) z1.getModel();
                model.addRow(new Object[]{name,pin});
            } else{
                JOptionPane.showMessageDialog(x,"User exists!");
            }
        } else if(ae.getSource()==e){
            User current = null;
            String name = n.getText();
            boolean found = false;
            int i = 0;
            for(i=0; i<u.size(); i++){
                User a = u.get(i);
                if(name.equals(a.getName())){
                    found = true;
                    current = a;
                    break;
                }
            }
            if(found){
                String pin = p.getText();
                current.setPin(Integer.parseInt(pin));
                DefaultTableModel model = (DefaultTableModel) z1.getModel();
                model.setValueAt(pin,i,1);
            } else{
                JOptionPane.showMessageDialog(x,"User not exists!");
            }
        } else{
            User current = null;
            String name = n.getText();
            boolean found = false;
            int i = 0;
            for(i=0; i<u.size(); i++){
                User a = u.get(i);
                if(name.equals(a.getName())){
                    found = true;
                    current = a;
                    u.remove(a);
                    break;
                }
            }
            if(found){
                DefaultTableModel model = (DefaultTableModel) z1.getModel();
                model.removeRow(i);
            } else{
                JOptionPane.showMessageDialog(x,"User not exists!");
            }
        }
    }
}
