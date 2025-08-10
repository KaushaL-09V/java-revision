class Calc{
    int a=10;
    public void add(int a,int b){
        System.out.println("Addition...");
        System.out.println("Sum is : "+(a+b));

    }
}
public class L4_ClassandObjects {
    public static void main(String[] args) {
        Calc c=new Calc();
        c.add(12,20);
    }
}
