package assignment.com.app.grade;

public class TestGrade {
    public static void main(String[] args) {
        StudentOpreation sop=new StudentOpreation();

        Student s1= new Student(1,35.35f,"Rama");
        Student s2= new Student(2,92f,"Rama");
        Student s3= new Student(3,98f,"Rama");
        Student s4= new Student(4,90f,"Rama");
        Student s5= new Student(5,89.35f,"Rama");
        Student s6= new Student(6,70f,"Rama");

        sop.addStudent(s2);
        sop.addStudent(s3);
        sop.addStudent(s4);
        sop.addStudent(s1);
     //   sop.addStudent(s5);

        sop.getGrade(s4);
      //  sop.addStudent(s1);
       // sop.getGrade(s1);
    }

}
