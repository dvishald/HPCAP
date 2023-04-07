package assignment.com.app.grade;

import assignment.com.app.vehicle.exception.DuplicateVehicalException;

public class StudentOpreation {

    Student studentArray[]= new Student[6];

    int top=-1;

      public void getGrade(Student std){
          for(int i=0;i<=top;i++){

              if(studentArray[i].getMarks()>95){
                  System.out.println("Grade A");
              }

              else if (studentArray[i].getMarks()>90) {
                  System.out.println("Grade B");

              }
              else if (studentArray[i].getMarks()>80) {
                  System.out.println("Grade C");

              }
              else if (studentArray[i].getMarks()<80) {
                  System.out.println("Grade D");

              }

          }
      }

      public  void addStudent(Student std){
                  studentArray[++top] = std;
          }

}