package week09lec08;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
public class MouseMotionSample implements MouseMotionListener {
    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Dragged: "+"X: "+e.getX()+" Y: "+e.getY());
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Moved: "+"X: "+e.getX()+" Y: "+e.getY());
    }
    
}
