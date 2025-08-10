//Strings are immutable
//Mutation with Thread
//We can not Access Single Reesources By multiple thread
//Thread t1 and t2 Can't access Single resources At the same time

//Ex.One bank account with two card
class Counter1{
    int count;
    public synchronized void increment(){
        count++;
    }
}
public class L16_RaceCondition {
    public static void main(String[] args) throws InterruptedException {

        Counter1 c1=new Counter1();
        Runnable obj1=() ->{
            for (int i = 1; i <= 10000; i++) {
                c1.increment();
//                System.out.println("Afteer calling T1 thread :"+c1.count);
            }

        };
        Runnable obj2=() ->{
            for (int i = 1; i <= 10000; i++) {
                c1.increment();
//                System.out.println("After calling t2 thread :"+c1.count);
            }
        };

        Thread t1=new Thread(obj1);
//        System.out.println("After making t1 thread :"+c1.count);
        Thread t2=new Thread(obj2);
//        System.out.println("After making t2 thread :"+c1.count);

        t1.start();
        t2.start();


//        t1.join();
//        t2.join();              //For join() Method we can losse value if the range is very high
        Thread.sleep(1000);
        System.out.println(c1.count);           //This thread is COmpleted Before Its calling 89;'87877
    }
}
