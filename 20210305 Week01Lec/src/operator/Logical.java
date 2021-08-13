package operator;
public class Logical {
    public static void main(String[] args) {
        int x=7, y=7;
        if((x>0)|(++x>0)){          //logical operator OR
            System.out.println(x);  //8
        }
        //logical operator short circuit OR
        if((y>0)||(++y>0)){         //skip (++y>0)
            System.out.println(y);  //7
        }
    }    
}
