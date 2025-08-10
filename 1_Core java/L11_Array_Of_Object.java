class Student{
    String name;
    int rollno;
}


public class L11_Array_Of_Object {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Kaushal";
        s1.rollno=211;
        Student s2=new Student();
        s2.name="Kaushal";
        s2.rollno=211;
        Student s3=new Student();
        s3.name="Kaushal";
        s3.rollno=211;

        Student std[]=new Student[3];
        std[0]=s1;
        std[1]=s2;
        std[2]=s3;
        for(int i=0;i<std.length;i++){
            System.out.println(std[i].name+" : "+std[i].rollno);
        }

    }
}
