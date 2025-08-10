class A22{
    public void show1(){
        System.out.println("Class A method Show");
    }
}
class B22 extends A22{
    public void show2(){
        System.out.println("CLass B method show");
    }

}
public class L13_UpcastingAndDownCasting {
    public static void main(String[] args) {
//        B22 b=new B22();
//        b.show();

//        A22 b=(A22)new B22();
//        b.show();

        A22 obj=(A22)new B22();
        obj.show1();
    }
}
