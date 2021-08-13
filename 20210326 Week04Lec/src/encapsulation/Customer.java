package encapsulation;
import java.util.Scanner;
public class Customer {
    public String name;
    private double balance;
    private int pin;
    public Customer(String name, double balance, int x) {
        this.name = name;
        this.balance = balance;
        pin = x;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your pin: ");
        int x = Integer.parseInt(s.nextLine());
        if(x==pin){
            this.balance = balance;
        } else{
            System.out.println("Go away hacker!");
        }
    }
    public String toString(){
        return name+", you have RM"+balance+"!";
    }
}
