package week07lab;
public class Week07Lab {
    public static void main(String[] args) {
        CheckingAccount x = new CheckingAccount(54321,8000,0.1,1000);
        System.out.println(x);  //8000+1000
        System.out.println("Withdraw 7500");    //500+1000
        x.withdraw(7500);
        System.out.println(x);
        System.out.println("Withdraw 1200");    //0+300
        x.withdraw(1200);
        System.out.println(x);
        System.out.println("Withdraw 400");    //0+300
        x.withdraw(400);
        System.out.println(x);
//        SavingAccount x = new SavingAccount(12345,5000,0.5);
//        System.out.println(x);
//        System.out.println("Deposit 500");    //5500
//        x.deposit(500);
//        System.out.println(x);
//        System.out.println("Withdraw 4500");    //1000
//        x.withdraw(4500);
//        System.out.println(x);
//        System.out.println("Withdraw 2000");    //1000
//        x.withdraw(2000);
//        System.out.println(x);
    }    
}
