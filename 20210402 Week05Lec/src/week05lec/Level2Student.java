package week05lec;
public class Level2Student extends Student 
{
//    String name;
//    double balance;
//    constructor is not inherited
//    public String toString(){
//        return name+", you have RM"+balance+"!";
//    }    
    //Java gives default constructor
    public Level2Student(){super();}
    int oodj;
    public Level2Student(String x, double y, int z){
        //super();
        name = x;
        balance = y;
        oodj = z;
    }
    public String toString(){
        return super.toString()+"\nYour OODJ result is "+oodj+".";
    }
}
