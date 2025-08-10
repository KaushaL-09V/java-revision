class A12{
    public void show(){
        System.out.println("In class A show");
    }
}
class B12 extends A12{
    public void show(){
        System.out.println("In class B show");
    }
}
class C12 extends A12{
    public void show(){
        System.out.println("In class C show");
    }
}


public class L10_Dynamic_method_Dispach {
    public static void main(String[] args) {
        A12 obj1=new A12();
        obj1.show();
//        A12 obj=new B12();
        obj1=new B12();
        obj1.show();

        obj1=new C12();
        obj1.show();
    }
}
