package exe2;
public abstract class GeometricObject implements Comparable, Colorable {
    //x.compareTo(y);
    public int compareTo(Object a){ //a = y
        System.out.println("APU");
        GeometricObject b = (GeometricObject)a;
        if(radius>b.radius){
            return 1;
        } else if(radius<b.radius){
            return -1;
        } else{
            return 0;
        }
    }
    //public void howToColor();
    protected double radius;
    public abstract double getArea();
    public String toString(){
        return "\nRadius\t: "+radius+"\nArea\t: "+getArea();
    }
}
