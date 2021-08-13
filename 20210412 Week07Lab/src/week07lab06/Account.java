package week07lab06;
public class Account {
    protected int number;
    protected double balance;
    protected double annualRate;
    public Account(int number, double balance, double annualRate) {
        this.number = number;
        this.balance = balance;
        this.annualRate = annualRate;
    }
    public void deposit(double amt){
        balance = balance+amt;
    }
    public void withdraw(double amt){
        if(amt>balance){
            System.out.println("You don't have enough balance!");
        } else{
            balance = balance-amt;
        }
    }
    public String toString(){
        return number+", your balance is RM"+balance+"!";
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAnnualRate() {
        return annualRate;
    }
    public void setAnnualRate(double annualRate) {
        this.annualRate = annualRate;
    }    
}
