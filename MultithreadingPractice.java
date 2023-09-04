import java.lang.Thread;

public class MultithreadingPractice {


    public class PracticeThread extends Thread {

        private String threadName;
        public PracticeThread(String threadName) {
            this.threadName = threadName;
        }

        public void run() {
            System.out.println("Thread " + this.threadName + "is being executed by one of the cores of the CPU.");
            int sum = 0;
            for (int i=1; i <=10; i++) {
                sum += i;
                System.out.println("Thread : " + this.threadName + " - value : " + sum);
                Thread.sleep(2000);
            }
        }
    }

// Problem statement: You need to run the below code with at least three threads (name those threads as A,B,C....), 
//and find the output.
//https://codein.withgoogle.com/archive/2018/organization/5191613659742208/task/5326133142749184/
// Initialize a variable sum = 0
// Run a for loop for 10 times. i.e : for(int x = 0; x < 10; x++) . Add the value x to the value sum in each iteration
// Print the thread name, and the value as follows : "Thread : A - value : 45 " in each iteration
// Finally Print the sum from each thread as follows : "Thread : A - Sum : 45 "

    // public static void printSumOfNumsWithMultithreading() {
    //     Thread t1 = new Thread("A");
    //     Thread t2 = new Thread("B");
    //     Thread t3 = new Thread("C");
    //     int sum = 0;
    //     for (int i=1; i <=10; i++) {
    //         sum += i;
    //         System.out.println("Thread : " + t1.getName() + " - value : " + sum);
    //         t1.start();
    //         t2.start();
    //         t3.start();
    //     }
    // }

    public static void main(String[] args) {
        for (int i=0; i < 3; i++) {
            String threadName = "" + (char) (i + 65);
            PracticeThread currThread = new PracticeThread(threadName);
            currThread.start();
        }
    }
}