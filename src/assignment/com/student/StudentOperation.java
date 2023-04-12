package assignment.com.student;

public class StudentOperation {
    Students StudentsArray []= new Students[5];
    int top =-1;



    public void addStudentDetails(Students students){
        if( top==-1){
            StudentsArray[++top]=students;
            top++;
        }

    }

    void fetchStudentAll(){

        for(int i=0;i<top;i++){
            System.out.println(StudentsArray[i]);

        }

    }
    void  StudentDetails(Students students){
        int i;
        for(i=0;i<=top;i++){
           // if(StudentsArray[i].equals(((Students)students).getPassword());
            {
                System.out.println(StudentsArray[i]);
                break;
            }
        }
        if(i==top){
            System.out.println("Student not found !!");
        }

    }

}
