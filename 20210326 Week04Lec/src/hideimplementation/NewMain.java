package hideimplementation;

import java.util.Scanner;

public class NewMain {
    public static void main(String[] args) {
        Customer c = new Customer("Poon",5000,60397);
        System.out.println(c);
        modify(c);      
        System.out.println(c);
    }    
    public static void modify(Customer c){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your pin: ");
        int x = Integer.parseInt(s.nextLine());
        if(x==c.pin){
            c.balance = 0;
        } else{
            System.out.println("Go away hacker!");
        }
    }
}
