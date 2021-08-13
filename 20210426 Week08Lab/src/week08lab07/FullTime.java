package week08lab07;
public class FullTime extends Employee implements Payable {
    private int rate;   //salary per hour
    public FullTime(String x, int y){
        name = x;
        hour = 40;
        rate = y;
    }
    public int getMonthlyHour(){
        return hour*4;
    }
    public double getMonthlySalary(){
        return getMonthlyHour()*rate;
    }
    public String toString(){
        return super.toString()+"\nYou earn RM"
                +getMonthlySalary()+" this month!";
    }
}
