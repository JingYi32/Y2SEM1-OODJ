//Use do-while construct, write a program that prompts the users to continue the program execution. 
//“Yes” to continue the program and “No” to terminate the program.
package week02lab;
import java.util.Scanner;
public class Exe10 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String x;
        do{
            System.out.print("Do you want to continue (Yes to continue)? ");
            x = s.nextLine();
        } while(x.equals("Yes"));
    }    
}
