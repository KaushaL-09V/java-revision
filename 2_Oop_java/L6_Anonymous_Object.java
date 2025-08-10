class A{
    public A() {
        System.out.println("Constructor calling");
    }
    void show(){
        System.out.println("Show mwthod exist");
    }
}

public class L6_Anonymous_Object {
    public static void main(String[] args) {
        new A();                //Anonynomous object
        new A().show();         //Again make new object and show method
    }
}
