package lab10;
import java.io.Serializable;
public class Account implements Serializable{
    private String name;
    private double balance;
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public String toString(){
        return name+", you have RM"+balance+"!";
    }
}
