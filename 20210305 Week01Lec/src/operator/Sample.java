package operator;
public class Sample {
    public static void main(String[] args) {
        //unary
        int i = 1;
        System.out.println(i++);
        //binary
        System.out.println(1+2);
        //ternary -> ?:
        double y = 10.1;
        double z = 19.9;
        int x = y > z ? 1 : -1;
        System.out.println(x);
    }    
}
