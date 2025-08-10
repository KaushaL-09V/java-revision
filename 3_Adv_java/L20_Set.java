import java.util.*;

public class L20_Set {
    public static void main(String[] args) {

        System.out.println("Hash set");
        Set<Integer> num=new HashSet<Integer>();
        num.add(62);
        num.add(54);
        num.add(83);
        num.add(21);
        num.add(6);
        for(int n:num){
            System.out.println(n);
        }

        System.out.println("Tree Set");
        Set<Integer> num1=new TreeSet<>();
        num1.add(62);
        num1.add(54);
        num1.add(83);
        num1.add(21);
        num1.add(6);
        for(int n:num1){
            System.out.println(n);
        }

        Iterator<Integer> values=num1.iterator();

        while(values.hasNext()){
            values.next();
        }



    }
}
