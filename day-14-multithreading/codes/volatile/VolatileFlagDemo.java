/*
Problem Statement

Create a program where:

One thread (Worker thread) runs continuously in a loop and prints:

Worker is running...
Another thread (Main thread or Controller) stops the worker thread after a short delay by changing a flag.
📌 Requirements
Use a shared boolean flag
The worker thread should stop when the flag becomes false
Use the volatile keyword for the flag
Do NOT use:
synchronized
AtomicBoolean
🎯 Expected Behavior
Worker is running...
Worker is running...
Worker is running...
Stopping worker...
Worker stopped.
*/

class WorkerThread implements Runnable{
    private volatile boolean running=true;

    public void stop(){
        running=false;
    }

    @Override
    public void run(){
        while(running){
            System.out.println("Worker is running...");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

}
public class VolatileFlagDemo {
    public static void main(String[] args) throws InterruptedException{
        WorkerThread worker=new WorkerThread();
        Thread t=new Thread(worker);
        t.start();

        Thread.sleep(1000);
        System.out.println("Stopping worker...");
        worker.stop();

        t.join();

        System.out.println("Worker stopped.");


    }
}