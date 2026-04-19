/*
Problem Statement

Create a program where:

One thread (Updater thread) updates a shared status variable multiple times
Another thread (Reader thread) continuously monitors the status and prints whenever it changes
📌 Requirements

Use a shared variable:

private volatile int status;

Updater thread should update status like:

1 → 2 → 3 → 4 → 5
Reader thread should:
continuously check the status
print whenever it sees a new value
Do NOT use:
synchronized
AtomicInteger
🎯 Expected Behavior
Status changed to: 1
Status changed to: 2
Status changed to: 3
Status changed to: 4
Status changed to: 5
*/

class StatusMonitor{
    private volatile int status=0;
    public void updateStatus(){
        for(int i=1;i<=5;i++){
            try {
                Thread.sleep(500);
                
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            status=i;
        }
    }

    public void readStatus(){
        int lastStatus=0;
        while(lastStatus<5){
            if(status!=lastStatus){
                System.out.println("Status changed to: "+status);
                lastStatus=status;
            }
        }
    }


}
public class VolatileStatusDemo {
    public static void main(String[] args) throws InterruptedException {
        StatusMonitor monitor=new StatusMonitor();
        
        Thread updaterThread=new Thread(()->{
            monitor.updateStatus();
        });
        Thread readerThread=new Thread(()->{
            monitor.readStatus();
        });

        updaterThread.start();
        readerThread.start();

        updaterThread.join();
        readerThread.join();

    
    }
}