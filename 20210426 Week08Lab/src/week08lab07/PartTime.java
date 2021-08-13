package week08lab07;
public class PartTime extends Employee implements Payable {
    private int rate;   //salary per hour
    public PartTime(String x, int y, int z){
        name = x;
        hour = y;
        rate = z;
    }
    public int getMonthlyHour(){
        return hour*3;
    }
    public double getMonthlySalary(){
        return getMonthlyHour()*rate*1.2;
    }
    public String toString(){
        return super.toString()+"\nYou earn RM"
                +getMonthlySalary()+" this month!";
    }
}
