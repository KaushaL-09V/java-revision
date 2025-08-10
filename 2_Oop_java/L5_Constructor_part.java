class Human2{
    private int age;
    private String name;

    public Human2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human2() {
        System.out.println("This is Default constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class L5_Constructor_part {
    public static void main(String[] args) {
        Human2 obj1=new Human2(19,"kaushal");       //(Parameterized Constructor)
        Human2 obj2=new Human2();                   //(Default constructor)

        System.out.println(obj1.getAge()+" "+obj1.getName());
        System.out.println(obj2.getAge()+" "+obj2.getName());
    }
}
