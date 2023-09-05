package MultithreadingPractice;

import java.lang.Thread;

public class PracticeThread extends Thread {

    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + "is being executed by one of the cores of the CPU.");
        int sum = 0;
        for (int i=1; i <=10; i++) {
            sum += i;
            System.out.println("Thread : " + Thread.currentThread().getName() + " - value : " + sum);
            Thread.sleep(2000);
        }
    }
}