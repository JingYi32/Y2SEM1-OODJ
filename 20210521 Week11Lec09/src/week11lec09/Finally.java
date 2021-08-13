/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11lec09;

/**
 *
 * @author guan.kiat
 */
public class Finally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(method1());
    }
    public static int method1(){
        try{
            if(20>11){
                throw new Exception();
            }
            return 10;
        } catch(Exception e){
            return -10;
        } finally{
            System.out.println("Hello");
        }
    }
}
