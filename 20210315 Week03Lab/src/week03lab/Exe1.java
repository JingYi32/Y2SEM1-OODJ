package week03lab;
public class Exe1 {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setId(58965);
        a1.setBalance(500);
        Account a2 = new Account();
        a2.setId(55701);
        a2.setBalance(1000);
        Account a3 = new Account();
        a3.setId(59563);
        a3.setBalance(300);
        System.out.println(a1.getId()+", you have RM"+a1.getBalance());
        System.out.println(a2.getId()+", you have RM"+a2.getBalance());
        System.out.println(a3.getId()+", you have RM"+a3.getBalance());
        a1.university = "APIIT";
        System.out.println(a1.getId()+", you are a "+a1.university+" student.");
        System.out.println(a2.getId()+", you are a "+a2.university+" student.");
        System.out.println(a3.getId()+", you are a "+a3.university+" student.");
        a2.university = "APU";
        System.out.println(a1.getId()+", you are a "+a1.university+" student.");
        System.out.println(a2.getId()+", you are a "+a2.university+" student.");
        System.out.println(a3.getId()+", you are a "+a3.university+" student.");
    }    
}
