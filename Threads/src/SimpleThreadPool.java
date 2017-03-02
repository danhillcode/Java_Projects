
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class SimpleThreadPool implements ISimpleThreadPool {

private LinkedBlockingQueue<ISimpleTask> queue = new LinkedBlockingQueue<>();

// new part
private ArrayList<Thread> threadList = new ArrayList<>();

//type of object
private Thread[] Threads;
LinkedBlockingQueue<ISimpleTask> nTask = new LinkedBlockingQueue<ISimpleTask>();


@Override
public void start() {
	
	// new part
	for (int i  = 0; i < 5; i++){
		Thread th = new Thread(new SimplePoolThread(queue));
		th.start();
		threadList.add(th);

	}
	
	
	
	//old part
//	(new Thread(new SimplePoolThread(queue))).start();
}


/*
@Override
public void start() {

	
	Threads = new Thread[10];
	
	for (int i=0; i<10; i++){
		
		Threads[i] = new Thread(new SimplePoolThread(nTask));
		Threads[i].start();
	}
}
*/

/*
@Override
public void stop() {
	queue.clear();
	
	for(Thread thread : threadList) {
        thread.interrupt();
    }

}
*/



	


    
    @Override
    public void stop() {
        try {
            
           /* 
            for(Thread thread : threadList) {
                thread.interrupt();
            }
            */
            queue.take();
            queue.clear();
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
    

    
    @Override
    public void addTask(ISimpleTask task) { 

        try {
            queue.put(task);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


@Override
public void run() {
	// TODO Auto-generated method stub
	
}
    

//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		
//	}

/*
	@Override
	public void addTask(ISimpleTask task) {

		try {
			nTask.put(task);
		}
		catch (InterruptedException  e)
		{
			System.out.println("Sorry it can't be done right now.");
		}
	}
*/	
}