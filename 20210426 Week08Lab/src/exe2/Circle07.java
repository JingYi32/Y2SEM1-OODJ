package exe2;
public class Circle07 implements GeometricObjectLab07 {
    private double radius;
    public Circle07(double x) {
        radius = x;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }    
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public String toString(){
        return "Radius\t\t: "+radius+
                "\nArea\t\t: "+getArea()+
                "\nPerimeter\t: "+getPerimeter()+"\n";
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double x){
        radius = x;
    }
}
