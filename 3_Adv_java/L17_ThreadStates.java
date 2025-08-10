//Thread State:   New-->Runnable(When thread waiting for schdeuler)->Running->Dead


//New:
//
//Transition to Runnable: start() method is called.
//Runnable:
//
//Transition to Running: The CPU allocates time to the thread.
//Transition to Blocked: The thread tries to enter a synchronized block/method, but the lock is not available.
//Running:
//
//Transition back to Runnable: The thread’s CPU time slice is over.
//Transition to Waiting: wait(), join(), or LockSupport.park() is called.
//Transition to Timed Waiting: sleep(time), wait(time), join(time), or LockSupport.parkNanos(time) is called.
//Transition to Blocked: The thread tries to enter a synchronized block/method.
//Transition to Terminated: The run() method ends.
//Blocked:
//
//Transition to Runnable: The thread acquires the lock.
//        Waiting:
//
//Transition to Runnable: The thread is notified (notify(), notifyAll()) or interrupted.
//Timed Waiting:
//
//Transition to Runnable: The wait time expires, or the thread is notified/interrupted.
//        Terminated:
//
//Final State: The thread completes its execution (no further transitions).

public class L17_ThreadStates {
    public static void main(String[] args) {

    }
}
