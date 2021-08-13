package week12;
import java.util.Arrays;
public class Lab09Exe3 {
    public static void main(String[] args) {
        int[] x = new int[10];
        for(int i=0; i<10; i++){
            x[i] = (int)(Math.random()*100);
            System.out.println(x[i]);
        }
        System.out.println();
        Arrays.sort(x);
        for(int i=0; i<10; i++){
            System.out.println(x[i]);
        }
    }    
}
