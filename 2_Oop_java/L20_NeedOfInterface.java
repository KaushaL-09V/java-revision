interface Computer{
    void code();
}
class Laptop12 implements Computer{
    public void code(){
        System.out.println("compile code run");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("Code Compile Run Faster");
    }
}
class Developer{
    public void devapp(Computer l){
        l.code();
    }
}

public class L20_NeedOfInterface {
    public static void main(String[] args) {

        Computer l=new Laptop12();
        Computer d=new Desktop();
        Developer desk=new Developer();
        desk.devapp(d);

    }
}
