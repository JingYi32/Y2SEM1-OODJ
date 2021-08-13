package exe2;
import java.util.Scanner;
public class NewMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("Enter speed: ");
            //int a = Integer.parseInt(s.nextLine());
            String a = s.nextLine();
            //if else
            System.out.print("Enter on: ");
            boolean b = Boolean.parseBoolean(s.nextLine());
            System.out.print("Enter radius: ");
            double c = Double.parseDouble(s.nextLine());
            System.out.print("Enter color: ");
            String d = s.nextLine();
            try{
                Fan x = new Fan(Velocity.valueOf(a),b,c,d);
                System.out.println(x);
                break;
            } catch(Exception e){
                System.out.println("Try again");
            }
        }
    }    
}
