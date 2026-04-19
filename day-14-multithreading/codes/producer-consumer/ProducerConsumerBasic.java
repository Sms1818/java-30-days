/*
Problem

Design a simple producer-consumer system where:

One Producer thread produces numbers from 1 to 5
One Consumer thread consumes those numbers
Both threads share a common buffer
The consumer should only consume when data is available
The producer should only produce when the buffer is empty
📌 Rules
Use a buffer of size 1
Use wait() and notifyAll()
Do not use sleep() for coordination

Print messages like:

Produced: 1
Consumed: 1
Produced: 2
Consumed: 2
*/

// Output
// Produced: 1
// Consumed: 1
// Produced: 2
// Consumed: 2
// Produced: 3
// Consumed: 3
// Produced: 4
// Consumed: 4
// Produced: 5
// Consumed: 5


class Buffer{
    private int item;
    private boolean hasItem = false;
    public synchronized void produce(int value) throws InterruptedException{
        while(hasItem){
            wait();
        }
        item = value;
        System.out.println("Produced: " + item);
        hasItem=true;
        notifyAll();

    }

    public synchronized int consume() throws InterruptedException{
        while(!hasItem){
            wait();
        }
        System.out.println("Consumed: " + item);
        hasItem=false;
        notifyAll();
        return item;
    }
}

public class ProducerConsumerBasic {
    public static void main(String[] args) throws InterruptedException {
        Buffer buffer = new Buffer();

        Thread producer=new Thread(()->{
            try{
                for(int i=1; i<=5; i++){
                    buffer.produce(i);
                }
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    buffer.consume();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
    }
}
