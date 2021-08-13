package exe4;
public class Account {
    private String name;
    private double balance;
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public String toString(){
        return name+", you have RM"+balance+"!";
    }
    public void withdraw(double amt)throws NotEnoughBalance{
        if(amt>balance){
            //System.out.println("You have not enough balance!");
            //throw new ArrayIndexOutOfBoundsException();
            throw new NotEnoughBalance(name,(amt-balance));
        } 
        //else{
            balance = balance-amt;
        //}
    }
}
