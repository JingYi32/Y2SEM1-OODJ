package exe345;
import java.util.Date;
public class NewMain {
    public static void main(String[] args) throws Exception {
        System.out.println(new Date());
        
        for(int i=0; i<5; i++){
            Thread.sleep(5000);
            System.out.println(new Date());
        }
    }    
}
