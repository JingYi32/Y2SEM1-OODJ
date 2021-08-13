package oo;
import java.util.Scanner;
public class NewMain {
    public static void main(String[] args) {
        Customer[] user = {new Customer("Balraaj",100),
                            new Customer("Wang",500)};
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String input = s.nextLine();
        boolean flag = false;
        int counter = -1;
        for(int i=0; i<user.length; i++){
            if(input.equals(user[i].name)){
                flag = true;
                counter = i;
                break;
            }
        }
        if(flag){
            System.out.print("Enter deposit amount: ");
            int amt = Integer.parseInt(s.nextLine());
            user[counter].balance = user[counter].balance + amt;
            System.out.println(user[counter].name+
                    ", your new balance is RM"+user[counter].balance+"!");
        } else{
            System.out.println("User not found!");
        }
    }    
}
