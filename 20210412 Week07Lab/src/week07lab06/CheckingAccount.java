package week07lab06;
public class CheckingAccount extends Account {
    private double overdraftLimit;
    public CheckingAccount(double overdraftLimit, int number, double balance, double annualRate) {
        super(number, balance, annualRate);
        this.overdraftLimit = overdraftLimit;
    }
    public void withdraw(double amt){
        if(amt>(balance+overdraftLimit)){
            System.out.println("You don't have enough overdraft!");
        } else if(amt>balance){
            System.out.println("You don't have enough balance!");
            overdraftLimit = overdraftLimit-(amt-balance);
            balance = 0;
        } else{
            balance = balance-amt;
        }
    }
    public String toString(){
        return super.toString()+
                "\nBesides, you have RM"+overdraftLimit+" overdraft!";
    }    
}
