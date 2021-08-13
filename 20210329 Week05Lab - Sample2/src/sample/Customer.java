package sample;
import java.util.ArrayList;
public class Customer {
    private String name;    //cannot duplicate
    private int pin;
    private ArrayList<Booking> myBooking = new ArrayList<Booking>();
    public Customer(String name, int pin) {
        this.name = name;
        this.pin = pin;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPin() {
        return pin;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
    public ArrayList<Booking> getMyBooking() {
        return myBooking;
    }
    public void setMyBooking(ArrayList<Booking> myBooking) {
        this.myBooking = myBooking;
    }    
}
