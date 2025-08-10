interface A54{
    int age=44;                 //Static and final
    String area="hydrabad";
    void show();
    void config();
}

interface C54{
    void run();
}
interface D54 extends C54{
    void run();
    void walk();
}
class B54 implements A54,D54{
    @Override
    public void show() {
        System.out.println("Showing......");
    }
    @Override
    public void config() {
        System.out.println("Configing..............");
    }

    @Override
    public void run() {
        System.out.println("Running");
    }

    @Override
    public void walk() {
        System.out.println("Walking..........");

    }
}

public class L19_Interface {
    public static void main(String[] args) {
        B54 obj=new B54();
        obj.config();
        obj.show();
        obj.run();
    }
}
