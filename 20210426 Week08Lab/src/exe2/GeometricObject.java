package exe2;
public abstract class GeometricObject implements Comparable {
    protected double radius;
    @Override
    //Circle x,y;   //x.compareTo(y);
    public int compareTo(Object o) {
        //System.out.println("APU");
        GeometricObject a = (GeometricObject)o;
        if(radius>a.radius){    //x radius > y radius
            return 1;
        } else if(radius<a.radius){
            return -1;
        } else{
            return 0;
        }
    }
    public abstract double getArea();
    public String toString(){
        return "\nRadius\t: "+radius+
                "\nArea\t: "+getArea()+"\n";
    }
}
