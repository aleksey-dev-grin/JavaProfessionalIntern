import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    BlockingQueue<Long> blockingQueue = null;

    public Consumer(BlockingQueue<Long> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Consumer took: " + this.blockingQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
