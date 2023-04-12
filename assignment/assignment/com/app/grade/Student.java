package assignment.com.app.grade;

public class Student {

      int roll_no;
   private   float marks;
     String name;

    public Student(int roll_no, float marks, String name) {
        this.roll_no = roll_no;
        this.marks = marks;
        this.name = name;
    }


  public  String toString(){
      return "Roll no: "+roll_no+" Name: "+ name+" Marks: "+ marks;
  }

    public float getMarks() {
        return marks;
    }
}
