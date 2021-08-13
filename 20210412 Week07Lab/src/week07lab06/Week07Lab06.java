package week07lab06;
public class Week07Lab06 {
    public static void main(String[] args) {
        CheckingAccount y = new CheckingAccount(500,54321,3000,1.5);
        System.out.println(y);
//        System.out.println("Withdraw 4800!");
//        y.withdraw(4800);
//        System.out.println(y);//3000&500

//        System.out.println("Withdraw 3100!");
//        y.withdraw(3100);
//        System.out.println(y);//0&400

        System.out.println("Withdraw 1800!");
        y.withdraw(1800);
        System.out.println(y);//1200&500
        
        SavingAccount x = new SavingAccount(12345,5000,1.5);
        System.out.println(x);
        System.out.println("Deposit 500!");
        x.deposit(500);
        System.out.println(x);//5500
        System.out.println("Withdraw 4800!");
        x.withdraw(4800);
        System.out.println(x);//700
        System.out.println("Withdraw 1000!");        
        x.withdraw(1000);
        System.out.println(x);//700
    }    
}
