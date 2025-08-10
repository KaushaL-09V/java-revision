//Map is part of collection

//Indices Having value started from 0,1,2,3,4,....
//But what if we want different value of indices

//Not following Sequence


import java.util.HashMap;
import java.util.Map;

//Map contiains :Key,values
//Map is collection of key and value pair
public class L21_Map {
    public static void main(String[] args) {
        Map<String,Integer> students=new HashMap<>();

        students.put("Urvashi",56);
        students.put("Kaushal",18);
        students.put("Jeet",15);
        students.put("Prachi",12);
        students.put("Jeet",19);
        //Key are actually Unique-set
        //System.out.println(students.keySet());
        for (String name:students.keySet()){
            System.out.println(name+":"+students.get(name));
        }
        System.out.println(students);
        students.remove("Urvashi");
        System.out.println(students);
    }
}
