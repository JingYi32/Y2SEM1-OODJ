package week03lab;
public class Exe2toString {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setId(58965);
        a1.setBalance(500);
        //version 1
        System.out.println("Hello "+a1.getId()+", you have RM"+a1.getBalance());
        //version 2
        System.out.println(a1.print());
        //version 3
        System.out.println(a1);
        System.out.println(a1.toString());
    }    
}
