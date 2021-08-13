package polymorphism;
import week07lec.DegreeStudent;
import week07lec.DiplomaStudent;
import week07lec.Student;
public class Reason {
    public static void main(String[] args) {
        DegreeStudent a = new DegreeStudent("Lew",59638);
        DiplomaStudent b = new DiplomaStudent("Balraaj",54014);
        printing(a);
        printing(b);
    }    
    public static void printing(Student a){
        if(a instanceof DegreeStudent){
            DegreeStudent a1 = (DegreeStudent)a;
            a1.setLevel(2);
        }
        System.out.println(a);
    }
//    public static void printing(DegreeStudent a){}
//    public static void printing(DiplomaStudent a){}
}
