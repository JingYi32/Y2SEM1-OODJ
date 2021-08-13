package week11lec09;
import java.util.Scanner;
public class NewMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true){
            int year = 0;
            try{
                System.out.print("(NEW)Enter your birth year: ");
                year = Integer.parseInt(s.nextLine());
                if(year>2020||year<1900){
                    throw new Exception();
                }
                int age = 2021-year;
                System.out.println("You are "+age+" years old!");
                break;
            } catch(Exception e){
                if(e instanceof NumberFormatException){
                    System.out.println("Enter only integer value!");
                } else{
                    System.out.println("Your birth year ("+year+") should be from 1900 to 2020!");
                }
            } 
//            catch(Exception e){
//                System.out.println("Your birth year should be from 1900 to 2020!");
//            }
        }
    }    
}
