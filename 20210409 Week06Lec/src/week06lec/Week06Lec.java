package week06lec;
public class Week06Lec {
    public static void main(String[] args) {
        TextBook t = new TextBook();
        Student s = new Student(12345,"0123456789",t);
        TextBook a = new TextBook();
        s.setTextBook(a);
    }  
    public static void restockPaper(){
        //.....
        printReceipt(); //<<include>>
        //.....
    }
    public static void withdrawCash(){
        boolean wantToPrint = false;
        if(wantToPrint){
            printReceipt(); //<<extend>>
        }
    }
    public static void printReceipt(){}
}
