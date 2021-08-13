package week07lec;
public class DegreeStudent extends Student{
//    protected String name;
//    private int id;   
//    public int getId(){
//        return id;
//    }    
    private int level;
    public DegreeStudent(String x, int y, int z){
        super(x,y);
        //name = x;
        //id = y;   //cannot access
        level = z;
    }
    public DegreeStudent(String name, int id) {
        super(name, id);
        level = 1;
    }
//    public String toString(){
//        return "Hello "+name+" ("+getId()+")!\n";
//    }
    public String toString(){
        return super.toString()+"You are a Level "+level+" student!\n";
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
}
