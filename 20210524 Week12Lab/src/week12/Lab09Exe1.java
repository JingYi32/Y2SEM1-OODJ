package week12;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Lab09Exe1 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new File("lab9e1.txt"));
        int l=0,w=0,c=0;
        while(s.hasNext()){
            String a = s.nextLine();
            l++;
            Scanner s1 = new Scanner(a);
            while(s1.hasNext()){
                String b = s1.next();
                w++;
                c = c+b.length();
            }
        }
        System.out.println("Line: "+l+"\t"+"Word: "+w+"\t"+"Character: "+c);
    }    
}
