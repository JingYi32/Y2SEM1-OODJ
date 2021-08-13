//Write a program that prompts the user to enter assignment marks and displays the grade of the keyed in marks. 
package week02lab;
import java.util.Scanner;
public class Exe7 {
    public static void main(String[] args) {
        System.out.print("Enter your OODJ result: ");
        Scanner s = new Scanner(System.in);
        String x = s.nextLine();
        int result = Integer.parseInt(x);
        if(result>100){
            System.out.println("Error");
        } else if(result>79){
            System.out.println("A+");
        } else if(result>74){
            System.out.println("A");
        } else if(result>69){
            System.out.println("B+");
        } else if(result>64){
            System.out.println("B");
        } else if(result>59){
            System.out.println("C+");
        } else if(result>54){
            System.out.println("C");
        } else if(result>49){
            System.out.println("C-");
        } else if(result>39){
            System.out.println("D");
        } else if(result>29){
            System.out.println("F+");
        } else if(result>19){
            System.out.println("F");
        } else if(result>=0){
            System.out.println("F-");
        } else{
            System.out.println("Error");
        }            
    }    
}
