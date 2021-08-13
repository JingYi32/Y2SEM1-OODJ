package exe4;
public class NotEnoughBalance extends Exception{
    public NotEnoughBalance(String x, double y){
        super("Sorry "+x+", you are less of RM"+y+"!");
    }
}
