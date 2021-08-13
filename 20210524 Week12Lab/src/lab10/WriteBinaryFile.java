package lab10;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class WriteBinaryFile {
    public static void main(String[] args) {
        Account[] a = {new Account("Poon",100),
                        new Account("Ibrahima",200),
                        new Account("Sarah",300)};
        try{
            ObjectOutputStream b = new ObjectOutputStream(
                                new FileOutputStream("data.dat"));
            b.writeObject(a);
            b.close();
        } catch(Exception e){
            System.out.println("Error");
        }
    }    
}
