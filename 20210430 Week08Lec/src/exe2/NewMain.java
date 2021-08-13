package exe2;
import java.util.TreeSet;
public class NewMain {
    public static void main(String[] args) {
//        Circle x = new Circle(7);
//        Circle y = new Circle(10);
//        Circle z = new Circle(3);
        Cylinder x = new Cylinder(7,10);
        Cylinder y = new Cylinder(10,2);
        Cylinder z = new Cylinder(3,50);
        TreeSet s = new TreeSet();  //array but no duplicates
        //auto sorting
        // x.compareTo(y); & x.compareTo(z); & y.compareTo(z);
        s.add(x);
        s.add(y);
        s.add(z);
        System.out.println(s);
    }    
}
