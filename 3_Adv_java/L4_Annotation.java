class A{
    public void showMethodwicharewillBeExtend(){
        System.out.println("In A class");
    }
}
class B extends A{
    @Override
    public void showMethodwicharewillBeExtend() {
        System.out.println("In B Class");
    }
}
public class L4_Annotation {
    public static void main(String[] args) {
        B obj=new B();
        obj.showMethodwicharewillBeExtend();
    }
}
