package week12;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Lab09Exe2 {
    public static void main(String[] args) {
        //String a = "I LOVE APU";
        String a = "I@LOVE APU#and today%is Monday";
        Scanner b1 = new Scanner(a);
        while(b1.hasNext()){
            System.out.println(b1.next());
        }
        System.out.println();
        StringTokenizer c1 = new StringTokenizer(a,"@ #%");
        while(c1.hasMoreTokens()){
            System.out.println(c1.nextToken());
        }
    }    
}
