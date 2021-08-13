package week04lec;
public class Car {
    private String name;
    public Car(String name) {
        this.name = name;
    }
    public String toString(){
        return "You have a "+name+" car.";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }    
}
