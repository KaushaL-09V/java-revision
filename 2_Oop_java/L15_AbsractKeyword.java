abstract class car{
    public abstract void drive();
    public abstract void fly();
    public void PlayMusic(){
        System.out.println("Play Music");
    }
}
abstract class WeganR extends car{
    public void drive(){
        System.out.println("Driving...........");
    }
}
class ExtendedWeganR extends WeganR{            //Concreate class
    public void fly(){
        System.out.println("Flying..............");
    }
}


public class L15_AbsractKeyword {
    public static void main(String[] args) {
//        WeganR obj=new WeganR();
//        obj.drive();
//        obj.PlayMusic();
        //Now we cannot be instantiated

        ExtendedWeganR obj2=new ExtendedWeganR();
        obj2.fly();
        obj2.drive();
        obj2.PlayMusic();
    }
}
