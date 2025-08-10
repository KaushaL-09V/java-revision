public class L14_WrapperClass {
    public static void main(String[] args) {
        int num=7;
//        Integer num1=new Integer(num);          //Boxing
        Integer num1=num;           //AutoBoxing
//        System.out.println(num1);

//        int num2=new Integer(num1);     //Unboxing

        int num2=num1;          //AutoUnboxing
        System.out.println(num2);



        String str="10";
        int num3=Integer.parseInt(str);
        System.out.println(num3);
    }
}
