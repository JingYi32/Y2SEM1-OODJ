package week11lec09;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ManyMethods {
    public static void main(String[] args) {
        try{
            method1();
        }catch(FileNotFoundException e){
            System.out.println("Error");
        }
    }
    public static void method1() throws FileNotFoundException{
        method2();
    }
    public static void method2() throws FileNotFoundException{
        //try{
            method3();
//        }catch(Exception e){
//            System.out.println("Error");
//        }
    }
    public static void method3() throws FileNotFoundException{
        //try{
            Scanner s = new Scanner(new File("Hello.txt"));
            int a = Integer.parseInt("I LOVE APU!");
        //} catch(Exception e){
        //    System.out.println("Error");
        //}
    }
}
