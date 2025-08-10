// If you have 3 software and they are execut in Same time (MultiTasking)
//Ex. game: Player playing,cheering,login,helper,zoom_software,kernal Consuming Thread
//Lightweight,multiple can shared resources and also Execute at the same time

class A123 extends Thread{
    public void run(){
        for (int i = 1; i <=100; i++) {
            System.out.println("Hi");
        }
    }
}
class A124 extends Thread{
    public void run(){
        for (int i = 1; i <=100; i++) {
            System.out.println("Hello");
        }
    }
}
public class L14_Threads {
    public static void main(String[] args) {
        A123 obj1=new A123();
        A124 obj2=new A124();
        obj1.start();
        obj2.start();
    }
}
