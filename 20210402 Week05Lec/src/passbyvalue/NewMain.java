package passbyvalue;
public class NewMain {
    public static void main(String[] args) {
        int x = 7;
        System.out.println("main before: "+x);  //(1)   7
        change(x);
        System.out.println("main after: "+x);   //(4)   7
        
        int[] y = {5,9,6,1,5};  
        System.out.println("main before: "+y[1]);  //(1)   9
        change(y);  
        //send the memory address of the array object
        System.out.println("main after: "+y[1]);   //(4)   11
    }    
    //polymorphism - many forms - overloading - overloaded + operator
    public static void change(int[] x){
        System.out.println("change before: "+x[1]);    //(2)   9
        x[1] = 11;
        System.out.println("change after: "+x[1]);     //(3)   11
    }
    public static void change(int x){
        System.out.println("change before: "+x);    //(2)   7
        x = 11;
        System.out.println("change after: "+x);     //(3)   11
    }
}
