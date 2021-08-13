package week08lab07;
public class Week08Lab07 {
    public static void main(String[] args) {
        //Employee a1 = new Employee();
        Employee a2 = new FullTime("Poon",100); //160,16000
        System.out.println(a2);
        Employee a3 = new PartTime("Ibrahim",10,150); //30,5400
        System.out.println(a3);
        Employee a4 = new Assistant("Jeffrey"); //8
        System.out.println(a4);
    }    
}
