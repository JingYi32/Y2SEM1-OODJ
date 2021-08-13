package week08lab07;
public abstract class Employee {
    //abstract method only can exist in abstarct class
    //abstract class can have both abstarct method and concrete method
    protected String name;
    protected int hour;     //per week
    public abstract int getMonthlyHour();   //cannot be accessed
    //public abstract int getMonthlyHour(){}
    public String toString(){
        return "\n"+name+", you work "+getMonthlyHour()+" hours this month!";
    }
}
