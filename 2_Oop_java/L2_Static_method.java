public class L2_Static_method {
    public static void main(String[] args) {
        Mobile mbl=new Mobile();
        mbl.brand="apple";
        mbl.price=1200;
        Mobile mbl2=new Mobile();
        mbl2.brand="Samsung";
        mbl2.price=1100;
        Mobile.name="Smartphone";
//        Mobile.show1();
        Mobile.show1(mbl2);
    }
}
