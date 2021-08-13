//Write a program that converts an uppercase letter to a lowercase letter. 
package week02lab;
public class Exe4 {
    public static void main(String[] args) {
        String x = "APU";       //Garbage collected
        System.out.println(x);
        x = "apu";              
        //the second object replaces the first one
        System.out.println(x);
        //In Java, String is not changable
        String y = x.toUpperCase();
        System.out.println(x);  //lower case
        System.out.println(y);  //upper case
    }    
}
