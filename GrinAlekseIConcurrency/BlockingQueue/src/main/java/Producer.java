import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
    BlockingQueue<Long> blockingQueue = null;

    public Producer(BlockingQueue<Long> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            Long tmpLong = System.currentTimeMillis();
            try {
                this.blockingQueue.put(tmpLong);
                System.out.println("Producer * * *");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
