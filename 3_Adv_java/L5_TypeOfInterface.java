
//--------There are three type of interface In java:
//--1>Normal Interface
//--2>Functional Interface
//--3>Marker Interface

//-----Normal Interface


interface abc{
    void show();
    void show1();
    void show3();
}
class bcd implements abc{
    @Override
    public void show() {
        System.out.println("In show");
    }

    @Override
    public void show1() {
        System.out.println("In show 1");
    }

    @Override
    public void show3() {
        System.out.println("In show 3");
    }
}

public class L5_TypeOfInterface {
    public static void main(String[] args) {
        bcd obj=new bcd();
        obj.show();
        obj.show1();
        obj.show3();
    }
}
