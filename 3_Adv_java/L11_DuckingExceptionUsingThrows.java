import java.io.FileNotFoundException;

class A21{
    public void show() throws ClassNotFoundException{
        Class.forName("Calc");
    }
}

public class L11_DuckingExceptionUsingThrows {

    static {
        System.out.println("Class Executed");
    }
    public static void main(String[] args)  {

        {
            A21 obj = new A21();
            try {
                obj.show();
            } catch (ClassNotFoundException e) {
                System.out.println(e+e.getMessage());
            }
        }
    }
}
