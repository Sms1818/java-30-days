import java.util.LinkedList;
import java.util.Queue;
/*
Problem

Create a producer-consumer system where:

Multiple items can be stored in buffer
Buffer size = 5
Producer produces numbers 1 → 10
Consumer consumes them
Use a queue-based buffer
📌 Rules
Use wait() and notifyAll()
Use synchronized
Do NOT use sleep() for coordination
Ensure:
Producer waits when buffer is full
Consumer waits when buffer is empty
Expected Behavior
Produced: 1
Produced: 2
Produced: 3
...
Consumed: 1
Consumed: 2
...

👉 Order may vary slightly, but correctness must hold
*/

// Output
// Produced: 1
// Produced: 2
// Produced: 3
// Produced: 4
// Produced: 5
// Produced: 6
// Consumed: 1
// Consumed: 2
// Consumed: 3
// Consumed: 4
// Consumed: 5
// Consumed: 6
// Produced: 7
// Consumed: 7
// Consumed: 8
// Produced: 8
// Produced: 9
// Consumed: 9
// Produced: 10
// Consumed: 10


class BufferedQueue{
    private int capacity;
    private Queue<Integer> queue;
    public BufferedQueue(int capacity){
        this.capacity = capacity;
        this.queue = new LinkedList<>();
    }

    public synchronized void produce(int value) throws InterruptedException {
        while(queue.size()==capacity){
            wait();
        }
        queue.add(value);
        System.out.println("Produced: " + value);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while(queue.isEmpty()){
            wait();
        }
        int value = queue.poll();
        System.out.println("Consumed: " + value);
        notifyAll();
        return value;
    }

}

public class ProducerConsumerBoundedBuffer {
    public static void main(String[] args) throws InterruptedException {
        BufferedQueue buffer = new BufferedQueue(5);
        Thread producer=new Thread(()->{
            try{
                for(int i=1;i<=10;i++){
                    buffer.produce(i);
                }
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer=new Thread(()->{
            try{
                for(int i=1;i<=10;i++){
                    buffer.consume();
                }
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();


    }
}