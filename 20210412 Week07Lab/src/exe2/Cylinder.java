package exe2;
public class Cylinder extends GeometricObject{
    private double height;
    public Cylinder(double x, double height) {
        radius = x;
        this.height = height;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius, 2)*2+
                2*Math.PI*radius*height;
    }
    public double getVolume(){
        return Math.PI*Math.pow(radius, 2)*height;
    }
    public String toString(){
        return super.toString()+"Volume\t: "+getVolume()+"\n";
    }
//    public int compareTo(Object o) {
//        //System.out.println("APU");
//        GeometricObject a = (GeometricObject)o;
//        if(getArea()>a.getArea()){    //x radius > y radius
//            return 1;
//        } else if(getArea()<a.getArea()){
//            return -1;
//        } else{
//            return 0;
//        }
//    }
    public int compareTo(Object o) {
        //System.out.println("APU");
        Cylinder a = (Cylinder)o;
        if(getVolume()>a.getVolume()){    //x radius > y radius
            return 1;
        } else if(getVolume()<a.getVolume()){
            return -1;
        } else{
            return 0;
        }
    }
}
