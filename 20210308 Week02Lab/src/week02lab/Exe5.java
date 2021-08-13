//Write a program that receives an ASCII code (an integer between 0 and 128) and displays its character. 
//For example, if the user enters 97, the program displays character ‘a’.
package week02lab;
public class Exe5 {
    public static void main(String[] args) {
        char x = 'B';
        System.out.println(x);
        int y = x;
        System.out.println(y+"\n");
        y = 55;
        System.out.println(y);
        x = (char)y;
        System.out.println(x);
    }    
}
