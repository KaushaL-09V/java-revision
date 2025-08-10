interface Lamda1 {
    void show();
}

interface Lamda2{
    void show2(int i);
}

public class L7_LamdaExpression {
    public static void main(String[] args) {


        //Expression Type 1:
//        Lamda1 obj=() -> {
//            System.out.println("In show");
//        };

        //Expression Type 2:
        Lamda1 obj=()-> System.out.println("Only in One Line");
        obj.show();

        //Expression Type3(Using Parameter)
//        Lamda2 obj2=(int i) -> System.out.println("In Show2 "+i);

        Lamda2 obj2=i -> System.out.println("In show2"+i);

        obj2.show2(12);
    }
}
