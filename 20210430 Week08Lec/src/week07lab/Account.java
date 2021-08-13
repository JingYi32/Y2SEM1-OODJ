package week07lab;
public class Account {
    protected int number;
    protected double balance;
    protected double rate;
    public void deposit(double amt){
        balance = balance+amt;
    }
    public void withdraw(double amt){
        if(amt>balance){
            System.out.println("Not enough balance!");
        } else{
            balance = balance-amt;
        }
    }
    public String toString(){
        return "Hello "+number+", you have RM"+balance+"!\n";
    }
}
