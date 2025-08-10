class A321{
    final public void show(){
        System.out.println("In class A show");
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }
}
class B321 extends A321{
//    public void show(){
//        System.out.println("In class B show");
//    }
}
public class L11_Final {
    public static void main(String[] args) {
//        final int a=20;         //We can't chamge the value of the final keyword
//        a=12;
//        System.out.println(a);


        B321 a=new B321();
        a.show();
        a.add(2,3);
    }
}
