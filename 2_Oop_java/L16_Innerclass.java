class A41{

    int age;

    public void show(){
        System.out.println("Show...........");
    }

    class B41{
        public void config(){
            System.out.println("Config....");
        }
    }
}

public class L16_Innerclass {
    public static void main(String[] args) {
        A41 obj=new A41();
        obj.show();
        A41.B41 obj2=obj.new B41();
        obj2.config();

    }
}
