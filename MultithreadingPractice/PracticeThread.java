package ExtendingThread;

import java.lang.Thread;

public class PracticeThread extends Thread {

    String name = "";
    public PracticeThread(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + "is being executed by one of the cores of the CPU.");
        int sum = 0;
        for (int i=1; i <=10; i++) {
            sum += i;
            System.out.println("Thread : " + Thread.currentThread().getName() + " - value : " + sum);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Thread was sleeping for 2s and got interrupted.");
            }
        
        }
    }
}