package week07lab;
public class CheckingAccount extends Account{
    private double overdraft;
    public CheckingAccount(int a, double b, double c, double d){
        number = a;
        balance = b;
        rate = c;
        overdraft = d;
    }
    public void withdraw(double amt){
        if(amt>(balance+overdraft)){    //7000>(5000+1000)
            System.out.println("Not enough overdraft!");
        } else if(amt>balance){         //5500>5000
            overdraft = overdraft-(amt-balance);
            balance = 0;
            System.out.println("Not enough balance!");
        } else{
            balance = balance-amt;
        }
    }
    public String toString(){
        return super.toString()+"Your overdraft is RM"+overdraft+"!\n";
    }
}
