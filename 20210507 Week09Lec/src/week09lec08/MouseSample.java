package week09lec08;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class MouseSample implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {        
    }
    @Override
    public void mousePressed(MouseEvent e) {
    }
    @Override
    public void mouseReleased(MouseEvent e) {
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("She loves me!");
    }
    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("She doesn't love me");
    }    
}
