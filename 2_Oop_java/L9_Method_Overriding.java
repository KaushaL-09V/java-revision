class A11{
    public void show(){
        System.out.println("In class A1 method show");
    }
    public void Conf(){
        System.out.println("In class A1 method Conf");
    }
}
class B1 extends A11{
    @Override
    public void show() {
        System.out.println("In b Show method");
    }
}
public class L9_Method_Overriding {
    public static void main(String[] args) {
        B1 obj=new B1();
        obj.show();
    }
}
