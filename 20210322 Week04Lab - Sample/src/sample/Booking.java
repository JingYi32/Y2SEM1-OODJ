package sample;
public class Booking {
    private int id;     //auto generate sequencially - 10001 / cannot duplicate
    private Hall hall;
    private Day day;
    private int time;   //24
    private boolean paid;   
    //default is false for new booking
    // but those from txt file might be paid
    private Customer owner;
    public Booking(int id, Hall hall, Day day, int time,boolean a, Customer owner) {
        this.id = id;
        this.hall = hall;
        this.day = day;
        this.time = time;
        this.paid = a;
        this.owner = owner;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Hall getHall() {
        return hall;
    }
    public void setHall(Hall hall) {
        this.hall = hall;
    }
    public Day getDay() {
        return day;
    }
    public void setDay(Day day) {
        this.day = day;
    }
    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }
    public boolean isPaid() {
        return paid;
    }
    public void setPaid(boolean paid) {
        this.paid = paid;
    }
    public Customer getOwner() {
        return owner;
    }
    public void setOwner(Customer owner) {
        this.owner = owner;
    }    
}
