package sample;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Page1 extends JFrame implements ActionListener { //IS-A
    private Button register, login, end;
    public Page1(){
        setSize(250,100);
        setLocation(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        register = new Button("Register");
        login = new Button("Login");
        end = new Button("End");
        //this == first in Sample program
        register.addActionListener(this);
        login.addActionListener(this);
        end.addActionListener(this);
        add(register);
        add(login);
        add(end);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==end){
            String input = JOptionPane.showInputDialog("Enter password:");
            if(input.equals("12345")){
                try{
                    PrintWriter p = new PrintWriter("customer.txt");
                    for(int i=0; i<Sample.allCustomer.size(); i++){
                        Customer c = Sample.allCustomer.get(i);
                        p.println(c.getName());
                        p.println(c.getPin());
                        p.println();
                    }
                    p.close();
                    p = new PrintWriter("booking.txt");
                    for(int i=0; i<Sample.allBooking.size(); i++){
                        Booking b = Sample.allBooking.get(i);
                        p.println(b.getId());
                        p.println(b.getHall());
                        p.println(b.getDay());
                        p.println(b.getTime());
                        p.println(b.isPaid());
                        p.println(b.getOwner().getName());
                        p.println();
                    }
                    p.close();
                    System.exit(0);
                } catch(Exception ex){
                    System.out.println("Error in output!");
                }
            } else{
                JOptionPane.showMessageDialog(end,"Wrong password!");
            }
        } else if(e.getSource()==register){
            String a = JOptionPane.showInputDialog("Name:");
            boolean flag = true;
            for(int i=0; i<Sample.allCustomer.size(); i++){
                Customer c = Sample.allCustomer.get(i);
                if(a.equals(c.getName())){
                    flag = false;
                    break;
                }
            }
            if(flag){
                int b = Integer.parseInt(JOptionPane.showInputDialog("Pin:"));
                Customer c = new Customer(a,b);
                Sample.allCustomer.add(c);
            } else{
                JOptionPane.showMessageDialog(register,"Name has been used!");
            }
        } else{ //login 
            Sample.current = null;
            System.out.println("Testing");
            String input = JOptionPane.showInputDialog("Username:");
            for(int i=0; i<Sample.allCustomer.size(); i++){
                Customer c = Sample.allCustomer.get(i);
                if(input.equals(c.getName())){
                    Sample.current = c;
                    break;
                }
            }
            if(Sample.current==null){
                JOptionPane.showMessageDialog(login,"Wrong username!");
            } else{
                input = JOptionPane.showInputDialog("Pin:");
                if(Integer.parseInt(input)==Sample.current.getPin()){
                    setVisible(false);
                    Sample.gui2.setVisible(true);
                } else{
                    JOptionPane.showMessageDialog(login,"Wrong password!");
                    Sample.current = null;
                }
            }
        }
    }
}
