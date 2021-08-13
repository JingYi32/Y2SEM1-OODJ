package exe2;
public class ResizableCircle extends Circle07 implements Resizable{
    public ResizableCircle(double x){
        super(x);
    }
    public void resize(int x){
        setRadius(getRadius()*(1+x/100.0));
    }
}
