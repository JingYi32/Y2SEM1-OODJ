package polymorphism;
import java.util.Scanner;
import week07lec.DegreeStudent;
import week07lec.Student;
public class Sample {
    public static void main(String[] args) {
        int x = 7;
        long y = 7L;
        y = x;
        //x = y;
        x = (int)y;
        int x2 = 7;
        //int x3 = 7L;
        
        DegreeStudent a = new DegreeStudent("Lew",59638);
        Student b = new Student("Balraaj",54014);
        
        Student a1 = a;     //inheritance
        //Sacnner a2 = a;   //DegreeStudent extends Student
        //DegreeStudent b1 = b;     //inheritance

        Student a2 = a; //new DegreeStudent("Lew",59638);
        System.out.println(a2); //DegreeStudent toString
        //during runtime, a2 is a DegreeStudent object
        //a2.setLevel(2);   
        //during compile time, a2 is a Student variable
        DegreeStudent a3 = (DegreeStudent)a2;   //casting or cast down
        a3.setLevel(2);
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
                
        //Scanner b2 = (Scanner)b;  //Compile DegreeStudent extends Student
        //DegreeStudent b1 = (DegreeStudent)b;    //runtime
        DegreeStudent b3 = (DegreeStudent)a1;           
    }    
}
