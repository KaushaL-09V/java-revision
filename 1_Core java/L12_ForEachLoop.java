class student123{
    String name;
    int rollno;
}
public class L12_ForEachLoop {
    public static void main(String[] args) {

        student123 s1=new student123();
        student123 s2=new student123();
        student123 s3=new student123();

        s1.name="kaushal";
        s1.rollno=211;
        s2.name="Yash";
        s2.rollno=109;
        s3.name="mihir";
        s3.rollno=190;

        student123 std[]=new student123[3];
        std[0]=s1;
        std[1]=s2;
        std[2]=s3;

        for(student123 data:std){
            System.out.println(data.name+" :"+data.rollno);
        }
//        int nums[]=new int[4];
//        nums[1]=23;
//        nums[2]=2;
//        nums[3]=3;
//
//        for(int num:nums){
//            System.out.print(num+" ");
//        }
    }
}
