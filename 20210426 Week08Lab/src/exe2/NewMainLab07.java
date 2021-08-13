package exe2;
public class NewMainLab07 {
    public static void main(String[] args) {
//        Circle07 x = new Circle07(11);
//        System.out.println(x);
        ResizableCircle x = new ResizableCircle(11);
        System.out.println(x);
        x.resize(50);
        System.out.println(x);
        x.resize(-10);
        System.out.println(x);
    }    
}
