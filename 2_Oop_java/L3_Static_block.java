import javax.xml.namespace.QName;

class phone{
    static String name;
    int price;
    String brandName;

    static {
        name="Apple";
        System.out.println("We are in static block");

    }
    public phone() {
        name="";
        price=1200;
        System.out.println("In constructor block");
    }
}

public class L3_Static_block {
    public static void main(String[] args) throws ClassNotFoundException {
//        phone p1=new phone();
//        p1.name="smartphone";
//        p1.brandName="apple";
//        p1.price=1200;
//        phone p2=new phone();
//        p2.name="smartphone";
//        p2.brandName="samsung";
//        p2.price=1000;

        Class.forName("phone");            //Create object

    }
}
