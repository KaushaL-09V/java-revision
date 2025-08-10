import jdk.dynalink.linker.LinkerServices;

import java.util.*;

class student{
    int age;
    String name;

    public student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class L22_2_ComparatorVsComparable {
    public static void main(String[] args) {

//        Comparator<Integer> com=new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if (o1%10>o2%10) return 1;
//                else return -1;
//            }
//        };
        Comparator<student> com=new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                if (o1.age>o2.age) return 1;
                else return -1;
            }
        };

        List<student> nums=new ArrayList<>();
        nums.add(new student(18,"java"));
        nums.add(new student(20,"Pyton"));
        nums.add(new student(10,"go"));
        nums.add(new student(12,"PHP"));

        Collections.sort(nums,com);     //If you want to sort the list by using claas function

        for (student s:nums){
            System.out.println(s);
        }


//        System.out.println(nums);       //Want to sort the values

        //Now i want to sort based on last digit we use Comparator

    }
}