package javaapplication379;
import java.util.Scanner;
public class JavaApplication379 {
    public static void main(String[] args) {
        String[] name = {"Balraaj", "Wang"};
        double[] balance = {100,500};
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String input = s.nextLine();
        boolean flag = false;
        int counter = -1;
        for(int i=0; i<name.length; i++){
            if(input.equals(name[i])){
                flag = true;
                counter = i;
                break;
            }
        }
        if(flag){
            System.out.print("Enter deposit amount: ");
            int amt = Integer.parseInt(s.nextLine());
            balance[counter] = balance[counter] + amt;
            System.out.println(name[counter]+
                    ", your new balance is RM"+balance[counter]+"!");
        } else{
            System.out.println("User not found!");
        }
    }    
}
