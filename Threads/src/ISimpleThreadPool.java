

/*
 *  

 */

/**
 *   <<-- Thread Pool -->> 
 *   It manages a queue of tasks, starts some pool threads.
 * 		
 *   #1. Create a task queue by using queue data structures, or designing your own data structure. 
 */

	
	//package servers;
	import java.net.ServerSocket;
	import java.net.Socket;
	import java.io.IOException;
	import java.util.concurrent.ExecutorService;
	import java.util.concurrent.Executors;

	public interface ISimpleThreadPool {



			public void start();

			

			public void run();
			

			void stop();

			void addTask(ISimpleTask task);
			
			

			
		}
