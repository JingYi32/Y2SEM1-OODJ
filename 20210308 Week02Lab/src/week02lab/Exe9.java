//Suppose that the tuition of a university is RM10000 this year and this tuition fee increases 5% every year. 
//Write a program that uses a loop to compute the tuition in ten years.
package week02lab;
public class Exe9 {
    public static void main(String[] args) {
        System.out.println(10000*Math.pow(1.05,9));     //In Java, ^ is XOR
        
        double total = 0;
        double fee = 10000;
        int counter = 1;
        while(counter<=10){
            total = total+fee;
            fee = fee*1.05;
            counter++;
        }
        System.out.println(total);
    }    
}
