/*
Problem Statement

Create a program where:

Two threads increment a shared counter 1000 times each

The counter is declared as:

private volatile int count = 0;
After both threads finish, print the final value of count
📌 Requirements
Use volatile
Do NOT use:
synchronized
AtomicInteger
Lock
🎯 Expected Observation

You may expect:

Final Count: 2000

But in many runs, you may get:

Final Count: 1873
Final Count: 1948
Final Count: 1991
*/

class Counter {
    private volatile int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
public class VolatileCounterProblem {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        Thread t2= new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + counter.getCount());


    }
}