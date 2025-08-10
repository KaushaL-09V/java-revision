import javax.swing.plaf.TableHeaderUI;

//class A112 implements Runnable{
//    @Override
//    public void run() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hi");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
class A113 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class L15_RunnableThread {
    public static void main(String[] args) {


//------------------Simple By Calling Runnable implemented class in Thread Class-------------
//        A112 obj1=new A112();
//        A113 obj2=new A113();
//
//        Thread t1=new Thread(obj1);
//        Thread t2=new Thread(obj2);

//--------------------Direct Extends in Thread------------
//        Thread t1=new Thread(new A112());
//        Thread t2=new Thread(new A113());
//
//        t1.start();
//        t2.start();

//--------------------Using Annomouns Class-------------
//        Runnable obj1=new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 5; i++) {
//                    System.out.println("Hi");
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        };
//        Thread t2=new Thread(obj1);
//        Thread t1=new Thread(new A113());
//        t1.start();
//        t2.start();


//-----------------------By lemda expression------------------

        Runnable obj1=()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(new A113());

        t1.start();
        t2.start();

    }
}
