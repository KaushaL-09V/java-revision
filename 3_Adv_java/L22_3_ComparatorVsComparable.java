import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students /*implements Comparable<Students>*/{
    int age;
    String name;

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


//    public int compareTo(Students that) {
//        if(this.age>that.age) return 1;
//        else return -1;
//    }
}
public class L22_3_ComparatorVsComparable {
    public static void main(String[] args) {

//        Comparator<Students> comparator=new Comparator<Students>() {
//            @Override
//            public int compare(Students o1, Students o2) {
//                if(o1.age >o2.age) return 1;
//                else return -1;
//            }
//        };
        Comparator<Students> comparator=(o1,o2)-> {
                return o1.age>o2.age?1:-1;
        };


        List<Students> numbs=new ArrayList<>();
        numbs.add(new Students(21,"navin"));
        numbs.add(new Students(12,"John"));
        numbs.add(new Students(18,"Parul"));
        numbs.add(new Students(20,"Kiran"));
//        Collections.sort(numbs);
//        System.out.println(numbs);
        for (Students s:numbs){
            System.out.println(s);
        }
    }
}


/*
Comparator: If you want to specify the logic that you want to sort the elements,you can use Comparator
Comparable: If you want to give power to the class itself to compare itself or to compare its object to itself
 */