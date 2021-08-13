package week11lab09;
public class Week11Lab09 {
    public static void main(String[] args) {
        int[] x = new int[10];                  //index from 0 to 9
        for(int i=0; i<10; i++){
            x[i] = (int)(Math.random()*100);    //0 to 99
        }
        try{
            for(int i=0; i<11; i++){
                System.out.println(x[i]);
            }
            System.out.println("END of TRY");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("CATCH");
        }
        System.out.println("DONE");
    }    
}
