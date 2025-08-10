class human{

    public human(int age,String name){
        System.out.println("This is constructor");
        this.age=age;
        this.name=name;

    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }


    public String getName() {
        return name;
    }

    private int age;        //Accessable in only same class
    private String name;


}

public class L4_Oop_Encapsulation {
    public static void main(String[] args) {
//        human obj1=new human();
        human obj1=new human(18,"kaushal");
        human obj2=new human(20,"john");
        System.out.println(obj1.getAge()+" "+obj1.getName());
        System.out.println(obj2.getAge()+" "+obj2.getName());
//        obj1.age=18;
//        obj1.name="kaushal";

//        System.out.println(obj1.name);
//        obj1.setAge(19);
//        obj1.setName("kaushal");
//        System.out.println(obj1.getAge()+" "+obj1.getName());



    }
}
