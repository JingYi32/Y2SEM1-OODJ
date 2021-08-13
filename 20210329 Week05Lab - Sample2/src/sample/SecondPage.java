package sample;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class SecondPage extends JFrame implements ActionListener {
    private Button book, pay, logout;
    public SecondPage(){
        setSize(250,100);
        setLocation(1000,300);
        setLayout(new FlowLayout());
        book = new Button("Book");
        pay = new Button("Pay");
        logout = new Button("Logout");
        book.addActionListener(this);
        pay.addActionListener(this);
        logout.addActionListener(this);
        add(book);
        add(pay);
        add(logout);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==logout){
            setVisible(false);
            Sample.first.setVisible(true);
            Sample.current = null;
        } else if(e.getSource()==book){
            //make sure login user can book
            //must pay the previous booking
            int size = Sample.current.getMyBooking().size();
            if(size==0 || Sample.current.getMyBooking().get(size-1).isPaid()){
                int id = 10001;
                int allSize = Sample.allBooking.size();
                id = id+allSize;
                try{
                    String b = JOptionPane.showInputDialog("Hall:");
                    Hall b1 = Hall.valueOf(b);
                    String c = JOptionPane.showInputDialog("Day");
                    Day c1 = Day.valueOf(c);
                    int d = Integer.parseInt(JOptionPane.showInputDialog("Time:"));
                    if(d<9 || d>23){
                        throw new Exception();
                    }
                    boolean flag = true;
                    for(int i=0; i<Sample.allBooking.size(); i++){
                        Booking z = Sample.allBooking.get(i);
                        if(b.equals(z.getHall().toString()) && 
                                c.equals(z.getDay().toString()) &&
                                d==z.getTime()){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        Booking y = new Booking(id,b1,c1,d,false,Sample.current);
                        Sample.current.getMyBooking().add(y);
                        Sample.allBooking.add(y);
                        JOptionPane.showMessageDialog(book,"ID: "+id);
                    } else{
                        JOptionPane.showMessageDialog(book,"Booking not available!");
                    }
                } catch(Exception ex){
                    JOptionPane.showMessageDialog(book, "Wrong input!");
                }
            } else{
                JOptionPane.showMessageDialog(book,"You have unpaid booking!");
            }
        } else{
            
        }
    }
}
