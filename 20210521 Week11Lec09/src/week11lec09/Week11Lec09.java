package week11lec09;
import java.util.Scanner;
public class Week11Lec09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true){
            try{
                System.out.print("Enter your birth year: ");
                int year = Integer.parseInt(s.nextLine());
                if(year>2020||year<1900){
                    throw new Exception();
                }
                int age = 2021-year;
                System.out.println("You are "+age+" years old!");
                break;
            } 
            catch(NumberFormatException e){
                System.out.println("Enter only integer value!");
            } 
            catch(Exception e){
                System.out.println("Your birth year should be from 1900 to 2020!");
            }
        }
    }    
}
