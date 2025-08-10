class Mobile{
    String brand;           //instance variable (value different for each object)
    static String name;
    int price;

    public void show(){
        System.out.println(brand+","+name+","+price);
    }
    public static void show1(Mobile mbl2){
        System.out.println("In static method");
//        System.out.println(brand+","+name+","+price); (We can't access static variable)
        System.out.println(mbl2.brand+","+name+","+mbl2.price);
    }
}

public class L1_Static_Var {
    public static void main(String[] args) {
        Mobile mbl=new Mobile();
        mbl.brand="apple";
        mbl.price=1200;

        Mobile mbl2=new Mobile();
        mbl2.brand="Samsung";
        mbl2.price=1100;

        Mobile.name="Smartphone";

        mbl.show();
        mbl2.show();




    }
}
