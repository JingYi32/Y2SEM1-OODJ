package week04lec;
public class Student {
    private String name;
    private Car myCar;
    public Student(String name, String x) {
        this.name = name;
        myCar = new Car(x);
    }
    public String toString(){
        //+ if one operand is String, 
        //another operand will be converted to String automatically
        return "Hello "+name+".\n"+myCar;
    }
}
