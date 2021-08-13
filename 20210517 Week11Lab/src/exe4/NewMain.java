package exe4;
public class NewMain {
    public static void main(String[] args) {
        Account a = new Account("Ibrahima",500);
        System.out.println(a);
        System.out.println("Withdraw 2000!");
        try{
            a.withdraw(2000);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch(NotEnoughBalance e){
            System.out.println(e.getMessage());
        }
        System.out.println(a);
    }    
}
