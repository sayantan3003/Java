package multi_threading;

/**
 * Thread priority and sleep
 */
// This is a thread
class Thread5 extends Thread   {
    // In every thread, we need to have a run method
    public void run()   {
        for (int i = 0; i < 20; i++) {
            System.out.println("Inside Thread 5.................");

            // Sleep means Thread is going into the waiting stage
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}

// This is a thread
class Thread6 extends Thread   {
    // In every thread, we need to have a run method
    public void run()   {
        for (int i = 0; i < 20; i++) {
            System.out.println("Inside Thread 6*****************");

            // Sleep means Thread is going into the waiting stage
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}

public class ThreadPriorityAndSleep {
    public static void main(String[] args) {
        Thread5 t5 = new Thread5();
        Thread6 t6 = new Thread6();

        // Range of priority --> from 1 to 10 --> 1 = least priority, 10 = highest priority, 5 = medium/normal priority
        // By default every thread has normal priority
        System.out.println(t5.getPriority());
        System.out.println(t6.getPriority());

        // Setting Thead priority
        // By setting priority we are suggesting schedular to work with priority but it depends on schedular algorithm
        t6.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);

        t5.start();
        t6.start();
    }
}
