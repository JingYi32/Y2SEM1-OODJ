package week11lec09;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class CheckedException {
    public static void main(String[] args) throws IOException 
    {
        try{
            Scanner s = new Scanner(new File("Hello.txt"));
        }catch(FileNotFoundException e){
            System.out.println("File not found!");
        }
    }    
}
