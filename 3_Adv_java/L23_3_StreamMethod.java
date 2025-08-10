import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class L23_3_StreamMethod {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(4,5,7,3,2,6);


//---------------------------filter-->Predicate-------------------
//        ----------------Method-1----------
//        Predicate-->have method Test(Boolean)If from a stream we apply filter from a value it gives filtered value
//        Predicate<Integer> p=(integer)->integer%2==0;
//        ----------------Method-2------------
//        Predicate<Integer> p=new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                if(integer%2==0) return true;
//                else return false;
//            }
//        };

//----------------------------map->Functions----------------------
//        -----------------Method-1:->apply---------------
//        map--->function-->apply(method):if whatever you get with the value apply will
//        Function<Integer,Integer> fun=new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer integer) {
//                return integer*2;
//            }
//        };
//        -----------------Method-2:Lemda Expression
//        Function<Integer,Integer> fun=(integer)-> integer*2;

//----------------------------Reduce->Implements two parameter:1.Identity,2.BinaryOperator
        Stream<Integer> result = nums.stream()
                .filter(n->n%2==0)
//                .filter(p)            By Predicate interface(Functional)
//                .map(n->n*2)
////                .map(fun)
//                .reduce(0,(n,e)->n+e);
                .sorted();
//        System.out.println(result);

        result.forEach(n-> System.out.println(n));
    }
}
