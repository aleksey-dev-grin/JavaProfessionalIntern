import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueRealisation {
    public static void main(String[] args) {
        BlockingQueue<Long> queue = new ArrayBlockingQueue<>(3);

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        Thread th1 = new Thread(producer);
        Thread th2 = new Thread(consumer);

        th1.start();
        th2.start();

    }
}
