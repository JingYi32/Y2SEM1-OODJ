package exe2;
public class Fan {
    //private int speed;  //1,2,3
    private Velocity speed;
    private boolean on;
    private double radius;
    private String color;
    public Fan(Velocity speed, boolean on, double radius, String color) {
        //if else
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public String toString(){
        return "Speed\t: "+speed+"("+speed.getValue()+")"+"\nOn\t: "+on+
                "\nRadius\t: "+radius+"\nColor\t: "+color;
    }
}
