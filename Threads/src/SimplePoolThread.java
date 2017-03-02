import java.util.concurrent.LinkedBlockingQueue;

public class SimplePoolThread implements ISimplePoolThread, Runnable {


private LinkedBlockingQueue<ISimpleTask> queue;

public SimplePoolThread(LinkedBlockingQueue<ISimpleTask> queue)
{
    this.queue = queue;
}

@Override
public void run() {

    while(true) {
        
        try {
        	System.out.println("Working with path: ");
            ISimpleTask task = queue.take();
            task.run();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
}