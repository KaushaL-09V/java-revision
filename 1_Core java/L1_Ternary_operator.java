public class L1_Ternary_operator {
    public static void main(String[] args) {


//   Q> to print value of result 10 if a is even if not then print result value 20
        int a=4;
        int result;

//        if(a%2==0)
//            result=10;
//        else
//            result=20;



//        we can do it by ising Ternary operator


        result= a%2==0 ? 10:20;
        System.out.println(result);
    }
}
