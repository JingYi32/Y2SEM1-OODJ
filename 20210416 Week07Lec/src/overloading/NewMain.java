package overloading;
public class NewMain {
    public static void main(String[] args) {
        method1("APU",100); //APU100
        method1(7,11);      //18
        method1(7);         //700
        method1(11,"APU");  //APU1100
    }   
    public static void method1(String x, int y){
        System.out.println(x+y);
    }
    public static void method1(int x, int y){
        System.out.println(x+y);
    }
    public static void method1(int x){
        System.out.println(x*100);
    }
    public static void method1(int x, String y){
        System.out.println(y+(x*100));
    }
}
