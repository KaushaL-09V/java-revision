import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class L23_StreamApi {
    public static void main(String[] args) {
//        List<Integer> nums=new ArrayList<>(List.of(4,5,7,3,2,6));
        List<Integer> nums= Arrays.asList(4,5,7,3,2,6);

//        nums.forEach(n-> System.out.println(n));


//        Consumer<Integer> con=new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        };

//        Consumer<Integer> con=(Integer integer)-> System.out.println(integer);
//        nums.forEach(con);

        nums.forEach(n-> System.out.println(n));        //forEach implements consumer class
//        int sum=0;
//        for (int n:nums){
//            if(n%2==0){
//                n=n*2;
//                sum=sum+n;
//            }
//        }
//        System.out.println(sum);
    }
}
