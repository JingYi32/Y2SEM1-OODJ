package lab10;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class ReadBinaryFile {
    public static void main(String[] args) {
        try{
            ObjectInputStream b = new ObjectInputStream(
                                new FileInputStream("data.dat"));
            Account[] a = (Account[])b.readObject();
            b.close();
            for(int i=0; i<a.length; i++){
                System.out.println(a[i]);
            }
        } catch(Exception e){
            System.out.println("Error");
        }
    }    
}
