class A51{
    public void show(){
        System.out.println("Showing in class A");
    }
}
class B52 extends A51{
    public void show(){
        System.out.println("Showing in class B");
    }
}


public class L17_AnontmousClass {
    public static void main(String[] args) {
        A51 obj=new A51(){
            public void show(){
                System.out.println("Showing in B");
            }
        };
        obj.show();

    }
}
