package sample;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class Sample {
    public static Page1 first = new Page1();
    public static ArrayList<Customer> allCustomer = new ArrayList<Customer>();
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
        } catch(Exception ex){
            System.out.println("Error in input!");
        }
    }    
}
