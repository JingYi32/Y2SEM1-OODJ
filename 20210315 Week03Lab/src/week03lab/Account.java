package week03lab;
public class Account {
    //non-static
    private int id;
    private double balance, annualRate;
    public static String university;
    //private - can be access in the class
    //public - can be accessed anywhere
    public Account() {                  
    }
    //Constructor must have the same name as the class name, not for method.
    //Constructor cannot have return type, method must have return type
    //Constructor is accessed implicitly, method is accessed explicitly.
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    
    public double getMonthlyRate(){
        return annualRate/12;
    }
    public void withdraw(double amt){
        balance = balance-amt;
    }
    public void deposit(double amt){
        balance = balance+amt;
    }
    public String print(){
        return "Hello "+id+", you have RM"+balance+".";
    }
    public String toString(){
        return "Hello "+id+", you have RM"+balance+".";
    }
}
