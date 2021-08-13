package week08lab07;
public class Assistant extends Employee{
    public Assistant(String x){
        name = x;
        hour = 2;
    }
    public int getMonthlyHour(){
        return hour*4;
    }
}
