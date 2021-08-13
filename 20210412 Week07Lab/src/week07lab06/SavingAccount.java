package week07lab06;
public class SavingAccount extends Account{
    public SavingAccount(int number, double balance, double annualRate) {
        super(number, balance, annualRate);
    }
//    public SavingAccount(){
//        super();
//    }   
//    public void withdraw(double amt){
//        if(amt>balance){
//            System.out.println("You don't have enough balance!");
//        } else{
//            balance = balance-amt;
//        }
//    }
//    public String toString(){
//        return number+", your balance is RM"+balance+"!";
//    }
}
