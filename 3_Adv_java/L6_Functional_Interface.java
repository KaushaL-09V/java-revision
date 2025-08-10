//----------Functional Interface

//------------Sam:Single Abstract Interface
@FunctionalInterface                    //If you Write Double Method then Error
interface xyz{
    void show();
}
//class xyz1 implements xyz{
//    @Override
//    public void show(){
//        System.out.println("In show ");
//    }
//}

public class L6_Functional_Interface {
    public static void main(String[] args) {
//        xyz obj=new xyz1();


        //----We Can Also Instentiate A using Annoymous inner class

        xyz obj=new xyz() {
            @Override
            public void show() {
                System.out.println("In show method");
            }
        };

        obj.show();
    }
}
