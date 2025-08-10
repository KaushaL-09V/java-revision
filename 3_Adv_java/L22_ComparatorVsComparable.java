//Comparator is a own interface use to build your own logic and Use to personally use Method in sorting

import java.util.*;

public class L22_ComparatorVsComparable {
    public static void main(String[] args) {

        Comparator com=new Comparator<Integer>() {
            @Override
            public int compare(Integer i,Integer j) {

                if(i%10 >j%10){
                    return 1;       //Value will swap
                }
                else {return -1;}
            }
        };
        List<Integer> nums=new ArrayList<>();
        nums.add(4);
        nums.add(3);
        nums.add(7);
        nums.add(9);

//        Collections.sort(nums);
        System.out.println(nums);
    }
}
