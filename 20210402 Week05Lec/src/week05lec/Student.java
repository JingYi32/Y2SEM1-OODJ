package week05lec;
public class Student //extends Object
{
    String name;
    double balance;
    //Java gives default constructor
    public Student(){super();}
    //default constructor will be removed 
    //when you code one constructor by yourself
    public Student(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public String toString(){
        return "Hello "+name+", you have RM"+balance+"!";
    }
}
