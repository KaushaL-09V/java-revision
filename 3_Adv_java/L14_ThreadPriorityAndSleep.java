//Default Priority==5
// Minimum Priority==10
//Maximum Priority==0


class A13 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class A131 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class L14_ThreadPriorityAndSleep {
    public static void main(String[] args) throws InterruptedException {

        A13 obj1=new A13();
        A131 obj2=new A131();

        obj2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());

        obj2.start();
        Thread.sleep(2);
        obj1.start();
    }
}
