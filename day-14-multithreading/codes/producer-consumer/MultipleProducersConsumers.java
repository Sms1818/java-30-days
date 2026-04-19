
import java.util.Queue;

/*
Problem

Create a producer-consumer system where:

Buffer size = 5
2 producer threads
2 consumer threads
Producers together produce numbers from 1 to 10
Consumers together consume all produced numbers
📌 Rules
Use wait() and notifyAll()
Use synchronized
Do not use sleep() for coordination
Buffer must be queue-based
No item should be lost or consumed twice
Example Output
Producer-1 Produced: 1
Producer-2 Produced: 2
Consumer-1 Consumed: 1
Consumer-2 Consumed: 2
...
*/

class MultipleBufferQueue{
    private int capacity;
    private Queue<Integer> queue;
    public MultipleBufferQueue(int capacity){
        this.capacity = capacity;
        this.queue = new java.util.LinkedList<>();
    }

    private int nextValue = 1;
    private int maxValue = 10;


    public synchronized boolean produce() throws InterruptedException {
        while(queue.size() == capacity){
            wait();
        }
        if(nextValue > maxValue){
            notifyAll();
            return false; 
        }

        int value=nextValue++;
        queue.offer(value);
        System.out.println(Thread.currentThread().getName() + " Produced: " + value);
        notifyAll();
        return true;
    }

    public synchronized Integer consume() throws InterruptedException {
        while(queue.isEmpty()){
            if(nextValue>maxValue){
                return null;
            }
            wait();
        }
        int value = queue.poll();
        System.out.println(Thread.currentThread().getName() + " Consumed: " + value);
        notifyAll();
        return value;
    }
}
public class MultipleProducersConsumers {
    public static void main(String[] args) throws InterruptedException {
        MultipleBufferQueue buffer = new MultipleBufferQueue(5);
        Thread producer1 = new Thread(() -> {
            try {
                while(buffer.produce()) {
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Producer-1");

        Thread producer2 = new Thread(() -> {
            try {
                while(buffer.produce()) {
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Producer-2");

        Thread consumer1 = new Thread(() -> {
            try {
                while (buffer.consume() != null) {
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Consumer-1");

        Thread consumer2 = new Thread(() -> {
            try {
                while (buffer.consume() != null) {
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Consumer-2");

        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();

        producer1.join();
        producer2.join();
        consumer1.join();
        consumer2.join();
    }
}