class a1{

    public a1(){
        super();
        System.out.println("In a");
    }
    public a1(int n){
//        super();            //constructor of object class
        this();
        System.out.println(n);
    }
}
class b extends a1{
    public b(){
//        super();
        super(12);
        System.out.println("In b");
    }
    public b(int n){
        this();
        System.out.println("in b parameterized const");
    }
}


public class L8_ThisAndSuper {
    public static void main(String[] args) {

        b obj=new b(12);
    }
}
