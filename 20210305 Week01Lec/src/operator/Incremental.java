package operator;
public class Incremental {
    public static void main(String[] args) {
        int x=7, y=11;
        System.out.println(++x);    //increase by 1
        System.out.println(--y);    //decrease by 1
        
        int a=10, b=10;
        System.out.println("\n"+a);     //10
        System.out.println(a++); //10
        System.out.println(a);     //11
        System.out.println("\n"+b);     //10
        System.out.println(++b); //11
        System.out.println(b);     //11
    }    
}
