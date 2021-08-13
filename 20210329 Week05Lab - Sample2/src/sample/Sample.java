package sample;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class Sample {
    public static Page1 first = new Page1();
    public static SecondPage gui2 = new SecondPage();
    public static Customer current;
    public static ArrayList<Customer> allCustomer = new ArrayList<Customer>();
    public static ArrayList<Booking> allBooking = new ArrayList<Booking>();
    public static void main(String[] args) {
        try{
            Scanner s = new Scanner(new File("customer.txt"));
            while(s.hasNext()){
                String a = s.nextLine();
                int b = Integer.parseInt(s.nextLine());
                s.nextLine();
                Customer c = new Customer(a,b);
                allCustomer.add(c);
            }
            s = new Scanner(new File("booking.txt"));
            while(s.hasNext()){
                int a = Integer.parseInt(s.nextLine());
                String b = s.nextLine();
                String c = s.nextLine();
                int d = Integer.parseInt(s.nextLine());
                boolean e = Boolean.parseBoolean(s.nextLine());
                String f = s.nextLine();
                s.nextLine();
                for(int i=0; i<allCustomer.size(); i++){
                    Customer x = allCustomer.get(i);
                    if(f.equals(x.getName())){
                        Booking y = new Booking(a,Hall.valueOf(b),Day.valueOf(c),d,e,x);
                        allBooking.add(y);
                        x.getMyBooking().add(y);
                    }
                }
            }
        } catch(Exception ex){
            System.out.println("Error in input!");
        }
    }    
}
