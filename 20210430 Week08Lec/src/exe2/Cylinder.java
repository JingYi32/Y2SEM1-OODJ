package exe2;
public class Cylinder extends GeometricObject{
    private double height;
    public Cylinder(double x, double y){
        radius = x;
        height = y;
    }
    public void howToColor(){
        System.out.println("I like black!");
    }
    //public abstract double getArea();
    public double getArea(){
        return Math.PI*Math.pow(radius, 2)*2+
                2*Math.PI*radius*height;
    }
    public double getVolume(){
        return Math.PI*Math.pow(radius, 2)*height;
    }
    public String toString(){
        return super.toString()+"\nVolume\t: "+getVolume()+"\n";
    }
    public int compareTo(Object a){
        System.out.println("APU");
        Cylinder b = (Cylinder)a;
        if(getVolume()>b.getVolume()){
            return 1;
        } else if(getVolume()<b.getVolume()){
            return -1;
        } else{
            return 0;
        }
    }
}
