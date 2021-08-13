package week07lec;
public class Student {
    protected String name;
    private int id;
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }    
    public int getId(){
        return id;
    }
    public String toString(){
        return "Hello "+name+" ("+getId()+")!\n";
    }
}
