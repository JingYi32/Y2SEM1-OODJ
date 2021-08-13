package week02lab;
import java.util.Scanner;
public class Week02Lab {
    public static void main(String[] args) {
        System.out.print("Enter +ve integer value (maximum 9 digits): ");
        Scanner s = new Scanner(System.in);
        String x = s.nextLine();
        int input = Integer.parseInt(x);
        int total=0;
        while(input>0){
            total = total+input%10;
            input = input/10;
        }
        System.out.println(total);
    }    
}
