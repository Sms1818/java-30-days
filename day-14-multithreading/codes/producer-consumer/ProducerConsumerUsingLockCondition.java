
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
Problem

Create a producer-consumer system where:

Buffer size = 5
1 producer thread
1 consumer thread
Producer produces numbers from 1 to 10
Consumer consumes all produced numbers
📌 Rules
Use Lock and Condition
Do not use synchronized
Do not use wait() / notifyAll()
Buffer must be queue-based
Producer waits when buffer is full
Consumer waits when buffer is empty
Example Output
Produced: 1
Produced: 2
Consumed: 1
Consumed: 2
...
*/

class BufferUsingLock{
    private int capacity;
    private Queue<Integer> queue;
    public BufferUsingLock(int capacity){
        this.capacity = capacity;
        this.queue = new java.util.LinkedList<>();
    }

    private final Lock lock=new ReentrantLock();
    private final Condition notFull=lock.newCondition();
    private final Condition notEmpty=lock.newCondition();

    public void produce(int value) throws InterruptedException{
        lock.lock();
        try{
            while(queue.size()==capacity){
                notFull.await();
            }
            queue.offer(value);
            System.out.println("Produced: "+value);
            notEmpty.signalAll();
        }finally{
            lock.unlock();
        }
    }

    public int consume() throws InterruptedException{
        lock.lock();
        try{
            while(queue.isEmpty()){
                notEmpty.await();
            }
            int value=queue.poll();
            System.out.println("Consumed: "+value);
            notFull.signalAll();
            return value;
        }finally{
            lock.unlock();
        }
    }
    
}

public class ProducerConsumerUsingLockCondition {
    public static void main(String[] args) throws InterruptedException{
        BufferUsingLock buffer=new BufferUsingLock(5);
        Thread producer=new Thread(()->{
            for(int i=1;i<=10;i++){
                try {
                    buffer.produce(i);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread consumer=new Thread(()->{
            for(int i=1;i<=10;i++){
                try {
                    buffer.consume();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
    }
}