package week06lec;
public class Student {
    private ID myId;
    private TextBook myBook;
    private Car myCar;      //Association no diamond
    public Student(int x, String y, TextBook z){
        myId = new ID(x,y); //Composition black diamond
        myBook = z;         //Aggregation white diamond
    }
    public void setTextBook(TextBook t){
        myBook = t;
    }
}
