package New;
public class User {
    private String name;
    private int pin;
    public User(String x, int y){
        name = x;
        pin = y;
    }
    public String getName() {
        return name;
    }
    public int getPin() {
        return pin;
    }  
    public void setPin(int pin) {
        this.pin = pin;
    }    
}
