package exe2;
public //abstract
        class Circle extends GeometricObject{
    public Circle(double x){
        radius = x;
    }
    //public abstract double getArea();
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }
    public void howToColor(){
        System.out.println("I like white!");
    }
}
