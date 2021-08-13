package hideimplementation;
public class Customer {
    public String name;
    public double balance;
    public int pin;
    public Customer(String name, double balance, int x) {
        this.name = name;
        this.balance = balance;
        pin = x;
    }
    public String toString(){
        return name+", you have RM"+balance+"!";
    }
}