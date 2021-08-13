package week03lab;
public class Week03Lab {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setId(1222);
        a1.setBalance(20000);
        a1.setAnnualRate(4.5);
        System.out.println(a1.getId()+", you have RM"+a1.getBalance());
        a1.withdraw(2500);
        //20000-2500 = 17500
        System.out.println(a1.getId()+", you have RM"+a1.getBalance());
        //17500*4.5/12/100 = 65.625
        System.out.println("Interest: "+
                (a1.getBalance()*a1.getMonthlyRate()/100));
        a1.deposit(3000);
        //17500 + 3000 = 20500
        System.out.println(a1.getId()+", you have RM"+a1.getBalance());
        //20500*4.5/12/100 = 76.875
        System.out.println("Interest: "+
                (a1.getBalance()*a1.getMonthlyRate()/100));
    }    
}
