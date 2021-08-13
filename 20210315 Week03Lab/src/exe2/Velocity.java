package exe2;
public enum Velocity {
    VERY_FAST(4), FAST(3), MEDIUM(2), SLOW(1);
    private int value;
    private Velocity(int x){
        value = x;
    }
    public int getValue(){
        return value;
    }
}
