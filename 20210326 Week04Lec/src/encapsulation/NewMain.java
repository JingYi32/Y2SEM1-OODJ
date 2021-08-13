package encapsulation;
public class NewMain {
    public static void main(String[] args) {
        Customer c = new Customer("Poon",5000,60397);
        System.out.println(c);
        c.name = "Bong";        //accessed directly
        System.out.println(c);
        //c.balance = 0;
        c.setBalance(0);        //accessed indirectly
        System.out.println(c);
    }    
}
