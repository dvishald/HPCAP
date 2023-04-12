package Day_1;

public class Student {
    int rollNo;
    String first_name;

    String last_Name;

    float perc;


    Student(){}
    Student(int rn,String name,String last,float per){

        this.rollNo=rn;
        this.first_name=name;
        this.last_Name=last;
        this.perc=per;
    }
public String toString()
{
    return rollNo+" "+first_name+" "+last_Name+" "+perc;
}
}
