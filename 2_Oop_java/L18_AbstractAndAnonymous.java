abstract class A53{
    abstract public void show();
}


public class L18_AbstractAndAnonymous {
    public static void main(String[] args) {
//        A53 obj=new A53();
//        obj.show();
        A53 obj=new A53(){
            public void show(){
                System.out.println("In new A");
            }
        };
        obj.show();
    }
}
