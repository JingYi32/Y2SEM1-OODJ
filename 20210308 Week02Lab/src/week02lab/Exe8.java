//Write a program that sum up all the values in double typed of an array. 
//The array capacity is 100. You are required to use for-each construct (enhanced for).
package week02lab;
public class Exe8 {
    public static void main(String[] args) {
        int[] x = {5,9,6,1,5};  //26
        int total = 0;
        
//        for(int i=0; i<x.length; i++){
//            total = total+x[i];
//        }
        for(int i : x){
            total = total+i;
        }
        System.out.println(total);
    }    
}
