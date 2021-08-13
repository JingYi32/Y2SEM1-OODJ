package exe2;
public class Circle extends GeometricObject{
    public Circle(double x) {
        radius = x;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }
}
