package exe2;
import java.util.TreeSet;
public class NewMain {
    public static void main(String[] args) {
        Circle a = new Circle(7);
        Circle b = new Circle(10);
        Circle c = new Circle(3);

        TreeSet x = new TreeSet();  //no duplicate + auto sorted
        x.add(a);
        x.add(b);
        x.add(c);
        System.out.println(x);
    }    
}
