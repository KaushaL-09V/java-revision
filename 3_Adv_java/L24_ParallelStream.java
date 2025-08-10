import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class L24_ParallelStream {
    public static void main(String[] args) {
        int size=10_000;
        List<Integer> nums=new ArrayList<>(size);
        Random ran=new Random();
        for (int i=1;i<=size;i++){
            nums.add(ran.nextInt(100));
        }

//-----------------.stream()------------
        long startseq = System.currentTimeMillis();
        int sum=nums.stream()
//                        .map(n->n*2)
                        .map(i-> {
                            try {
                                Thread.sleep(1);
                            } catch (Exception e) {}
                            return i*2;
                        })
                        .reduce(0,(n,e)->n+e);
        long endseq = System.currentTimeMillis();

//------------------.stream().mapToInt(i->i).sum();------
        long startseq2 = System.currentTimeMillis();
        int sum2=nums.stream()
//                        .map(n->n*2)
                        .map(i-> {
                            try {
                                Thread.sleep(1);
                            } catch (Exception e) {}
                            return i*2;
                        })
                        .mapToInt(i -> i)
                        .sum();
        long endseq2 = System.currentTimeMillis();

//------------------.parallelstream().maptoInt.sum()----------
        long startseq3 = System.currentTimeMillis();
        int sum3=nums.parallelStream()
//                        .map(n->n*2)
                        .map(i-> {
                            try {
                                Thread.sleep(1);
                            } catch (Exception e) {}
                            return i*2;
                        })
                        .mapToInt(i -> i)
                        .sum();
        long endseq3 = System.currentTimeMillis();

//        System.out.println(nums);
        System.out.println(sum);
        System.out.println("Times of .stream():"+(endseq-startseq));
        System.out.println(sum2);
        System.out.println("Times2 of .stream().mapToInt(i->i).sum();:"+(endseq2-startseq2));
        System.out.println(sum3);
        System.out.println("Times3 of .parallelstream().maptoInt.sum():"+(endseq3-startseq3));
    }
}


/*
I want to multiply all the value by 2 and then we also add all the values
->get the value
->Multiply by 2
->sum of it

 */
