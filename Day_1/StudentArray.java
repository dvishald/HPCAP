package Day_1;

public class StudentArray {

    public static void main(String[] args) {

        Student s=new Student();

//        s.first_name="Teja";
//        s.last_Name="Bhai";
//        s.rollNo=5;
//        s.perc=55;

       Student s1=new Student(10,"teja","bagul",81.8f);
//        System.out.println(s1.rollNo);
//        System.out.println(s1.first_name);++++++++++++++++++++++++++


//        System.out.println(s1.last_Name);
//        System.out.println(s1.perc);

       // Student s1[]=new Student(1,"vishal","dhire",90f);

        Student s2=new Student(11,"vishal","dhire",81.8f);
        Student s3=new Student(10,"abhi","shinde",81.8f);
        Student s4=new Student(10,"adi","madame",81.8f);

        Student sArray[]= new Student[4];

        sArray[0]=s1;
        sArray[1]=s2;
        sArray[2]=s3;
        sArray[3]=s4;

        for (int i=0;i< sArray.length;i++){

            System.out.println(sArray[i]);

        }

    }
}
