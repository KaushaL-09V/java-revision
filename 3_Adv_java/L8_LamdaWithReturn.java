interface Lamda3{
    int add(int a,int b);
}

public class L8_LamdaWithReturn {
    public static void main(String[] args) {

        //Method-1
//        Lamda3 obj=(a, b) -> {
//            return a+b;
//        };

        //Method-2
        Lamda3 obj=(a,b)-> a+b;
        System.out.println(obj.add(12,23));


    }
}
