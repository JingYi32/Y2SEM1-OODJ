package week01lab;
import java.util.Scanner;
public class BirthYear {
    public static void main(String[] args) {
        System.out.print("Enter your birth year: ");
        Scanner s = new Scanner(System.in);
        //x = 1+2
        String input = s.nextLine();
        int year = Integer.parseInt(input);
        int age = 2021-year;
        System.out.println("You are "+age+" years old!");
        //overloaded operator
        //1+3 = 3
        System.out.println("I am "+1+1);
        //("I am "+1)+1
        //"I am 1"+1
        //I am 11
        System.out.println("I am "+(1+1));
    }    
}
